package com.example.ezhong.myapplication;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.ezhong.myapplication.adapters.ExampleRecyclerViewAdapter;
import com.example.ezhong.myapplication.model.Attribute;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final List<Attribute> attributes = createAttributes();

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialiseViews();
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setupViews();
    }

    private void initialiseViews(){
        this.recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
    }

    private void setupViews() {
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.recyclerView.setAdapter(new ExampleRecyclerViewAdapter(attributes));

    }

    private static List<Attribute> createAttributes() {
        List<Attribute> attributes = new ArrayList<>();
        attributes.add(new Attribute("Make", 1111, Attribute.TYPE_INPUT, "Car make"));
        attributes.add(new Attribute("Model", 1111, Attribute.TYPE_TEXT, "Car make"));
        attributes.add(new Attribute("Kilometres", 1111, Attribute.TYPE_INPUT, "Car make"));
        attributes.add(new Attribute("Body style", 1111, Attribute.TYPE_TEXT, "Car make"));
        return attributes;
    }
}
