package com.minsung.test;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

/**
 * Created by minsung on 14. 5. 22.
 */
public class MainActivity extends Activity {
    private static final String TAG = "TVS_KMS_" + MainActivity.class.getSimpleName();

    private RecyclerView mRecyclerView;
    private MyAdapter mAdapter;
    private LinearLayoutManager mLayoutManager;

    private String[] mDataSet = {"aaa", "bbb", "ccc"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.main_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        mLayoutManager = new LinearLayoutManager(getApplicationContext());
//        mLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new MyAdapter();
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setDataSet(mDataSet);

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
