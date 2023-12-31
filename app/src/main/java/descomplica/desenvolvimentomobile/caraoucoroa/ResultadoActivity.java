package descomplica.desenvolvimentomobile.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imageResultado;
    private ImageButton btnVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageResultado = findViewById(R.id.imageResultado);
        btnVoltar = findViewById(R.id.btnVoltar);

        //Recuperar dados;
        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        if(numero == 0){
            //coroa
            imageResultado.setImageResource(R.drawable.moeda_coroa);
        }else{
            //cara
            imageResultado.setImageResource(R.drawable.moeda_cara);
        }

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //voltar a tela principal;
                finish();
            }
        });
    }
}