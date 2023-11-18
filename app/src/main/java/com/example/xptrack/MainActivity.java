package com.example.xptrack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onBtnClick (View view){

        EditText edtTxt = findViewById(R.id.edtXpGain);

        int totalXP = 0;

        int xpToAdd = 0;
        try {
            xpToAdd = Integer.parseInt(edtTxt.getText().toString());
        }
        catch (NumberFormatException e) {
            xpToAdd = 0;
        }
        totalXP += xpToAdd;
        //todo: Add database class to store data, USE SQLITE , things to add: str cha int as integers

        //todo 2: Add extra page scrollview

    }

}

