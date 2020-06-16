package com.folkmedia.folkmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Contacts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        ImageButton insta = (ImageButton) findViewById(R.id.insta);
       ImageButton call = (ImageButton) findViewById(R.id.call);
TextView tvinsta = (TextView) findViewById(R.id.tvinsta);
        TextView tvcall = (TextView) findViewById(R.id.tvcall);
        final String number = "tel:+79141839851";


        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri instagram = Uri.parse("http://intagram.com/folkmediajournal");
                Intent intent = new Intent(Intent.ACTION_VIEW, instagram);
                startActivity(intent);
            }
        });

      call.setOnClickListener(new View.OnClickListener() {
         @Override
       public void onClick(View v) {
              startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(number)));
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
            case R.id.action_tomenu:
                Intent intent = new Intent(Contacts.this, MainActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_writeus:
                Intent intent2 = new Intent(Contacts.this, Writeus.class);
                startActivity(intent2);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
