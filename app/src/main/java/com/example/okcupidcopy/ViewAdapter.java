package com.example.okcupidcopy;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ViewAdapter extends RecyclerView.Adapter<ViewHolder> {
    private List<ProfileDTO> dataDTOList;

    public ViewAdapter(List<ProfileDTO> dataDTOList) {
        this.dataDTOList = dataDTOList;
    }

//    @NonNull
//    @Override
//    public CardStackAdapter.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
//        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
//        return new ViewHolder(view);
//    }


    @NonNull

    @Override
    public ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  ViewHolder holder, int position) {
        ProfileDTO profileDTO=dataDTOList.get(position);
        holder.setData(profileDTO);
    }


    @Override
    public int getItemCount() {
        return dataDTOList.size();
    }

    public void updateData(List<ProfileDTO>dataDTOList) {
        this.dataDTOList=dataDTOList;
        notifyDataSetChanged();
    }
}
