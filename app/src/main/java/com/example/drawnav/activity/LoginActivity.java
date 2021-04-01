package com.example.drawnav.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.drawnav.R;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    ImageButton login;
    EditText username,password;

    protected void onCreate (Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

        setContentView(R.layout.home_relative);
        login = (ImageButton) findViewById(R.id.bttnLogin);
        username = (EditText) findViewById(R.id.etUsername);
        password = (EditText) findViewById(R.id.etPassword);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(password.getText().toString().toUpperCase().equals("TIRTA")){
                    login_sukses();

                }else {
                    Toast.makeText(getApplicationContext(),"Salah Password", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    private void login_sukses() {
        String user_login = username.getText().toString();
        Intent i = new Intent(this,MainActivity.class);
        //mengirim username ke MainActivity
        i.putExtra("USERNAME", user_login);
        startActivity(i);
    }
}
