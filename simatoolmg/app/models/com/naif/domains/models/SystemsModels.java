package models.com.naif.domains.models;

import java.util.*;

import javax.persistence.*;
import play.modules.morphia.Model;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Reference;

@Entity
public class SystemsModels extends Model {

    public Float orden;
    public String name;
    public String observaciones;

    // Uno a Muchos Bidireccional No.5:Domains
    @Reference
    public Set<Domains> domains = new HashSet<Domains>(0);

    public String toString() {
        return name;
    }

} // Fin de la clase