package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class Cardinalities extends Model {

    private String name;
    private String cardinality;
    private boolean unidireccional;
    private String observaciones;
    private Float orden;
    
    // Muchos a Uno Unidireccional No.3:LinksModels
    @ManyToOne
    public LinksModels linksModels;
    
    public String toString() {
        return name;
    }    


} // Fin de la clase