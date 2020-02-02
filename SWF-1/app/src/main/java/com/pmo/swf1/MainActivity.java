package com.pmo.swf1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn_count;
    private  Button btn_toast;
    private TextView tv_count;
    private  int count =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_count = findViewById(R.id.btn_count);
        btn_toast = findViewById(R.id.btn_toast);
        tv_count = findViewById(R.id.tv_count);

        btn_count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tampiCount(count++);
            }
        });
        btn_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Count = "+tv_count.getText(),Toast.LENGTH_LONG).show();
            }
        });
    }

    private void tampiCount(int param){
        tv_count.setText(String.valueOf(param));
    }
}
