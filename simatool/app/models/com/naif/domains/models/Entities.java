package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class Entities extends Model {

    public String name;
    public String tabla;
    public String tablaSecuencia;
    public String modifier;
    public String extend;
    public String imports;
    public String annotations;
    public String source;
    public String description;
    public String observaciones;
    public Float orden;

} // Fin de la clase