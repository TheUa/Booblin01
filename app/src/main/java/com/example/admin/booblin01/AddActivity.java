package com.example.admin.booblin01;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AddActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private TextView item;
    private Spinner addSpinner;
    private Button saveButton;
    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle(getString(R.string.add));

        item = (TextView) findViewById(R.id.add_item);
        addSpinner = (Spinner) findViewById(R.id.add_spinner);
        saveButton = (Button) findViewById(R.id.add_button);

        databaseHelper = new DatabaseHelper(this);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

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
                                "Nemiroff -175 \n" +
                                "Cola -25");
                        break;
                    case 1:
                        item.setText("Bushmills +200 \n" +
                                "Nemiroff -175\n" +
                                "Cola -25");
                        break;
                    case 2:
                        item.setText("Bells +100 \n" +
                                "Nemiroff -90 \n" +
                                "Cola -10");
                        break;
                    case 3:
                        item.setText("Jose Cuervo Silver +300 \n" +
                                "Nemiroff -300");
                        break;
                    case 4:
                        item.setText("Gordons +300 \n" +
                                "Nemiroff -300");
                        break;
                    case 5:
                        item.setText("Jagermeister +150 \n" +
                                "Nemiroff -50 \n" +
                                "Сахарный сироп -100");
                        break;
                    case 6:
                        item.setText("Smirnoff +250 \n" +
                                "Nemiroff -250");
                        break;
                    case 7:
                        item.setText("Capitan Morgan Gold +200 \n" +
                                "Nemiroff -175 \n" +
                                "Cola -25");

                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar c = Calendar.getInstance();
                SimpleDateFormat df = new SimpleDateFormat("dd MMM yyyy");
                String formattedDate = df.format(c.getTime());
                int i = addSpinner.getSelectedItemPosition();
                Toast.makeText(AddActivity.this, "Вкусняшка сохранена", Toast.LENGTH_LONG).show();

                switch (i) {
                    case 0:
                        databaseHelper.addNewsItem(new NewsItem(formattedDate, 200), databaseHelper.DATABASE_JAMESON);
                        databaseHelper.addNewsItem(new NewsItem(formattedDate, -175), databaseHelper.DATABASE_NEMIROFF);
                        break;
                    case 1:
                        databaseHelper.addNewsItem(new NewsItem(formattedDate, 200), databaseHelper.DATABASE_BUSHMILLS);
                        databaseHelper.addNewsItem(new NewsItem(formattedDate, -175), databaseHelper.DATABASE_NEMIROFF);
                        break;
                    case 2:
                        databaseHelper.addNewsItem(new NewsItem(formattedDate, 100), databaseHelper.DATABASE_BELLS);
                        databaseHelper.addNewsItem(new NewsItem(formattedDate, -100), databaseHelper.DATABASE_NEMIROFF);
                        break;
                    case 3:
                        databaseHelper.addNewsItem(new NewsItem(formattedDate, 300), databaseHelper.DATABASE_JOSE_CUERVO_SILVER);
                        databaseHelper.addNewsItem(new NewsItem(formattedDate, -300), databaseHelper.DATABASE_NEMIROFF);
                        break;
                    case 4:
                        databaseHelper.addNewsItem(new NewsItem(formattedDate, 300), databaseHelper.DATABASE_GORDONS);
                        databaseHelper.addNewsItem(new NewsItem(formattedDate, -300), databaseHelper.DATABASE_NEMIROFF);
                        break;
                    case 5:
                        databaseHelper.addNewsItem(new NewsItem(formattedDate, 150), databaseHelper.DATABASE_JAGERMEISTER);
                        databaseHelper.addNewsItem(new NewsItem(formattedDate, -50), databaseHelper.DATABASE_NEMIROFF);
                        break;

                    case 6:
                        databaseHelper.addNewsItem(new NewsItem(formattedDate, 250), databaseHelper.DATABASE_SMIRNOFF);
                        databaseHelper.addNewsItem(new NewsItem(formattedDate, -250), databaseHelper.DATABASE_NEMIROFF);
                        break;
                    case 7:
                        databaseHelper.addNewsItem(new NewsItem(formattedDate, 200), databaseHelper.DATABASE_MORGAN_GOLD);
                        databaseHelper.addNewsItem(new NewsItem(formattedDate, -175), databaseHelper.DATABASE_NEMIROFF);
                        break;

                }

            }
        });

    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_menu) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        if (id == R.id.nav_add) {

        } else if (id == R.id.nav_coctail) {

        } else if (id == R.id.nav_dolg) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

}
