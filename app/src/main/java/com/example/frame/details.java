package com.example.frame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class details extends AppCompatActivity {

    TextView txt_fullname, txt_fathers, txt_mothers, txt_address, txt_number, txt_ctizenNo, textView;

    Button button_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        txt_fullname = findViewById(R.id.txt_fullname);
        txt_fathers = findViewById(R.id.txt_fathers);
        txt_mothers = findViewById(R.id.txt_mothers);
        txt_address = findViewById(R.id.txt_address);
        txt_number = findViewById(R.id.txt_number);
        txt_ctizenNo = findViewById(R.id.txt_ctizenNo);

        String fulname = getIntent().getStringExtra("Keyfullname");
        String fname = getIntent().getStringExtra("Keyfathersname");
        String mname = getIntent().getStringExtra("Keymothersname");
        String adds = getIntent().getStringExtra("Keyaddress");
        String pnum = getIntent().getStringExtra("Keyphonenum");
        String cnum = getIntent().getStringExtra("Keycitizennum");


      txt_fullname.setText(fulname);
      txt_fathers.setText(fname);
      txt_mothers.setText(mname);
      txt_address.setText(adds);
      txt_number.setText(pnum);
      txt_ctizenNo.setText(cnum);


        button_back = findViewById(R.id.button_back);

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(details.this, MainActivity.class);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.votingcheck);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(details.this, VotingCheck.class);
                startActivity(intent);
                Toast.makeText(details.this, "Taking You to Voting Check ", Toast.LENGTH_SHORT).show();

            }
        });


    }
}