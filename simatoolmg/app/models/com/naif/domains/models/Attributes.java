package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.modules.morphia.Model;
import com.google.code.morphia.annotations.Entity;
import play.modules.morphia.Blob;

@Entity
public class Attributes extends Model {

    public String name;
    public int length;
    public int precision;
    public boolean nullable;
    public boolean unico;
    public String descripcion;
    public String field;
    public String access;
    public String columnDefinition;
    public String annotationsField;
    public String annotationsMethod;
    public String observaciones;
    public Float orden;

    public String toString() {
        return name;
    }

} // Fin de la clase