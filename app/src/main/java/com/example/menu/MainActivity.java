package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.search_menu) {
startActivity(new Intent(this,SearchActivity.class));
        }else if(item.getItemId()==R.id.notification_menu){
            Toast.makeText(this, "Notification", Toast.LENGTH_SHORT).show();

        }else if(item.getItemId()==R.id.setting_menu){
            Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();

        }else if(item.getItemId()==R.id.aboutus_menu){
            Toast.makeText(this, "About Us", Toast.LENGTH_SHORT).show();

        }else if(item.getItemId()==R.id.aboutus_menu){
            Toast.makeText(this, "About Us", Toast.LENGTH_SHORT).show();

        }
        return false;
    }
}
