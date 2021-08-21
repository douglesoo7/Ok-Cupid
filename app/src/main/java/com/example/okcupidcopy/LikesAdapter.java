package com.example.okcupidcopy;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LikesAdapter  extends RecyclerView.Adapter<LikesViewHolder> {
    private ArrayList<LikesItems> items;
    private OnClickListner onClickListner;
    public LikesAdapter(ArrayList<LikesItems> items,OnClickListner onClickListner){
        this.items=items;
        this.onClickListner=onClickListner;
    }
    @NonNull
    @Override
    public LikesViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_likes_items,parent,false);
        return new LikesViewHolder(view,onClickListner);
    }

    @Override
    public void onBindViewHolder(@NonNull  LikesViewHolder holder, int position) {
        LikesItems likesItems=items.get(position);
        holder.setData(likesItems);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}