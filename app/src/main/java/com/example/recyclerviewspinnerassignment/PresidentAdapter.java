package com.example.recyclerviewspinnerassignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class PresidentAdapter extends  RecyclerView.Adapter <PresidentAdapter.PresidentViewHolder>{
    Context mContext;
    List<President> presidentsList;

    public PresidentAdapter(Context mContext, List<President> presidentsList){

        this.mContext= mContext;
        this.presidentsList= presidentsList;

    }

    @NonNull
    @Override
    public PresidentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.president,parent,false);

        return new PresidentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PresidentViewHolder holder, int position) {

         President president = presidentsList.get(position);
        holder.img.setImageResource(president.getImgid());
        holder.tvname.setText(president.getName());


    }

    @Override
    public int getItemCount() {

        return presidentsList.size();
    }

    public class PresidentViewHolder extends RecyclerView.ViewHolder{

        CircleImageView img;
        TextView tvname;

        public PresidentViewHolder(@NonNull View itemView) {
            super(itemView);

            tvname = itemView.findViewById(R.id.tvName);
            img = itemView.findViewById(R.id.img);
        }
    }
}
