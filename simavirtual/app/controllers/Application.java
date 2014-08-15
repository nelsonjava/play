package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.com.naif.domains.recibos.recibosData;

import controllers.com.naif.sima.dbf.simacart.year.recibos.RecibosDbf;

public class Application extends Controller {

    public static void index() {
        render();
    }

   public void saveRecibos(Recibos recibos, String xCodigo) {

        String sfile = "D:/sima/simacart/2014.diu/RECIBOS/JUN/RECIJUN.DAT";
        RecibosDbf recibosDbf = new RecibosDbf(sfile);

        RecibosData recibosData = new RecibosData();
        recibosDbf.saveRecibos(recibosData, "CCODIGOEST");
        render();
    }  // recibos

}

