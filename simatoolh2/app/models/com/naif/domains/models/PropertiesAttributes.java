package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class PropertiesAttributes extends Model {

    public static final long serialVersionUID = 1L;

    public Integer optlock;

    public String name;
    public String value;
    public String observaciones;
    public Float orden;
    
    public String toString() {
        return name;
    }    

} // Fin de la clase