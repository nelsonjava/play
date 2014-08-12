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
    @OneToMany(mappedBy="systemsModels",
               fetch=FetchType.LAZY, targetEntity=void.class)
    public Set<Domains> domains = new HashSet<Domains>(0);

    public String toString() {
        return name;
    }

} // Fin de la clase
