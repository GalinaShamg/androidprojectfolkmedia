package com.folkmedia.folkmedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton aa = (ImageButton) findViewById(R.id.aa);
        ImageButton bb = (ImageButton) findViewById(R.id.bb);
        ImageButton cc = (ImageButton) findViewById(R.id.cc);
        ImageButton dd = (ImageButton) findViewById(R.id.dd);
        ImageButton ee = (ImageButton) findViewById(R.id.ee);

        aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity1.class);
                startActivity(intent);
            }
        });

        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                startActivity(intent);
            }
        });

        cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity3.class);
                startActivity(intent);
            }
        });

        dd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity4.class);
                startActivity(intent);
            }
        });

        ee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity5.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        TextView headerView = (TextView) findViewById(R.id.header);
        switch(id){
            case R.id.action_contact:
                Intent intent = new Intent(MainActivity.this, Contacts.class);
                startActivity(intent);
                return true;
            case R.id.action_writeus:
                Intent intent1 = new Intent(MainActivity.this, Writeus.class);
                startActivity(intent1);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
