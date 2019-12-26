package chrisservice.project.slatkarnica.repositories;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;

import java.util.ArrayList;
import java.util.List;

import chrisservice.project.slatkarnica.db.SlatkiDatabase;
import chrisservice.project.slatkarnica.listeners.GetSlatkiListener;
import chrisservice.project.slatkarnica.model.Blago;

public class TortiRepository {



    public static List<Blago> tortiRepo() {


        List<Blago> torti = new ArrayList<>();

        torti.add(new Blago("https://scontent.fskp2-1.fna.fbcdn.net/v/t1.0-9/s960x960/74465904_2682998258425666_1695967965398171648_o.jpg?_nc_cat=110&_nc_ohc=84VvKv7opccAQnHW1xLe-DY8uSDKGVvr1R33R7d2nF8_JGullxO2qHovA&_nc_ht=scontent.fskp2-1.fna&oh=8022e3f69914e9c309a870023bda6ded&oe=5E8CC91C", "Mozzart", "choko loco", "bademi, lesnici, kakao, kokos, lokumi"));


        return torti;
    }

//    public static class TortiAsyncTask extends AsyncTask<Void,Void,List<Blago>> {
//
//        GetSlatkiListener listener;
//        Context context;
//
//        public TortiAsyncTask(GetSlatkiListener listener, Context context) {
//            this.listener = listener;
//            this.context = context;
//        }
//
//        @Override
//        protected List<Blago> doInBackground(Void... voids) {
//
//
//
//
//            ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
//            if (cm != null) {
//                NetworkInfo networkInfo = cm.getActiveNetworkInfo();
//                if (networkInfo != null && networkInfo.isConnected()){
////                    torti.add(new Blago(null, "Mozzart", "choko loco", "bademi, lesnici, kakao, kokos, lokumi"));
//                    SlatkiDatabase.getSlatkiDatabase(context).slatkiDao().insertSlatki(torti);
//                }else {
//                    torti = SlatkiDatabase.getSlatkiDatabase(context).slatkiDao().getAllSlatki();
//                }
//            }
//
//
//
//            return torti;
//        }
//
//        @Override
//        protected void onPostExecute(List<Blago> blagos) {
//            super.onPostExecute(blagos);
//
//            listener.loadSlatki(torti);
//        }
//    }


}
