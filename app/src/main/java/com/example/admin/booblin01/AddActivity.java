package com.example.admin.booblin01;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class AddActivity extends AppCompatActivity {
    private TextView item;
    private Spinner addSpinner;
    private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Добавить должника");

        item = (TextView) findViewById(R.id.add_item);
        addSpinner = (Spinner) findViewById(R.id.add_spinner);
        saveButton = (Button) findViewById(R.id.add_button);


        ArrayAdapter<?> adapter =
                ArrayAdapter.createFromResource(this, R.array.mix, R.layout.spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        addSpinner.setAdapter(adapter);

        addSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i) {
                    case 0:
                        item.setText("Jameson +200 \n" +
                                "Nemiroff -175");
                        break;
                    case 1:
                        item.setText("Bushmills +200 \n" +
                                "Nemiroff -175");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

}
