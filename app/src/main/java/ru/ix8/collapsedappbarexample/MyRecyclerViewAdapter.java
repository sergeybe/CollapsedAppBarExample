package ru.ix8.collapsedappbarexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter {
    ArrayList<String> mDataset = new ArrayList<>();

    public MyRecyclerViewAdapter(ArrayList<String> data) {
        mDataset = data;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);

        ViewHolder vh = new ViewHolder(view);
        vh.mTextView = (TextView) view.findViewById(R.id.text_view);

        return vh;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        MyRecyclerViewAdapter.ViewHolder vh = (ViewHolder) viewHolder;
        vh.mTextView.setText(mDataset.get(position));
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView mTextView;

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
