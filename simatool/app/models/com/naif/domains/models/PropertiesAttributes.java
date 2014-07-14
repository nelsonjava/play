package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class PropertiesAttributes extends Model {

    private static final long serialVersionUID = 1L;

    private Integer optlock;

    private String name;
    private String value;
    private String observaciones;
    private Float orden;
    
    // Uno a Muchos Bidireccional No.5:Relationships
    @OneToMany
    private Set<Relationships> relationships = new HashSet<Relationships>(0);

    // Uno a Muchos Bidireccional No.5:Attributes
    @OneToMany
    private Set<Attributes> attributes = new HashSet<Attributes>(0);

} // Fin de la clase