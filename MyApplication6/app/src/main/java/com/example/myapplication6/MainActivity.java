package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        ArrayList<Student> studentArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.changeStudent);
        Intent intent = new Intent();
        String name = "Marioom";
        Student student1 = new Student("Lolo", 17, 98, R.drawable.img);
        Student student2 = new Student("Jowana",17,92,R.drawable.img_1);
        Student student3 = new Student("Nanse", 17,93,R.drawable.img_2);





    }
}