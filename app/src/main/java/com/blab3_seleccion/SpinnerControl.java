package com.blab3_seleccion;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class SpinnerControl extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        Spinner spinner=(Spinner)findViewById(R.id.spinnerAsistencia);
        final TextView txtSpinerSeleccionado=(TextView)findViewById(R.id.txtSpinnerSeleccionado);
        String[] tipoAsistencia={"distancia","Semipresencial","presencial"};
        spinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,tipoAsistencia));
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                txtSpinerSeleccionado.setTextColor(0xff00ff00);
                txtSpinerSeleccionado.setText(parent.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

}
