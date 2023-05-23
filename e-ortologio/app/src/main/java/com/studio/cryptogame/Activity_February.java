package com.studio.cryptogame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Objects;

public class Activity_February extends AppCompatActivity {

    int unicode=0x1F310	;
    String emojipagosmio = getEmoji(unicode);

    public String getEmoji(int uni){
        return new String(Character.toChars(uni));
    }

    int unicode1=0x1F642;
    String emoji1 = getEmoji1(unicode1);

    public String getEmoji1(int uni){
        return new String(Character.toChars(uni));
    }

    int unicode2=0x1F615;
    String emoji2 = getEmoji2(unicode2);

    public String getEmoji2(int uni){
        return new String(Character.toChars(uni));
    }


    ArrayList<AminoAcidModel> aminoAcidModels = new ArrayList<AminoAcidModel>();

    int[] aminoAcidImages = {R.drawable.ic_baseline_today_24};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //ALLAGI XRWMATOS BARAS
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimary)));


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_february);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView = findViewById(R.id.mRecyclerViewFebruary);

        setAminoAcidModel();

        AA_RecyclerViewAdapterFebruary adapter = new AA_RecyclerViewAdapterFebruary(this,aminoAcidModels);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setAminoAcidModel(){


        String[] aminoAcidMonths = getResources().getStringArray(R.array.months_txt);
        String[] aminoAcidNames = getResources().getStringArray(R.array.names_february_txt);
        String[] aminoAcidPagosmies = getResources().getStringArray(R.array.pagosmies_february_txt);
        String[] aminoAcidDayoff = getResources().getStringArray(R.array.dayoff_february_txt);
        String n_day = "";
        String emoji = "";

        for( int i=0; i<28; i++){
if(i%7==0) n_day="Τετάρτη ";
if(i%7==1) n_day="Πέμπτη ";
if(i%7==2) n_day="Παρασκευή ";
if(i%7==3) n_day="Σάββατο ";
if(i%7==4) n_day="Κυριακή ";
if(i%7==5) n_day="Δευτέρα ";
if(i%7==6) n_day="Τρίτη ";

            if(!aminoAcidDayoff[i].contains("-")){ emoji=emoji1;}
            if(aminoAcidDayoff[i].equals("-")){emoji=emoji2;}


            aminoAcidModels.add(new AminoAcidModel(n_day + (i+1) + " " + aminoAcidMonths[1],aminoAcidNames[i],emojipagosmio + " " + aminoAcidPagosmies[i],emoji + " Αργία : " + aminoAcidDayoff[i],aminoAcidImages[0]));

        }

    }
}