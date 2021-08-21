package com.example.okcupidcopy;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class ViewHolder extends RecyclerView.ViewHolder {

    private TextView mName;
    private TextView mAge;
    private TextView mState;
    private TextView msumm;
    private ImageView mImg;




    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);

    }

    private void initView(View itemView) {
        mName=itemView.findViewById(R.id.name);
        mAge=itemView.findViewById(R.id.age);
        mState=itemView.findViewById(R.id.place);
        msumm=itemView.findViewById(R.id.myself);
        mImg=itemView.findViewById(R.id.image);
    }

    public  void setData(ProfileDTO profileDTO){
        mName.setText(profileDTO.getName());
        mAge.setText(profileDTO.getAge());
        mState.setText(profileDTO.getState());
        msumm.setText(profileDTO.getSelfSummary());
        //mImg.setImageResource(Integer.parseInt(profileDTO.getProfile()));
        Glide.with(mImg).load(profileDTO.getProfile()).into(mImg);

    }

}

