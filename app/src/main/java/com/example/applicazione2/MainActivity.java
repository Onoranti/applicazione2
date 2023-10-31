package com.example.applicazione2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    private Button somma;
    private Button differenza;
    private EditText numero1;   //serve per ricevere il risultato
    private EditText numero2;
    private TextView risultato; //serve per stampare il risultato a video



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button risultato = (Button) findViewById(R.id.risultato); //questa riga da dei problemi bisogna vedere cosa fare
        final TextView txtViewSaluta= (TextView)findViewById(R.id.risultato);
        btnSaluta.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                String strNum1 = numero1.getText().toString();
                String strNum2 = numero2.getText().toString();
                int n1 = Integer.parseInt(strNum1);
                int n2 = Integer.parseInt(strNum2);
                int res = n1 + n2;
                String strStr = String.valueOf(res);
                risultato.setText(strStr);
            }
        });


        somma = (Button) findViewById(R.id.somma);
        differenza = (Button) findViewById(R.id.differenza);
        risultato = (TextView)findViewById(R.id.risultato);
        numero1 = (EditText)findViewById(R.id.numero1);
        numero2 = (EditText)findViewById(R.id.numero2);

        //capire come agganciare un ascoltatore ad un bottone.
        //bisogna usare dei "puntatori" per capire cosa fare una volta che un evento avviene (devo capire cosa fare quando vengo cliccato).
    }
}