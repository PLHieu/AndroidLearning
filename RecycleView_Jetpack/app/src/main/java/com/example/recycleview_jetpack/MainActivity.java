package com.example.recycleview_jetpack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Hero> mHeros ;
    private RecyclerView mRecyclerHero;
    private HeroAdapter mHeroAdapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerHero = findViewById(R.id.recyclerHero);
        mHeros = new ArrayList<>();
        createHeroList();
        mHeroAdapter = new HeroAdapter(this,mHeros);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerHero.setAdapter(mHeroAdapter);
        mRecyclerHero.setLayoutManager(layoutManager);
    }

    private void createHeroList() {
        mHeros.add(new Hero("Thor",R.drawable.thor));
        mHeros.add(new Hero("IronMan",R.drawable.ironman));
        mHeros.add(new Hero("Hulk",R.drawable.hulk));
        mHeros.add(new Hero("SpiderMan",R.drawable.spiderman));
        mHeros.add(new Hero("Thor",R.drawable.thor));
        mHeros.add(new Hero("IronMan",R.drawable.ironman));
        mHeros.add(new Hero("Hulk",R.drawable.hulk));
        mHeros.add(new Hero("SpiderMan",R.drawable.spiderman));
        mHeros.add(new Hero("Thor",R.drawable.thor));
        mHeros.add(new Hero("IronMan",R.drawable.ironman));
    }
}