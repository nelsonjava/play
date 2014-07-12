package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class TypesAttributes extends Model {

    public String type;
    public String observaciones;
    public Float orden;

} // Fin de la clase