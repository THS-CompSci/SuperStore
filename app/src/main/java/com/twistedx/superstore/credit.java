package com.twistedx.superstore;

import android.os.Bundle;
import android.app.Activity;
import android.app.ActionBar;

public class credit extends Activity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.credit);
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
