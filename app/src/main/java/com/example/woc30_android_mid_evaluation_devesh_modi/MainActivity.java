package com.example.woc30_android_mid_evaluation_devesh_modi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    public void showMonday(View view) {
        Intent intent = new Intent(this, myMonday.class) ;
        startActivity(intent) ;
    }
    public void showTuesday(View view) {
        Intent intent = new Intent(this, myTuesday.class) ;
        startActivity(intent) ;
    }
    public void showWednesday(View view) {
        Intent intent = new Intent(this, myWednesday.class) ;
        startActivity(intent) ;
    }
    public void showThursday(View view) {
        Intent intent = new Intent(this, myThursday.class) ;
        startActivity(intent) ;
    }
    public void showFriday(View view) {
        Intent intent = new Intent(this, myFriday.class) ;
        startActivity(intent) ;
    }
    public void showSaturday(View view) {
        Intent intent = new Intent(this, myMonday.class) ;
        startActivity(intent) ;
    }
}
