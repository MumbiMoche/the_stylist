package com.example.thestylist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

import java.util.ArrayList;

public class GirlsActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girls);

        ArrayList<Integer> images = new ArrayList<>();

        images.add(R.drawable.young_girls);
        images.add(R.drawable.young_girls);
        images.add(R.drawable.young_girls);
        images.add(R.drawable.young_girls);
        images.add(R.drawable.young_girls);
        images.add(R.drawable.young_girls);
        images.add(R.drawable.young_girls);
        images.add(R.drawable.young_girls);

        ArrayList<String> names = new ArrayList<>();

        names.add("Girl Clothes");
        names.add("Girl Clothes");
        names.add("Girl Clothes");
        names.add("Girl Clothes");
        names.add("Girl Clothes");
        names.add("Girl Clothes");
        names.add("Girl Clothes");
        names.add("Girl Clothes");


        ArrayList<String> prices = new ArrayList<>();

        prices.add("1000");
        prices.add("1000");
        prices.add("1000");
        prices.add("1000");
        prices.add("1000");
        prices.add("1000");
        prices.add("1000");
        prices.add("1000");

        Toolbar toolbar = findViewById(R.id.tool_bar_cart);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        TextView mTitle = toolbar.findViewById(R.id.toolbar_title);


        recyclerView = findViewById(R.id.recycler_view);
        GridLayoutManager gridLayoutManager= new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);

        LayoutAdapter layoutAdapter = new LayoutAdapter(GirlsActivity.this, images, names, prices);
        recyclerView.setAdapter(layoutAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }
}