package myTrain.entity;

import javax.persistence.*;
import java.util.*;


@Entity
@Table(name = "Train")
public class TrainEntity {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id int idTrain;
    private int numTrain;
    private String depart;
    private String arrivee;
    private String heureDepart;
    private String duree;
    @ManyToMany
    private Collection <CalendrierEntity> lesDates ;
    @OneToMany(mappedBy = "leTrain")
    private TrainEntity leTrain;


    public TrainEntity() {}
    
    public TrainEntity(int idTrain, int numTrain, String depart, String arrivee, String heureDepart, String duree) {
        this.idTrain = idTrain;
        this.numTrain = numTrain;
        this.depart = depart;
        this.arrivee = arrivee;
        this.heureDepart = heureDepart;
        this.duree = duree;
    }

    //getters
    public int getIdTrain() { return this.idTrain; }
    public int getNumTrain() { return this.numTrain; }
    public String getDepart() { return this.depart; }
    public String getArrivee() { return this.arrivee; }
    public String getHeureDepart() { return this.heureDepart; }
    public String getDuree() { return this.duree; }
    public Collection <CalendrierEntity> getLesDates () { return lesDates; }
    public  TrainEntity getLeTrain () { return leTrain; }

    //setters
    public void setIdTrain(int idTrain) { this.idTrain = idTrain; }
    public void setNumTrain (int numTrain) { this.numTrain = numTrain; }
    public void setDepart(String depart) { this.depart = depart; }
    public void setArrivee(String arrivee) { this.arrivee = arrivee; }
    public void setHeureDepart(String heureDepart) { this.heureDepart = heureDepart; }
    public void setDuree(String duree) { this.duree = duree;}
    public void setLesDates (Collection <CalendrierEntity> lesDates) { this.lesDates = lesDates ;  }
    public void setLeTrain (TrainEntity te) { this.leTrain = te ; }

    

    
}
