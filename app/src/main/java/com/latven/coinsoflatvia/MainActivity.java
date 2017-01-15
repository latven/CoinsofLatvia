package com.latven.coinsoflatvia;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] coins = {"1 Santīms", "2 Santīmi", "5 Santīmi", "10 Santīmi", "20 Santīmi", "50 Santīmi", "1 Eiro", "2 Eiro"};
        //ListAdapter coinAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, coins);
        ListAdapter coinAdapter = new CustomAdapter(this, coins);
        ListView coinListView = (ListView) findViewById(R.id.coinListView);
        coinListView.setAdapter(coinAdapter);

        coinListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String coin = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(MainActivity.this, coin, Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }

}
