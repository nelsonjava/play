package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class Entities extends Model {

    public String name;
    public String tabla;
    public String tablaSecuencia;
    public String modifier;
    public String extend;
    public String imports;
    public String annotations;
    public String source;
    public String description;
    public String observaciones;
    public Float orden;

    // Uno a Muchos Bidireccional No.5:Entities
    @OneToMany
    private Set<Entities> objHijos = new HashSet<Entities>(0);

    // Muchos a Uno Unidireccional No.3:Entities
    @ManyToOne
    Entities objPadre;

    // Muchos a Uno Unidireccional No.3:Models
    @ManyToOne
    Models models;

    // Uno a Muchos Bidireccional No.5:NameQueries
    @OneToMany
    private Set<NameQueries> nameQueries = new HashSet<NameQueries>(0);

    // Uno a Muchos Bidireccional No.5:LinksModels
    @OneToMany
    private Set<LinksModels> linksModels = new HashSet<LinksModels>(0);

    // Uno a Muchos Bidireccional No.5:Attributes
    @OneToMany
    private Set<Attributes> attributes = new HashSet<Attributes>(0);

    // Uno a Muchos Bidireccional No.5:Relationships
    @OneToMany
    private Set<Relationships> from = new HashSet<Relationships>(0);

    // Uno a Muchos Bidireccional No.5:Relationships
    @OneToMany
    private Set<Relationships> to = new HashSet<Relationships>(0);


} // Fin de la clase