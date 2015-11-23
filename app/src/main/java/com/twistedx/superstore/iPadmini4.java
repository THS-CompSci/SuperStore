package com.twistedx.superstore;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class iPadmini4 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ipadmini4);
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_store1, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_cart:
                Intent intent = new Intent(this,Cart.class);
                startActivity(intent);
                return true;
            case R.id.credit:
                //Code to run when the Create Order item is clicked
                Intent intent2 = new Intent(this, credit.class);
                startActivity(intent2);
                return true;
            //Code to run when the Create Order item is clicked return true;
            case R.id.action_settings:
                //Code to run when the settings item is clicked return true;
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
