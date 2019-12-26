package chrisservice.project.slatkarnica.adapters;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import chrisservice.project.slatkarnica.R;
import chrisservice.project.slatkarnica.fragments.DetailFragment;
import chrisservice.project.slatkarnica.model.Blago;

public class SlatkiAdapter extends RecyclerView.Adapter<SlatkiAdapter.SlatkiViewHolder> {

    private List<Blago> slatki = new ArrayList<>();
    private Context context;
    FragmentManager fragmentManager;

    public SlatkiAdapter(List<Blago> slatki, Context context, FragmentManager fragmentManager) {
        this.slatki = slatki;
        this.context = context;
        this.fragmentManager = fragmentManager;
    }

    @NonNull
    @Override
    public SlatkiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_slatki, parent, false);
        return new SlatkiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SlatkiViewHolder holder, int position) {

        final Blago blago = slatki.get(holder.getAdapterPosition());

        String uri = blago.getUrl();
        Glide.with(holder.blagoSlika.getContext()).load(uri).into(holder.blagoSlika);
        holder.blagoIme.setText(blago.getIme());
        holder.blagoKratokOpis.setText(blago.getKratokOpis());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DetailFragment fragment = new DetailFragment();
                Bundle bundle = new Bundle();
                bundle.putString("url", blago.getUrl());
                bundle.putString("ime", blago.getIme());
                bundle.putString("kratokOpis", blago.getKratokOpis());
                bundle.putString("dolgOpis", blago.getDolgOpis());
                fragment.setArguments(bundle);
                fragmentManager.beginTransaction()
                        .replace(R.id.frameLayout, fragment)
                        .addToBackStack("details")
                        .commit();
            }
        });

    }

    @Override
    public int getItemCount() {
        return slatki.size();
    }

    public class SlatkiViewHolder extends RecyclerView.ViewHolder {

        ImageView blagoSlika;
        TextView blagoIme, blagoKratokOpis;

        public SlatkiViewHolder(@NonNull View itemView) {
            super(itemView);

            blagoSlika = itemView.findViewById(R.id.slika);
            blagoIme = itemView.findViewById(R.id.slatkiName);
            blagoKratokOpis = itemView.findViewById(R.id.slatkiKratokOpis);
        }
    }
}
