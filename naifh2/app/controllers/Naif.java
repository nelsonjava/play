package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

import models.com.naif.domains.models.*;

import controllers.com.naif.simatool.ejb.gen.*;

public class Naif extends Application {

    public static void index() {
        List<SystemsModels> systemsModels = SystemsModels.find("order by orden, name").fetch();
        render(systemsModels);
    }

    public static void systemsModels(Long id ) {

        SystemsModels systemsModels = SystemsModels.findById(id);

        render(systemsModels);
    }

    public static void domains(Long id ) {

        SystemsModels systemsModels = SystemsModels.findById(id);
        render(systemsModels);

    }

    public static void models(Long id ) {

        Domains domains = Domains.findById(id);
        render(domains);

    }

    public static void entities(Long id ) {

        Models models = Models.findById(id);
        render(models);

    }

    public static void attributes(Long id ) {

        Entities entities = Entities.findById(id);
        render(entities);

    }

    public static void generar(Long idDomains, Long idFrameworks ) {

        Domains domains = Domains.findById(idDomains);

        Frameworks frameworks = Frameworks.findById(idFrameworks);

        EntityGen entityGen = new EntityGen(domains,frameworks);
        entityGen.GenDominio();

        render(domains);

    }


    public static void frameworks(Long id ) {

        Domains domains = Domains.findById(id);

        List<Frameworks> frameworks = Frameworks.find("order by orden, name").fetch();
        render(frameworks,domains);

    }

    public static void frameworksGen(Long id ) {

        Entities entities = Entities.findById(id);

        EntityGen entityGen = new EntityGen(entities);
        entityGen.GenEjb();

        render(entities);

    }

/*
    public static void frameworksGen(Long idEntities,Long idFrameworks) {

        Entities entities = Entities.findById(idEntities);

        Frameworks frameworks = Frameworks.findById(idFrameworks);

        EntityGen entityGen = new EntityGen(entities);
        entityGen.GenEjb();

        render(entities);

    }
*/

}

