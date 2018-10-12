package com.amf.user.usobasicodefragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnFragmentoA = (Button) findViewById(R.id.btnFragmentoA);


        btnFragmentoA.setOnClickListener(new View.OnClickListener() {
            fragmentA fragA = new fragmentA();
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,fragA).commit();
            }
        });

            Button btnFragmentoB =(Button) findViewById(R.id.btnFragmentoB);

            btnFragmentoB.setOnClickListener(new View.OnClickListener() {
                fragmentB fragtB = new fragmentB();
                @Override
                public void onClick(View v) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,fragtB).commit();
                }
            });
    }
}
