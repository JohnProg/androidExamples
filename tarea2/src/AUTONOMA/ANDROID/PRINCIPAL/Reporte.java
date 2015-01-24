package AUTONOMA.ANDROID.PRINCIPAL;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class Reporte extends Activity {
	EditText txtResp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_reporte);
		txtResp = (EditText)findViewById(R.id.txtResultado);
		//Recuperamos la información pasada en el intent
		Bundle bundle = this.getIntent().getExtras();
		//Construimos el mensaje a mostrar
		txtResp.setText(bundle.getString("numero1") + (bundle.getString("numero2")));
	}
	
	public void regresar (View v) {
		Intent intent =
		    	new Intent(Reporte.this, Principal.class);
		    	startActivity(intent);
		    	finish();
	}
}
