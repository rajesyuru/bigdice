package com.rajes.dicecode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ImageViewLeftDice = findViewById(R.id.imageViewLefty);
        final ImageView ImageViewRightDice = findViewById(R.id.imageViewRighty);
        Button button = findViewById(R.id.button);

        final int[] dicearray = new int[] {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int indexleft = new Random().nextInt(6);
                ImageViewLeftDice.setImageResource(dicearray[indexleft]);
                int indexright = new Random().nextInt(6);
                ImageViewRightDice.setImageResource(dicearray[indexright]);
            }
        });
    }
}
