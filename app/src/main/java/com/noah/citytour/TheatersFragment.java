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
        attractions.add(new Attraction("Mazkeka Venue","Shoshan 3","Indie music every evening!",
                R.drawable.hamazkeka, getString(R.string.mazkeka_link)));
        attractions.add(new Attraction("Jerusalem Khan Theatre", "David Remez 2", "For intimate experience of theatre and music events at the theatre coffee place.",
                R.drawable.khan, getString(R.string.khan_link)));
        attractions.add(new Attraction("Jerusalem Theatre", "David Marcus 20", "The centre for the performing arts in Jerusalem.",
                R.drawable.jerutheater, getString(R.string.jeur_theater_link)));
        attractions.add(new Attraction("Cinema City Jerusalem", "Sderot Yitshak Rabin 10", "The place to watch all the latest movies.",
                R.drawable.cinemacity, getString(R.string.cinema_city_link)));
        attractions.add(new Attraction("Abraham Hostel", "HaNeviim 67", "Take a part in the nightlife and events in the hostel, even if you are not staying there.",
                R.drawable.abrahamhostel, getString(R.string.abrahamhostel_link)));

        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
