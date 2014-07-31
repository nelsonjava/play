package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class Models extends Model {

    public String name;
    public String paquete;
    public String codigo;
    public String release;
    public Date date;
    public String description;
    public String observaciones;
    public Float orden;

    // Muchos a Uno Unidireccional No.3:Domains
    @ManyToOne
    public Domains domains;
    
    // Uno a Muchos Bidireccional No.5:Entities
    @OneToMany(mappedBy="models",
               fetch=FetchType.LAZY, targetEntity=void.class)
    private Set<Entities> entities = new HashSet<Entities>(0);

    public String toString() {
        return name;
    }

} // Fin de la clase