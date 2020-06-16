package com.folkmedia.folkmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Writeus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_writeus);

        final EditText nameField = (EditText) findViewById(R.id.tvname);
        final String name = nameField.getText().toString();

        final EditText emailField = (EditText) findViewById(R.id.tvmail);
        String email = emailField.getText().toString();


        Button buttonSend = (Button) findViewById(R.id.buttonSend);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent email = new Intent(Intent.ACTION_SEND);
               email.putExtra(Intent.EXTRA_EMAIL, new String[]{"yurovskayaev@yandex.ru"});
               email.putExtra(Intent.EXTRA_SUBJECT,name);
               email.putExtra(Intent.EXTRA_TEXT, "");
               email.setType("message/rfc822");
               startActivity(Intent.createChooser(email, "Выберите способ отправки"));
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
                    Intent intent = new Intent(Writeus.this, Contacts.class);
                    startActivity(intent);
                    return true;
                case R.id.action_tomenu:
                    Intent intent1 = new Intent(Writeus.this, MainActivity.class);
                    startActivity(intent1);
                    return true;
            }
            return super.onOptionsItemSelected(item);
        }

    }
