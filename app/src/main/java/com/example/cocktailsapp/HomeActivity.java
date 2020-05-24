package com.example.cocktailsapp;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    DBHelper dbHelper;
    ArrayList<Drinks> drinksList = new ArrayList<Drinks>();
    private  RecyclerView myrv;
    private  RecyclerViewAdapter  myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Cocktail App");
        toolbar.setTitleTextColor(Color.BLACK);


        FloatingActionButton fab = findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSearchActivity();
            }
        });
        dbHelper = new DBHelper(this);

        SQLiteDatabase database = dbHelper.getWritableDatabase();

        Cursor cursor = database.query(DBHelper.COCKTAILS_TABLE, null, null, null, null, null, null);

        if (cursor.moveToFirst()) {
            int idIndex = cursor.getColumnIndex(DBHelper.KEY_id);
            int nameIndex = cursor.getColumnIndex(DBHelper.NAME);
            int alcoholicIndex = cursor.getColumnIndex(DBHelper.ALCOHOLIC);
            int glassIndex = cursor.getColumnIndex(DBHelper.GLASS);
            int i1 = cursor.getColumnIndex(DBHelper.INGRADIENT_1);
            int i2 = cursor.getColumnIndex(DBHelper.INGRADIENT_2);
            int i3 = cursor.getColumnIndex(DBHelper.INGRADIENT_3);
            int i4 = cursor.getColumnIndex(DBHelper.INGRADIENT_4);
            int m1 = cursor.getColumnIndex(DBHelper.MEASURE_1);
            int m2 = cursor.getColumnIndex(DBHelper.MEASURE_2);
            int m3 = cursor.getColumnIndex(DBHelper.MEASURE_3);
            int m4 = cursor.getColumnIndex(DBHelper.MEASURE_4);
            int instructions = cursor.getColumnIndex(DBHelper.INSTRUCTION);
            int urlindex = cursor.getColumnIndex(DBHelper.URL);

            do {
              //  Log.d("mLog", "ID = " + cursor.getInt(idIndex) +
                //        ", name = " + cursor.getString(nameIndex) +
                 //       ", alcoholic = " + cursor.getString(emailIndex));
                drinksList.add(new Drinks((String.valueOf(cursor.getInt(idIndex))),cursor.getString(nameIndex),cursor.getString(alcoholicIndex),cursor.getString(glassIndex),cursor.getString(i1),cursor.getString(i2),cursor.getString(i3),cursor.getString(i4),cursor.getString(m1),cursor.getString(m2),cursor.getString(m3),cursor.getString(m4),cursor.getString(instructions),cursor.getString(urlindex)));
            } while (cursor.moveToNext());
        } else
            Log.d("mLog","0 rows");
        cursor.close();

        myrv = (RecyclerView) findViewById(R.id.recycler_viewhome);
        myAdapter = new RecyclerViewAdapter(this, drinksList);

        myrv.setLayoutManager(new GridLayoutManager(this, 2));
        myrv.setAdapter(myAdapter);

        if(drinksList.isEmpty()){
            TextView textView = findViewById(R.id.text_empty);
            textView.setVisibility(View.VISIBLE);
            myrv.setVisibility(View.INVISIBLE);
        }
    }


      public void openSearchActivity(){
          Intent intent = new Intent(this, activity_search.class);
          startActivityForResult(intent,RESULT_OK);

    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }

}
