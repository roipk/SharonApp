package com.roipk.sharonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.roipk.sharonapp.ui.login.LoginActivity;

public class Register extends AppCompatActivity {

    private EditText _firstName;
    private EditText _lastName;
    private EditText _id;
    private EditText _numberPeople;

    private Button _back;
    private Button _clear;
    private Button _next;

    private Intent loginPage;
    private Intent nextRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        loginPage = new Intent(this, LoginActivity.class);
        nextRegister = new Intent(this, LoginActivity.class);

        _firstName = (EditText)findViewById(R.id.firstname);
        _lastName = (EditText)findViewById(R.id.lastname);
        _id = (EditText)findViewById(R.id.idnumber);
        _numberPeople = (EditText)findViewById(R.id.numberpeople);


        _back = (Button)findViewById(R.id.back);
        _clear = (Button)findViewById(R.id.clear);
        _next = (Button)findViewById(R.id.next);



        _back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(loginPage);
            }
        });

        _clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _firstName.setText("");
                _lastName.setText("");
                _id.setText("");
                _numberPeople.setText("");
            }
        });

        _next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(nextRegister);
            }
        });




    }
}
