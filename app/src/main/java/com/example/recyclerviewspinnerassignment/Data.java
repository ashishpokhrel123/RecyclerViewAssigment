package com.example.recyclerviewspinnerassignment;

import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Data extends AppCompatActivity {

    TextView tvName, tvphone, tvaddress;
    Spinner address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        tvName = findViewById(R.id.etname);
        tvphone = findViewById(R.id.etphone);
        address = findViewById(R.id.spin1);

        Bundle bundleForm = getIntent().getExtras();
        if(bundleForm != null){
            tvName.setText(bundleForm.getString("formName"));
            tvphone.setText(bundleForm.getString("formPhone"));
            tvaddress.setText(bundleForm.getString("formAddress"));
        }
        else{
            Toast.makeText(this, "No Message", Toast.LENGTH_LONG).show();
        }
    }
}
