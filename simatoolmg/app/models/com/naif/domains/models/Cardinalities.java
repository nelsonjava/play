package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.modules.morphia.Model;
import com.google.code.morphia.annotations.Entity;
import play.modules.morphia.Blob;

@Entity
public class Cardinalities extends Model {

    private String name;
    private String cardinality;
    private boolean unidireccional;
    private String observaciones;
    private Float orden;

    public String toString() {
        return name;
    }


} // Fin de la clase