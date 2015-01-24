package principal.java.empresa.proyectocajadedialogo00002;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MovilCajaDialogo02 extends Activity {
    EditText txtMarca, txtTalla, txtNPV, txtResultado;
    String marcas[] = {"NIKE", "ADIDAS", "FILA"};
    String tallas[] = {"38", "40", "42"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movil_caja_dialogo02);

        txtMarca = (EditText)findViewById(R.id.txtMarca);
        txtTalla = (EditText)findViewById(R.id.txtTalla);
        txtNPV = (EditText)findViewById(R.id.txtNPV);
        txtResultado = (EditText)findViewById(R.id.txtResultado);
    }

    public void BuscarMarca(View v) {
        AlertDialog.Builder builderMarca = new AlertDialog.Builder(this);
        builderMarca.setTitle("Elija la marca");
        builderMarca.setSingleChoiceItems(marcas, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int pos) {
                 txtMarca.setText(marcas[pos]);
                dialog.dismiss();
            }
        });
        builderMarca.show();
    }

    public void BuscarTalla(View v) {
        AlertDialog.Builder builderTalla = new AlertDialog.Builder(this);
        builderTalla.setTitle("Elija la talla");
        builderTalla.setSingleChoiceItems(tallas, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int pos) {
                txtTalla.setText(tallas[pos]);
                dialog.dismiss();
            }
        });
        builderTalla.show();
    }

    public void mostrarDatos(View v) {
        txtResultado.setText("Marca: " + txtMarca.getText()+ "\nTalla: " + txtTalla.getText() + "\nCantidad: " + txtNPV.getText());
    }
}
