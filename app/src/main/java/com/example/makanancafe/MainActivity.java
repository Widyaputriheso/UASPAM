package com.example.makanancafe;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button menu langsung akan ke halaman menu
        Button menu = (Button) findViewById(R.id.button);
        //Button keluar langsung keluar dari aplikasi
        Button keluar = (Button) findViewById(R.id.button2);

        //Memasukan fungsi button keluar dari aplikasi
        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack (true);

            }
        });

        //Memasukan fungsi untuk pindah kemenu makan my bakery
        menu.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MainActivity.this, menu.class);
                startActivity(pindah);
            }
        });
    }
}
