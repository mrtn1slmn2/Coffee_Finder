package net.androidbootcamp.coffeefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        String [] shops = {"Snowshack Dessert Cafe", "9th Bar Espresso", "Canes Cafe", "Cosmic Donuts"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.cafes, shops));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        switch (position){

            case 0:
                startActivity(new Intent(MainActivity.this, Snowshack.class));
                break;
            case 1:
                startActivity(new Intent(MainActivity.this, Ninth.class));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, Canes.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, Cosmic.class));
                break;

        }

    }
}
