package com.pmo.swf1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private EditText username,password;
    private Button btn_masuk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.et_username);
        password = findViewById(R.id.et_password);

        btn_masuk = findViewById(R.id.btn_masuk);
        btn_masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().equals("Trian") && password.getText().equals("Password")){
                    Intent intent = new Intent(Login.this,ActivityUtama.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(Login.this,"Username da Password salah!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
