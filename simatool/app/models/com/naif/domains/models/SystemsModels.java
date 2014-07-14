package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class SystemsModels extends Model {

    public Float orden;
    public String name;
    public String observaciones;
    
    // Uno a Muchos Bidireccional No.5:Domains
    @OneToMany
    private Set<Domains> domains = new HashSet<Domains>(0);

    // Uno a Muchos Bidireccional No.5:LinksModels
    @OneToMany
    private Set<LinksModels> linksModels = new HashSet<LinksModels>(0);


} // Fin de la clase
