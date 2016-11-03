package com.example.admin.booblin01;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
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

        item = (TextView) findViewById(R.id.add_item);
        addSpinner = (Spinner) findViewById(R.id.add_spinner);
        saveButton = (Button) findViewById(R.id.add_button);


    }

}
