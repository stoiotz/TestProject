package com.minsung.test;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by minsung on 14. 7. 25.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Holder> {
    private String[] mDataSet;

    public void setDataSet(String[] dataSet) {
        mDataSet = dataSet;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.layout_recycler_view_item, parent, false);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        holder.mTextView.setText(mDataSet[position]);
    }

    @Override
    public int getItemCount() {
        return mDataSet != null ? mDataSet.length : 0;
    }

    public static class Holder extends RecyclerView.ViewHolder {
        private TextView mTextView;

        public Holder(View v) {
            super(v);
            mTextView = (TextView)v.findViewById(R.id.main_text_view);
        }
    }
}
