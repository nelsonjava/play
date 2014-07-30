package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.modules.morphia.Model;
import com.google.code.morphia.annotations.Entity;
import play.modules.morphia.Blob;

@Entity
public class Domains extends Model {

    public String name;
    public String codigo;
    public String release;
    public Date fecha;
    public String description;
    public Float orden;
    
    public String toString() {
        return name;
    }

} // Fin de la clase