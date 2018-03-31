package com.example.dell.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editEmail,editPassword;
    private Button buttonSignIn,buttonSignUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editEmail=findViewById(R.id.edit_emailSignIn);
        editPassword=findViewById(R.id.edit_passwordSignIn);
        buttonSignIn=findViewById(R.id.button_signIn);
        buttonSignUp=findViewById(R.id.button_signUp);

        buttonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editEmail.getText().toString().equals("mailtopandit7@gmail.com")&
                        editPassword.getText().toString().length()==8){

                    Toast.makeText(MainActivity.this, "Welcomr", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this,"Invalid email",Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,SignUpActivity.class);
                startActivity(intent);


//
            }
        });

    }
}