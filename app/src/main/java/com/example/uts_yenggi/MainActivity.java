package com.example.uts_yenggi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.provider.Settings;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public  boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()==R.id.action_settings) {
            Intent nintent = new Intent(Settings.ACTION_LOCALE_SETTINGS);
            startActivity(nintent);
        }
        return super.onOptionsItemSelected(item);
    }


    public void clickutsman_bin_affan(View view) {
        Intent i = new Intent(this,utsman_bin_affan.class);
        startActivity(i);
    }

    public void clickayyubiyah(View view) {
        Intent i = new Intent(this,ayyubiyah.class);
        startActivity(i);
    }
}