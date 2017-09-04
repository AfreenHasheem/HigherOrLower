package com.example.afreen.higherorlowernumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void makeToast(String string)
    {
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();
    }

    public void guess(View view)
    {
        EditText guessEditText = (EditText) findViewById(R.id.guessEditText);

        int guessInt = Integer.parseInt(guessEditText.getText().toString());

        if(guessInt>randomNumber) {

            makeToast("Lower!");
        }
        else if(guessInt<randomNumber)
        {
            makeToast("Higher!");
        }
        else{
            makeToast("That's right!Try again.");

            Random r = new Random();
            int Low = 1;
            int High = 20;
            randomNumber = r.nextInt(High-Low) + Low;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random r = new Random();
        int Low = 1;
        int High = 20;
        randomNumber = r.nextInt(High-Low) + Low;
    }
}
