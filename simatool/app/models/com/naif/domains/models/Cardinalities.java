package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class Cardinalities extends Model {

    private String name;
    private String cardinality;
    private boolean unidireccional;
    private String observaciones;
    private Float orden;

} // Fin de la clase