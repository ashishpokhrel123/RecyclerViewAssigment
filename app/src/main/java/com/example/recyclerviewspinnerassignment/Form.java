package com.example.recyclerviewspinnerassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Form extends AppCompatActivity {

    EditText et1,et2,et3;
    Spinner spiner1;
    Button btn1;

    public static final String address[]={
            "Kathmandu",
            "Pokhara",
            "Birthnagar",
            "Dharan",
            "Ithari",
            "Nepalgunj",
            "BUtwal",
            "Lumbini",
            "Illam",
            "Nuwakot"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);


        initView();

        ArrayAdapter adapter = new ArrayAdapter<>(this,
                R.layout.support_simple_spinner_dropdown_item,
                address);

        spiner1.setAdapter(adapter);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name, phone, address;
                name = et1.getText().toString();
                phone = et2.getText().toString();
                address = spiner1.getSelectedItem().toString();

                Intent intentForm = new Intent(Form.this, Data.class);
                intentForm.putExtra("formName", name);
                intentForm.putExtra("formPhone", phone);
                intentForm.putExtra("formAddress", address);
                startActivity(intentForm);
            }
        });
    }


    private void initView() {
        et1 = findViewById(R.id.etname);
        et2 = findViewById(R.id.etphone);
        btn1 = findViewById(R.id.btnreg);
        spiner1 = findViewById(R.id.spin1);
    }



    }

