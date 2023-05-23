package com.studio.cryptogame;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AA_RecyclerViewAdapterDecember extends RecyclerView.Adapter<AA_RecyclerViewAdapterDecember.MyViewHolder> {

    Context context;
    ArrayList<AminoAcidModel> aminoAcidModels;


    public AA_RecyclerViewAdapterDecember(Context context, ArrayList<AminoAcidModel> aminoAcidModels){

        this.context = context;
        this.aminoAcidModels = aminoAcidModels;


    }

    @NonNull
    @Override
    public AA_RecyclerViewAdapterDecember.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row_december,parent,false);

        return new AA_RecyclerViewAdapterDecember.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AA_RecyclerViewAdapterDecember.MyViewHolder holder, int position) {

        holder.tvName.setText(aminoAcidModels.get(position).getMonth());
        holder.tvName2.setText(aminoAcidModels.get(position).getNames());
        holder.tvName3.setText(aminoAcidModels.get(position).getDayoff());
        holder.tvName4.setText(aminoAcidModels.get(position).getPagosmies());
        holder.imageView.setImageResource(aminoAcidModels.get(position).getImages());


    }

    @Override
    public int getItemCount() {
        return 31;
    }



    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView tvName,tvName2,tvName3,tvName4;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView13);
            tvName = itemView.findViewById((R.id.textView34));
            tvName2 = itemView.findViewById((R.id.textView35));
            tvName3 = itemView.findViewById((R.id.textView36));
            tvName4 = itemView.findViewById((R.id.textView112));
        }
    }
}
