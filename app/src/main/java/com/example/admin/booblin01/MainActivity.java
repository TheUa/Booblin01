package com.example.admin.booblin01;


import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.preference.AndroidResources;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Toolbar mToolbar;
    private static long back_pressed;
    private CatTask catTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

//        getFragmentManager().beginTransaction().replace(R.id.content_frame, new ExpandableFragment()).commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, mToolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(new MyFragmentPagerAdapter(getSupportFragmentManager()));

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override


            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        viewPager.setCurrentItem(0);
                        mToolbar.setTitle("Виски");
                        break;
                    case 1:
                        viewPager.setCurrentItem(1);
                        mToolbar.setTitle("Водка");
                        break;
                    case 2:
                        viewPager.setCurrentItem(2);
                        mToolbar.setTitle("Пиво");
                        break;
                    case 3:
                        viewPager.setCurrentItem(3);
                        mToolbar.setTitle("Ром/Текила/Джин");
                        break;
                    case 4:
                        viewPager.setCurrentItem(4);
                        mToolbar.setTitle("Ликеры/Настойки");
                        break;
                    case 5:
                        viewPager.setCurrentItem(5);
                        mToolbar.setTitle("Напитки");
                        break;
                    default:
                        viewPager.setCurrentItem(tab.getPosition());
                        mToolbar.setTitle("Первое правило :)");
                        break;

                }

            }


            @Override


            public void onTabUnselected(TabLayout.Tab tab) {

            }


            @Override


            public void onTabReselected(TabLayout.Tab tab) {

            }

        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
            return;
        } else if (back_pressed + 2000 > System.currentTimeMillis())
            super.onBackPressed();
        else
            Toast.makeText(getBaseContext(), "Press once again to exit!",
                    Toast.LENGTH_SHORT).show();
        back_pressed = System.currentTimeMillis();
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_add) {
            Intent intent = new Intent(this, AddActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_coctail) {
            Toast.makeText(this, "В разработке", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_dolg) {
            Toast.makeText(this, "В разработке", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_share) {
            Toast.makeText(this, "В разработке", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_send) {
            Toast.makeText(this, "В разработке", Toast.LENGTH_SHORT).show();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    class CatTask extends AsyncTask<Void, Void, Void> {


        private ProgressDialog pDialog;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = ProgressDialog.show(MainActivity.this, "Подожди...", "обновляются данные...", true);
            pDialog.setCancelable(false);

//            new DialogInterface.OnCancelListener() {
//                @Override
//                public void onCancel(DialogInterface dialogInterface) {
//                    catTask.cancel(true);
//                }
//
//            };
        }

        @Override
        protected Void doInBackground(Void... params) {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);

            Toast.makeText(MainActivity.this, "Цифарки обновились", Toast.LENGTH_LONG).show();
            if (pDialog.isShowing()) {
                pDialog.dismiss();
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_refresh, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.refresh) {
            catTask = new CatTask();
            catTask.execute();
        }

        return super.onOptionsItemSelected(item);
    }


}
