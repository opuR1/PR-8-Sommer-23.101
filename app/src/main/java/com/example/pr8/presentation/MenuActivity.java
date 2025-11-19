package com.example.pr8.presentation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.example.pr8.R;

public class MenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // 1. Логика для перехода к рецепту БОРЩА
        // Ищем LinearLayout по ID "Borsch" (как у тебя в xml)
        LinearLayout borschLayout = findViewById(R.id.Borsch);

        borschLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, RecipeBorschActivity.class);
                startActivity(intent);
            }
        });

        // 2. Логика для кнопки НАЗАД
        Button btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // finish() закрывает текущую активность и возвращает на предыдущую (MainActivity)
                finish();
            }
        });
    }
}