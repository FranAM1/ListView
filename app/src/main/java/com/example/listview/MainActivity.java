package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listview = this.findViewById(R.id.listView);

        //add text to listview
        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4'"};
        Activity[] activities = {new CheckBoxes(), };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        listview.setAdapter(adapter);

        // to change to another activity
        listview.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(this, activities[position].getClass());
            startActivity(intent);
        });
    }
}