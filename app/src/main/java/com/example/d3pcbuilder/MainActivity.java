package com.example.d3pcbuilder;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        Button btnBuild=(Button) findViewById(R.id.btnBuild);
        btnBuild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goBuild();
            }
        });

        //Add a listener to the button to take you to the temp converter
        Button btnResources =(Button) findViewById(R.id.btnResources);
        btnResources.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goResources();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch(id){
            case R.id.mnuHome:
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                return true;
            case R.id.mnuBuild:
                startActivity(new Intent(getApplicationContext(), BuildActivity.class));
                return true;
            case R.id.mnuResources:
                startActivity(new Intent(getApplicationContext(), ResourceActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }



    private void goBuild() {
        Intent intent = new Intent(MainActivity.this, BuildActivity.class);
        this.startActivity(intent);
    }

    private void goResources() {
        Intent intent = new Intent(MainActivity.this, ResourceActivity.class);
        this.startActivity(intent);
    }
}
