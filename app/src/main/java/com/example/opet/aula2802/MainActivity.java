package com.example.opet.aula2802;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText editNome;
    private CheckBox checkNews;
    private Spinner spinnerFrutas;
    private RadioGroup radioSelecao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNome = findViewById(R.id.editNome);
        checkNews = findViewById(R.id.checkNews);
        spinnerFrutas = findViewById(R.id.spinnerFrutas);
        radioSelecao = findViewById(R.id.grupoSelecao);

    }

    public void click(View v){
        String data = editNome.getText().toString();
        if(checkNews.isChecked()){
            data += "\nAssinado!";
        }else
        {
            data += "\nNão Assinado!";
        }

        int selecionado = radioSelecao.getCheckedRadioButtonId();
        RadioButton radioButton = findViewById(selecionado);

        data += "\n"+spinnerFrutas.getSelectedItem().toString();

        data+= "\n"+ radioButton.getText().toString();

        Toast.makeText(this, data, Toast.LENGTH_LONG).show();
    }
}
