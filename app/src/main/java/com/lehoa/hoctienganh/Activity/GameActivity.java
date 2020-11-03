package com.lehoa.hoctienganh.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.lehoa.hoctienganh.Adapter.AdapterGame;
import com.lehoa.hoctienganh.LoadAllLession;
import com.lehoa.hoctienganh.Model.ItemLession;
import com.lehoa.hoctienganh.R;
import com.lehoa.hoctienganh.RateApp;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {

    ImageButton imghome, imgstar;

    RecyclerView rv;
    ArrayList<ItemLession> arrayListAll, arrayListRan;
    AdapterGame adapter;
    int pos;
    ImageButton btSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        init();
        star();
        backhome();

    }

    private void init(){
        imghome = findViewById(R.id.bt_home);
        imgstar = findViewById(R.id.bt_rate);
        rv = findViewById(R.id.rv_game);
        btSound = findViewById(R.id.bt_sound);
        arrayListAll = new ArrayList<>();
        arrayListRan = new ArrayList<>();
        new LoadAllLession(arrayListAll);

        adapter = new AdapterGame(arrayListRan, arrayListAll, this, pos, btSound);
        GridLayoutManager layoutManager = new GridLayoutManager(this,2);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adapter);
    }

    private void star() {
        imgstar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new RateApp(GameActivity.this);
            }
        });
    }

    private void backhome() {
        imghome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GameActivity.this, MainActivity.class));
            }
        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();

        EventHandlerClass.releaseMediaPlayer();
    }
}
