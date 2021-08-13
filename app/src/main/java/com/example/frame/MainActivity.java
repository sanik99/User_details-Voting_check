package com.example.frame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.security.Key;

public class MainActivity extends AppCompatActivity {

    EditText fullname, fathersname, mothersname, citizennum, phonenum, address;
    Button button_continue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fullname = findViewById(R.id.fullname);
        fathersname = findViewById(R.id.fathersname);
        mothersname = findViewById(R.id.mothersname);
        citizennum = findViewById(R.id.citizennum);
        phonenum = findViewById(R.id.phonenum);
        address = findViewById(R.id.address);
        button_continue = findViewById(R.id.button_continue);


        button_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fulname = fullname.getText().toString();
                String fname = fathersname.getText().toString();
                String mname = mothersname.getText().toString();
                String cnum = citizennum.getText().toString();
                String pnum = phonenum.getText().toString();
                String adds = address.getText().toString();

                Intent intent = new Intent(MainActivity.this, details.class);
                intent.putExtra("Keyfullname", fulname);
                intent.putExtra("Keyfathersname", fname);
                intent.putExtra("Keymothersname", mname);
                intent.putExtra("Keycitizennum", cnum);
                intent.putExtra("Keyphonenum", pnum);
                intent.putExtra("Keyaddress", adds);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Getting Your Details", Toast.LENGTH_LONG).show();


            }

        });
    }
}