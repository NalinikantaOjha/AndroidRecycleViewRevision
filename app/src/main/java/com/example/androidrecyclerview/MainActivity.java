package com.example.androidrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Model> arrayList=new ArrayList<>();
    private RecyclerView recyclerView;
    private Adapter view;
    Button button;
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        buildData();
        setRecycle();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Model Model=new Model(arrayList.size()+1);
               arrayList.add(Model);

                view.notifyDataSetChanged();
            }
        });

button1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
       // Model model=new Model(arrayList.size());
        arrayList.remove(arrayList.size()-1);
        view.notifyDataSetChanged();
    }
});
    }private void setRecycle(){
        view=new Adapter(arrayList);
        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(view);
    }
    public void initView(){
        button1=findViewById(R.id.decrement);
        button=findViewById(R.id.increment1);
        recyclerView=findViewById(R.id.recycleView);


    }private void buildData(){
        for(int i=0;i<3;i++) {
            Model sAW = new Model(arrayList.size()+1);
            arrayList.add(sAW);

        }


    }
}