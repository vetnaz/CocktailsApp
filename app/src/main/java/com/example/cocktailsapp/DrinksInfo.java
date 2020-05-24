package com.example.cocktailsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.net.URL;

public class DrinksInfo extends AppCompatActivity {

    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks_info);
        String id = getIntent().getStringExtra("id");
        int _id = Integer.parseInt(id);
        String name = getIntent().getStringExtra("Name");
        String alcohol = getIntent().getStringExtra("Alcohol");
        String glass = getIntent().getStringExtra("Glass");
        String Ingradient1 = getIntent().getStringExtra("Ingradient1");
        String Ingradient2 = getIntent().getStringExtra("Ingradient2");
        String Ingradient3 = getIntent().getStringExtra("Ingradient3");
        String Ingradient4 = getIntent().getStringExtra("Ingradient4");
        String Measure1 = getIntent().getStringExtra("Measure1");
        String Measure2 = getIntent().getStringExtra("Measure2");
        String Measure3 = getIntent().getStringExtra("Measure3");
        String Measure4 = getIntent().getStringExtra("Measure4");
        String Instruction = getIntent().getStringExtra("Instruction");
        String url = getIntent().getStringExtra("URL");

        Toolbar toolbar = findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(name);
        toolbar.setTitleTextColor(Color.BLACK);

        TextView t1 = findViewById(R.id.t1);
        t1.setText(name);

        TextView t2 = findViewById(R.id.t2);
        t2.setText(alcohol);

        TextView t3 = findViewById(R.id.t3);
        t3.setText(glass);

        TextView t4 = findViewById(R.id.t4);
        t4.setText(Measure1);

        TextView t5 = findViewById(R.id.t5);
        t5.setText(Measure2);

        TextView t6 = findViewById(R.id.t6);
        t6.setText(Measure3);

        TextView t7 = findViewById(R.id.t7);
        t7.setText(Measure4);

        TextView t8 = findViewById(R.id.t8);
        t8.setText(Ingradient1);

        TextView t9 = findViewById(R.id.t9);
        t9.setText(Ingradient2);

        TextView t10 = findViewById(R.id.t10);
        t10.setText(Ingradient3);

        TextView t11 = findViewById(R.id.t11);
        t11.setText(Ingradient4);

        TextView t12 = findViewById(R.id.t12);
        t12.setText(Instruction);

        ImageView imageView = findViewById(R.id.image_info);

        Glide.with(this)
                .load(url)
                .into(imageView);

        dbHelper = new DBHelper(this);

        SQLiteDatabase database = dbHelper.getWritableDatabase();

        ContentValues contentValues = new ContentValues();

        Cursor cursor = database.query(DBHelper.COCKTAILS_TABLE, null, null, null, null, null, null);

        boolean k=true;

        if (cursor.moveToFirst()) {
            int idIndex = cursor.getColumnIndex(DBHelper.KEY_id);
            do {
               if(cursor.getInt(idIndex)==_id){
                   k=false;
               }
            } while (cursor.moveToNext());
        }
        cursor.close();
        if(k) {
            contentValues.put(DBHelper.KEY_id, _id);
            contentValues.put(DBHelper.NAME, name);
            contentValues.put(DBHelper.ALCOHOLIC, alcohol);
            contentValues.put(DBHelper.GLASS, glass);
            contentValues.put(DBHelper.INGRADIENT_1, Ingradient1);
            contentValues.put(DBHelper.INGRADIENT_2, Ingradient2);
            contentValues.put(DBHelper.INGRADIENT_3, Ingradient3);
            contentValues.put(DBHelper.INGRADIENT_4, Ingradient4);
            contentValues.put(DBHelper.MEASURE_1, Measure1);
            contentValues.put(DBHelper.MEASURE_2, Measure2);
            contentValues.put(DBHelper.MEASURE_3, Measure3);
            contentValues.put(DBHelper.MEASURE_4, Measure4);
            contentValues.put(DBHelper.INSTRUCTION, Instruction);
            contentValues.put(DBHelper.URL, url);

            database.insert(DBHelper.COCKTAILS_TABLE, null, contentValues);
        }
        dbHelper.close();

    }
}
