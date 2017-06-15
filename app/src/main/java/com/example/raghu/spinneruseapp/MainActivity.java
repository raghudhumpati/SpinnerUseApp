package com.example.raghu.spinneruseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner s;
    String[] country = { "India", "USA", "China", "Japan", "Other",  };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        s=(Spinner)findViewById(R.id.spinner);

        s.setOnItemSelectedListener(this);

        ArrayAdapter da=new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, country);
        da.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(da);




    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        
        Toast.makeText(getApplicationContext(),country[position] ,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
