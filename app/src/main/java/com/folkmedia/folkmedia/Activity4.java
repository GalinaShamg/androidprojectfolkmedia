package com.folkmedia.folkmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        ImageView imageView = (ImageView) findViewById(R.id.aa);
        TextView textViewhead = (TextView) findViewById(R.id.tvhead);

        TextView textView = (TextView) findViewById(R.id.tv);
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
            case R.id.action_tomenu:
                Intent intent = new Intent(Activity4.this, MainActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_contact:
                Intent intent1 = new Intent(Activity4.this, Contacts.class);
                startActivity(intent1);
                return true;
            case R.id.action_writeus:
                Intent intent2 = new Intent(Activity4.this, Writeus.class);
                startActivity(intent2);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
