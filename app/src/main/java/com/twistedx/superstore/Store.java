package com.twistedx.superstore;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class Store extends Activity implements OnItemClickListener {

    private ListView listView1;
    private ArrayAdapter<String> listAdapter1;
    private String[] productNames;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_store);


        listView1 = (ListView) findViewById(R.id.listView);
        productNames = getResources().getStringArray(R.array.products);
        ArrayList<String> productArrayList = new ArrayList<String>();
        productArrayList.addAll(Arrays.asList(productNames));
        listAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, productArrayList);
        listView1.setAdapter(listAdapter1);
        listView1.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                intent = new Intent(Store.this, AppleJuice.class);
                break;
            case 1:
                intent = new Intent(Store.this, Apples.class);
                break;
            case 2:
                intent = new Intent(Store.this, AppleWatch.class);
                break;
            case 3:
                intent = new Intent(Store.this, Banana.class);
                break;
            case 4:
                intent = new Intent(Store.this, Chips.class);
                break;
            case 5:
                intent = new Intent(Store.this, CocaCola.class);
                break;
            case 6:
                intent = new Intent(Store.this, CompCase.class);
                break;
            case 7:
                intent = new Intent(Store.this, CPU.class);
                break;
            case 8:
                intent = new Intent(Store.this, FuryX.class);
                break;
            case 9:
                intent = new Intent(Store.this, GalaxyS6Edge.class);
                break;
            case 10:
                intent = new Intent(Store.this, GearS2.class);
                break;
            case 11:
                intent = new Intent(Store.this, HTCM9.class);
                break;
            case 12:
                intent = new Intent(Store.this, iPadAir2.class);
                break;
            case 13:
                intent = new Intent(Store.this, iPadmini4.class);
                break;
            case 14:
                intent = new Intent(Store.this, iPhone6s.class);
                break;
            case 15:
                intent = new Intent(Store.this, LCK.class);
                break;
            case 16:
                intent = new Intent(Store.this, MotherBoard.class);
                break;
            case 17:
                intent = new Intent(Store.this, Orange.class);
                break;
            case 18:
                intent = new Intent(Store.this, PCIeSSD.class);
                break;
            case 19:
                intent = new Intent(Store.this, Phone.class);
                break;
            case 20:
                intent = new Intent(Store.this, Potato.class);
                break;
            case 21:
                intent = new Intent(Store.this, Power.class);
                break;
            case 22:
                intent = new Intent(Store.this, RAM.class);
                break;
            case 23:
                intent = new Intent(Store.this, Spaghetti.class);
                break;
            case 24:
                intent = new Intent(Store.this, Sprite.class);
                break;
            case 25:
                intent = new Intent(Store.this, SSD.class);
                break;
            case 26:
                intent = new Intent(Store.this, SurfacePro4.class);
                break;
            case 27:
                intent = new Intent(Store.this, Titan.class);
                break;
            case 28:
                intent = new Intent(Store.this, Watch.class);
                break;
            case 29:
                intent = new Intent(Store.this, Water.class);
                break;
        }

        startActivity(intent);

        String itemValue = (String) listView1.getItemAtPosition(position);
        Toast.makeText(getApplicationContext(), itemValue, Toast.LENGTH_SHORT).show();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_store1, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.credit:
//Code to run when the Create Order item is clicked
                Intent intent = new Intent(this, credit.class);
                startActivity(intent);
                return true;
            case R.id.action_settings:
//Code to run when the settings item is clicked
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
