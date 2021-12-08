package myTrain.session;

import javax.ejb.Remote;

@Local
public interface AchatItf {
    public String reserver (String FROM, String TO, String date) ;
    public String choisir (int numTrain, int numSiege) ;
    public String renseigner(List<Voyageur> voyageurs) ;
}