package com.arushiappdev.lotterygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class WinActivity extends AppCompatActivity {
    Button btnreplaywin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);

       Toast tt= Toast.makeText(this, "Numbers matched!", Toast.LENGTH_SHORT);
       tt.show();
        btnreplaywin= (Button) findViewById(R.id.btnreplaywin);
                btnreplaywin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent replaywin= new Intent(WinActivity.this, MainActivity.class);
                        startActivity(replaywin);
                    }
                });
    }
}
