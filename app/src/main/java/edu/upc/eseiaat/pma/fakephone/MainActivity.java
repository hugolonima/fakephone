package edu.upc.eseiaat.pma.fakephone;

import android.net.sip.SipAudioCall;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Botones de los números
    private Button btn_1 = (Button) findViewById(R.id.n1);
    private Button btn_2 = (Button) findViewById(R.id.n2);
    private Button btn_3 = (Button) findViewById(R.id.n3);
    private Button btn_4 = (Button) findViewById(R.id.n4);
    private Button btn_5 = (Button) findViewById(R.id.n5);
    private Button btn_6 = (Button) findViewById(R.id.n6);
    private Button btn_7 = (Button) findViewById(R.id.n7);
    private Button btn_8 = (Button) findViewById(R.id.n8);
    private Button btn_9 = (Button) findViewById(R.id.n9);
    private Button btn_0 = (Button) findViewById(R.id.n10);

    //Botones de borrar (esborrar) y llamar (trucar)

    private Button btn_borrar = (Button) findViewById(R.id.btn_borrar);
    private Button btn_llamar = (Button) findViewById(R.id.btn_call);

    //Edit Text
    private EditText phone_text = (EditText) findViewById(R.id.phone_number);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Vamoh a empezar a hacer cositas

        //TODO : Un escuchador genérico
        //Hay que hacer un escuchador y aplicárselo a los diversos métodos
        //TODO : Hacer métodos, unos que lean el número del texto y lo añadan al Edit
        // TODO : text, en cuanto a los otros hemos de dividirlos en dos : uno que borre
        //TODO: y otro que saque un toast con el mensaje de "llamando"

        //actualizar();


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
    private void borrar(){
        phone_text.setText("");
        
        //Vamoh a imaginar que lo que quiere es borrar el último, que mi señora es una pesada
        
        /*String current = phone_text.getText().toString();
        String actual = current.substring(0,current.length()-2);
        phone_text.setText(actual);*/
    }
    private void llamar(){
        String num_actual = phone_text.getText().toString();
        Toast.makeText(this, "Trucant al "+ num_actual + "..." , Toast.LENGTH_SHORT).show();
    }
    

}
