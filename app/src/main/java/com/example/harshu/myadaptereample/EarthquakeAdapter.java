package com.example.harshu.myadaptereample;

import android.app.Activity;
import android.graphics.Movie;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {
    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakeArrayList) {
        super(context, 0, earthquakeArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null)
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent, false);

        Earthquake earthquake = getItem(position);
        String mag= Integer.toString(earthquake.getMagnitude());
        TextView magnitude = (TextView) listItem.findViewById(R.id.magid);
        magnitude.setText(mag);

        TextView place = (TextView) listItem.findViewById(R.id.placeid);
        place.setText(earthquake.getPlace());
        String tim= Integer.toString(earthquake.getTime());
        TextView time = (TextView) listItem.findViewById(R.id.timeid);
        time.setText(tim);

        return listItem;
    }
}