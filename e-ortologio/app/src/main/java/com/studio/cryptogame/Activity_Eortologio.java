package com.studio.cryptogame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class Activity_Eortologio extends AppCompatActivity {

    private Button b11,b12,b13,b14,b15,b16,b17,b18,b19,b110,b111,b112;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //ALLAGI XRWMATOS BARAS
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimary)));


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eortologio);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        view_months();
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Eortologio.this, Activity_January.class);
                startActivity(intent);
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Eortologio.this, Activity_February.class);
                startActivity(intent);
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Eortologio.this, Activity_March.class);
                startActivity(intent);
            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Eortologio.this, Activity_April.class);
                startActivity(intent);
            }
        });

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Eortologio.this, Activity_May.class);
                startActivity(intent);
            }
        });

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Eortologio.this, Activity_June.class);
                startActivity(intent);
            }
        });

        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Eortologio.this, Activity_July.class);
                startActivity(intent);
            }
        });

        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Eortologio.this, Activity_August.class);
                startActivity(intent);
            }
        });

        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Eortologio.this, Activity_September.class);
                startActivity(intent);
            }
        });

        b110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Eortologio.this, Activity_October.class);
                startActivity(intent);
            }
        });

        b111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Eortologio.this, Activity_November.class);
                startActivity(intent);
            }
        });

        b112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Eortologio.this, Activity_December.class);
                startActivity(intent);
            }
        });









    }


    //12 buttons for the months
    private void view_months(){
        b11 = findViewById(R.id.b11);
        b12 = findViewById(R.id.b12);
        b13 = findViewById(R.id.b13);
        b14 = findViewById(R.id.b14);
        b15 = findViewById(R.id.b15);
        b16 = findViewById(R.id.b16);
        b17 = findViewById(R.id.b17);
        b18 = findViewById(R.id.b18);
        b19 = findViewById(R.id.b19);
        b110 = findViewById(R.id.b110);
        b111 = findViewById(R.id.b111);
        b112 = findViewById(R.id.b112);
    }
}