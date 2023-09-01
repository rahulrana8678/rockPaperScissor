package com.example.rockpaperscissor;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//import android.widget.TextView;
import android.widget.Toast;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button rock, paper, scissors;
    private ImageView myInput, ComputerInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rock = findViewById(R.id.button_rock);
        paper = findViewById(R.id.button_paper);
        scissors = findViewById(R.id.button_scissor);

        myInput = findViewById(R.id.myOutput);
        ComputerInput = findViewById(R.id.computerOutput);



        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Rock", Toast.LENGTH_SHORT).show();
                myInput.setImageResource(R.drawable.rock);
//                int input = 0;
                int number = generateRandom();
                if(number == 0){
                    ComputerInput.setImageResource(R.drawable.rock);
                    Toast.makeText(MainActivity.this, "Draw!!!", Toast.LENGTH_SHORT).show();
                }
                else if(number == 1){
                    ComputerInput.setImageResource(R.drawable.paper);
                    Toast.makeText(MainActivity.this, "You Loose ~_~", Toast.LENGTH_SHORT).show();
                }
                else{
                    ComputerInput.setImageResource(R.drawable.scissors);
                    Toast.makeText(MainActivity.this, "You Win *_*", Toast.LENGTH_SHORT).show();
                }

            }
        });

        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Paper", Toast.LENGTH_SHORT).show();
                myInput.setImageResource(R.drawable.paper);
//                int input = 1;
                int number = generateRandom();

                if(number == 0){
                    ComputerInput.setImageResource(R.drawable.rock);
                    Toast.makeText(MainActivity.this, "You Win *_*", Toast.LENGTH_SHORT).show();
                }
                else if(number == 1){
                    ComputerInput.setImageResource(R.drawable.paper);
                    Toast.makeText(MainActivity.this, "Draw!!!", Toast.LENGTH_SHORT).show();
                }
                else{
                    ComputerInput.setImageResource(R.drawable.scissors);
                    Toast.makeText(MainActivity.this, "You Loose ~_~", Toast.LENGTH_SHORT).show();
                }
            }
        });

        scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Scissors", Toast.LENGTH_SHORT).show();
                myInput.setImageResource(R.drawable.scissors);
//                int input = 2;
                int number = generateRandom();

                if(number == 0){
                    ComputerInput.setImageResource(R.drawable.rock);
                    Toast.makeText(MainActivity.this, "You Loose ~_~", Toast.LENGTH_SHORT).show();
                }
                else if(number == 1){
                    ComputerInput.setImageResource(R.drawable.paper);
                    Toast.makeText(MainActivity.this, "You Win *_*", Toast.LENGTH_SHORT).show();
                }
                else{
                    ComputerInput.setImageResource(R.drawable.scissors);
                    Toast.makeText(MainActivity.this, "Draw!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public int generateRandom(){
        Random ran = new Random();
        int number;
        number = ran.nextInt(3);
        return number;
    }


}
