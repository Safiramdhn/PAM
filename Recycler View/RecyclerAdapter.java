package com.pam.listviewpam;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class MyRecyclerAdapter extends RecyclerView.Adapter {

    Context context;
    List versionModels;

    public static List titleBook = new ArrayList();

    public void setCardList(Context context) {
        String[] listArray = context.getResources().getStringArray(R.array.book_list);
        for (int i = 0; i < listArray.length; ++i) {
            titleBook.add(listArray[i]);
        }
    }

    public MyRecyclerAdapter(Context context) {
        this.context = context;
        setCardList(context);
    }


    public MyRecyclerAdapter(List versionModels) {
        this.versionModels = versionModels;

    }

    @Override
    public ItemController onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_recycle, viewGroup, false);
        ItemController viewHolder = new ItemController(view);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(ItemController versionViewHolder, int i) {
        versionViewHolder.title.setText(titleBook.get(i));
    }

    @Override
    public int getItemCount() {
        return titleBook == null ? 0 : titleBook.size();
    }

}
