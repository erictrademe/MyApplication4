package com.example.ezhong.myapplication.viewholders;

import android.support.annotation.NonNull;
import android.support.design.widget.TextInputLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ezhong.myapplication.R;

/**
 * Created by ezhong on 11/25/16.
 */

public class InputViewHolder extends RecyclerView.ViewHolder {

    private TextInputLayout inputTextInputLayout;
    private EditText inputEditText;

    public InputViewHolder(View itemView) {
        super(itemView);
        initialiseViews(itemView);
    }

    private void initialiseViews(@NonNull View itemView) {
        this.inputTextInputLayout = (TextInputLayout) itemView.findViewById(R.id.input_textinputlayout);
        this.inputEditText = (EditText) itemView.findViewById(R.id.input_edittext);
    }

    public void setError(@NonNull String errorText) {
        this.inputTextInputLayout.setError(errorText);
    }

    public void setHint(@NonNull String hintText) {
        this.inputEditText.setHint(hintText);
    }
}
