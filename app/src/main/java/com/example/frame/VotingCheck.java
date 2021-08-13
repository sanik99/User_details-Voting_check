package com.example.frame;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Scanner;

public class VotingCheck extends AppCompatActivity {

    TextView textView, home, circle_result;
    EditText editText;
    Button button_check, button_back2;
    int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote_true);

        editText = findViewById(R.id.textbox_age);
        button_check = findViewById(R.id.button_check);
        textView = findViewById(R.id.resultbox);
        circle_result = findViewById(R.id.circle_result);

        button_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                age = Integer.valueOf(editText.getText().toString());

                if(age>=18) {
                    textView.setText("You can vote!");
                    circle_result.setBackgroundResource(R.drawable.result_circle);
                }

                else{

                    textView.setText("You can't vote!");
                    circle_result.setBackgroundResource(R.drawable.result_circle2);


                }

            }
        });

        home = findViewById(R.id.returnhome);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
             public void onClick(View v) {
               Intent intent = new Intent(VotingCheck.this, MainActivity.class);
               startActivity(intent);
                Toast.makeText(VotingCheck.this, "Taking You to Home Page", Toast.LENGTH_SHORT).show();


            }
       });

        button_back2 = findViewById(R.id.button_back2);

        button_back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VotingCheck.this, details.class);
                startActivity(intent);

            }
        });
    }

}