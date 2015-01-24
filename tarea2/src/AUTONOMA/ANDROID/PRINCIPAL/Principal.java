package AUTONOMA.ANDROID.PRINCIPAL;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class Principal extends ActionBarActivity {
	EditText txtNum1, txtNum2, txtResp;
	Button btnCal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);
        
        txtNum1 = (EditText)findViewById(R.id.txtNum1);
        txtNum2 = (EditText)findViewById(R.id.txtNum2);
        txtResp = (EditText)findViewById(R.id.txtResp);
        btnCal = (Button)findViewById(R.id.btnCalcular);
        
        
        btnCal.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String num1, num2;
				num1 = txtNum1.getText().toString();
				num2 = txtNum2.getText().toString();
				
				int total = Integer.parseInt(num1)+ Integer.parseInt(num2);
				
				txtResp.setText(" "+ total);
			}
		});               
    }
    
    public void producto (View v) {
    	String num1, num2;
		num1 = txtNum1.getText().toString();
		num2 = txtNum2.getText().toString();
		
		int total = Integer.parseInt(num1) * Integer.parseInt(num2);
		
		txtResp.setText(" "+ total);
    }
    
    public void envio (View v) {
    	//Creamos el Intent
    	Intent intent =
    	new Intent(Principal.this, Reporte.class);
    	//Creamos la información a pasar entre actividades
    	Bundle b = new Bundle();
    	b.putString("numero1", txtNum1.getText().toString());
    	b.putString("numero2", txtNum2.getText().toString());
    	//Añadimos la información al intent
    	intent.putExtras(b);
    	//Iniciamos la nueva actividad
    	startActivity(intent);
    	finish();
    }
}
