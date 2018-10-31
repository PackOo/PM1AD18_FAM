package paloma.gonzalez.interfazusuariofragments;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements MensualFragment.OnSemanaCambiada{
    InicioFragment fragmentInicio;
    SemanalFragment fragmentSemana;
    MensualFragment fragmentMensual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentInicio=new InicioFragment();
        fragmentSemana=new SemanalFragment();
        fragmentMensual=new MensualFragment();
        BottomNavigationView toolbarprincipal = findViewById(R.id.toolbarPrincipal);
        ListView menuPrincipalListView=findViewById(R.id.menuListViewPrincipal);
        if(toolbarprincipal!=null){
            toolbarprincipal.setOnNavigationItemSelectedListener(
                    new BottomNavigationView.OnNavigationItemSelectedListener() {
                        @Override
                        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                            switch (item.getItemId()) {
                                case R.id.actionInicio:
                                    getSupportFragmentManager().beginTransaction().
                                            replace(R.id.contenedorPrincipal,fragmentInicio).
                                            addToBackStack(null).
                                            commit();
                                    break;
                                case R.id.actionMensual:
                                    getSupportFragmentManager().beginTransaction().
                                            replace(R.id.contenedorPrincipal,fragmentMensual).
                                            addToBackStack(null).
                                            commit();
                                    break;
                                case R.id.actionSemanal:
                                    getSupportFragmentManager().beginTransaction().
                                            replace(R.id.contenedorPrincipal,fragmentSemana).
                                            addToBackStack(null).
                                            commit();
                                    break;
                            }
                            return true;
                        }

                    }
            );
        }else{
            menuPrincipalListView.setOnItemClickListener(
                    new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            switch (position){
                                case 0:
                                    getSupportFragmentManager().beginTransaction().
                                            replace(R.id.contenedor_principal,fragmentInicio).
                                            addToBackStack(null).
                                            commit();
                                    break;
                                case 1:
                                    getSupportFragmentManager().beginTransaction().
                                            replace(R.id.contenedor_principal,fragmentMensual).
                                            addToBackStack(null).
                                            commit();
                                    break;
                                case 2:
                                    getSupportFragmentManager().beginTransaction().
                                            replace(R.id.contenedor_principal,fragmentSemana).
                                            addToBackStack(null).
                                            commit();
                                    break;
                            }

                        }
                    }
            );
        }

    }


    @Override
    public void SemanaCambiado(String nombreSemana) {
        //Cuando el fragmento mensual cambie de semana
        String datosAPasar ="";
        switch (nombreSemana){
            case "Sem1":
                //TODO: cargar datos de la semana 1
                break;
            case "Sem2":
                break;
            case "Sem3":
                break;

        }
        Bundle bundleDatos = new Bundle();
        bundleDatos.putString("datos", datosAPasar);

    }


}
