package com.example.recyclerviewspinnerassignment;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailsActivity extends AppCompatActivity {

    CircleImageView imgProfile;
    TextView tvName, tvdesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


          ActionBar name = getSupportActionBar();




        imgProfile = findViewById(R.id.imgProfile);
        tvName = findViewById(R.id.fullname);
        tvdesc = findViewById(R.id.desc);

        Bundle bundle = getIntent().getExtras();

        if(bundle!=null){
            imgProfile.setImageResource(bundle.getInt("image"));
            tvName.setText(bundle.getString("name"));
            tvdesc.setText(bundle.getString("desc"));
            name.setTitle(tvName.getText().toString());
        }

    }
}
