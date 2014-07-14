package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class Models extends Model {

    private String name;
    public String paquete;
    public String codigo;
    public String release;
    public Date date;
    public String description;
    public String observaciones;
    public Float orden;
    
    // Muchos a Uno Unidireccional No.3:Domains
    @ManyToOne
    public Domains domains;

} // Fin de la clase