package pt.pdm.ficha3a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InserirDadosActivity extends AppCompatActivity {

    private EditText nome, morada, email, telemovel;
    private Button btnGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inserir_dados);

        nome = findViewById(R.id.txtNome);
        morada = findViewById(R.id.txtMorada);
        email = findViewById(R.id.txtEmail);
        telemovel = findViewById(R.id.txtTelemovel);
        btnGuardar = findViewById(R.id.btnGuardar);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendInformation = new Intent(InserirDadosActivity.this, VisualizarDadosUtilizador.class);
                sendInformation.putExtra("nome", nome.getText().toString());
                sendInformation.putExtra("morada", morada.getText().toString());
                sendInformation.putExtra("email", email.getText().toString());
                sendInformation.putExtra("telemovel", telemovel.getText().toString());

                startActivity(sendInformation);
            }
        });
    }
}