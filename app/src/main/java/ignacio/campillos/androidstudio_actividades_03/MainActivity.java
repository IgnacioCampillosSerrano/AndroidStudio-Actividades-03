package ignacio.campillos.androidstudio_actividades_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    /* Fases actividades
        1- onCreate
        2- onStart
        3- onResume
        4- onPause
        5- onStop
        6- onRestart
        7- onDestroy
     */

    //Para crear actividad, click derecho en el package de la MainActivity -> Activity -> Elegir actividad ( Empty View Activity )

    private Button buttonGotoSecondary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("ESTADOS", "1-En el método onCreate"); //Muestra un mensaje de tipo Log Error en rojo. Etiqueta luego Mensaje

        buttonGotoSecondary = findViewById(R.id.buttonGotoSecond); //Vincular boton

        buttonGotoSecondary.setOnClickListener(new View.OnClickListener() { //Metodo onclick para el boton

            @Override
            public void onClick(View view) {
                //LANZAR LA NUEVA ACTIVIDAD
                Intent intent = new Intent(MainActivity.this, SecondActivity.class); //Intent da permisos o accesso a actividades o propiedades nativas
                startActivity(intent); //Lanza la aplicacion puesta en el intent
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ESTADOS", "2-En el método onStart MAIN");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ESTADOS", "3-En el método onResume MAIN");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ESTADOS", "4-En el método onPause MAIN");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ESTADOS", "5-En el método onStop MAIN");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("ESTADOS", "6-En el método onRestart MAIN");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ESTADOS", "7-En el método onDestroy MAIN");
    }
}