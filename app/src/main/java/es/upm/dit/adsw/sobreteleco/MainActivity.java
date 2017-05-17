package es.upm.dit.adsw.sobreteleco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = MainActivity.class.getName();
    private boolean imagenInicial = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pulsadoBoton (View v){
        Toast.makeText(this, R.string.saludo, Toast.LENGTH_SHORT).show();
    }

    public void pulsadoImagen (View v){
        ImageView img = (ImageView) findViewById(R.id.imageViewEtsit);
        Log.i(TAG, "Cambio de imagen al ser pulsada");
        if (imagenInicial) {
            img.setImageResource(R.drawable.etsit_b);
            Log.i(TAG, "imagenInicial = " + imagenInicial + "Pongo imagen alternativa");
        }
        else {
            img.setImageResource(R.drawable.etsit);
            Log.i(TAG, "imagenInicial = " + imagenInicial + "Pongo imagen inicial");
        }
        imagenInicial = !imagenInicial;
    }
}