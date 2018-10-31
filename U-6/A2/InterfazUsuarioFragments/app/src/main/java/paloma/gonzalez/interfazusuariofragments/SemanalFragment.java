package paloma.gonzalez.interfazusuariofragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SemanalFragment extends Fragment {


    public SemanalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String datosQueMePasaron = getArguments().getString("datos");

        TextView txtDatosAMostrar = getView().findViewById(R.id.txtDatosAMostrar);




        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_semanal, container, false);
    }

}
