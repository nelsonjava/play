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
    public SystemsModels systemsModels;

    @OneToMany(mappedBy="domains",
               fetch=FetchType.LAZY, targetEntity=void.class)
    public Set<Models> models = new HashSet<Models>(0);

    public String toString() {
        return name;
    }    

} // Fin de la clase