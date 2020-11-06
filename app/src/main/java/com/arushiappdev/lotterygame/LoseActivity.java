package com.arushiappdev.lotterygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoseActivity extends AppCompatActivity {
    Button btnreplaylose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lose);

        Toast toast= Toast.makeText(this, "Numbers did not match. Better Luck Next Time!", Toast.LENGTH_LONG);
        toast.show();

        btnreplaylose= (Button) findViewById(R.id.btnreplaylose);
        btnreplaylose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent replaylose= new Intent(LoseActivity.this, MainActivity.class);
                startActivity(replaylose);
            }
        });
    }
}
