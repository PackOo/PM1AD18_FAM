package com.example.user.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    public EditText pant;
    public double operando1,operando2,resultado;
    int ope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_alterno);
        pant = (EditText)findViewById(R.id.txtcaja);
    }

    public void btn0 (View v){
        String cap =pant.getText().toString();
        cap=cap+"0";
        pant.setText(cap);
    }
    public void btn1 (View v){
        String cap =pant.getText().toString();
        cap=cap+"1";
        pant.setText(cap);
    }
    public void btn2 (View v){
        String cap =pant.getText().toString();
        cap=cap+"2";
        pant.setText(cap);
    }
    public void btn3 (View v){
        String cap =pant.getText().toString();
        cap=cap+"3";
        pant.setText(cap);
    }

    public void btn4 (View v){
        String cap =pant.getText().toString();
        cap=cap+"4";
        pant.setText(cap);
    }
    public void btnpunto (View v){
        String cap =pant.getText().toString();
        cap=cap+".";
        pant.setText(cap);
    }
    public void btn5 (View v){
        String cap =pant.getText().toString();
        cap=cap+"5";
        pant.setText(cap);
    }
    public void btn6 (View v){
        String cap =pant.getText().toString();
        cap=cap+"6";
        pant.setText(cap);
    }
    public void btn7 (View v){
        String cap =pant.getText().toString();
        cap=cap+"7";
        pant.setText(cap);
    }
    public void btn8 (View v){
        String cap =pant.getText().toString();
        cap=cap+"8";
        pant.setText(cap);
    }
    public void btn9 (View v){
        String cap =pant.getText().toString();
        cap=cap+"9";
        pant.setText(cap);
    }
    public void suma (View v){
        String aux1=pant.getText().toString();
        operando1=Double.parseDouble(aux1);
        pant.setText("");
        ope=1;
    }
    public void resta (View v){
        try {
            String aux1=pant.getText().toString();
            operando1=Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pant.setText("");
        ope=2;
    }
    public void multiplicacion (View v){
        try {
            String aux1=pant.getText().toString();
            operando1=Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pant.setText("");
        ope=3;
    }
    public void divicion (View v){
        try {
            String aux1=pant.getText().toString();
            operando1=Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pant.setText("");
        ope=4;
    }
    public void igual (View v){
        try {
            String aux2=pant.getText().toString();
            operando2=Double.parseDouble(aux2);
        }catch (NumberFormatException nfe){}
        pant.setText("");

        if(ope==1){
            resultado= operando1+operando2;

        }else if (ope==2){
            resultado= operando1-operando2;
        }else if(ope==3){
            resultado=operando1*operando2;

        }else if(ope==4){
            if(operando2==0){
                pant.setText("Error");
            }else{
                resultado=operando1/operando2;
            }
        }
        pant.setText(""+resultado);
        //operando1+resultado


    }
    public void limpiar(View v){
        pant.setText("");
        operando1=0.0;
        operando2=0.0;
        resultado=0.0;
    }

  //  public void borrar (View v){
  //     if (¡pant.getText().subSequence(0, pant.getText().length()-1)+"");
  // }

}
