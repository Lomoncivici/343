package com.example.a2practoz;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Инициализация RecyclerView
        RecyclerView recyclerView1 = findViewById(R.id.recycler_view1);

        // Установка LayoutManager для каждого RecyclerView
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));

        // Создание списков данных для каждого RecyclerView
        List<Item> itemList1 = generateItemList("Хей 1 - ПП 2");

        // Создание адаптеров и установка для каждого RecyclerView
        ItemAdapter adapter1 = new ItemAdapter(this, itemList1);

        recyclerView1.setAdapter(adapter1);
    }

    // Метод для генерации списка элементов
    private List<Item> generateItemList(String prefix) {
        List<Item> itemList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            itemList.add(new Item(prefix + i, "Да да " + prefix + i));
        }
        return itemList;
    }
}