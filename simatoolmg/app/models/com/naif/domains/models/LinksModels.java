package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.modules.morphia.Model;
import com.google.code.morphia.annotations.Entity;
import play.modules.morphia.Blob;

@Entity
public class LinksModels extends Model {

    public String titulo;
    public String link;
    public String observacion;
    public Float orden;

    public String toString() {
        return titulo;
    }

} // Fin de la clase