package com.blab3_seleccion;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class Radio extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        final RadioGroup radioGroup=(RadioGroup)findViewById(R.id.grupoRadio);
        final RadioButton radioDistancia=(RadioButton)findViewById(R.id.radiobuttonDistancia);
        final RadioButton radioSemipresecial=(RadioButton)findViewById(R.id.radiobuttonSemipresencial);
        final RadioButton radioPresencial=(RadioButton)findViewById(R.id.radiobuttonPresencial);
        final TextView txtradioSeleccionado=(TextView)findViewById(R.id.txtRadioAsistencia);
        radioGroup.clearCheck();
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (radioDistancia.isChecked()){
                    txtradioSeleccionado.setTextColor(0xff00ff00);
                    txtradioSeleccionado.setText(radioDistancia.getText());
                }
                else{
                    if (radioPresencial.isChecked()){
                        txtradioSeleccionado.setTextColor(0xff00ff00);
                        txtradioSeleccionado.setText(radioPresencial.getText());
                    }
                    else{
                        if (radioSemipresecial.isChecked()){
                            txtradioSeleccionado.setTextColor(0xff00ff00);
                            txtradioSeleccionado.setText(radioSemipresecial.getText());
                        }
                    }
                }
            }
        });
    }
}
