package com.twistedx.superstore;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

public class RAM extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ram);
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

}
