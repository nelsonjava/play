package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.modules.morphia.Model;
import com.google.code.morphia.annotations.Entity;
import play.modules.morphia.Blob;

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

    public String toString() {
        return name;
    }

} // Fin de la clase