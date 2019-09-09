package com.example.mad_libs;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FunnyActivity extends AppCompatActivity {
    Button createFunny;
    EditText name,place,animal, motion, adj1, adj2, verb2, otherAnimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funny);


        createFunny = (Button) findViewById(R.id.createFunny);
        motion = (EditText) findViewById(R.id.funnyMotion);
        name = (EditText) findViewById(R.id.funnyName);
        place = (EditText) findViewById(R.id.funnyPlace);
        animal = (EditText) findViewById(R.id.funnyAnimal);
        adj1 = (EditText) findViewById(R.id.adj1);
        adj2 = (EditText) findViewById(R.id.adj2);
        verb2 = (EditText) findViewById(R.id.verb2);
        otherAnimal = (EditText) findViewById(R.id.otherAnimal);

    }

    public void sendInfo(View v){
        try {
            String myNameStr = name.getText().toString();
            String myMotionStr = motion.getText().toString();
            String myPlaceStr = place.getText().toString();
            String myAnimalStr = animal.getText().toString();
            String myAdjStr = adj1.getText().toString();
            String myAdj2Str = adj2.getText().toString();
            String myVerb2Str = verb2.getText().toString();
            String myOtherAnimalStr = otherAnimal.getText().toString();

            Intent intent = new Intent(FunnyActivity.this, DisplayFunnyActivity.class);
            intent.putExtra(DisplayFunnyActivity.MY_NAME, myNameStr);
            intent.putExtra(DisplayFunnyActivity.MY_MOTION, myMotionStr);
            intent.putExtra(DisplayFunnyActivity.MY_PLACE, myPlaceStr);
            intent.putExtra(DisplayFunnyActivity.MY_ANIMAL, myAnimalStr);
            intent.putExtra(DisplayFunnyActivity.MY_ADJ1, myAdjStr);
            intent.putExtra(DisplayFunnyActivity.MY_ADJ2, myAdj2Str);
            intent.putExtra(DisplayFunnyActivity.MY_VERB2, myVerb2Str);
            intent.putExtra(DisplayFunnyActivity.MY_OTHER_ANIMAL, myOtherAnimalStr);

            startActivity(intent);
        }

        catch(Exception e){
            Toast.makeText(this, "please enter correct values", Toast.LENGTH_SHORT).show();
        }

    }
    public void shareInfo(View v){
        String myNameStr = name.getText().toString();
        String myMotionStr = motion.getText().toString();
        String myPlaceStr = place.getText().toString();
        String myAnimalStr = animal.getText().toString();
        String myAdjStr = adj1.getText().toString();
        String myAdj2Str = adj2.getText().toString();
        String myVerb2Str = verb2.getText().toString();
        String myOtherAnimalStr = otherAnimal.getText().toString();

        String myMessage = myNameStr + " " +  myMotionStr  + " down the street to the nearest " + myPlaceStr + " and out of no where a(n) " + myAnimalStr + " jumps in front of " + myNameStr + ". " +
                myNameStr + " tries not to " + myMotionStr + " but the " + myAdjStr + " " + myAnimalStr + " starts to come closer. " + myNameStr + "  just cant hold back at how " +  myAdj2Str +
                " the " + myAnimalStr + " is and decides to take it home. " + myNameStr + "'s parents " + myVerb2Str + " out but " + myNameStr + "persuades them into keeping the " + myAnimalStr +
                ". Now it is part of their family. But to everyone's surprise, they find out it's actually a(n) " + myOtherAnimalStr + "!  DUH DUH DUUUH.";;

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(intent.EXTRA_TEXT, myMessage);

        String chooserTitle = getString(R.string.app_name);

        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);
        startActivity(chosenIntent);
    }

}
