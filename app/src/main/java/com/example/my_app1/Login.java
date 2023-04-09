package com.example.my_app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    Button login_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();

    }
    public void init(){
        login_btn=findViewById(R.id.btn1);
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_Login=new Intent(Login.this,MainActivity.class);
                startActivity(intent_Login);
                Toast.makeText(Login.this,"Login comp",Toast.LENGTH_SHORT).show();
            }
        });
    }



    public void Forgot(View view) {
        Intent intent=new Intent(Login.this,ForgotPassword.class);
        startActivity(intent);

    }

    public void signup(View view) {
        Intent Signupintent=new Intent(Login.this,Signup.class);
        startActivity(Signupintent);
    }
}