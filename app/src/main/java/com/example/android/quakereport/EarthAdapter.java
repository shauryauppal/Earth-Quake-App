package com.example.android.quakereport;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by shaur on 13-09-2017.
 */

public class EarthAdapter extends ArrayAdapter<Earth> {

   public EarthAdapter(Activity context, ArrayList<Earth> earthquakes)
   {
       super(context,0,earthquakes);
   }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v =convertView;
        if(v==null)
        {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v= vi.inflate(R.layout.list_item,parent,false);
        }

        //Listitem position
        Earth currentdata = getItem(position);

        //For Earth text display
        TextView Mag = (TextView) v.findViewById(R.id.magnitude);
        Mag.setText(String.valueOf(currentdata.getMagnitude()));

        //For Location
        TextView Loc = (TextView) v.findViewById(R.id.location);
        Loc.setText(currentdata.getcity());

        //For date
        TextView Date = (TextView) v.findViewById(R.id.date);
        Date.setText(currentdata.getdate());

        return v;


    }
}
