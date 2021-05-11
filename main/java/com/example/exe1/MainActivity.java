package com.example.exe1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    EditText txttemperatura;
    TextView txtresultado;

    public void temperatura(View view){
        txttemperatura = findViewById(R.id.txtt);
        txtresultado = findViewById(R.id.txtr);

        double v = Double.parseDouble(txttemperatura.getText().toString());

        double f = ((v * 1.8) + 32);

        txtresultado.setText( "A temperatura em fahrenheit é: " +String.valueOf(f));




    }
}