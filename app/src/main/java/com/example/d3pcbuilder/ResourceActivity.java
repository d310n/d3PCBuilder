package com.example.d3pcbuilder;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class ResourceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //Add a listener to the button to take you to the temp converter
        Button btnLinkOne = (Button) findViewById(R.id.btnLinkOne);
        btnLinkOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLinkOne();
            }
        });
        //Add a listener to the button to take you to the temp converter
        Button btnLinkTwo = (Button) findViewById(R.id.btnLinkTwo);
        btnLinkTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLinkTwo();
            }
        });
        //Add a listener to the button to take you to the temp converter
        Button btnLinkThree = (Button) findViewById(R.id.btnLinkThree);
        btnLinkThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLinkThree();
            }

        });
    }

    private void goLinkOne() {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.wepc.com/how-to/build-a-gaming-pc/"));
        startActivity(browserIntent);
    }

    private void goLinkTwo() {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(" https://www.tomshardware.com/"));
        startActivity(browserIntent);
    }

    private void goLinkThree() {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.com/s?k=gaming+pc+parts&ref=nb_sb_noss_2"));
        startActivity(browserIntent);
    }

}
