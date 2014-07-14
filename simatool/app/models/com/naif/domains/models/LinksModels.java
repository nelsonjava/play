package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class LinksModels extends Model {

    public String titulo;
    public String link;
    public String observacion;
    public Float orden;
    
    // Muchos a Uno Unidireccional No.3:TiposLinksModels
    @ManyToOne
    TiposLinksModels tiposLinksModels;

    // Muchos a Uno Unidireccional No.3:Models
    @ManyToOne
    Models models;

    // Muchos a Uno Unidireccional No.3:Domains
    @ManyToOne
    Domains domains;

    // Muchos a Uno Unidireccional No.3:SystemsModels
    @ManyToOne
    SystemsModels systemsModels;

    // Muchos a Uno Unidireccional No.3:Attributes
    @ManyToOne
    Attributes attributes;

    // Muchos a Uno Unidireccional No.3:Relationships
    @ManyToOne
    Relationships relationships;

    // Muchos a Uno Unidireccional No.3:Cardinalities
    @ManyToOne
    Cardinalities cardinalities;

    // Muchos a Uno Unidireccional No.3:Entities
    @ManyToOne
    Entities entities;

    // Muchos a Uno Unidireccional No.3:NameQueries
    @ManyToOne
    NameQueries nameQueries;

} // Fin de la clase