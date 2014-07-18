package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

import models.com.naif.domains.models.*;

public class ControllerSystemsModels extends Application {

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





}

