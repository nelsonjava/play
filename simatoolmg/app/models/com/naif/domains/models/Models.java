package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.modules.morphia.Model;
import com.google.code.morphia.annotations.Entity;
import play.modules.morphia.Blob;

@Entity
public class Models extends Model {

    public String name;
    public String paquete;
    public String codigo;
    public String release;
    public Date date;
    public String description;
    public String observaciones;
    public Float orden;
    public String link;

    public String toString() {
        return name;
    }

} // Fin de la clase