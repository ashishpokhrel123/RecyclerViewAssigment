package com.example.recyclerviewspinnerassignment;

import android.os.Bundle;

import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class Data extends AppCompatActivity {

    TextView tvName, tvphone, tvaddress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        tvName = findViewById(R.id.etname);
        tvphone = findViewById(R.id.etphone);
        tvaddress = findViewById(R.id.desc);

        Bundle bundleForm = getIntent().getExtras();
        if(bundleForm != null){
            tvName.setText(bundleForm.getString("formName"));
            tvphone.setText(bundleForm.getString("formEmail"));
            tvaddress.setText(bundleForm.getString("formCountry"));
        }
        else{
            Toast.makeText(this, "No Message", Toast.LENGTH_LONG).show();
        }


    }
}
