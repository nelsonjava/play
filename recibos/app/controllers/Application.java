package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    static String sfile = "D:/sima/simacart/2014.diu/RECIBOS/JUN/RECIJUN.DAT";

    public static void index() {
        Recibos recibo = new Recibos(sfile);
        recibo.registro("209843");
        render();
    }

}