package com.example.xptrack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView viewFinder = findViewById(R.id.textView2);
        viewFinder.setText("Hello");  // changes textview in iml to hello on app
    }
}

