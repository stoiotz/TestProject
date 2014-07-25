package com.minsung.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by minsung on 14. 5. 22.
 */
public class MainActivity extends Activity {
    private static final String TAG = "TVS_KMS_" + MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SubActivity.class));
            }
        });

        ((Button)findViewById(R.id.button)).setText(getString(R.string.test, 7));
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TVS_KMS", "onResume()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TVS_KME", "onStart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TVS_KMS", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TVS_KMS", "onStop()");
    }

    @Override
    public void finish() {
        super.finish();
        Log.d("TVS_KMS", "finish()");
        overridePendingTransition(0, 0);
    }
}
