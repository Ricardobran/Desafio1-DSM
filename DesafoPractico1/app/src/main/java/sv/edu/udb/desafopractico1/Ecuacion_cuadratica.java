package sv.edu.udb.desafopractico1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Ecuacion_cuadratica extends AppCompatActivity {

    private EditText etA;
    private EditText etB;
    private EditText etC;
    private TextView tvResultado;
    private TextView tvResultado1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecuacion_cuadratica);
        etA=findViewById(R.id.etA);
        etB=findViewById(R.id.etB);
        etC=findViewById(R.id.etC);
        tvResultado=findViewById(R.id.tvResultado);
        tvResultado1=findViewById(R.id.tvResultado1);


    }
    public void calcular(View view) {
        String valor1=etA.getText().toString();
        String valor2=etB.getText().toString();
        String valor3=etC.getText().toString();
        int nro1=Integer.parseInt(valor1);
        int nro2=Integer.parseInt(valor2);
        int nro3=Integer.parseInt(valor3);
 if ( nro1>0){
     double variable1= Math.sqrt((nro2*nro2)-4*(nro1)*(nro3));
     double calculo=(-nro2+variable1);
     double calculo1=  (calculo/(2*nro1));

     double calculo2=(-nro2-variable1);
     double calculo3=  (calculo2/(2*nro1));




     String resu=String.valueOf(calculo1);
     tvResultado.setText("X1="+Math.round(Float.parseFloat(resu)));
     String resu1=String.valueOf( calculo3);
     tvResultado1.setText("X2="+Math.round(Float.parseFloat(resu1)));

 } else {
     Toast.makeText(this, "No se puede realizar la operacion", Toast.LENGTH_SHORT).show();

 }

}
    public void onClickRegresar(View v){
        Intent llamar= new Intent(this,MainActivity.class );
        startActivity(llamar);
}
}