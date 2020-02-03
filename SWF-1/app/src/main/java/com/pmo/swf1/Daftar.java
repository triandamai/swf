package com.pmo.swf1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Daftar extends AppCompatActivity {
    private Button daftar;
    private EditText nama,username,password;
    private RadioGroup jk;
    private RadioButton jk_pilih;
    private CheckBox setuju;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        daftar = findViewById(R.id.btn_daftar);
        nama = findViewById(R.id.et_nama);
        username = findViewById(R.id.et_username);
        password = findViewById(R.id.et_password);
        setuju = findViewById(R.id.cb_setuju);


        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(setuju.isChecked()){
                    // get selected radio button from radioGroup
                    int selectedId = jk.getCheckedRadioButtonId();

                    // find the radiobutton by returned id
                    jk_pilih = (RadioButton) findViewById(selectedId);

                    Toast.makeText(Daftar.this,"Nama = "+nama.getText()+"\nUsername = "+username.getText()+"\nPassword = "+password.getText()+"\nJenis Kelamin = "+jk_pilih.getText(),Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(Daftar.this,"Setujui persyaratan diatas!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
