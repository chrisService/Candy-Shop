package chrisservice.project.slatkarnica.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Blago {

    @PrimaryKey
    @NonNull
    private String url;
    private String ime;
    private String kratokOpis;
    private String dolgOpis;

    public Blago(String url, String ime, String kratokOpis, String dolgOpis) {
        this.url = url;
        this.ime = ime;
        this.kratokOpis = kratokOpis;
        this.dolgOpis = dolgOpis;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getKratokOpis() {
        return kratokOpis;
    }

    public void setKratokOpis(String kratokOpis) {
        this.kratokOpis = kratokOpis;
    }

    public String getDolgOpis() {
        return dolgOpis;
    }

    public void setDolgOpis(String dolgOpis) {
        this.dolgOpis = dolgOpis;
    }
}
