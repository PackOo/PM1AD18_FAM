package paloma.gonzalez.interfazusuariofragments;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class MensualFragment extends Fragment {

       private OnSemanaCambiada activityObservar;
       private Button btnSem1, btnSem2, btnSem3, btnSem4;

    public MensualFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        btnSem1 = getView().findViewById(R.id.btnsemana1_card);
        btnSem2 = getView().findViewById(R.id.btnsemana2_card);
        btnSem3 = getView().findViewById(R.id.btnsemana3_card);

        btnSem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activityObservar.SemanaCambiado("Sem1");
            }
        });

        return inflater.inflate(R.layout.fragment_mensual, container, false);
    }

    @Override
    public void onAttach(Activity activity) {
        activityObservar = (OnSemanaCambiada) activity;
        super.onAttach(activity);
    }

    public interface OnSemanaCambiada{
        public void SemanaCambiado(String semana);
    }
}
