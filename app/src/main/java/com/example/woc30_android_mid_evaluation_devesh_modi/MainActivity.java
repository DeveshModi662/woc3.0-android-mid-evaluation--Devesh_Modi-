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

//        ListView myIntro = findViewById(R.id.myListView) ;
//        ArrayList<String> intro = new ArrayList<>() ;
//        intro.add("Student's name   : Devesh Modi") ;
//        intro.add("Student's course : Btech ICT 2019") ;
//        intro.add("Student's email  : 201901173@daiict.ac.in") ;
    }

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
//    }
//    public void showMonday(View view) {
//        Intent intent = new Intent(this, myMonday.class) ;
//        startActivity(intent) ;
//    }
//    public void showMonday(View view) {
//        Intent intent = new Intent(this, myMonday.class) ;
//        startActivity(intent) ;
//    }
//    public void showSaturday(View view) {
//        Intent intent = new Intent(this, myMonday.class) ;
//        startActivity(intent) ;
//    }
}