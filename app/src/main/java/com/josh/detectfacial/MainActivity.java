package com.josh.detectfacial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    AutoCompleteTextView autoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.editText);
        autoCompleteTextView =(AutoCompleteTextView) findViewById(R.id.editTextTwo);


        String [] name = {"Joshua","Josh","John","Jane", "Jonhson", "Jack"};


        ArrayAdapter<String > adapter  = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,name);

        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(adapter);









    }
}
