package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class Frameworks extends Model {

    public Float orden;
    public String name;
    public String persistence;

    public String toString() {
        return name+" "+persistence;
    }

} // Fin de la clase