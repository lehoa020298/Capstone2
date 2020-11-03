package com.lehoa.hoctienganh.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.auth.FirebaseAuth;
import com.lehoa.hoctienganh.Adapter.AdapterMain;
import com.lehoa.hoctienganh.Model.ItemMain;
import com.lehoa.hoctienganh.R;
import com.lehoa.hoctienganh.ShareApp;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView rv, rvdialog;
    AdapterMain adapter;
    ArrayList<ItemMain> arrayList;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv_main);
        arrayList = new ArrayList<>();

        arrayList.add(new ItemMain(0, R.drawable.imgbr_0, R.drawable.img_alphabet, "Chữ cái"));
        arrayList.add(new ItemMain(1, R.drawable.img1, R.drawable.img_number, "Số đếm"));
        arrayList.add(new ItemMain(2, R.drawable.imgbr_2, R.drawable.img_color, "Màu sắc"));
        arrayList.add(new ItemMain(3, R.drawable.imgbr_3, R.drawable.img_fruit, "Trái cây"));
        arrayList.add(new ItemMain(4, R.drawable.imgbr_4, R.drawable.img_animal, "Động vật"));
        arrayList.add(new ItemMain(5, R.drawable.imgbr_5, R.drawable.img_food, "Thực phẩm"));
        arrayList.add(new ItemMain(6, R.drawable.imgbr_6, R.drawable.home, "Đồ dùng"));
        arrayList.add(new ItemMain(7, R.drawable.imgbr_7, R.drawable.img_career, "Nghề nghiệp"));
        arrayList.add(new ItemMain(8, R.drawable.img_pink, R.drawable.img_transport, "Vận tải"));
        arrayList.add(new ItemMain(9, R.drawable.img_green, R.drawable.img_body2, "Thân hình"));
        arrayList.add(new ItemMain(10, R.drawable.imgbr_10, R.drawable.img_emotions, "Cảm xúc"));
        arrayList.add(new ItemMain(11, R.drawable.imgbr_11, R.drawable.img_sports, "Thể thao"));
        arrayList.add(new ItemMain(12, R.drawable.imgbr_12, R.drawable.img_landscapes, "Phong cảnh"));
        arrayList.add(new ItemMain(13, R.drawable.imgbr_13, R.drawable.img_action, "Hoạt động"));

        adapter = new AdapterMain(arrayList, this);
        rv.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
        rv.setAdapter(adapter);
        rv.setHasFixedSize(true);
        adapter.notifyDataSetChanged();

        toolBar();
    }

    //Khai báo gọi lại toolbar và Navigation view
    private void toolBar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_profile:
                startActivity(new Intent(MainActivity.this, ProfileActivity.class));
                break;
            case R.id.action_game:
                startActivity(new Intent(MainActivity.this, GameActivity.class));
                break;
//            case R.id.action_star:
//                new RateApp(MainActivity.this);
//                break;
            case R.id.action_share:
                new ShareApp(MainActivity.this);
                break;
            case R.id.action_logout:
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getApplicationContext(),LoginActivity.class));
                finish();
                break;

            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }



    @Override
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }
}
