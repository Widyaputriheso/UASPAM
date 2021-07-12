package com.example.makanancafe;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;
public class struk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Melihat Item  pesanan dari @activity_struk
        setContentView(R.layout.activity_struk);
        setContentView (R.layout.activity_struk);
        //Untuk melihat data pesanan dari menu
        TextView pesanan = (TextView) findViewById (R.id.totalpesanan);
        //Untuk melihat total pesanan
        TextView total = (TextView) findViewById (R.id.totalharga);

        //Menghubungkan dari data total pesananan yang di pesan
        Intent intent =getIntent();
        String sum = intent.getStringExtra ("summaryOrder");
        int tot = intent.getIntExtra ("totalOrder",0);
        //Penjumblahan dari total belanjaan
        pesanan.setText(sum);
        total.setText ("Rp. "+tot);
    }
}