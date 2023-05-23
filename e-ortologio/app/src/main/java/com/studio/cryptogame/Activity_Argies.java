package com.studio.cryptogame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;

public class Activity_Argies extends AppCompatActivity {


    int unicode1=0x1F642;
    String emoji1 = getEmoji1(unicode1);

    public String getEmoji1(int uni){
        return new String(Character.toChars(uni));
    }

    int unicode=0x1F310	;
    String emojipagosmio = getEmoji(unicode);

    public String getEmoji(int uni){
        return new String(Character.toChars(uni));
    }


    ArrayList<AminoAcidModel> aminoAcidModels = new ArrayList<AminoAcidModel>();

    int[] aminoAcidImages = {R.drawable.ic_baseline_today_24};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //ALLAGI XRWMATOS BARAS
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimary)));

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_argies);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView = findViewById(R.id.mRecyclerViewArgies);

        setAminoAcidModel();

        AA_RecyclerViewAdapterArgies adapter = new AA_RecyclerViewAdapterArgies(this,aminoAcidModels);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setAminoAcidModel(){

        String[] aminoAcidArgiesOnomata = getResources().getStringArray(R.array.argies_onomata_txt);
        String[] aminoAcidArgiesMeres = getResources().getStringArray(R.array.argies_meres_txt);
        String[] aminoAcidPagosmies = getResources().getStringArray(R.array.argies_pagosmies_txt);
        String[] aminoAcidArgies = getResources().getStringArray(R.array.argies_txt);




        for( int i=0; i<aminoAcidArgies.length; i++){


            aminoAcidModels.add(new AminoAcidModel(aminoAcidArgiesMeres[i],aminoAcidArgiesOnomata[i],emojipagosmio + " " + aminoAcidPagosmies[i],emoji1 + " Αργία : " + aminoAcidArgies[i],aminoAcidImages[0]));

        }

    }
}