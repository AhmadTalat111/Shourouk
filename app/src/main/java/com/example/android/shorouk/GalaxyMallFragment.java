package com.example.android.shorouk;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class GalaxyMallFragment extends Fragment {


    public GalaxyMallFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.shops_list, container, false);
        final ArrayList<Shop> Shops = new ArrayList<Shop>();
        Shops.add(new Shop("Carefour", "Massive SuperMarket"));
        Shops.add(new Shop("ACE","Hardware shop"));
        Shops.add(new Shop("LC Wakiki", "Every One deserves to wear nicely"));
        Shops.add(new Shop("Kabani","Furniture Store") );
        Shops.add(new Shop("Orange", "Mobile Network"));
        Shops.add(new Shop("Vodafone", "Mobile Network"));

        ShopsAdapter adapter = new ShopsAdapter(getActivity(), Shops);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
