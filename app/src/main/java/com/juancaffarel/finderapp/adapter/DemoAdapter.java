package com.juancaffarel.finderapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.juancaffarel.finderapp.R;
import com.juancaffarel.finderapp.models.Demo;
import com.juancaffarel.finderapp.viewholders.DemoViewHolder;

import java.util.List;

public class DemoAdapter extends RecyclerView.Adapter<DemoViewHolder> {
    private List<Demo> demoList;
    private Context ctx;

    public DemoAdapter(List<Demo> demoList, Context ctx) {
        this.demoList = demoList;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public DemoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_map_example,parent,false);
        return new DemoViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull DemoViewHolder holder, int i) {
        holder.tvDemo.setText(demoList.get(i).getName());

        holder.cvDemoContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ctx,demoList.get(holder.getAdapterPosition()).getActivity());
                ctx.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return demoList.size();
    }
}
