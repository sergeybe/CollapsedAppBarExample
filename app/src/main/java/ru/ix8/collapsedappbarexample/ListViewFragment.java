package ru.ix8.collapsedappbarexample;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.internal.widget.ListViewCompat;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_listview, container, false);
        //ListView listView = (ListView) ListViewCompat.inflate(getActivity().getBaseContext(), R.id.list_view, container);

        ListView listView = (ListView) view.findViewById(R.id.list_view);

        ListViewCompat lv = new ListViewCompat(getActivity());

        ArrayList<String> data = new ArrayList();

        for (int i = 0; i < 50; i++) {
            data.add(String.format("ListView Item %d", i));
        }

        MyListViewAdapter adapter = new MyListViewAdapter(getActivity(), data);

        listView.setAdapter(adapter);
        return view;
    }
}
