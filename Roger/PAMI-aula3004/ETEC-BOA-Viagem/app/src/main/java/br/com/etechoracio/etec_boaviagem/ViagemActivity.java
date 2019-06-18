package br.com.etechoracio.etec_boaviagem;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import br.com.etechoracio.etec_boaviagem.utils.DateTimeUtils;

public abstract class ViagemActivity extends AppCompatActivity {

    private Button btndataChegada;
    private Button btndataSaida;
    private EditText editDestino;
    private EditText editQuantidadePessoas;
    private EditText editOrcamento;
    private RadioGroup radioTipo;
    public void onSalvar(View View)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viagem);

        btndataChegada = findViewById(R.id.btndataChegada);
        btndataSaida = findViewById(R.id.btndataSaida);
    }

    private DatePickerDialog.OnDateSetListener datachegada = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker datePicker, int ano, int mes, int dia) {
            btndataChegada.setText(DateTimeUtils.formatDate(dia, mes + 1, ano));
        }
    };
    private DatePickerDialog.OnDateSetListener datasaida = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker datePicker, int ano, int mes, int dia) {
            btndataSaida.setText(DateTimeUtils.formatDate(dia, mes + 1, ano));
        }
    };

    protected Dialog onCreateDialog(int id) {
        Calendar cal = Calendar.getInstance();
        int ano = cal.get(Calendar.YEAR);
        int mes = cal.get(Calendar.MONTH);
        int dia = cal.get(Calendar.DAY_OF_MONTH);

        switch (id) {
            case R.id.btndataChegada:
                return new DatePickerDialog(this, datachegada, ano, mes, dia);
        }


        switch (id) {
            case R.id.btndataSaida:
                return new DatePickerDialog(this, datasaida, ano, mes, dia);
        }
        return null;
    }

    public void onSelecionarData(View view) {
        showDialog(view.getId());
    }
}
