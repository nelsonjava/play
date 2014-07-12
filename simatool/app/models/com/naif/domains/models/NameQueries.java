package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class NameQueries extends Model {

    public String name;
    public String query;
    public String observaciones;
    public Float orden;

} // Fin de la clase