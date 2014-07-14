package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class TypesAttributes extends Model {

    public String type;
    public String observaciones;
    public Float orden;
    
    // Uno a Muchos Bidireccional No.5:Attributes
    @OneToMany
    private Set<Attributes> attributes = new HashSet<Attributes>(0);

} // Fin de la clase