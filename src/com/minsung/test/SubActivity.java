package com.minsung.test;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by minsung on 14. 5. 22.
 */
public class SubActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TVS_KMS", "SubActivity.onResume()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TVS_KME", "SubActivity.onStart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TVS_KMS", "SubActivity.onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TVS_KMS", "SubActivity.onStop()");
    }
}
