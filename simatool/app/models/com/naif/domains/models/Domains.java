package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.modules.morphia.Model;
import com.google.code.morphia.annotations.Entity;
import play.modules.morphia.Blob;

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
    private Set<Models> models = new HashSet<Models>(0);

    public String toString() {
        return name;
    }    

} // Fin de la clase