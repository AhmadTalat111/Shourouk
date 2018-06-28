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
public class SkyPlazaFragment extends Fragment {


    public SkyPlazaFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.shops_list, container, false);

        final ArrayList<Shop> Shops = new ArrayList<Shop>();
        Shops.add(new Shop("Carefour", "Massive SuperMarket", R.drawable.rsz_carefour));
        Shops.add(new Shop("ACE","Hardware shop",R.drawable.ace));
        Shops.add(new Shop("LC Wakiki", "Every One deserves to wear nicely",R.drawable.lc_wakiki));
        Shops.add(new Shop("Kabani","Furniture Store", R.drawable.kabani));
        Shops.add(new Shop("Orange", "Mobile Network", R.drawable.orange));
        Shops.add(new Shop("Vodafone", "Mobile Network", R.drawable.vodafone));

        ShopsAdapter adapter = new ShopsAdapter(getActivity(), Shops);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
