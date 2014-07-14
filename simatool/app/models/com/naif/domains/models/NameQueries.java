package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class NameQueries extends Model {

    public String name;
    public String query;
    public String observaciones;
    public Float orden;
    
    // Uno a Muchos Bidireccional No.5:LinksModels
    @OneToMany
    private Set<LinksModels> linksModels = new HashSet<LinksModels>(0);

    // Muchos a Uno Unidireccional No.3:Entities
    @ManyToOne
    Entities entities;


} // Fin de la clase