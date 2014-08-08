/*
würde = burde
wieder = bida = er=a
weg = be
j = h
*/
package controllers.com.naif.simatool.ejb.gen;

import models.com.naif.domains.models.*;

import com.naif.tools.filetxt.FileTxt;

public class EntityGen {

    private StringBuilder javaSource = new StringBuilder();
    private Entities entities;
    private Frameworks frameworks;

    public EntityGen() {
    }

    public EntityGen(Entities entities) {
       this.entities = entities;
    }

    public EntityGen(Entities entities, Frameworks frameworks) {
       this.entities = entities;
       this.frameworks = frameworks;
    }

    public void imports(Frameworks frameworks) {

       javaSource.append("\npackage models.com.naif.domains.models;");
       javaSource.append("\n");
       javaSource.append("\nimport java.util.*;");
       javaSource.append("\n");

       switch(frameworks.persistence) {
           case "jpa":
                javaSource.append("\nimport javax.persistence.*;");
                break;

           case "play":
                javaSource.append("\nimport javax.persistence.*;");
                javaSource.append("\nimport play.db.jpa.*;");
                break;

           case "morphia":
                javaSource.append("\nimport javax.persistence.*;");
                javaSource.append("\nimport play.db.morphia.*;");
                break;

           case "sqlite":
                javaSource.append("\nimport javax.persistence.*;");
                javaSource.append("\nimport sqlite.pendiente");
                break;

           default:
                break;
       } // switch

       javaSource.append("\n");
       javaSource.append("\n@Entity");
       javaSource.append("\npublic class "+entities.name+" extends Model {");
       javaSource.append("\n");

    } // imports

    public void attributes() {

       for (Attributes attributes : entities.attributes) {
           javaSource.append("\n    "+attributes.typesAttributes.type+" "+attributes.name+";");
       }

    }

    public void to() {

       for (Relationships relationships : entities.to) {
            cardinality(relationships, "to");
       } // for
    } // to()

    public void from() {

       for (Relationships relationships : entities.from) {
            cardinality(relationships, "from");
       } // for

    } // from()


    public void cardinality(Relationships relationships, String type) {

        switch(relationships.cardinalities.cardinality) {

            case "1..1":     // Uno a Uno Unidireccional No.1
                 javaSource.append("\n");
                 javaSource.append(relationships.cardinalities.cardinality+" OK");
                 break;

            case "1..1b":     // Uno a Uno Bidireccional No.2
                 javaSource.append("\n");
                 javaSource.append(relationships.cardinalities.cardinality+" OK");
                 break;

            case "*..1":     // Muchos a Uno Unidireccional No.3
                 javaSource.append("\n");
                 javaSource.append(relationships.cardinalities.cardinality+" OK");
                 break;

            case "1..*":     // Uno a Muchos Unidireccional No.4
                 javaSource.append("\n");
                 javaSource.append(relationships.cardinalities.cardinality+" OK");
                 break;

            case "1..*b":     // Uno a Muchos Bidireccional No.5

                 javaSource.append("\n");
                 switch(type) {

                     case "from":

                          javaSource.append("\n    // "+relationships.cardinalities.name+":"+relationships.to.name+" from");
                          javaSource.append("\n    "+"@OneToMany(mappedBy=\""+relationships.from.name.toLowerCase()+"\",");
                          javaSource.append("\n               fetch=FetchType.LAZY, targetEntity=void.class)");
                          javaSource.append("\n    "+    "public Set<"+relationships.to.name+"> "+relationships.to.name.toLowerCase()+" = new HashSet<Domains>(0);");
                          break;

                     case "to":

                          javaSource.append("\n    // "+relationships.cardinalities.name+":"+relationships.to.name+" to");
                          javaSource.append("\n    "+"@ManyToOne");
                          javaSource.append("\n    "+relationships.from.name+" "+relationships.from.name.toLowerCase()+";");
                          break;

                     default:
                          break;
                 } // switch

                 break;

            case "*..*":     // Muchos a Muchos Unidireccional No.6
                 javaSource.append("\n");
                 javaSource.append(relationships.cardinalities.cardinality+" OK");
                 break;

            case "*..*b":     // Muchos a Muchos Bidireccional No.7
                 javaSource.append("\n");
                 javaSource.append(relationships.cardinalities.cardinality+" OK");
                 break;

            default:
                   break;
        } // switch

    } // cardinality


    public void GenEjb() {

       imports(frameworks);
       attributes();
       to();
       from();

       javaSource.append("\n");
       javaSource.append("\n}");

       FileTxt filetxt = new FileTxt("c:/models.com.naif.domains", entities.name+".java", javaSource.toString());

       System.out.println(javaSource);

    }


} // Fin de clase
