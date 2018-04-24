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
        attractions.add(new Attraction("Mazkeka Venue","Shoshan, 3","info",
                R.drawable.hamazkeka, "www.mazkeka.com"));
        attractions.add(new Attraction("Jerusalem Khan Theatre", "David Remez, 2", "info",
                R.drawable.khan, "https://khan.co.il/"));
        attractions.add(new Attraction("Jerusalem Theatre", "David Marcus, 20", "info",
                R.drawable.jerutheater, "https://www.jerusalem-theatre.co.il"));
        attractions.add(new Attraction("Cinema City Jerusalem", "Sderot Yitshak Rabin, 10", "info",
                R.drawable.cinemacity, "https://www.cinema-city.co.il"));
        attractions.add(new Attraction("Abraham Hostel", "HaNeviim, 67", "info",
                R.drawable.abrahamhostel, "https://abrahamhostels.com/jerusalem/"));

        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
