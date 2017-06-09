package br.com.spw.pontoe.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

import br.com.spw.pontoe.R;

public class PontoActivity extends AppCompatActivity {

    private ImageView imgFoto;
    private Button btnFoto;
    public  static Bitmap imagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ponto);

        imgFoto = (ImageView) findViewById(R.id.img_photo);

        if(imagem != null)
        imgFoto.setImageBitmap(imagem);

//        btnFoto.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                tirarFoto();
//
//            }
//        });


    }

    private void tirarFoto() {

        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivityForResult(intent, 0);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
//        super.onActivityResult(requestCode, resultCode, data);
        if (intent != null) {

            Bundle bundle = intent.getExtras();
            if (bundle != null) {


//                ((ImageView) findViewById(R.id.img_photo)).setImageURI(data.getData());
                boolean temImagem = (boolean)bundle.get("bitmap-data");

                if(temImagem) {
                    Bitmap img = (Bitmap) bundle.get("data");
                    ImageView iv = (ImageView) findViewById(R.id.img_photo);
                    iv.setImageBitmap(img);

                }
//
//                Intent  = new Intent(getApplicationContext(), PontoActivity.class);
//                startActivity(intent);


            }
        }
    }
}
