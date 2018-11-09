package org.chillrend.meineapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class aktiviteur extends AppCompatActivity {
    String msg = "Android :";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktiviteur);
        Log.d(msg, "You're at onCreate() !");
    }

    public void toButton(View view){
        Intent intent = new Intent(aktiviteur.this, ButtonAktiviteur.class);
        startActivity(intent);
    }
    public void toForm(View view){
        Intent intent = new Intent(aktiviteur.this, textbox_demo.class);
        startActivity(intent);
    }
    public void toRegForm(View view){
        Intent intent = new Intent(aktiviteur.this, registrasi.class);
        startActivity(intent);
    }
}
