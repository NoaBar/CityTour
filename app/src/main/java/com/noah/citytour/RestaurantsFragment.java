package com.noah.citytour;

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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(getString(R.string.machane_yehuda_name),
                getString(R.string.machane_yehuda_address), getString(R.string.machane_yehuda_info),
                R.drawable.market ,getString(R.string.market_link)));
        attractions.add(new Attraction(getString(R.string.sushiya_name),getString(R.string.sushiya_address),getString(R.string.sushiya_info),
                R.drawable.sushiya, getString(R.string.sushiya_link)));
        attractions.add(new Attraction(getString(R.string.habash_name), getString(R.string.habash_address), getString(R.string.habash_info),
                R.drawable.habash, getString(R.string.habash_link)));
        attractions.add(new Attraction(getString(R.string.bardak_name), getString(R.string.bardak_address), getString(R.string.bardak_info),
                R.drawable.bardak, getString(R.string.habardak_link)));
        attractions.add(new Attraction(getString(R.string.wafflefacory_name), getString(R.string.wafflefacory_address), getString(R.string.wafflefacory_info),
                R.drawable.waffle, getString(R.string.waffle_link)));
        attractions.add(new Attraction(getString(R.string.arbes_name), getString(R.string.arbes_address), getString(R.string.arbes_info),
                R.drawable.arbes, getString(R.string.arbes_link)));

        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
