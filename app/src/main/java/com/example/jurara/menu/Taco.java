package com.example.jurara.menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;

public class Taco extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener{
    SeekBar bar;
    int cantidad;
    Intent i=new Intent();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taco);
        bar=(SeekBar)findViewById(R.id.seekBar);
        bar.setOnSeekBarChangeListener(this);
        bar.setMax(20);
    }



    public int getCantidad(){

        i.putExtra("cantidad",cantidad);
        return cantidad;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        cantidad=bar.getProgress();
        i.putExtra("cantidad",cantidad);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

}
