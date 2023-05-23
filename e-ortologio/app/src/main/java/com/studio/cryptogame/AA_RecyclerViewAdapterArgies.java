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

public class AA_RecyclerViewAdapterArgies extends RecyclerView.Adapter<AA_RecyclerViewAdapterArgies.MyViewHolder> {

    Context context;
    ArrayList<AminoAcidModel> aminoAcidModels;


    public AA_RecyclerViewAdapterArgies(Context context, ArrayList<AminoAcidModel> aminoAcidModels){

        this.context = context;
        this.aminoAcidModels = aminoAcidModels;


    }

    @NonNull
    @Override
    public AA_RecyclerViewAdapterArgies.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recyclcer_view_row_argies,parent,false);

        return new AA_RecyclerViewAdapterArgies.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AA_RecyclerViewAdapterArgies.MyViewHolder holder, int position) {

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



    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView tvName,tvName2,tvName3,tvName4;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView15);
            tvName = itemView.findViewById((R.id.textView40));
            tvName2 = itemView.findViewById((R.id.textView41));
            tvName3 = itemView.findViewById((R.id.textView42));
            tvName4 = itemView.findViewById((R.id.textView113));

        }
    }
}
