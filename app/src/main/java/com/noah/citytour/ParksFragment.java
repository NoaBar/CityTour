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
public class ParksFragment extends Fragment {

    public ParksFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(getString(R.string.sacher_name),getString(R.string.sacher_address),getString(R.string.sacher_info),
                R.drawable.sacher,
                getString(R.string.sacher_link)));
        attractions.add(new Attraction(getString(R.string.bell_name), getString(R.string.bell_address), getString(R.string.bell_info),
                R.drawable.bellpark,
                getString(R.string.bell_link)));
        attractions.add(new Attraction(getString(R.string.lions_fountain_name), getString(R.string.lions_fountain_address), getString(R.string.lions_fountain_info),
                R.drawable.lions_fountain, getString(R.string.lion_foun_link)));
        attractions.add(new Attraction(getString(R.string.jeru_park_name), getString(R.string.jeru_park_address), getString(R.string.jeru_park_info),
                R.drawable.jeru_park, getString(R.string.jeru_park_link)));
        attractions.add(new Attraction(getString(R.string.zoo_name), getString(R.string.zoo_address), getString(R.string.zoo_info),
                R.drawable.zoo, getString(R.string.zoo_link)));

        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
