package ignacio.campillos.androidstudio_actividades_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button buttonGotoMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.e("ESTADOS", "1-En el metodo onCreate SECOND");

        buttonGotoMain = findViewById(R.id.buttonGotoMain);

        buttonGotoMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Back to main activity
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ESTADOS", "2-En el método onStart SECOND");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ESTADOS", "3-En el método onResume SECOND");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ESTADOS", "4-En el método onPause SECOND");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ESTADOS", "5-En el método onStop SECOND");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("ESTADOS", "6-En el método onRestart SECOND");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ESTADOS", "7-En el método onDestroy SECOND");
    }
}