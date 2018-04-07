package com.example.yanirayanes.aboutme;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void process (View view){

        Intent intent = null, choose = null;
        Uri imageUri = Uri.parse("android.resource://com.example.yanirayanes.aboutme/drawable/"+R.drawable.me);
        intent = new Intent(Intent.ACTION_SEND);
        intent.setType("image/*");
        intent.putExtra(Intent.EXTRA_STREAM, imageUri);
        intent.putExtra(Intent.EXTRA_TEXT, "Miguel Ernesto González\n"+"Ingenieria Informática\n\nFacebook: Miguel Ernesto González\nWhatsapp: 6420 - 9082\nGmail: 00145016@uca.edu.sv\nGithub: MickeyMiguel97\nG+: me.gyanes@gmail.com\nInstagram: @mickey.miguel\nYouTube: Miguel E. Yanes G.\nTwitter: @MiguelEYanesG1\n\nPOWERED BY MSSY");
        choose = Intent.createChooser(intent,"Share ... ");
        startActivity(choose);
    }
}
