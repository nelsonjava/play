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
    public TiposLinksModels tiposLinksModels;

    // Muchos a Uno Unidireccional No.3:Models
    @ManyToOne
    public Models models;

    // Muchos a Uno Unidireccional No.3:Domains
    @ManyToOne
    public Domains domains;

    // Muchos a Uno Unidireccional No.3:SystemsModels
    @ManyToOne
    public SystemsModels systemsModels;

    // Muchos a Uno Unidireccional No.3:Attributes
    @ManyToOne
    public Attributes attributes;

    // Muchos a Uno Unidireccional No.3:Relationships
    @ManyToOne
    public Relationships relationships;

    // Muchos a Uno Unidireccional No.3:Cardinalities
    @ManyToOne
    public Cardinalities cardinalities;

    // Muchos a Uno Unidireccional No.3:Entities
    @ManyToOne
    public Entities entities;

    // Muchos a Uno Unidireccional No.3:NameQueries
    @ManyToOne
    public NameQueries nameQueries;

} // Fin de la clase