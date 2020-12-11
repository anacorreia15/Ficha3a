package pt.pdm.ficha3a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VisualizarDadosUtilizador extends AppCompatActivity {

    private TextView nome, morada, email, telemovel;
    private Button btnEditar, btnApagar, btnNovoUtilizador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar_dados_utilizador);

        nome = findViewById(R.id.txtNome);
        morada = findViewById(R.id.txtMorada);
        email = findViewById(R.id.txtEmail);
        telemovel = findViewById(R.id.txtTelemovel);
        btnEditar = findViewById(R.id.btnEditar);
        btnNovoUtilizador = findViewById(R.id.btnNovoUtilizador);
        btnApagar = findViewById(R.id.btnApagar);

        Bundle extras = getIntent().getExtras();
        String tvNome = extras.getString("nome");
        String tvMorada = extras.getString("morada");
        String tvEmail = extras.getString("email");
        String tvTelemovel = extras.getString("telemovel");

        nome.setText(tvNome);
        morada.setText(tvMorada);
        email.setText(tvEmail);
        telemovel.setText(tvTelemovel);

       btnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

       btnNovoUtilizador.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent back = new Intent(VisualizarDadosUtilizador.this, InserirDadosActivity.class);
               startActivity(back);
           }
       });
    }
}