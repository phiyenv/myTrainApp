package myTrain.entity;

import javax.persistence.*;
import java.util.*;


@Entity
@Table(name = "Place")
public class PlaceEntity {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id int idPlace;
    private int numVoiture;
    private int numSiege;
    @ManyToOne
    private PlaceEntity lesPlaces;
    @OneToOne
    private BilletEntity leBillet;
    

    
    public PlaceEntity() {}
    
    public PlaceEntity(int idPlace, int numVoiture, int numSiege) {
        this.idPlace = idPlace;
        this.numVoiture = numVoiture;
        this.numSiege = numSiege;
    }

    //getters
    public int getIdPlace() { return this.idPlace; }
    public int getNumVoiture() { return this.numVoiture; }
    public int getNumSiege() { return this.numSiege; }
    public PlaceEntity getLesPlaces() { return lesPlaces; }
    public BilletEntity getLeBillet(){ return leBillet ; }

    //setters
    public void setIdPlace (int idPlace) { this.idPlace = idPlace; }
    public void setNumVoiture (int numVoiture) { this.numVoiture = numVoiture;}
    public void setNumSiege (int numSiege) { this.numSiege = numSiege;}
    public void setLesPlaces(PlaceEntity p) { this.lesPlaces = p; }
    public void setLeBillet(BilletEntity b) { this.leBillet = b ;}

    

    
}
