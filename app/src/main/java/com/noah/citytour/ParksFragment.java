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
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction("Sacher Garden","Sderot Ben Tsvi 1","The Central park of Jerusalem!",
                R.drawable.sacher,
                getString(R.string.sacher_link)));
        attractions.add(new Attraction("The Bell (Hapa'amon) Garden", "King David St", "Great for families with children.",
                R.drawable.bellpark,
                getString(R.string.bell_link)));
        attractions.add(new Attraction("Lions Fountain, Bloomfield Park", "King David St", "Come and enjoy the fountain, the statues and the flowers in spring.",
                R.drawable.lions_fountain, getString(R.string.lion_foun_link)));
        attractions.add(new Attraction("Jerusalem Park", "Jerusalem Park", "The park is divided into 4 parts around the city, each part is different from the other. Choose the part that is the most suitable for you!",
                R.drawable.jeru_park, getString(R.string.jeru_park_link)));
        attractions.add(new Attraction("The Jerusalem Biblical Zoo", "Derech Aharon Shulov 1", "The most famous zoo in Israel!",
                R.drawable.zoo, getString(R.string.zoo_link)));

        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
