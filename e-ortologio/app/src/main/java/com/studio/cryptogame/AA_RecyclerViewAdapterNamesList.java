package com.studio.cryptogame;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;


public class AA_RecyclerViewAdapterNamesList extends RecyclerView.Adapter<AA_RecyclerViewAdapterNamesList.MyViewHolder> implements Filterable {

    Context context;
    ArrayList<AminoAcidModel> aminoAcidModels;
    ArrayList<AminoAcidModel> aminoAcidModelsFull;


    public AA_RecyclerViewAdapterNamesList(Context context, ArrayList<AminoAcidModel> aminoAcidModels){

        this.context = context;
        this.aminoAcidModelsFull = aminoAcidModels;
        this.aminoAcidModels = new ArrayList<>(aminoAcidModelsFull);
    }

    @NonNull
    @Override
    public AA_RecyclerViewAdapterNamesList.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View v = LayoutInflater.from(context).inflate(R.layout.recycler_view_row_nameslist,parent,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AA_RecyclerViewAdapterNamesList.MyViewHolder holder, int position) {

        AminoAcidModel aminoAcidModel = aminoAcidModels.get(position);

        holder.tvName.setText(aminoAcidModels.get(position).getMonth());
        holder.tvName2.setText(aminoAcidModels.get(position).getNames());
        holder.tvName3.setText(aminoAcidModels.get(position).getDayoff());
        holder.tvName4.setText(aminoAcidModels.get(position).getPagosmies());
        holder.imageView.setImageResource(aminoAcidModels.get(position).getImages());


    }

    @Override
    public int getItemCount() {
        return aminoAcidModels.size();
    }

    @Override
    public Filter getFilter() {
        return namesFilter;
    }

    private final Filter namesFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence charSequence) {

            ArrayList<AminoAcidModel> filteredNamesList = new ArrayList<>();

            if(charSequence == null || charSequence.length() == 0){

                filteredNamesList.addAll(aminoAcidModelsFull);
            }else{

                String filterPattern = charSequence.toString().toLowerCase().trim();

                for(AminoAcidModel aminoAcidModel: aminoAcidModelsFull){

                    if(aminoAcidModel.names.toLowerCase().contains(filterPattern)) {filteredNamesList.add(aminoAcidModel);}
                }
            }
         FilterResults results = new FilterResults();
            results.values = filteredNamesList;
            results.count = filteredNamesList.size();
            return results;
        }

        @Override
        protected void publishResults(CharSequence charSequence, FilterResults results) {

            aminoAcidModels.clear();
            aminoAcidModels.addAll((ArrayList)results.values);
            notifyDataSetChanged();

        }
    };

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView tvName, tvName2, tvName3, tvName4;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView14);
            tvName = itemView.findViewById((R.id.textView37));
            tvName2 = itemView.findViewById((R.id.textView38));
            tvName3 = itemView.findViewById((R.id.textView39));
            tvName4 = itemView.findViewById((R.id.textView100));
        }
    }


}
