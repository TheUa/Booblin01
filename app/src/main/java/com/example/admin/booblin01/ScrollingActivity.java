package com.example.admin.booblin01;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final CollapsingToolbarLayout collapsingToolbarLayout =
                (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout1);


        ImageView imageView = (ImageView) findViewById(R.id.backdrop);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        imageView.setBackgroundResource(R.drawable.bushmills10);

//        collapsingToolbarLayout.setBackgroundResource();
//
//        collapsingToolbarLayout.setContentScrimResource(R.drawable.jack);
//        collapsingToolbarLayout.setContentScrim(getResources().getDrawable(R.drawable.jameson));
//        collapsingToolbarLayout.setBackgroundResource(R.drawable.bushmills10);
    }
}
