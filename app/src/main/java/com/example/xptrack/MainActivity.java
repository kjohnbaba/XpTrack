package com.example.xptrack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void onBtnClick (View view){
        TextView viewFinder = findViewById(R.id.textView2);
        EditText edtTxt = findViewById(R.id.edtTxt);

        int totalXP = 0;

        int xpToAdd = 0;
        try {
            xpToAdd = Integer.parseInt(edtTxt.getText().toString());
        }
        catch (NumberFormatException e) {
            xpToAdd = 0;
        }


        viewFinder.setText("Strength XP " + xpToAdd);  // changes textview in iml to hello on app
    }

}

