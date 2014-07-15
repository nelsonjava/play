package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class SystemsModels extends Model {

    public Float orden;
    public String name;
    public String observaciones;
    
    public String toString() {
        return name;
    }

} // Fin de la clase
