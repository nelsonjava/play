package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class TiposLinks extends Model {

    public String name;
    public Float orden;

    public String toString() {
        return name;
    }

} // Fin de la clase