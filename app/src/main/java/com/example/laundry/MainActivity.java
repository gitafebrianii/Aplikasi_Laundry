package com.example.laundry;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText Username, Password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = (EditText) findViewById(R.id.username);
        Password = (EditText) findViewById(R.id.password);
        Button btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(this);

    }

        @Override
        public void onClick (View v){
            String usernameKey = Username.getText().toString();
            String passwordKey = Password.getText().toString();

            if (usernameKey.equals("admin") && passwordKey.equals("123")) {
                //jika login berhasil
                Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, activity_welcome.class);
                MainActivity.this.startActivity(intent);
                finish();
            } else {
                //jika login gagal
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Username atau Password Anda salah!")
                        .setNegativeButton("Retry", null).create().show();
            }
        }
    }