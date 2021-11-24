package com.example.assignmentsplash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LogIn extends AppCompatActivity {
EditText userName;
Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        userName = (EditText) findViewById(R.id.username);
        Login = (Button) findViewById(R.id.login);


        Login.setOnClickListener(new View.OnClickListener() { // Login
            @Override
            public void onClick(View v) { // callback method
                Intent intent = new Intent(LogIn.this,Welcome.class);
                intent.putExtra("NAME",userName.getText()+"");
                startActivity(intent);
                finish();

            }
        });
    }
}