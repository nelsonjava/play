package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class PropertiesAttributes extends Model {

    private static final long serialVersionUID = 1L;

    private Integer optlock;

    private String name;
    private String value;
    private String observaciones;
    private Float orden;
    
    public String toString() {
        return name;
    }    

} // Fin de la clase