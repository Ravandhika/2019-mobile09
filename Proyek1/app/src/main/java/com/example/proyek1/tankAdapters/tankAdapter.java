package com.example.proyek1.tankAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyek1.R;
import com.example.proyek1.tankModels.tankModel;

import java.util.ArrayList;

public class tankAdapter extends RecyclerView.Adapter<tankAdapter.ViewHolder> {
    private Context mContext;
    private ArrayList<tankModel>mList;
    public tankAdapter(Context context, ArrayList<tankModel> list){
        mContext = context;
        mList = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.tank_layout,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        tankModel tankitem = mList.get(position);
        ImageView image = holder.tankImage;
        TextView name, desc;

        name = holder.tankName;
        desc = holder.tankDesc;

        image.setImageResource(tankitem.TankImg);
        name.setText(tankitem.tankName);
        desc.setText(tankitem.tankDesc);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView tankImage;
        TextView tankName,tankDesc;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tankImage = itemView.findViewById(R.id.tankImg);
            tankName = itemView.findViewById(R.id.tankName);
            tankDesc =itemView.findViewById(R.id.tankDesc);
        }
    }


}
