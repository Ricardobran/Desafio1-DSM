package sv.edu.udb.desafopractico1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Votos extends AppCompatActivity {
    private EditText etCandidato1;
    private EditText etCandidato2;
    private EditText etCandidato3;
    private EditText etCandidato4;
    private TextView tvVoto1;
    private TextView tvVoto2;
    private TextView tvVoto3;
    private TextView tvVoto4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_votos2);
        etCandidato1=findViewById(R.id.etCandidato1);
        etCandidato2=findViewById(R.id.etCandidato2);
        etCandidato3=findViewById(R.id.etCandidato3);
        etCandidato4=findViewById(R.id.etCandidato4);
        tvVoto1=findViewById(R.id.tvVoto1);
        tvVoto2=findViewById(R.id.tvVoto2);
        tvVoto3=findViewById(R.id.tvVoto3);
        tvVoto4=findViewById(R.id.tvVoto4);

    }
    public void resultado(View view) {
        String valor1=etCandidato1.getText().toString();
        String valor2=etCandidato2.getText().toString();
        String valor3=etCandidato3.getText().toString();
        String valor4=etCandidato4.getText().toString();
        int nro1=Integer.parseInt(valor1);
        int nro2=Integer.parseInt(valor2);
        int nro3=Integer.parseInt(valor3);
        int nro4=Integer.parseInt(valor4);

        int total=nro1+nro2+nro3+nro4;
        int calculo1= (nro1*100)/(total);
        int calculo2= (nro2*100)/(total);
        int calculo3= (nro3*100)/(total);
        int calculo4= (nro4*100)/(total);


        String resu1=String.valueOf(calculo1);
        tvVoto1.setText("Votos del Candidato 1:"+resu1+"%");

        String resu2=String.valueOf( calculo2);
        tvVoto2.setText("Votos del Candidato 2:"+resu2+"%");

        String resu3=String.valueOf(calculo3);
        tvVoto3.setText("Votos del Candidato 3:"+resu3+"%");

        String resu4=String.valueOf( calculo4);
        tvVoto4.setText("Votos del Candidato 4:"+resu4+"%");
    }
    public void onClickRegresar(View v){
        Intent llamar= new Intent(this,MainActivity.class );
        startActivity(llamar);
    }
}