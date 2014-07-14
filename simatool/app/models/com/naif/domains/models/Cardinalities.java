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
    
    // Uno a Muchos Bidireccional No.5:Relationships
    @OneToMany
    private Set<Relationships> relationships = new HashSet<Relationships>(0);

    // Muchos a Uno Unidireccional No.3:LinksModels
    @ManyToOne
    LinksModels linksModels;


} // Fin de la clase