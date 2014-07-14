package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class TiposLinksModels extends Model {

    public String nombre;
    public Float orden;

} // Fin de la clase