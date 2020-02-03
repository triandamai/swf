package com.pmo.swf1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class ActivityUtama extends AppCompatActivity {
    private LinearLayout item1,item2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);
        item1 = findViewById(R.id.item_1);
        item2 = findViewById(R.id.item_2);

        item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        item2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
    private void pindah(){
        Intent intent = new Intent(ActivityUtama.this,ActivityDetail.class);
        startActivity(intent);
    }
}
