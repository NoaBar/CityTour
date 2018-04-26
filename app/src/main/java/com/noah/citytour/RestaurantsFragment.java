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
        attractions.add(new Attraction("Machane Yehuda market",
                "Machane Yehuda St", "Walk around the market in daylight to experience the flavors and scents of a true market, come back at night for the shows and the drinks!",
                R.drawable.market ,getString(R.string.market_link)));
        attractions.add(new Attraction("Sushi-ya","Trumpeldor 1","The nicest most homely sushi place in town. Try the rice bowl!",
                R.drawable.sushiya, getString(R.string.sushiya_link)));
        attractions.add(new Attraction("Habash", "Mashiyah Barukhof 5", "For some Ethiopian tastes.",
                R.drawable.habash, getString(R.string.habash_link)));
        attractions.add(new Attraction("HaBardak", "Keren HaYesod 38", "Pizza with a variety of toppings and beers.",
                R.drawable.bardak, getString(R.string.habardak_link)));
        attractions.add(new Attraction("Waffle Factory", "Sderot Yitshak Rabin 10", "For a nice meal and even nicer dessert.",
                R.drawable.waffle, getString(R.string.waffle_link)));
        attractions.add(new Attraction("Arbes", "Shilo 1", "After visiting the Mahane Yehuda market, come and eat hummus!",
                R.drawable.arbes, getString(R.string.arbes_link)));

        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
