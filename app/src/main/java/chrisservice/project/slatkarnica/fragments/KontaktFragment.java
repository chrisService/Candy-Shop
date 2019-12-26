package chrisservice.project.slatkarnica.fragments;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import chrisservice.project.slatkarnica.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class KontaktFragment extends Fragment {


    public KontaktFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_kontakt, container, false);

        Toast.makeText(getContext(), "Притисни на текстот и јави се", Toast.LENGTH_LONG).show();

        TextView telefon = rootView.findViewById(R.id.telefon);
        telefon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String phone = "077879710";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + phone));
                startActivity(intent);
            }
        });

        // Inflate the layout for this fragment
        return rootView;
    }

}
