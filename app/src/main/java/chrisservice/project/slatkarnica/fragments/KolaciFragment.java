package chrisservice.project.slatkarnica.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import chrisservice.project.slatkarnica.R;
import chrisservice.project.slatkarnica.adapters.SlatkiAdapter;
import chrisservice.project.slatkarnica.listeners.GetSlatkiListener;
import chrisservice.project.slatkarnica.model.Blago;
import chrisservice.project.slatkarnica.repositories.KolaciRepository;
import chrisservice.project.slatkarnica.repositories.TortiRepository;


/**
 * A simple {@link Fragment} subclass.
 */
public class KolaciFragment extends Fragment {


    public KolaciFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_kolaci, container, false);
        // Inflate the layout for this fragment
        final RecyclerView rvKolaci = rootView.findViewById(R.id.rvKolaci);
        LinearLayoutManager llManager = new LinearLayoutManager(getContext());
        rvKolaci.setLayoutManager(llManager);
        SlatkiAdapter adapter = new SlatkiAdapter(KolaciRepository.kolaciRepo(), getContext(), getFragmentManager());
        rvKolaci.setAdapter(adapter);

//        KolaciRepository.KolaciAsyncTask asyncTask = new KolaciRepository.KolaciAsyncTask(new GetSlatkiListener() {
//            @Override
//            public void loadSlatki(List<Blago> slatki) {
//                SlatkiAdapter adapter = new SlatkiAdapter(KolaciRepository.kolaciRepo(), getContext());
//                rvKolaci.setAdapter(adapter);
//            }
//        }, getContext());
//
//        asyncTask.execute();


        return rootView;
    }

}
