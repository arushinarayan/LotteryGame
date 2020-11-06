package com.arushiappdev.lotterygame;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


import java.util.Random;


public class FirstActivity extends AppCompatActivity {
    EditText textnum;

    Random rand= new Random();
    int intrand= rand.nextInt(11);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        textnum= (EditText) findViewById(R.id.textnum);
        textnum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num= textnum.getText().toString();
                int n= Integer.parseInt(num);
                if (n==intrand)
                {
                Intent win= new Intent(FirstActivity.this, WinActivity.class);
                startActivity(win);

                }

                else if (n>intrand)
                {
                    Intent lose= new Intent(FirstActivity.this, LoseActivity.class);
                    startActivity(lose);

                }

                else{

                    Intent lose= new Intent(FirstActivity.this, LoseActivity.class);
                    startActivity(lose);
                }

            }
        });
    }
}
