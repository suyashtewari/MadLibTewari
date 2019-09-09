package com.example.mad_libs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayFunnyActivity extends AppCompatActivity {
    public static final String MY_NAME = "name";
    public static final String MY_MOTION = "motion";
    public static final String MY_PLACE = "place";
    public static final String MY_ANIMAL = "animal";
    public static final String MY_ADJ1 = "adjective";
    public static final String MY_ADJ2 = "adjective";
    public static final String MY_VERB2 = "verb";
    public static final String MY_OTHER_ANIMAL = "animal2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_funny);

        Intent intent = getIntent();
        String myName = intent.getStringExtra(MY_NAME);
        String myMotion = intent.getStringExtra(MY_MOTION);
        String myPlace = intent.getStringExtra(MY_PLACE);
        String myAnimal = intent.getStringExtra(MY_ANIMAL);
        String myAdj1 = intent.getStringExtra(MY_ADJ1);
        String myAdj2 = intent.getStringExtra(MY_ADJ2);
        String myVerb2 = intent.getStringExtra(MY_VERB2);
        String myOtherAnimal = intent.getStringExtra(MY_OTHER_ANIMAL);


        String strToDisplay = myName + " " +  myMotion  + " down the street to the nearest " + myPlace + " and out of no where a(n) " + myAnimal + " jumps in front of " + myName + ". " +
                myName + " tries not to " + myMotion + " but the " + myAdj1 + " " + myAnimal + " starts to come closer. " + myName + "  just cant hold back at how " +  myAdj2 +
                " the " + myAnimal + " is and decides to take it home. " + myName + "'s parents " + myVerb2 + " out but " + myName + "persuades them into keeping the " + myAnimal +
                ". Now it is part of their family. But to everyone's surprise, they find out it's actually a(n) " + myOtherAnimal + "!  DUH DUH DUUUH.";
        TextView str = (TextView) findViewById(R.id.DisplayFunny);
        str.setText(strToDisplay);
    }
}
