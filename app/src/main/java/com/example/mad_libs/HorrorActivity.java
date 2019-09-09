package com.example.mad_libs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HorrorActivity extends AppCompatActivity {
    Button createHorror;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horror);

        createHorror = (Button) findViewById(R.id.createHorror);
         createHorror.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HorrorActivity.this, DisplayHorrorActivity.class);
                startActivity(intent);
            }
        });
    }
}
