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


public class AA_RecyclerViewAdapterPagosmies extends RecyclerView.Adapter<AA_RecyclerViewAdapterPagosmies.MyViewHolder> implements Filterable {

    Context context;
    ArrayList<AminoAcidModel1> aminoAcidModels1;
    ArrayList<AminoAcidModel1> aminoAcidModelsFull1;


    public AA_RecyclerViewAdapterPagosmies(Context context, ArrayList<AminoAcidModel1> aminoAcidModels1){

        this.context = context;
        this.aminoAcidModelsFull1 = aminoAcidModels1;
        this.aminoAcidModels1 = new ArrayList<>(aminoAcidModelsFull1);
    }

    @NonNull
    @Override
    public AA_RecyclerViewAdapterPagosmies.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.recycler_view_row_pagosmies,parent,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AA_RecyclerViewAdapterPagosmies.MyViewHolder holder, int position) {

        AminoAcidModel1 aminoAcidModel1 = aminoAcidModels1.get(position);

        holder.tvName.setText(aminoAcidModels1.get(position).getMonth());
        holder.tvName2.setText(aminoAcidModels1.get(position).getPagosmiamera());
        holder.imageView.setImageResource(aminoAcidModels1.get(position).getImages());


    }

    @Override
    public int getItemCount() {
        return aminoAcidModels1.size();
    }

    @Override
    public Filter getFilter() {
        return namesFilter;
    }

    private final Filter namesFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence charSequence) {

            ArrayList<AminoAcidModel1> filteredNamesList = new ArrayList<>();

            if(charSequence == null || charSequence.length() == 0){

                filteredNamesList.addAll(aminoAcidModelsFull1);
            }else{

                String filterPattern = charSequence.toString().toLowerCase().trim();

                for(AminoAcidModel1 aminoAcidModel1: aminoAcidModelsFull1){

                    if(aminoAcidModel1.pagosmiamera.toLowerCase().contains(filterPattern)) {filteredNamesList.add(aminoAcidModel1);}
                }
            }
            FilterResults results = new FilterResults();
            results.values = filteredNamesList;
            results.count = filteredNamesList.size();
            return results;
        }

        @Override
        protected void publishResults(CharSequence charSequence, FilterResults results) {

            aminoAcidModels1.clear();
            aminoAcidModels1.addAll((ArrayList)results.values);
            notifyDataSetChanged();

        }
    };

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView tvName, tvName2;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView16);
            tvName = itemView.findViewById((R.id.textView43));
            tvName2 = itemView.findViewById((R.id.textView44));

        }
    }


}
