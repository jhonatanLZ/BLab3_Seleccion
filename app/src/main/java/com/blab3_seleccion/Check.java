package com.blab3_seleccion;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class Check extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);
        final CheckBox distancia=(CheckBox)findViewById(R.id.checkDistancia);
        final CheckBox semipresencial=(CheckBox)findViewById(R.id.checkSemiPresencial);
        final CheckBox presencial=(CheckBox)findViewById(R.id.checkPresencial);

        distancia.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    distancia.setTextColor(0xff00ff00);
                    distancia.append("seleccionado");
                }
                else{
                    distancia.setText("DISTANCIA");
                }
                semipresencial.setOnCheckedChangeListener(new OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                       if (isChecked){
                           semipresencial.setTextColor(0xff00ff00);
                           semipresencial.setText("seleccionado");
                       }
                       else{
                           semipresencial.setText("Semi Presencial");
                       }
                       presencial.setOnCheckedChangeListener(new OnCheckedChangeListener() {
                           @Override
                           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                               if (isChecked){
                                   presencial.setTextColor(0xff00ff00);
                                   presencial.setText("seleccionado");
                               }
                               else{
                                   presencial.setText("PRESENCIAL");
                               }
                           }
                       });
                    }
                });


            }
        });
    }
}
