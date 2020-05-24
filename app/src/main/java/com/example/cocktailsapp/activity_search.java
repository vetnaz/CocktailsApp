package com.example.cocktailsapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.SearchView;
import android.widget.TextView;

import java.lang.reflect.Field;
import java.nio.channels.FileLock;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class activity_search extends AppCompatActivity {


    public JsonPlaceHolder jsonPlaceHolder;
    private TextView textViewRezult;
    private RecyclerView myrv;
    private RecyclerViewAdapter  myAdapter;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Toolbar toolbar = findViewById(R.id.toolbar_search);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("");
        toolbar.setTitleTextColor(Color.BLACK);

         textView = findViewById(R.id.text_start);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.thecocktaildb.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        myrv = (RecyclerView) findViewById(R.id.recycler_view123);

        jsonPlaceHolder=  retrofit.create(JsonPlaceHolder.class);

        EditText editText = findViewById(R.id.edit_text);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    getDrinks(s.toString());
                    myrv.setVisibility(View.VISIBLE);

                }catch (Exception e){

                }
            }
        });

       // List<Drinks> list = getDrinks();

     //   TextView txt  = findViewById(R.id.text123);


    }

    public void getDrinks(String s) {

        Call<RezulList> call = jsonPlaceHolder.getDrinks(s);

        call.enqueue(new Callback<RezulList>() {
            @Override
            public void onResponse(Call<RezulList> call, Response<RezulList> response) {
                if (!response.isSuccessful()) {
                    textViewRezult.setText("code:" + response.code());
                    return;
                }

                RezulList drinks = response.body();

                try{
                    drinks.getDrinksList().size();
                }catch (Exception e){
                    myrv.setVisibility(View.INVISIBLE);
                    textView.setText("No cocktails found");
                }

                myAdapter = new RecyclerViewAdapter(activity_search.this, drinks.getDrinksList());

                myrv.setLayoutManager(new GridLayoutManager(activity_search.this, 2));
                myrv.setAdapter(myAdapter);

                setResult(RESULT_CANCELED);
            }

            @Override
            public void onFailure(Call<RezulList> call, Throwable t) {
                textViewRezult.setText(t.getMessage());
            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent i = new Intent(this, HomeActivity.class);
        finish();
        this.startActivity(i);
    }
}





