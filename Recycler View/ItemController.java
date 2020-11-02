package com.pam.listviewpam;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class ItemController extends RecyclerView.ViewHolder implements View.OnClickListener {

    CardView cardItemLayout;
    TextView title;

    public ItemController(View itemView) {
        super(itemView);

        cardItemLayout = (CardView) itemView.findViewById(R.id.cardlist_item);
        title = (TextView) itemView.findViewById(R.id.listitem_name);

        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(),
                String.format("Position %d", getAdapterPosition()),
                Toast.LENGTH_SHORT).show();
    }
}