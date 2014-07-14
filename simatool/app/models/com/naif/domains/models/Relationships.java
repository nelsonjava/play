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
    Cardinalities cardinalities;

    // Muchos a Uno Unidireccional No.3:PropertiesAttributes
    @ManyToOne
    PropertiesAttributes propertiesAttributes;

    // Muchos a Uno Unidireccional No.3:Entities
    @ManyToOne
    Entities from;

    // Muchos a Uno Unidireccional No.3:Entities
    @ManyToOne
    Entities to;

    // Muchos a Uno Unidireccional No.3:LinksModels
    @ManyToOne
    LinksModels linksModels;

} // Fin de la clase