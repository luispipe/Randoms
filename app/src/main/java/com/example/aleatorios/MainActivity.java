package com.example.aleatorios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button randomBt;
    TextView randomTv;
    Button listBt;
    TextView listTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        randomBt= findViewById(R.id.buttonRandom);
        randomTv= findViewById(R.id.textViewRandom);
        listBt= findViewById(R.id.buttonList);
        listTv= findViewById(R.id.textViewList);

        ArrayList<Integer> randoms= new ArrayList<>();

        randomBt.setOnClickListener(new View.OnClickListener() {
            int numberRandom;
            @Override
            public void onClick(View v) {
                numberRandom= (int)(Math.random()*(10-1+1)+1);
                randomTv.setText(numberRandom+"");
                randoms.add(numberRandom);
            }
        });

        listBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listTv.setText(randoms.toString());
            }
        });

    }
}