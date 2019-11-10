package com.example.recyclerviewspinnerassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView  recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);

        List<President> presidentList = new ArrayList<>();
        presidentList.add(new President("Richard Nixon","Aaa",R.drawable.noavtar1));
        presidentList.add(new President("Richard Nixon","Aaa",R.drawable.noavtar1));
        presidentList.add(new President("Richard Nixon","Aaa",R.drawable.noavtar1));
        presidentList.add(new President("Richard Nixon","Aaa",R.drawable.noavtar1));
        presidentList.add(new President("Richard Nixon","Aaa",R.drawable.noavtar1));


        PresidentAdapter presidentAdapter = new PresidentAdapter(this,presidentList);
        recyclerView.setAdapter(presidentAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));


    }
}
