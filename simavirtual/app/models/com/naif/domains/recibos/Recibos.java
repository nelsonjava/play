package models.com.naif.domains.recibos;

import java.util.*;

import javax.persistence.*;
import play.db.jpa.*;

@Entity
public class Recibos extends Model {

    public String cBarOpoRec;
    public String cVlrExtRec;
    public String cTxtUnoRec;
    public String cBarExtRec;
    public String cNomUsrRfa;
    public String cTxtDosRec;
    public String cHorUsrRfa;
    public Date dFecUsrRfa;
    public String cCodidoEst;
    public Integer nMesIniPag;
    public Integer nMesFinPag;
    public String cNomEmpCon;
    public Float nIdeCodRfa;
    public String cCodRefRec;
    public String cNombreRec;
    public String cFecFacPag;
    public String cCodigoGru;
    public String cNroFacCaa;
    public String cNroNitCon;
    public String cNroCtaBan;
    public String cNomBanRec;
    public String cVlrMe1Rec;
    public String cVlrMo1Rec;
    public String cNomCo2Rec;
    public String cVlrTo1Rec;
    public String cPagExtPag;
    public String cPagOpoPag;
    public String cNomCo1Rec;
    public String cPerFacRec;
    public String cVlrTo3Rec;
    public String cNomCo4Rec;
    public String cVlrMo3Rec;
    public String cVlrMe3Rec;
    public String cVlrTo2Rec;
    public String cNomCo3Rec;
    public String cVlrMo2Rec;
    public String cVlrMe2Rec;
    public String cVlrTo5Rec;
    public String cNomCo6Rec;
    public String cVlrMo5Rec;
    public String cVlrMe5Rec;
    public String cVlrTo4Rec;
    public String cNomCo5Rec;
    public String cVlrMo4Rec;
    public String cVlrMe4Rec;
    public String cNomCo8Rec;
    public String cVlrTo7Rec;
    public String cVlrMe7Rec;
    public String cVlrMo7Rec;
    public String cNomCo7Rec;
    public String cVlrTo6Rec;
    public String cVlrMe6Rec;
    public String cVlrMo6Rec;
    public String cVlrOpoRec;
    public String cVlrTo9Rec;
    public String cVlrMe9Rec;
    public String cVlrMo9Rec;
    public String cNomCo9Rec;
    public String cVlrTo8Rec;
    public String cVlrMe8Rec;
    public String cVlrMo8Rec;

    public String toString() {
        return cCodRefRec;
    }

} // Fin de la clase