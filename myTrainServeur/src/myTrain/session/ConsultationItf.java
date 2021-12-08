package myTrain.session;

import javax.ejb.Remote;

@Remote
public interface ConsultationItf {
    public String consulter (String FROM, String TO);
}