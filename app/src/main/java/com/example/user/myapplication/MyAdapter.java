package com.example.user.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by USER on 16-02-2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
String[]versions;

    public MyAdapter(String[] versions) {
        this.versions = versions;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list,null);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.textView.setText(versions[position]);
    }

    @Override
    public int getItemCount() {
        return versions.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
TextView textView;
    public MyViewHolder(View itemView) {
        super(itemView);
        textView=(TextView)itemView.findViewById(R.id.tv1);
    }
}

}
