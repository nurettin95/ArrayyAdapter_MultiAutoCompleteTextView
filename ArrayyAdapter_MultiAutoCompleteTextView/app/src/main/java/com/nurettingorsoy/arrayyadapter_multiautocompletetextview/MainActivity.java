package com.nurettingorsoy.arrayyadapter_multiautocompletetextview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    MultiAutoCompleteTextView multiAutoCompleteTextView;
    ArrayAdapter<String> arrayAdapter;
    String[] degerler = {"istanbul","isviçre","ispanya","ankara","antalya","almanya","alanya"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        multiAutoCompleteTextView = findViewById(R.id.multiAutoCompleteTextView);

        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line,degerler);
        multiAutoCompleteTextView.setThreshold(2);//minimum 2 karaktertir.
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        multiAutoCompleteTextView.setAdapter(arrayAdapter);


    }
}