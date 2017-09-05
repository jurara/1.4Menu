package com.example.jurara.menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String lenguajeProgramacion[]=new String[]{
            "Tacos de Carne azada",
            "Fideos",
            "Fresas con Crema",
            "Guacamole",
            "Hamburguesa",
            "Huevos con Tosinno",
            "Pizza",
            "Postre",
            "Pozole",
            "Sandwich"};


    private Integer[] imgid={
            R.drawable.taco,
            R.drawable.fideo,
            R.drawable.fresas,
            R.drawable.guaca,
            R.drawable.hamb,
            R.drawable.huevos,
            R.drawable.pizza,
            R.drawable.postre,
            R.drawable.pozo,
            R.drawable.sandwich,

    };

    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LenguajeListAdapter adapter=new LenguajeListAdapter(this,lenguajeProgramacion,imgid);
        lista=(ListView)findViewById(R.id.mi_lista);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Slecteditem= lenguajeProgramacion[+position];
                Toast.makeText(getApplicationContext(), Slecteditem+" "+position, Toast.LENGTH_SHORT).show();

                switch (position){
                    case 0:
                        Intent i=new Intent(getApplicationContext(),Taco.class);
                        startActivity(i);
                        break;
                    case 1:
                        Intent q=new Intent(getApplicationContext(),Fideo.class);
                        startActivity(q);
                        break;
                    case 2:
                        Intent w=new Intent(getApplicationContext(),Fresas.class);
                        startActivity(w);
                        break;
                    case 3:
                        Intent e=new Intent(getApplicationContext(),Guacamole.class);
                        startActivity(e);
                        break;
                    case 4:
                        Intent r=new Intent(getApplicationContext(),Hamburguesa.class);
                        startActivity(r);
                        break;
                    case 5:
                        Intent t=new Intent(getApplicationContext(),Huevos.class);
                        startActivity(t);
                        break;
                    case 6:
                        Intent y=new Intent(getApplicationContext(),Pizza.class);
                        startActivity(y);
                        break;
                    case 7:
                        Intent u=new Intent(getApplicationContext(),Postre.class);
                        startActivity(u);
                        break;
                    case 8:
                        Intent o=new Intent(getApplicationContext(),Pozole.class);
                        startActivity(o);
                        break;
                    case 9:
                        Intent p=new Intent(getApplicationContext(),Sandwich.class);
                        startActivity(p);
                        break;
                }

            }
        });
    }


}
