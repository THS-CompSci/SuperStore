package com.twistedx.superstore;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

public class iPhone6s extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iphone6s);
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

}
