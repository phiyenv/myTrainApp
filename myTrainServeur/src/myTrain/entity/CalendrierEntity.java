package myTrain.entity;

import javax.persistence.*;
import java.util.*;


@Entity
@Table(name = "Calendrier")
public class CalendrierEntity {

    private String uneDate;

    public CalendrierEntity() {}
    
    public CalendrierEntity(String uneDate) {
        this.uneDate = uneDate;
    }

    //getters
    public String getUneDate() { return this.uneDate; }

    //setters
    public void setUneDate (String uneDate) { this.uneDate = uneDate; }

    

    
}
