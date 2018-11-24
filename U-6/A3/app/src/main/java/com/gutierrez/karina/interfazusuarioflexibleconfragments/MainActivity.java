package com.gutierrez.karina.interfazusuarioflexibleconfragments;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    InicioFragment fragmentInicio;
    SemanalFragment fragmentSemanal;
    MensualFragment fragmentMensual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentInicio = new InicioFragment();
        fragmentSemanal = new SemanalFragment();
        fragmentMensual = new MensualFragment();

        BottomNavigationView toolbarPrincipal= findViewById(R.id.toolbarPrincipal);
        ListView menuListViewPrincipal = findViewById(R.id.menuListViewPrincipal);

        if(toolbarPrincipal != null){//ESTAMOS EN MODO PORTRAIT
            toolbarPrincipal.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()){
                        case R.id.actionInicio:
                            //Cambiar a fragmen Inicio
                            getSupportFragmentManager().beginTransaction().replace(R.id.contenedorPrincipal,fragmentInicio).addToBackStack(null).commit();
                            break;
                        case R.id.actionMensual:
                            //Cambiar a fragment Mensual
                            getSupportFragmentManager().beginTransaction().replace(R.id.contenedorPrincipal,fragmentMensual).addToBackStack(null).commit();
                            break;
                        case R.id.actionSemanal:
                            //Cambiar a fragmente Semanal
                            getSupportFragmentManager().beginTransaction().replace(R.id.contenedorPrincipal,fragmentSemanal).addToBackStack(null).commit();
                            break;
                    }
                    return true;
                }
            });
        }else{//ESTAMOS EN EL MODO LANDSCAPE

            menuListViewPrincipal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    switch (position){
                        case 0:
                            //Cambiar a fragmen Inicio
                            getSupportFragmentManager().beginTransaction().replace(R.id.contenedorPrincipal,fragmentInicio).addToBackStack(null).commit();
                            break;
                        case 1:
                            //Cambiar a fragment Mensual
                            getSupportFragmentManager().beginTransaction().replace(R.id.contenedorPrincipal,fragmentMensual).addToBackStack(null).commit();
                            break;
                        case 2:
                            //Cambiar a fragmente Semanal
                            getSupportFragmentManager().beginTransaction().replace(R.id.contenedorPrincipal,fragmentSemanal).addToBackStack(null).commit();
                            break;
                    }
                }
            });

        }


    }
}
