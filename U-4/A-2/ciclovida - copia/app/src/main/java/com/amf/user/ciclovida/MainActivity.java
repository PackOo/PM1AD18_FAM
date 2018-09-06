package com.amf.user.ciclovida;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    TextView txtstate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtstate =(TextView) findViewById(R.id.txtstate);
        txtstate.setMovementMethod(new ScrollingMovementMethod());
        Toast.makeText(this,"On create", Toast.LENGTH_SHORT).show();
        Log.d("State", "On create");
        txtstate.setText(txtstate.getText()+"\n On create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"ONstart" , Toast.LENGTH_LONG).show();
        Log.d("state","On Start");
        txtstate.setText(txtstate.getText()+"\n On Start");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"ONpause" , Toast.LENGTH_LONG).show();
        Log.d("state","On Pause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"ONrestart" , Toast.LENGTH_LONG).show();
        Log.d("state","On restart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"ONresume" , Toast.LENGTH_LONG).show();
        Log.d("state","On Resume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"ONstop" , Toast.LENGTH_LONG).show();
        Log.d("state","On Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"ONdestrory" , Toast.LENGTH_LONG).show();
        Log.d("state","On Destrory");
    }


}
