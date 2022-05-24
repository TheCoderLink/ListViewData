 package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

    DataStructure myStructure = new DataStructure();

    ListView newList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newList = findViewById(R.id.ListView1);
        ArrayAdapter<String> array = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);

        myStructure.pushFirst("NOW'S YOUR CHANCE TO BE A ");
        array.add(myStructure.peekFirst());
        myStructure.pushLast("[[Big Shot]]");
        array.add(myStructure.peekLast());
        myStructure.pushLast("I can do anything!");
        array.add(myStructure.peekLast());
        myStructure.pushLast("CHAOS CHAOS");
        array.add(myStructure.peekLast());
        myStructure.pushLast("My In N' Out Order is");
        array.add(myStructure.peekLast());
        myStructure.pushLast("anything animal style");
        array.add(myStructure.peekLast());
        myStructure.pushLast("among us impostor");
        array.add(myStructure.peekLast());
        myStructure.pushLast("pizza time");
        array.add(myStructure.peekLast());
        myStructure.pushLast("the accordion appears");
        array.add(myStructure.peekLast());
        myStructure.pushLast("random elements go wild");
        array.add(myStructure.peekLast());
        myStructure.pushLast("Can we fix it?");
        array.add(myStructure.peekLast());
        myStructure.pushLast("Yes we can!");
        array.add(myStructure.peekLast());

//Rioux comment for GH testing

        newList.setAdapter(array);
    }
}