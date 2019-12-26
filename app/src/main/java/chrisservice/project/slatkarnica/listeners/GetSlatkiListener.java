package chrisservice.project.slatkarnica.listeners;

import java.util.List;

import chrisservice.project.slatkarnica.model.Blago;

public interface GetSlatkiListener {

    void loadSlatki(List<Blago> slatki);
}
