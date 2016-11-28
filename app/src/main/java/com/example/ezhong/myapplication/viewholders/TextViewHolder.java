package com.example.ezhong.myapplication.viewholders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.ezhong.myapplication.R;

/**
 * Created by ezhong on 11/25/16.
 */

public class TextViewHolder extends RecyclerView.ViewHolder {

    private TextView titleTextView;

    public TextViewHolder(View itemView) {
        super(itemView);
        initialiseViews();
    }

    private void initialiseViews() {
        this.titleTextView = (TextView) itemView.findViewById(R.id.title_textview);
    }

    public void setTitle(@NonNull String title) {
        this.titleTextView.setText(title);
    }
}
