package com.example.foodie;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {
    CheckBox cb1, cb2, cb3, cb4;
    Button btn;
    TextView Bill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        cb1 = findViewById(R.id.biryani);
        cb2 = findViewById(R.id.sambar);
        cb3 = findViewById(R.id.lemon);
        cb4 = findViewById(R.id.curd);

        btn = findViewById(R.id.order);
        Bill = findViewById(R.id.Bill);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int total = 0;

                if (cb1.isChecked()) {
                    total = total + 50;
                }
                if (cb2.isChecked()) {
                    total = total + 30;
                }
                if (cb3.isChecked()) {
                    total = total + 20;
                }
                if (cb4.isChecked()) {
                    total = total + 25;
                }

                Toast.makeText(Menu.this, "Your Value is " + total, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
