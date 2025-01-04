package com.example.personalblog

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Инициализация DrawerLayout
        drawerLayout = findViewById(R.id.main)

        // Находим кнопку и настраиваем обработчик нажатия
        val btnOpenDrawer: Button = findViewById(R.id.btn_open_drawer)
        btnOpenDrawer.setOnClickListener {
            // Открываем боковое меню
            drawerLayout.openDrawer(findViewById(R.id.navigation_view))
        }
    }
}