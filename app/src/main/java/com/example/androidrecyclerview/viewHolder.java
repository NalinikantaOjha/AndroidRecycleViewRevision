package com.example.androidrecyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class viewHolder extends RecyclerView.ViewHolder {
    public TextView textView;
    public viewHolder(@NonNull  View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        textView=itemView.findViewById(R.id.textView);

    }
    public void setData(Model model){
        textView.setText(model.getText()+"");

    }
}
