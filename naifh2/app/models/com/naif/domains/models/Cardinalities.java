package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class Cardinalities extends Model {

    public String name;
    public String cardinality;
    public boolean unidireccional;
    public String observaciones;
    public Float orden;

    // Muchos a Uno Unidireccional No.3:LinksModels
    @ManyToOne
    public LinksModels linksModels;

    public String toString() {
        return name;
    }


} // Fin de la clase