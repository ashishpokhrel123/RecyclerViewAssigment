package com.example.recyclerviewspinnerassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Form extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText et1,et2,et3;
    Spinner spiner1;
    Button btn1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);


        getSupportActionBar().setTitle("Personal");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        initView();
        final Spinner spinner = findViewById(R.id.spin1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.address,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);



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


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(),text,Toast.LENGTH_LONG).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

