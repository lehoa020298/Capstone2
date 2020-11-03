package com.lehoa.hoctienganh.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.lehoa.hoctienganh.Adapter.AdapterTab;
import com.lehoa.hoctienganh.LoadLession;
import com.lehoa.hoctienganh.Model.ItemLession;
import com.lehoa.hoctienganh.R;

import java.util.ArrayList;

public class LessionActivity extends AppCompatActivity {
    ArrayList<ItemLession> arrayList;
    AdapterTab adapterTab;
    RecyclerView rv;
    ImageButton imghome, imgstar;
    int id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lession);
        // nhận dữ liệu từ màn hình main
        getinformation();
        setControl();
        arrayList = new ArrayList<>();
        rv.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
        adapterTab = new AdapterTab(this, arrayList, rv);
        int parentWidth = rv.getWidth();
        int itemWidth = 120;
        rv.setAdapter(adapterTab);
        rv.setHasFixedSize(true);


        addLession();
        backhome();
//        star();
    }


    private void setControl() {
        imghome = findViewById(R.id.bt_home);
//        imgstar = findViewById(R.id.bt_rate);
        rv = findViewById(R.id.rv_tab);
    }



    private void getinformation() {
        id = getIntent().getExtras().getInt("id");
    }

//    private void star() {
//        imgstar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                new RateApp(LessionActivity.this);
//            }
//        });
//    }

    private void backhome() {
        imghome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LessionActivity.this, MainActivity.class));
            }
        });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == android.R.id.home) {
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void addLession() {
        new LoadLession(id, arrayList);
    }

    @Override
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        EventHandlerClass.releaseMediaPlayer();
    }
}
