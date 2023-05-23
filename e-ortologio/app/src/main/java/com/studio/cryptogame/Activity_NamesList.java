package com.studio.cryptogame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.Objects;

public class Activity_NamesList extends AppCompatActivity {

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



    ArrayList<AminoAcidModel> aminoAcidModels;

    RecyclerView recyclerView;

    int[] aminoAcidImages = {R.drawable.ic_baseline_today_24};

    AA_RecyclerViewAdapterNamesList adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //ALLAGI XRWMATOS BARAS
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimary)));


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_names_list);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.mRecyclerViewNamesList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);



        aminoAcidModels = new ArrayList<AminoAcidModel>();

        setAminoAcidModel();


    }


    @SuppressLint("NotifyDataSetChanged")
    private void setAminoAcidModel() {

        int i;
        String emoji = "";
        String n_day = "";

        String[] aminoAcidMonths = getResources().getStringArray(R.array.months_txt);
        String[] aminoAcidNames = getResources().getStringArray(R.array.names_nameslist_txt);
        String[] aminoAcidDayoffs = getResources().getStringArray(R.array.dayoff_nameslist_txt);
        String[] aminoAcidPagosmies = getResources().getStringArray(R.array.pagosmies_nameslist_txt);


        for (i = 0; i < aminoAcidDayoffs.length; i++) {

            if(!aminoAcidDayoffs[i].contains("-")){ emoji=emoji1;}
            if(aminoAcidDayoffs[i].equals("-")){emoji=emoji2;}


            if (i % 7 == 0) n_day = "Κυριακή ";
            if (i % 7 == 1) n_day = "Δευτέρα ";
            if (i % 7 == 2) n_day = "Τρίτη ";
            if (i % 7 == 3) n_day = "Τετάρτη ";
            if (i % 7 == 4) n_day = "Πέμπτη ";
            if (i % 7 == 5) n_day = "Παρασκευή ";
            if (i % 7 == 6) n_day = "Σάββατο ";


            if (i < 31)
                aminoAcidModels.add(new AminoAcidModel(n_day + (i + 1) + " " + aminoAcidMonths[0], aminoAcidNames[i],emojipagosmio + " " + aminoAcidPagosmies[i], emoji + " Αργία : " + aminoAcidDayoffs[i], aminoAcidImages[0]));
            if (i >= 31 && i < 59)
                aminoAcidModels.add(new AminoAcidModel(n_day + ((i + 1) - 31) + " " + aminoAcidMonths[1], aminoAcidNames[i],emojipagosmio + " " + aminoAcidPagosmies[i], emoji + " Αργία : " + aminoAcidDayoffs[i], aminoAcidImages[0]));
            if (i >= 59 && i < 90)
                aminoAcidModels.add(new AminoAcidModel(n_day + ((i + 1) - 59) + " " + aminoAcidMonths[2], aminoAcidNames[i],emojipagosmio + " " + aminoAcidPagosmies[i], emoji + " Αργία : " + aminoAcidDayoffs[i], aminoAcidImages[0]));
            if (i >= 90 && i < 120)
                aminoAcidModels.add(new AminoAcidModel(n_day + ((i + 1) - 90) + " " + aminoAcidMonths[3], aminoAcidNames[i],emojipagosmio + " " + aminoAcidPagosmies[i], emoji + " Αργία : " + aminoAcidDayoffs[i], aminoAcidImages[0]));
            if (i >= 120 && i < 151)
                aminoAcidModels.add(new AminoAcidModel(n_day + ((i + 1) - 120) + " " + aminoAcidMonths[4], aminoAcidNames[i],emojipagosmio + " " + aminoAcidPagosmies[i], emoji + " Αργία : " + aminoAcidDayoffs[i], aminoAcidImages[0]));
            if (i >= 151 && i < 181)
                aminoAcidModels.add(new AminoAcidModel(n_day + ((i + 1) - 151) + " " + aminoAcidMonths[5], aminoAcidNames[i],emojipagosmio + " " + aminoAcidPagosmies[i], emoji + " Αργία : " + aminoAcidDayoffs[i], aminoAcidImages[0]));
            if (i >= 181 && i < 212)
                aminoAcidModels.add(new AminoAcidModel(n_day + ((i + 1) - 181) + " " + aminoAcidMonths[6], aminoAcidNames[i],emojipagosmio + " " + aminoAcidPagosmies[i], emoji + " Αργία : " + aminoAcidDayoffs[i], aminoAcidImages[0]));
            if (i >= 212 && i < 243)
                aminoAcidModels.add(new AminoAcidModel(n_day + ((i + 1) - 212) + " " + aminoAcidMonths[7], aminoAcidNames[i],emojipagosmio + " " + aminoAcidPagosmies[i], emoji + " Αργία : " + aminoAcidDayoffs[i], aminoAcidImages[0]));
            if (i >= 243 && i < 273)
                aminoAcidModels.add(new AminoAcidModel(n_day + ((i + 1) - 243) + " " + aminoAcidMonths[8], aminoAcidNames[i],emojipagosmio + " " + aminoAcidPagosmies[i], emoji + " Αργία : " + aminoAcidDayoffs[i], aminoAcidImages[0]));
            if (i >= 273 && i < 304)
                aminoAcidModels.add(new AminoAcidModel(n_day + ((i + 1) - 273) + " " + aminoAcidMonths[9], aminoAcidNames[i],emojipagosmio + " " + aminoAcidPagosmies[i], emoji + " Αργία : " + aminoAcidDayoffs[i], aminoAcidImages[0]));
            if (i >= 304 && i < 334)
                aminoAcidModels.add(new AminoAcidModel(n_day + ((i + 1) - 304) + " " + aminoAcidMonths[10], aminoAcidNames[i],emojipagosmio + " " + aminoAcidPagosmies[i], emoji + " Αργία : " + aminoAcidDayoffs[i], aminoAcidImages[0]));
            if (i >= 334 && i < 365)
                aminoAcidModels.add(new AminoAcidModel(n_day + ((i + 1) - 334) + " " + aminoAcidMonths[11], aminoAcidNames[i],emojipagosmio + " " + aminoAcidPagosmies[i], emoji + " Αργία : " + aminoAcidDayoffs[i], aminoAcidImages[0]));



        }


        adapter = new AA_RecyclerViewAdapterNamesList(this, aminoAcidModels); //
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_item,menu);
        MenuItem menuItem = menu.findItem(R.id.search_action);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setMaxWidth(Integer.MAX_VALUE);
        searchView.setQueryHint("Ψάχνω τον ...");

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                adapter.getFilter().filter(newText);

                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }

}