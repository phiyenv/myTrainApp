package myTrain.entity;

import javax.persistence.*;
import java.util.*;


@Entity
@Table(name = "Billet")
public class BilletEntity {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id int idBillet;
    private int numBillet;
    private String refDossier;
    private String nom;
    private String prenom;
    private String laDate;
    
    public BilletEntity() {}
    
    public BilletEntity(int idBillet, int numBillet, String refDossier, String nom, String prenom, String laDate) {
        this.idBillet = idBillet;
        this.numBillet = numBillet;
        this.refDossier = refDossier;
        this.nom = nom;
        this.prenom = prenom;
        this.laDate = laDate;
    }

    //getters
    public int getIdBillet() { return this.idBillet; }
    public int getNumBillet() { return this.numBillet ; }
    public String getRefDossier() { return this.refDossier; }
    public String getNom() { return this.nom; }
    public String getPrenom() { return this.prenom; }
    public String getlaDate() { return this.laDate; }

    //setters
    public void setIdBillet (int idBillet) { this.idBillet = idBillet ; }
    public void setNumBillet (int numBillet) { this.numBillet = numBillet ; }
    public void setRefDossier (String refDossier) { this.refDossier = refDossier ; }
    public void setNom (String nom) { this.nom = nom ; }
    public void setPrenom (String prenom) { this.prenom = prenom ; }
    public void setlaDate (String laDate) { this.laDate = laDate ; }


    

    
}
