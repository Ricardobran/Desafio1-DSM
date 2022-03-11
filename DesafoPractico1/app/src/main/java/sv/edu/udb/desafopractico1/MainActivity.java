package sv.edu.udb.desafopractico1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button btnEcuacion, btnVotos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickEcuacion_cuadratica(View v){
        Intent llamar= new Intent(this,Ecuacion_cuadratica.class );
        startActivity(llamar);
    }
    public void onClickvotos(View v){
        Intent llamar= new Intent(this,Votos.class );
        startActivity(llamar);
    }
    public void onClickSalario(View v){
        Intent llamar= new Intent(this,Salario.class );
        startActivity(llamar);
    }
}