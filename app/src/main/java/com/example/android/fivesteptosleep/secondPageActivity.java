package com.example.android.fivesteptosleep;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class secondPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Five Steps To Sleep", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
    }
    public void goThirdPage(View view){
        Intent intent = new Intent(this, thirdPageActivity.class);
        if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }
    }
    public void goFirstPage(View view){
        Intent intent = new Intent(this, MainActivity.class);
        if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }
    }

}
