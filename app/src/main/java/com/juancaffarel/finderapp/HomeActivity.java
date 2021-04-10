package com.juancaffarel.finderapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.juancaffarel.finderapp.adapter.DemoAdapter;
import com.juancaffarel.finderapp.models.Demo;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        List<Demo> demoList = new ArrayList<>();

        demoList.add(new Demo("Basic map",MapsActivity.class));

        DemoAdapter adapter = new DemoAdapter(demoList,this);

        RecyclerView rvDemos = findViewById(R.id.rvDemos);

        rvDemos.setAdapter(adapter);

        rvDemos.setHasFixedSize(true);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);

        rvDemos.setLayoutManager(manager);

    }
}