package chrisservice.project.slatkarnica.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import chrisservice.project.slatkarnica.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {


    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);
        // Inflate the layout for this fragment

        ImageView poster = rootView.findViewById(R.id.poster);
        TextView detailsIme = rootView.findViewById(R.id.detailsIme);
        TextView dolgOpis = rootView.findViewById(R.id.dolgOpis);

        if (getArguments() != null) {
            String url = getArguments().getString("url");
            Glide.with(poster.getContext()).load(url).into(poster);
        }
        if (getArguments() != null) {
            String ime = getArguments().getString("ime");
            detailsIme.setText(ime);
        }
        if (getArguments() != null) {
            String opis = getArguments().getString("dolgOpis");
            dolgOpis.setText(opis);
        }


        return rootView;
    }

}
