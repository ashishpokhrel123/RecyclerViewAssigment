package com.example.recyclerviewspinnerassignment;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class PresidentAdapter extends  RecyclerView.Adapter <PresidentAdapter.PresidentViewHolder> {
    Context mContext;
    List<President> presidentsList;

    public PresidentAdapter(Context mContext, List<President> presidentsList){

        this.mContext= mContext;
        this.presidentsList= presidentsList;

    }

    @NonNull
    @Override
    public PresidentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {



        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.president,parent,false);
        return new PresidentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PresidentViewHolder holder, int position) {

         final President president = presidentsList.get(position);
        holder.img.setImageResource(president.getImgid());
        holder.txtpname.setText(president.getName());


        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext,DetailsActivity.class);

                intent.putExtra("image",president.getImgid());
                intent.putExtra("name",president.getName());
                intent.putExtra("desc",president.getDesc());

                mContext.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {

        return presidentsList.size();
    }




    public class PresidentViewHolder extends RecyclerView.ViewHolder{

        CircleImageView img;
        TextView txtpname,desc;
        CardView cardView;

        public PresidentViewHolder(@NonNull View itemView) {
            super(itemView);

            txtpname= itemView.findViewById(R.id.pres_name) ;
            img =  itemView.findViewById(R.id.pres_img);
            desc = itemView.findViewById(R.id.desc);

        }
    }
}
