package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView,textView3;
    EditText n1,n2;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView3 = findViewById(R.id.textView3);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float sum  = Float.parseFloat(n1.getText().toString())+Float.parseFloat(n2.getText().toString());
                textView3.setText("Sum="+sum);
            }
        });
    }
}