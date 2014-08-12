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

    // Muchos a Uno Unidireccional No.3:Entities
    @ManyToOne
    public Entities objPadre;

    // Muchos a Uno Unidireccional No.3:Models
    @ManyToOne
    public Models models;

    // Uno a Muchos Bidireccional No.5:Attributes
    @OneToMany(mappedBy="entities",
               fetch=FetchType.LAZY, targetEntity=void.class)
    public Set<Attributes> attributes = new HashSet<Attributes>(0);

    // Uno a Muchos Bidireccional No.5:Relationships
    @OneToMany(mappedBy="from",
               fetch=FetchType.LAZY, targetEntity=void.class)
    public  Set<Relationships> from = new HashSet<Relationships>(0);

    // Uno a Muchos Bidireccional No.5:Relationships
    @OneToMany(mappedBy="to",
               fetch=FetchType.LAZY, targetEntity=void.class)
    public Set<Relationships> to = new HashSet<Relationships>(0);

    public String toString() {
        return name;
    }

} // Fin de la clase