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
        attractions.add(new Attraction("Sacher Garden","Sderot Ben Tsvi, 1","info",
                R.drawable.sacher,
                "https://www.jerusalem.muni.il/Residents/ParksandLandscapes/Gardens/site420/Pages/PageSite_3479.aspx"));
        attractions.add(new Attraction("The Bell(Hapa'amon) garden", "King David St", "info",
                R.drawable.bellpark,
                "https://www.jerusalem.muni.il/Residents/ParksandLandscapes/Gardens/site420/Pages/PageSite_3631.aspx"));
        attractions.add(new Attraction("Lions Fountain, Bloomfield Park", "King David St", "info",
                R.drawable.lions_fountain, "https://www.jerusalem-theatre.co.il"));
        attractions.add(new Attraction("Jerusalem Park", "It's everywhere!", "info",
                R.drawable.jeru_park, "http://www.jerusalempark.org.il/"));
        attractions.add(new Attraction("The Jerusalem Biblical Zoo", "Derech Aharon Shulov, 1", "info",
                R.drawable.zoo, "http://www.jerusalemzoo.org/home-english"));

        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
