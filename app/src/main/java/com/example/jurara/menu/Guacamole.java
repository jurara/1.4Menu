package com.example.jurara.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;

public class Guacamole extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener{

    SeekBar bar;
    int cantidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guacamole);
        bar=(SeekBar)findViewById(R.id.seekBar);
        bar.setMax(20);
        bar.setOnSeekBarChangeListener(this);
    }

    public int getCantidad(){
        return cantidad;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        cantidad=bar.getProgress();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
