package models.com.naif.domains.models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class LinksModels extends Model {

    public String titulo;
    public String link;
    public String observacion;
    public Float orden;

} // Fin de la clase