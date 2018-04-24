package com.noah.citytour;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class AttractionsAdapter extends ArrayAdapter<Attraction> {

    public AttractionsAdapter(Activity activity, ArrayList<Attraction> attractions) {
        super(activity, 0, attractions);
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Attraction} object located at this position in the list
        final Attraction currentWord = getItem(position);

        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(currentWord.getName());

        TextView info = (TextView) listItemView.findViewById(R.id.info);
        info.setText(currentWord.getInfo());

        TextView address = (TextView) listItemView.findViewById(R.id.address);
        address.setText(currentWord.getAddress());

        TextView link = (TextView) listItemView.findViewById(R.id.link);
        link.setClickable(true);
        link.setMovementMethod(LinkMovementMethod.getInstance());
        link.setText(Html.fromHtml(currentWord.getLink()));

        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        image.setImageResource(currentWord.getImage());

        return listItemView;
    }

}
