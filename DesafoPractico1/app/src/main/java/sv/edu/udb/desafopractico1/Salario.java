package sv.edu.udb.desafopractico1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;
import java.util.ResourceBundle;

public class Salario extends AppCompatActivity {

    private EditText etHoras;


    private EditText etNivel;

    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salario);

        etHoras=findViewById(R.id.etHoras);

        etNivel=findViewById(R.id.etNivel);

        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        tv4=findViewById(R.id.tv4);
        tv5=findViewById(R.id.tv5);

    }
    public void calcular_salario(View view) {

        String valor2=etHoras.getText().toString();

        String valor4=etNivel.getText().toString();


        int nro2=Integer.parseInt(valor2);


        int nro4=Integer.parseInt(valor4);


if (nro4==0){

   double sueldo=(nro2*9.75);
   double iss=(sueldo*0.0525);
    double afp=(sueldo*0.0688);
    double renta=(sueldo*0.10);
    double descuento= (iss + afp + renta);
    double bono=(sueldo*0.10);
    double sueldo_neto= (sueldo-descuento)+ bono;





    String resu2=String.valueOf(iss);
    tv2.setText("Descuento ISS:"+"$"+ Math.round(Float.parseFloat(resu2)));


    String resu3=String.valueOf(afp);
    tv3.setText("Descuento AFP:"+"$"+ Math.round(Float.parseFloat(resu3)));

    String resu4=String.valueOf( renta);
    tv4.setText("Descuento RENTA:"+"$"+Math.round(Float.parseFloat(resu4)));

    String resu5=String.valueOf( sueldo_neto);
    tv5.setText("Sueldo Neto:"+"$"+Math.round(Float.parseFloat(resu5)));
}
        else if (nro4==1){

            double sueldo=(nro2*9.75);
            double iss=(sueldo*0.0525);
            double afp=(sueldo*0.0688);
            double renta=(sueldo*0.10);
            double descuento= (iss + afp + renta);
            double bono=(sueldo*0.05);
            double sueldo_neto= (sueldo-descuento)+ bono;




            String resu2=String.valueOf(iss);
            tv2.setText("Descuento ISS:"+"$"+resu2);


            String resu3=String.valueOf(afp);
            tv3.setText("Descuento AFP:"+"$"+resu3);

            String resu4=String.valueOf( renta);
            tv4.setText("Descuento RENTA:"+"$"+resu4);

            String resu5=String.valueOf( sueldo_neto);
            tv5.setText("Sueldo Neto:"+"$"+resu5);
        }
        else if (nro4==2){

            double sueldo=(nro2*9.75);
            double iss=(sueldo*0.0525);
            double afp=(sueldo*0.0688);
            double renta=(sueldo*0.10);
            double descuento= (iss + afp + renta);
            double bono=(sueldo*0.03);
            double sueldo_neto= (sueldo-descuento)+ bono;




            String resu2=String.valueOf(iss);
            tv2.setText("Descuento ISS:"+"$"+resu2);


            String resu3=String.valueOf(afp);
            tv3.setText("Descuento AFP:"+"$"+resu3);

            String resu4=String.valueOf( renta);
            tv4.setText("Descuento RENTA:"+"$"+resu4);

            String resu5=String.valueOf( sueldo_neto);
            tv5.setText("Sueldo Neto:"+"$"+resu5);
        }
else {
    Toast.makeText(this, "Nivel de cargo no existe", Toast.LENGTH_SHORT).show();

}

    }
    public void onClickRegresar(View v){
        Intent llamar= new Intent(this,MainActivity.class );
        startActivity(llamar);
    }
}