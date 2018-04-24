package com.noah.citytour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class WebFragment extends Fragment {


    public WebFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction("The guide for the alternative Jerusalem dweller","Information about all the alternative events happening in the city.",
                R.drawable.guid,
                "https://www.facebook.com/pg/%D7%94%D7%9E%D7%93%D7%A8%D7%99%D7%9A-%D7%9C%D7%99%D7%A8%D7%95%D7%A9%D7%9C%D7%9E%D7%99-%D7%94%D7%90%D7%9C%D7%98%D7%A8%D7%A0%D7%98%D7%99%D7%91%D7%99-321275831317927/about/?ref=page_internal"));
        attractions.add(new Attraction("Jerusalem Municipality", "For information straight from the official municipality website.",
                R.drawable.municipality, getString(R.string.muni_link)));

        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
