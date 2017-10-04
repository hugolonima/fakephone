package edu.upc.eseiaat.pma.fakephone;

import android.net.sip.SipAudioCall;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    //Botones de borrar (esborrar) y llamar (trucar)

     Button btn_borrar;
     Button btn_llamar;

    //Edit Text
     EditText phone_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_borrar = (Button) findViewById(R.id.btn_borrar);
        btn_llamar= (Button) findViewById(R.id.btn_call);
        phone_text = (EditText) findViewById(R.id.phone_number);



    }

    public void clicat(View v){
        Button boton = (Button) v;
        actualizar(boton);
    }

    private void actualizar(Button button) {
        String current_number = phone_text.getText().toString();
        String btn_number = button.getText().toString();
        String new_number = current_number.concat(btn_number);
        phone_text.setText(new_number);
    }
    public void borrar(View v){
        //phone_text.setText("");

        String current = phone_text.getText().toString();
        if(current.length() > 0) {
            String actual = current.substring(0, current.length() - 1);
            phone_text.setText(actual);
        }
    }
    public void llamar(View v){
        String num_actual = phone_text.getText().toString();
        Toast.makeText(this, "Trucant al "+ num_actual + "..." , Toast.LENGTH_SHORT).show();
    }

}
