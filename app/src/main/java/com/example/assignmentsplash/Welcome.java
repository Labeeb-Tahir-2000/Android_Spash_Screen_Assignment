package com.example.assignmentsplash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
    String name = "";
    TextView NameDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Bundle b= getIntent().getExtras();
        NameDisplay = (TextView) findViewById(R.id.nameDisplay) ;
        if( b!= null){
            NameDisplay.setText(b.getString("NAME"));

        }
      

    }
}