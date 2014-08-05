package controllers.com.naif.simatool.ejb.gen;

import models.com.naif.domains.models.*;

import com.naif.tools.filetxt.FileTxt;

public class EntityGen {

    private StringBuilder javaSource = new StringBuilder();
    private Entities entities;

    public EntityGen() {
    }

    public EntityGen(Entities entities) {
       this.entities = entities;
    }

    public void GenEjb() {

       javaSource.append("\npackage models.com.naif.domains.models;");
       javaSource.append("\n");
       javaSource.append("\nimport java.util.*;");
       javaSource.append("\nimport javax.persistence.*;");
       javaSource.append("\n");
       javaSource.append("\nimport play.db.jpa.*;");
       javaSource.append("\n");
       javaSource.append("\n@Entity");
       javaSource.append("\npublic class "+entities.name+" extends Model {");
       javaSource.append("\n");

       for (Attributes attributes : entities.attributes) {
           javaSource.append("\n    "+attributes.typesAttributes.type+" "+attributes.name+";");
       }
       javaSource.append("\n");
       javaSource.append("\n}");

       FileTxt filetxt = new FileTxt("c:/models.com.naif.domains", entities.name+".java", javaSource.toString());

       System.out.println(javaSource);






    }


} // Fin de clase
