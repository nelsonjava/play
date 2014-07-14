package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class Domains extends Model {

    public String name;
    public String codigo;
    public String release;
    public Date fecha;
    public String description;
    public Float orden;
    
    // Muchos a Uno Unidireccional No.3:SystemsModels
    @ManyToOne
    SystemsModels systemsModels;

    // Uno a Muchos Bidireccional No.5:Models
    @OneToMany
    private Set<Models> models = new HashSet<Models>(0);

    // Uno a Muchos Bidireccional No.5:LinksModels
    @OneToMany
    private Set<LinksModels> linksModels = new HashSet<LinksModels>(0);


} // Fin de la clase