package com.twistedx.superstore;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

public class FuryX extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.furyx);
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

}
