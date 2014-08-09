package models.com.naif.domains.models;

import play.modules.morphia.Model;
import com.google.code.morphia.annotations.Entity;

@Entity
public class SystemsModels extends Model {

    public Float orden;
    public String name;
    public String observaciones;

    public String toString() {
        return name;
    }

} // Fin de la clase


