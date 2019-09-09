package com.example.mad_libs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SportActivity extends AppCompatActivity {
    Button createSport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport);

        createSport = (Button) findViewById(R.id.createSport);
        createSport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SportActivity.this, DisplaySportActivity.class);
                startActivity(intent);
            }
        });
    }
}
