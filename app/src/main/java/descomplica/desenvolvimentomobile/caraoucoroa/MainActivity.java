package descomplica.desenvolvimentomobile.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //declarando o botão
    public ImageButton btnJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instanciando o botão;
        btnJogar = findViewById(R.id.btnJogar);

        //declarando sua ação;
        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ResultadoActivity.class);

                //Passar dados para próxima tela;

                int numero = new Random().nextInt(2); //resultado 0 e 1
                intent.putExtra("numero", numero);


                startActivity(intent);
            }
        });
    }
}