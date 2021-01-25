package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText)findViewById(R.id.etName);
        Password = (EditText)findViewById(R.id.etPassword);
        Info = (TextView)findViewById(R.id.tvInfo);
        Login = (Button)findViewById(R.id.btnLogin);


        Login.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                validate(Name.getText().toString(), Password.getText().toString());

            }});

    }

    private void validate(String userName,String userPassword)
    {
        if ((userName.equals("SRMAP")) && (userPassword.equals("0000")))
        {
            Intent page_2 = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(page_2);
        }

        else
        {counter++;

            Info.setText("No of attempts: " + String.valueOf(counter));



        }


    }
}


