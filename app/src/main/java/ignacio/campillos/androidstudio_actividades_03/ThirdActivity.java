package ignacio.campillos.androidstudio_actividades_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e("ESTADOS", "1-En el metodo onCreate THIRD")
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ESTADOS", "2-En el método onStart THIRD");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ESTADOS", "3-En el método onResume THIRD");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ESTADOS", "4-En el método onPause THIRD");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ESTADOS", "5-En el método onStop THIRD");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("ESTADOS", "6-En el método onRestart THIRD");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ESTADOS", "7-En el método onDestroy THIRD");
    }
}