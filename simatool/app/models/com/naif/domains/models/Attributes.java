package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.modules.morphia.Model;
import com.google.code.morphia.annotations.Entity;
import play.modules.morphia.Blob;

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

    // Muchos a Uno Unidireccional No.3:Attributes
    @ManyToOne
    public Attributes objPadre;

    // Muchos a Uno Unidireccional No.3:Entities
    @ManyToOne
    public Entities entities;

    // Muchos a Uno Unidireccional No.3:PropertiesAttributes
    @ManyToOne
    public PropertiesAttributes propertiesAttributes;

    // Muchos a Uno Unidireccional No.3:LinksModels
    @ManyToOne
    public LinksModels linksModels;

    // Muchos a Uno Unidireccional No.3:TypesAttributes
    @ManyToOne
    public TypesAttributes typesAttributes;
    
    public String toString() {
        return name;
    }

} // Fin de la clase