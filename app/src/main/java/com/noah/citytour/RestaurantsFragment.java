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
        attractions.add(new Attraction("Sushi-ya","Trumpeldor 1","info",
                R.drawable.sushiya, "link"));
        attractions.add(new Attraction("Habash", "Mashiyah Barukhof, 5", "info",
                R.drawable.habash, "link"));
        attractions.add(new Attraction("P2 Pizza", "Keren HaYesod, 36", "info",
                R.drawable.p2pizza, "link"));
        attractions.add(new Attraction("Waffle Factory", "Sderot Yitshak Rabin, 10", "info",
                R.drawable.waffle, "link"));
        attractions.add(new Attraction("Arbes", "Shilo, 1", "info",
                R.drawable.arbes, "link"));

        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
