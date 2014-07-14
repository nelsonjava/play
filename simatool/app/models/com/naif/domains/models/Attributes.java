package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class Attributes extends Model {

    public String name;
    public int length;
    public int precision;
    public boolean nullable;
    public boolean unico;
    public String descripcion;
    public String field;
    public String access;
    public String columnDefinition;
    public String annotationsField;
    public String annotationsMethod;
    public String observaciones;
    public Float orden;
    
    // Uno a Muchos Bidireccional No.5:Attributes
    @OneToMany
    private Set<Attributes> objHijos = new HashSet<Attributes>(0);
    
    // Muchos a Uno Unidireccional No.3:Attributes
    @ManyToOne
    Attributes objPadre;

    // Muchos a Uno Unidireccional No.3:Entities
    @ManyToOne
    Entities entities;

    // Muchos a Uno Unidireccional No.3:PropertiesAttributes
    @ManyToOne
    PropertiesAttributes propertiesAttributes;

    // Muchos a Uno Unidireccional No.3:LinksModels
    @ManyToOne
    LinksModels linksModels;

    // Muchos a Uno Unidireccional No.3:TypesAttributes
    @ManyToOne
    TypesAttributes typesAttributes;

} // Fin de la clase