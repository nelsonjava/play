package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class Relationships extends Model {

    public boolean optionality;
    public String name;
    public String mappedby;
    public String annotationsField;
    public String annotationsMethod;
    public String tabla;
    public String idTabla1;
    public String idTabla2;
    public String description;
    public String observaciones;
    public Float orden;
    
    // Muchos a Uno Unidireccional No.3:Cardinalities
    @ManyToOne
    public Cardinalities cardinalities;

    // Muchos a Uno Unidireccional No.3:PropertiesAttributes
    @ManyToOne
    public PropertiesAttributes propertiesAttributes;

    // Muchos a Uno Unidireccional No.3:Entities
    @ManyToOne
    public Entities from;

    // Muchos a Uno Unidireccional No.3:Entities
    @ManyToOne
    public Entities to;

    // Muchos a Uno Unidireccional No.3:LinksModels
    @ManyToOne
    public LinksModels linksModels;
    
    public String toString() {
        return name;
    }    

} // Fin de la clase