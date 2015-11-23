package com.twistedx.superstore;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

public class Chips extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chips);
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

}
