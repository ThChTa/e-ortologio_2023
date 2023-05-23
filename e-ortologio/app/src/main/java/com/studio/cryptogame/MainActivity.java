package com.studio.cryptogame;

import androidx.appcompat.app.AppCompatActivity;



import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Calendar;
import java.util.Objects;


public class MainActivity extends AppCompatActivity {

    private Button b3,b2,b1,b14, bsettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ImageView imgView = (ImageView)findViewById(R.id.imageView);
        imgView.setBackgroundResource(R.drawable.logo);

        view_one();


        //ALLAGI XRWMATOS BARAS
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimary)));




        //BUTTON CLICK OPEN NEW ACTIVITY FOR ACTIVITY_ARGIES

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity_Argies.class);
                startActivity(intent);
            }
        });


        //BUTTON CLICK OPEN NEW ACTIVITY FOR ACTIVITY_NAMES

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity_NamesList.class);
                startActivity(intent);
            }
        });


        //BUTTON CLICK OPEN NEW ACTIVITY FOR ACTIVITY_EORTOLOGIO

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity_Eortologio.class);
                startActivity(intent);
            }
        });

        //BUTTON CLICK OPEN NEW ACTIVITY FOR ACTIVITY_PAGOSMIES

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity_Pagosmies.class);
                startActivity(intent);
            }
        });


        NotificationChannel();


        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(java.util.Calendar.HOUR_OF_DAY, 11);
        calendar.set(java.util.Calendar.MINUTE, 00);
        calendar.set(java.util.Calendar.SECOND, 00);
        // calendar.set(Calendar.YEAR, 2023);

        if (java.util.Calendar.getInstance().after(calendar)) {
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }

        Intent intent = new Intent(MainActivity.this, MemoBroadcast.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(getApplicationContext(), 0, intent, PendingIntent.FLAG_IMMUTABLE);

        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), AlarmManager.INTERVAL_DAY, pendingIntent);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            alarmManager.setExactAndAllowWhileIdle(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntent);
        }

    }

    private void view_one(){
        b3 = findViewById(R.id.b3);
        b2 = findViewById(R.id.b2);
        b1 = findViewById(R.id.b1);
        b14 = findViewById(R.id.b14);
        //bsettings = findViewById(R.id.bsettings);
    }


    private void NotificationChannel(){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            CharSequence name = "PAS";
            String description = "Pas's Channel";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            android.app.NotificationChannel channel = new NotificationChannel("Notification", name,importance);
            channel.setDescription(description);

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }






    
}