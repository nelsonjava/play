package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.com.naif.domains.recibos.RecibosData;

import controllers.com.naif.sima.dbf.simacart.year.recibos.RecibosDbf;

public class Application extends Controller {

    public static void index() {
        render();
    }

   public static void recibos() {

        if(RecibosData.count() == 0) {

          String sfile = "D:/sima/simacart/2014.diu/RECIBOS/JUN/RECIJUN.DAT";
          RecibosDbf recibosDbf = new RecibosDbf(sfile);

          recibosDbf.saveRecibos();
        } // if

        render();

    }  // recibos

   public static void recibosData() {

      List<RecibosData> recibosData = RecibosData.find("order by cCodigoGru").fetch();
      render(recibosData);

   }  // recibos



}

