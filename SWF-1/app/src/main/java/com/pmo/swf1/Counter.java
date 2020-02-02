package com.pmo.swf1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Counter extends AppCompatActivity {
    //Membuat variabel
    private Button btn_count;
    private  Button btn_toast;
    private TextView tv_count;
    private  int count =0;

    //Ketika Activity  dibuka
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        //inisiasi variabel
        btn_count = findViewById(R.id.btn_count);
        btn_toast = findViewById(R.id.btn_toast);
        tv_count = findViewById(R.id.tv_count);

        //aksi ketika di klik
        btn_count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tampiCount(count++);
            }
        });

        btn_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Counter.this,"Count = "+tv_count.getText(),Toast.LENGTH_LONG).show();
            }
        });
    }

    //menampilkan counter di textview
    private void tampiCount(int param){
        tv_count.setText(String.valueOf(param));
    }
}
