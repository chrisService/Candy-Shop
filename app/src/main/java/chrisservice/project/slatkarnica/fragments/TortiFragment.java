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
public class TortiFragment extends Fragment {


    public TortiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_torti, container, false);
        // Inflate the layout for this fragment
        final RecyclerView rvTorti = rootView.findViewById(R.id.rvTorti);
        LinearLayoutManager llManager = new LinearLayoutManager(getContext());
        rvTorti.setLayoutManager(llManager);
        SlatkiAdapter adapter = new SlatkiAdapter(TortiRepository.tortiRepo(), getContext(), getFragmentManager());
        rvTorti.setAdapter(adapter);
//        TortiRepository.TortiAsyncTask asyncTask = new TortiRepository.TortiAsyncTask(new GetSlatkiListener() {
//            @Override
//            public void loadSlatki(List<Blago> slatki) {
//                SlatkiAdapter adapter = new SlatkiAdapter(KolaciRepository.kolaciRepo(), getContext());
//                rvTorti.setAdapter(adapter);
//            }
//        }, getContext());
//
//        asyncTask.execute();


        return rootView;
    }

}
