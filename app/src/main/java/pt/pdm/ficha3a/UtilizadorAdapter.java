package pt.pdm.ficha3a;

import android.content.Context;
import android.util.SparseBooleanArray;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import java.util.ArrayList;

public class UtilizadorAdapter extends ArrayAdapter<Utilizador> implements CompoundButton.OnCheckedChangeListener {

    private SparseBooleanArray mCheckStates;
    private ArrayList<Utilizador> dataSet;
    private Context mContext;
    private Utilizador oUtilizador;


    static class UserInfoHolder
    {
        TextView txtNome;
        TextView txtMorada;
        TextView txtEmail;
        TextView txtTelemovel;
        CheckBox chkSeleccionado;
        Button btnEditar;

    }

    public UtilizadorAdapter(ArrayList<Utilizador> data, Context context) {
        super(context, R.layout.activity_visualizar_dados_utilizador, data);
        this.dataSet = data;
        this.mContext = context;

        mCheckStates = new SparseBooleanArray(data.size());
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
    }
}

