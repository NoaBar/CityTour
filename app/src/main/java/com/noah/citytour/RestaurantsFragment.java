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
        attractions.add(new Attraction("Sushi-ya","Trumpeldor 1","The nicest most homely sushi place in town. Try the rice bowl!",
                R.drawable.sushiya, "link"));
        attractions.add(new Attraction("Habash", "Mashiyah Barukhof, 5", "For some Ethiopian tastes.",
                R.drawable.habash, "link"));
        attractions.add(new Attraction("P² Pizza", "Keren HaYesod, 36", "Pizza. Not for Kosher eaters.",
                R.drawable.p2pizza, "link"));
        attractions.add(new Attraction("Waffle Factory", "Sderot Yitshak Rabin, 10", "For a nice meal and even nicer dessert.",
                R.drawable.waffle, "http://www.wafflefactory.co.il/"));
        attractions.add(new Attraction("Arbes", "Shilo, 1", "After visiting the Mahane Yehuda market, come and eat hummus!",
                R.drawable.arbes, "http://www.machne.co.il/category/%D7%90%D7%A8%D7%91%D7%A2%D7%A1"));

        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
