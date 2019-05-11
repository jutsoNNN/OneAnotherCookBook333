package com.example.oneanothercookbook;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;

public class ReceptInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recept_info);

        //получаем интент, с помощью которого запущен активити
        Intent intent = getIntent();
        //извлекаем gson строчку из intent'a
        String receptJson = intent.getStringExtra("receptJson");
//
        Gson gson = new Gson();
        //десериалиуем обьект класса рецепт блюда
        ReceptBluda rb = gson.fromJson(receptJson,ReceptBluda.class);

        //---Вывод информации по рецепту на активити

        TextView nazv = (TextView)findViewById(R.id.textViewNazv);
        nazv.setText(rb.getNazvanie());

        ImageView receptImageView = (ImageView)findViewById(R.id.imageViewRecept);
        receptImageView.setImageResource(R.drawable.omelette);
//        Drawable d = Drawable.createFromPath("res/drawable/omelette.png");
//        receptImageView.setImageDrawable(d);

        TextView opis = (TextView)findViewById(R.id.textViewOpisanie);
        opis.setText(rb.getPolnoeOpisanie());

    }
}
