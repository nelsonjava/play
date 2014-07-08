package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

import com.naif.tools.dbffile.DBFFieldDescriptor;
import com.naif.tools.dbffile.DBFFile;
import com.naif.tools.dbffile.DBFReader;
import com.naif.tools.dbffile.DBFRecord;

import  com.naif.tools.dbf.DbfUtils;

import com.naif.tools.filetxt.FileTxt;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void sima() {
        simacont();
        simacart();
        render();
    }

    public static void simacont() {

        String PahtSimacont = "";

        PahtSimacont = "D:/sima/simacont/2009.diu";
        FileTxt fArchivos = new FileTxt();
        ArrayList<String> files = fArchivos.getClassFiles(PahtSimacont, "Dat");

        for (String fileName : files) {

            System.out.println("- " + fileName);
            System.out.println(PahtSimacont+"/"+fileName+".DAT");

            DbfUtils.beanDbfile(PahtSimacont+"/"+fileName+".DAT",               // Archivo a Leer
                                "com.naif.sima.dbf.simacont.year",              // Paquete
                                fileName,                                       // Nombre de la Clase
                                "private",                                      // Visibilidad
                                "c:/models.com.naif.sima.dbf.simacont.year");   // Directorio Destino
        }

        PahtSimacont = "D:/sima/simacont/2009.diu/bto";
        files = fArchivos.getClassFiles(PahtSimacont, "Dat");

        for (String fileName : files) {

            System.out.println("- " + fileName);
            System.out.println(PahtSimacont+"/"+fileName+".DAT");

            DbfUtils.beanDbfile(PahtSimacont+"/"+fileName+".DAT",                    // Archivo a Leer
                                "com.naif.sima.dbf.simacont.year.maeact",            // Paquete
                                fileName,                                            // Nombre de la Clase
                                "private",                                           // Visibilidad
                                "c:/models.com.naif.sima.dbf.simacont.year.maeact"); // Directorio Destino
        }
        render();
    }  // simacont

    public static void simacart() {

        String PahtSimacart = "";

        PahtSimacart = "D:/sima/simacart/2014.diu";
        FileTxt fArchivos = new FileTxt();
        ArrayList<String> files = fArchivos.getClassFiles(PahtSimacart, "Dat");

        for (String fileName : files) {

            System.out.println("- " + fileName);
            System.out.println(PahtSimacart+"/"+fileName+".DAT");

            DbfUtils.beanDbfile(PahtSimacart+"/"+fileName+".DAT",             // Archivo a Leer
                                "com.naif.sima.dbf.simacart.year",            // Paquete
                                fileName,                                     // Nombre de la Clase
                                "private",                                    // Visibilidad
                                "c:/models.com.naif.sima.dbf.simacart.year"); // Directorio Destino
        }

        PahtSimacart = "D:/sima/simacart/2014.diu/recibos/jun";

        files = fArchivos.getClassFiles(PahtSimacart, "Dat");

        for (String fileName : files) {

            System.out.println("- " + fileName);
            System.out.println(PahtSimacart+"/"+fileName+".DAT");

            DbfUtils.beanDbfile(PahtSimacart+"/"+fileName+".DAT",                     // Archivo a Leer
                                "com.naif.sima.dbf.simacart.year.recibos",            // Paquete
                                fileName,                                             // Nombre de la Clase
                                "private",                                            // Visibilidad
                                "c:/models.com.naif.sima.dbf.simacart.year.recibos"); // Directorio Destino
        }
        render();


    }  // simacart

}