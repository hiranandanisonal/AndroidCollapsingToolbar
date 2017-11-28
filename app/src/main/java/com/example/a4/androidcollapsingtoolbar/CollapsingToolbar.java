package com.example.a4.androidcollapsingtoolbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

public class CollapsingToolbar extends AppCompatActivity {



    ImageView img;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toolbar);

        toolbar=(Toolbar)findViewById(R.id.toolbar);
        toolbar.setLogo(R.mipmap.ic_launcher);

        setSupportActionBar(toolbar);
        toolbar.setTitle(R.string.app_name);

    }


}
