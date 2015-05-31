package ru.ix8.collapsedappbarexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class MyListViewAdapter extends ArrayAdapter<String> {
    private ArrayList<String> mDataset;

    public MyListViewAdapter(Context context, ArrayList<String> dataset) {
        super(context, R.layout.row_item, dataset);
        mDataset = dataset;
    }

    @Override
    public View getView(int position, View row, ViewGroup parent) {
        ViewHolder holder;

        if (row == null) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            row = inflater.inflate(R.layout.row_item, parent, false);

            holder = new ViewHolder();

            holder.mTextView = (TextView) row.findViewById(R.id.text_view);
            row.setTag(holder);
        } else {
            holder = (ViewHolder) row.getTag();
        }

        holder.mTextView.setText(mDataset.get(position));

        return row;
    }

    class ViewHolder {
        public TextView mTextView;
    }
}
