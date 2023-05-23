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

public class Activity_Pagosmies extends AppCompatActivity {

    int unicode=0x1F310	;
    String emoji = getEmoji(unicode);

    public String getEmoji(int uni){
        return new String(Character.toChars(uni));
    }


    ArrayList<AminoAcidModel1> aminoAcidModels1;

    RecyclerView recyclerView;

    int[] aminoAcidImages = {R.drawable.ic_baseline_today_24};

    AA_RecyclerViewAdapterPagosmies adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //ALLAGI XRWMATOS BARAS
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimary)));


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagosmies);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.mRecyclerViewPagosmies);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);


        aminoAcidModels1 = new ArrayList<AminoAcidModel1>();

        setAminoAcidModel1();
    }

    @SuppressLint("NotifyDataSetChanged")
    private void setAminoAcidModel1() {

        int i;

        String[] aminoAcidPagosmiesMeres = getResources().getStringArray(R.array.pagosmies_meres_txt);
        String[] aminoAcidPagosmies = getResources().getStringArray(R.array.pagosmies_txt);

        for (i = 0; i <aminoAcidPagosmies.length; i++) {

            aminoAcidModels1.add(new AminoAcidModel1(aminoAcidPagosmiesMeres[i],emoji + " " + aminoAcidPagosmies[i], aminoAcidImages[0]));

        }




        adapter = new AA_RecyclerViewAdapterPagosmies(this, aminoAcidModels1); //
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_item,menu);
        MenuItem menuItem = menu.findItem(R.id.search_action);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setMaxWidth(Integer.MAX_VALUE);
        searchView.setQueryHint("Παγκόσμια μέρα ...");

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