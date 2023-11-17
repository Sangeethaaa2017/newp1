package com.example.foodie;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(view -> Toast.makeText(MainActivity.this, "You have clicked successfully", Toast.LENGTH_SHORT).show());

        Button menu=findViewById(R.id.menupage);
        menu.setOnClickListener(view -> {
        Intent Intent=new Intent(MainActivity.this,Menu.class);
        startActivity(Intent);
    });
        }


}


