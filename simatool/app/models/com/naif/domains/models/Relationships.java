package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class Relationships extends Model {

    public boolean optionality;
    public String name;
    public String mappedby;
    public String annotationsField;
    public String annotationsMethod;
    public String tabla;
    public String idTabla1;
    public String idTabla2;
    public String description;
    public String observaciones;
    public Float orden;

} // Fin de la clase