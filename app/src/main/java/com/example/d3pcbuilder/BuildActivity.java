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

public class BuildActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_build);
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
        Button btnStepOne=(Button) findViewById(R.id.btnStepOne);
        btnStepOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goStepOne();
            }
        });
        //Add a listener to the button to take you to the temp converter
        Button btnStepTwo =(Button) findViewById(R.id.btnStepTwo);
        btnStepTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goStepTwo();
            }
        });
        //Add a listener to the button to take you to the temp converter
        Button btnStepThree=(Button) findViewById(R.id.btnStepThree);
        btnStepThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goStepThree();
            }
        });
    }
    private void goStepOne() {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=gHY6ygHj80c&t=6s"));
        startActivity(browserIntent);
    }

    private void goStepTwo() {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=i5jFXl0GZJo&t=55s"));
        startActivity(browserIntent);
    }

    private void goStepThree() {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=WXwMbmhCQuY&t=4s"));
        startActivity(browserIntent);
    }

}
