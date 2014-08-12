package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class Links extends Model {

    public String titulo;
    public String link;
    public String observaciones;
    public Float orden;

    // Muchos a Uno Unidireccional No.3:TiposLinksModels
    @ManyToOne
    public TiposLinks tiposLinks;

    public String toString() {
        return titulo;
    }

} // Fin de la clase