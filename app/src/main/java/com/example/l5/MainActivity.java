package com.example.l5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btcalcular;

    private EditText etdistancia;
    private EditText etautonomia;
    private EditText etcusto;

    private Float distancia;
    private Float autonomia;
    private Float custo;

    private Float resultado;

    private TextView tvresultado;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btcalcular = (Button) findViewById(R.id.btcalcular);

        etcusto = (EditText) findViewById(R.id.etcusto);
        etautonomia = (EditText) findViewById(R.id.etautonomia);
        etdistancia = (EditText) findViewById(R.id.etdistancia);

        tvresultado = (TextView) findViewById(R.id.tvresultado);

        btcalcular.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        distancia = Float.parseFloat(etdistancia.getText().toString());
        autonomia = Float.parseFloat(etautonomia.getText().toString());
        custo = Float.parseFloat(etcusto.getText().toString());

        if(view.getId()==R.id.btcalcular){
        resultado = (distancia/autonomia)*custo;

        tvresultado.setText("Total do custo da viagem: R$"+resultado);

        }


    }
}
