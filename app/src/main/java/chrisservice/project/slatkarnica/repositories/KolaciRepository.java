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

public class KolaciRepository {



    public static List<Blago> kolaciRepo(){

        List<Blago> kolaci = new ArrayList<>();

        kolaci.add(new Blago("https://scontent.fskp2-1.fna.fbcdn.net/v/t1.0-9/p960x960/67333955_2460212684037559_917676907330273280_o.jpg?_nc_cat=100&_nc_ohc=PcCE3RQzdnYAQk_UoEo57SoUyHol7-DXo8T3orxr3Fv-lXKPTldsJXsvg&_nc_ht=scontent.fskp2-1.fna&oh=e0c5dee775862f23d00df0faace82425&oe=5E44ADC6","Nuttela", "choko loco", "bademi, lesnici, kakao, kokos, lokumi"));

        return kolaci;
    }

//    public static class KolaciAsyncTask extends AsyncTask<Void,Void,List<Blago>>{
//
//        GetSlatkiListener listener;
//        Context context;
//
//        public KolaciAsyncTask(GetSlatkiListener listener, Context context) {
//            this.listener = listener;
//            this.context = context;
//        }
//
//        @Override
//        protected List<Blago> doInBackground(Void... voids) {
//
//
//
//            ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
//            if (cm != null) {
//                NetworkInfo networkInfo = cm.getActiveNetworkInfo();
//                if (networkInfo != null && networkInfo.isConnected()){
//                    kolaci.add(new Blago(null,"Nuttela", "choko loco", "bademi, lesnici, kakao, kokos, lokumi"));
//                    SlatkiDatabase.getSlatkiDatabase(context).slatkiDao().insertSlatki(kolaci);
//                }else {
//                    kolaci = SlatkiDatabase.getSlatkiDatabase(context).slatkiDao().getAllSlatki();
//                }
//            }
//
//
//
//            return kolaci;
//        }
//
//        @Override
//        protected void onPostExecute(List<Blago> blagos) {
//            super.onPostExecute(blagos);
//
//            listener.loadSlatki(kolaci);
//        }
//    }

}
