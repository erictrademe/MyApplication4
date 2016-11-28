package com.example.ezhong.myapplication.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ezhong.myapplication.R;
import com.example.ezhong.myapplication.model.Attribute;
import com.example.ezhong.myapplication.viewholders.InputViewHolder;
import com.example.ezhong.myapplication.viewholders.TextViewHolder;

import java.util.List;

/**
 * Created by ezhong on 11/25/16.
 */

public class ExampleRecyclerViewAdapter extends RecyclerView.Adapter {

    private final List<Attribute> attributes;

    public ExampleRecyclerViewAdapter(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        switch (viewType) {
            case Attribute.TYPE_TEXT:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.text_viewholder, null);
                return new TextViewHolder(view);
            case Attribute.TYPE_INPUT:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.input_viewholder, null);
                return new InputViewHolder(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Attribute attribute = this.attributes.get(position);
        int viewType = getItemViewType(position);

        switch (viewType) {
            case Attribute.TYPE_TEXT:
                bindTextViewHolder((TextViewHolder) holder, attribute);
                break;
            case Attribute.TYPE_INPUT:
                bindInputViewHolder((InputViewHolder) holder, attribute);
                break;
        }
    }

    private void bindTextViewHolder (@NonNull TextViewHolder textViewHolder, @NonNull Attribute attribute) {
        textViewHolder.setTitle(attribute.getName());
    }

    private void bindInputViewHolder(@NonNull InputViewHolder inputViewHolder, @NonNull Attribute attribute) {
        inputViewHolder.setHint(attribute.getName());
        //inputViewHolder.setError(attribute.getName() + " has an error");
    }

    @Override
    public int getItemViewType(int position) {
        Attribute attribute = this.attributes.get(position);
        return attribute.getType();
    }

    @Override
    public int getItemCount() {
        return attributes.size();
    }
}
