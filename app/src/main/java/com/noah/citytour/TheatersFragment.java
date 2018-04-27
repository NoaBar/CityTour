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
public class TheatersFragment extends Fragment {


    public TheatersFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(getString(R.string.mazkeka_name),getString(R.string.mazkeka_address),getString(R.string.mazkeka_info),
                R.drawable.hamazkeka, getString(R.string.mazkeka_link)));
        attractions.add(new Attraction(getString(R.string.khan_name), getString(R.string.khan_address), getString(R.string.khan_info),
                R.drawable.khan, getString(R.string.khan_link)));
        attractions.add(new Attraction(getString(R.string.jeru_theater_name), getString(R.string.jeru_theater_address), getString(R.string.jeru_theater_info),
                R.drawable.jerutheater, getString(R.string.jeur_theater_link)));
        attractions.add(new Attraction(getString(R.string.cinema_name), getString(R.string.cinema_address), getString(R.string.cinema_info),
                R.drawable.cinemacity, getString(R.string.cinema_city_link)));
        attractions.add(new Attraction(getString(R.string.abraham_name), getString(R.string.abraham_address), getString(R.string.abraham_info),
                R.drawable.abrahamhostel, getString(R.string.abrahamhostel_link)));

        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
