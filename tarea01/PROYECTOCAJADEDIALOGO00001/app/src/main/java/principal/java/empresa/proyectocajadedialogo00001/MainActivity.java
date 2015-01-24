package principal.java.empresa.proyectocajadedialogo00001;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    View layout;
    LayoutInflater inflater;
    EditText txtUser, txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        accessSystem();
    }

    public void accessSystem() {
        inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        layout = inflater.inflate(R.layout.activity_main, (ViewGroup) findViewById(R.id.root));
        txtUser = (EditText)layout.findViewById(R.id.txtUser);
        txtPassword = (EditText)layout.findViewById(R.id.txtPassword);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Ventana de Acceso al Sistema");
        builder.setView(layout);
        builder.setPositiveButton("Entrar", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                String user = "", password = "";
                user = txtUser.getText().toString();
                password = txtPassword.getText().toString();
                if(user.equalsIgnoreCase("JOHN") && password.equalsIgnoreCase("123")){
                    Toast.makeText(MainActivity.this, "Acceso Correcto, Entrastes al Sistema", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Acceso Denegado", Toast.LENGTH_LONG).show();
                    accessSystem();
                }
            }
        });
        builder.show();
    }
}
