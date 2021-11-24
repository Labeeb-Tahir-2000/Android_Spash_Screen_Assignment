package com.example.assignmentsplash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.google.android.material.textfield.TextInputEditText;

public class Registration extends AppCompatActivity {
    Spinner mySpinner;
    Button submit;
    TextInputEditText password, confirmPassword;
    Boolean isAllFieldsChecked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        mySpinner = (Spinner) findViewById(R.id.spinner);
        submit = (Button) findViewById(R.id.registration_submit);
        password = (TextInputEditText) findViewById(R.id.password);
        confirmPassword = (TextInputEditText) findViewById(R.id.confirm_password);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.city_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(adapter);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isAllFieldsChecked = CheckAllFields();

                if (isAllFieldsChecked) {
                    Intent i = new Intent(Registration.this, LogIn.class);
                    startActivity(i);
                    finish();
                }
            }
        });
    } // end of onCreate method

    private boolean CheckAllFields () {
        if (password.length() == 0) {
            password.setError("This field is required");
            return false;
        }
        if (confirmPassword.length() == 0) {
            confirmPassword.setError("This field is required");
            return false;
        }

        return true;
    }
}