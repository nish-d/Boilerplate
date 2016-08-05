package com.alphalabz.nishitadutta.boilerplate.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alphalabz.nishitadutta.boilerplate.Objects.POJO;
import com.alphalabz.nishitadutta.boilerplate.R;

import java.util.ArrayList;

/**
 * Created by Nishita on 05-08-2016.
 */
public class CustomRecyclerViewAdapter extends RecyclerView.Adapter<CustomRecyclerViewAdapter.POJOHolder> {

    Context context;
    ArrayList<POJO> arrayList;

    public CustomRecyclerViewAdapter(Context context, ArrayList<POJO> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    @Override
    public POJOHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(android.R.layout.activity_list_item, parent, false);
        return new POJOHolder(itemView);

    }

    @Override
    public void onBindViewHolder(POJOHolder holder, int position) {

    }

    public class POJOHolder extends RecyclerView.ViewHolder{
        public POJOHolder(View itemView) {
            super(itemView);
        }
    }
}
