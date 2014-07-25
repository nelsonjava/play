package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.modules.morphia.Model;
import com.google.code.morphia.annotations.Entity;
import play.modules.morphia.Blob;

@Entity
public class TypesAttributes extends Model {

    public String type;
    public String observaciones;
    public Float orden;

    public String toString() {
        return type;
    }

} // Fin de la clase