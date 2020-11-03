package com.lehoa.hoctienganh;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;

import com.lehoa.hoctienganh.Activity.MainActivity;
// Khởi tạo màn hình chờ
public class DelaySplash {
    Activity context;

    public DelaySplash(final Activity context) {

        this.context = context;
        int SPLASH_DISPLAY_LENGTH = 1500;
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(context, MainActivity.class);
                context.startActivity(mainIntent);
                context.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }

}
