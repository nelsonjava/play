package controllers.com.naif.sima.dbf.simacont.year.maeact;

import java.util.*;

import com.naif.tools.dbffile.DBFFieldDescriptor;
import com.naif.tools.dbffile.DBFFile;
import com.naif.tools.dbffile.DBFReader;
import com.naif.tools.dbffile.DBFRecord;

public class MAEBTO implements java.io.Serializable {

   private String cCODIGOEST;
   private String cCODESTEST;
   private String cPASWOREST;
   private String cUSRWWWEST;
   private String cPASWWWEST;
   private boolean lHAYWWWEST ;
   private String cANOUSREST;
   private boolean lGRUPOKEST ;
   private String cGRUANTGRU;
   private String cCODIGOGRU;
   private String cNSALONGRU;
   private boolean lRETIROEST ;
   private Date dFECRETEST;
   private int nPERRETEST;
   private int nULTRECEST;
   private int nAPROBONOT;
   private int nAPRANTNOT;
   private boolean lREPITEEST ;
   private boolean lSICUPOEST ;
   private boolean lSIMATREST ;
   private Date dFECMATEST;
   private String cHORMATEST;
   private boolean lESTNEWEST ;
   private String cFOLFINEST;
   private String cANOINGEST;
   private int nNROLISEST;
   private int nMOROSOEST;
   private int nNOMFACEST;
   private int nESTRATEST;
   private String cNOMEPSEST;
   private String cGRUPRHEST;
   private String cCONCEPEST;
   private String cCODIGORUT;
   private String cCODIGOBUS;
   private String cBOLETIEST;
   private String cTXTTEMEST;
   private String cAPELLIEST;
   private String cNOMBREEST;
   private Date dFECNACEST;
   private String cLUGNACEST;
   private String cDOCNITEST;
   private String cLUGNITEST;
   private String cTIPNITEST;
   private boolean lFOTNITEST ;
   private boolean lSEXFEMEST ;
   private String cDIRECCEST;
   private String cBARRIOEST;
   private String cCIUDADEST;
   private String cDEPARTEST;
   private String cTELEFNEST;
   private String cTELCELEST;
   private String cMAIESTEST;
   private String cPARNITEST;
   private String cCODFAMEST;
   private float nTOTFACEST;
   private float nTOTPAGEST;
   private String cNITCO1EST;
   private String cTIPCO1EST;
   private boolean lNORCO1EST ;
   private String cNITCO2EST;
   private String cTIPCO2EST;
   private boolean lNORCO2EST ;
   private String cNITCO3EST;
   private String cTIPCO3EST;
   private boolean lNORCO3EST ;
   private String cNITCO4EST;
   private String cTIPCO4EST;
   private boolean lNORCO4EST ;
   private String cASIENEEST;
   private String cASIFEBEST;
   private String cASIMAREST;
   private String cASIABREST;
   private String cASIMAYEST;
   private String cASIJUNEST;
   private String cASIJULEST;
   private String cASIAGOEST;
   private String cASISEPEST;
   private String cASIOCTEST;
   private String cASINOVEST;
   private String cASIDICEST;
   private boolean lCARNETEST ;
   private String cRESENEEST;
   private String cRESFEBEST;
   private String cRESMAREST;
   private String cRESABREST;
   private String cRESMAYEST;
   private String cRESJUNEST;
   private String cRESJULEST;
   private String cRESAGOEST;
   private String cRESSEPEST;
   private String cRESOCTEST;
   private String cRESNOVEST;
   private String cRESDICEST;
   private String pNOMPADEST;
   private String cAPEPADEST;
   private String cNOMPADEST;
   private boolean lPADQEPEST ;
   private Date dNACPADEST;
   private String cLUGPADEST;
   private String cPADNITEST;
   private String cPADLUGEST;
   private String cPADTNTEST;
   private boolean lPADFOTEST ;
   private String cPROPADEST;
   private String cEMPPADEST;
   private String cCARPADEST;
   private String cDIRPADEST;
   private String cBARPADEST;
   private String cCIUPADEST;
   private String cDEPPADEST;
   private String cTELPADEST;
   private String cCELPADEST;
   private String cFAXPADEST;
   private String cBIPPADEST;
   private String cMAIPADEST;
   private String pNOMMADEST;
   private String cAPEMADEST;
   private String cNOMMADEST;
   private boolean lMADQEPEST ;
   private Date dNACMADEST;
   private String cLUGMADEST;
   private String cMADNITEST;
   private String cMADLUGEST;
   private String cMADTNTEST;
   private boolean lMADFOTEST ;
   private String cPROMADEST;
   private String cEMPMADEST;
   private String cCARMADEST;
   private String cDIRMADEST;
   private String cBARMADEST;
   private String cCIUMADEST;
   private String cDEPMADEST;
   private String cTELMADEST;
   private String cCELMADEST;
   private String cFAXMADEST;
   private String cBIPMADEST;
   private String cMAIMADEST;
   private String pNOMACUEST;
   private String cAPEACUEST;
   private String cNOMACUEST;
   private boolean lACUQEPEST ;
   private Date dNACACUEST;
   private String cLUGACUEST;
   private String cACUNITEST;
   private String cACULUGEST;
   private String cACUTNTEST;
   private boolean lACUFOTEST ;
   private String cPROACUEST;
   private String cEMPACUEST;
   private String cCARACUEST;
   private String cDIRACUEST;
   private String cBARACUEST;
   private String cCIUACUEST;
   private String cDEPACUEST;
   private String cTE1ACUEST;
   private String cTE2ACUEST;
   private String cCELACUEST;
   private String cFAXACUEST;
   private String cBIPACUEST;
   private String cMAIACUEST;
   private String cPARACUEST;
   private String cPAZSDOEST;
   private String cOBSLIBEST;
   private String cOBSRETEST;
   private String cCOLE13EST;
   private String cCOLE00EST;
   private String cCOLE01EST;
   private String cCOLE02EST;
   private String cCOLE03EST;
   private String cCOLE04EST;
   private String cCOLE05EST;
   private String cCOLE06EST;
   private String cCOLE07EST;
   private String cCOLE08EST;
   private String cCOLE09EST;
   private String cCOLE10EST;
   private String cCOLE11EST;
   private String cCOLE12EST;
   private String cVOTESCEST;
   private String cCODIGOMAT;
   private String cANOESTMAE;

   private DBFFile dbf;
   private ArrayList<DBFRecord> registros;
   private DBFRecord registro;

   public MAEBTO(String sFile) {
     dbf = new DBFReader().readDBFFile(sFile);
     registros = dbf.getRecords();
   }

   public String getCCODIGOEST() {
       return cCODIGOEST;
   }

   public String getCCODESTEST() {
       return cCODESTEST;
   }

   public String getCPASWOREST() {
       return cPASWOREST;
   }

   public String getCUSRWWWEST() {
       return cUSRWWWEST;
   }

   public String getCPASWWWEST() {
       return cPASWWWEST;
   }

   public boolean getLHAYWWWEST () {
       return lHAYWWWEST ;
   }

   public String getCANOUSREST() {
       return cANOUSREST;
   }

   public boolean getLGRUPOKEST () {
       return lGRUPOKEST ;
   }

   public String getCGRUANTGRU() {
       return cGRUANTGRU;
   }

   public String getCCODIGOGRU() {
       return cCODIGOGRU;
   }

   public String getCNSALONGRU() {
       return cNSALONGRU;
   }

   public boolean getLRETIROEST () {
       return lRETIROEST ;
   }

   public Date getDFECRETEST() {
       return dFECRETEST;
   }

   public int getNPERRETEST() {
       return nPERRETEST;
   }

   public int getNULTRECEST() {
       return nULTRECEST;
   }

   public int getNAPROBONOT() {
       return nAPROBONOT;
   }

   public int getNAPRANTNOT() {
       return nAPRANTNOT;
   }

   public boolean getLREPITEEST () {
       return lREPITEEST ;
   }

   public boolean getLSICUPOEST () {
       return lSICUPOEST ;
   }

   public boolean getLSIMATREST () {
       return lSIMATREST ;
   }

   public Date getDFECMATEST() {
       return dFECMATEST;
   }

   public String getCHORMATEST() {
       return cHORMATEST;
   }

   public boolean getLESTNEWEST () {
       return lESTNEWEST ;
   }

   public String getCFOLFINEST() {
       return cFOLFINEST;
   }

   public String getCANOINGEST() {
       return cANOINGEST;
   }

   public int getNNROLISEST() {
       return nNROLISEST;
   }

   public int getNMOROSOEST() {
       return nMOROSOEST;
   }

   public int getNNOMFACEST() {
       return nNOMFACEST;
   }

   public int getNESTRATEST() {
       return nESTRATEST;
   }

   public String getCNOMEPSEST() {
       return cNOMEPSEST;
   }

   public String getCGRUPRHEST() {
       return cGRUPRHEST;
   }

   public String getCCONCEPEST() {
       return cCONCEPEST;
   }

   public String getCCODIGORUT() {
       return cCODIGORUT;
   }

   public String getCCODIGOBUS() {
       return cCODIGOBUS;
   }

   public String getCBOLETIEST() {
       return cBOLETIEST;
   }

   public String getCTXTTEMEST() {
       return cTXTTEMEST;
   }

   public String getCAPELLIEST() {
       return cAPELLIEST;
   }

   public String getCNOMBREEST() {
       return cNOMBREEST;
   }

   public Date getDFECNACEST() {
       return dFECNACEST;
   }

   public String getCLUGNACEST() {
       return cLUGNACEST;
   }

   public String getCDOCNITEST() {
       return cDOCNITEST;
   }

   public String getCLUGNITEST() {
       return cLUGNITEST;
   }

   public String getCTIPNITEST() {
       return cTIPNITEST;
   }

   public boolean getLFOTNITEST () {
       return lFOTNITEST ;
   }

   public boolean getLSEXFEMEST () {
       return lSEXFEMEST ;
   }

   public String getCDIRECCEST() {
       return cDIRECCEST;
   }

   public String getCBARRIOEST() {
       return cBARRIOEST;
   }

   public String getCCIUDADEST() {
       return cCIUDADEST;
   }

   public String getCDEPARTEST() {
       return cDEPARTEST;
   }

   public String getCTELEFNEST() {
       return cTELEFNEST;
   }

   public String getCTELCELEST() {
       return cTELCELEST;
   }

   public String getCMAIESTEST() {
       return cMAIESTEST;
   }

   public String getCPARNITEST() {
       return cPARNITEST;
   }

   public String getCCODFAMEST() {
       return cCODFAMEST;
   }

   public float getNTOTFACEST() {
       return nTOTFACEST;
   }

   public float getNTOTPAGEST() {
       return nTOTPAGEST;
   }

   public String getCNITCO1EST() {
       return cNITCO1EST;
   }

   public String getCTIPCO1EST() {
       return cTIPCO1EST;
   }

   public boolean getLNORCO1EST () {
       return lNORCO1EST ;
   }

   public String getCNITCO2EST() {
       return cNITCO2EST;
   }

   public String getCTIPCO2EST() {
       return cTIPCO2EST;
   }

   public boolean getLNORCO2EST () {
       return lNORCO2EST ;
   }

   public String getCNITCO3EST() {
       return cNITCO3EST;
   }

   public String getCTIPCO3EST() {
       return cTIPCO3EST;
   }

   public boolean getLNORCO3EST () {
       return lNORCO3EST ;
   }

   public String getCNITCO4EST() {
       return cNITCO4EST;
   }

   public String getCTIPCO4EST() {
       return cTIPCO4EST;
   }

   public boolean getLNORCO4EST () {
       return lNORCO4EST ;
   }

   public String getCASIENEEST() {
       return cASIENEEST;
   }

   public String getCASIFEBEST() {
       return cASIFEBEST;
   }

   public String getCASIMAREST() {
       return cASIMAREST;
   }

   public String getCASIABREST() {
       return cASIABREST;
   }

   public String getCASIMAYEST() {
       return cASIMAYEST;
   }

   public String getCASIJUNEST() {
       return cASIJUNEST;
   }

   public String getCASIJULEST() {
       return cASIJULEST;
   }

   public String getCASIAGOEST() {
       return cASIAGOEST;
   }

   public String getCASISEPEST() {
       return cASISEPEST;
   }

   public String getCASIOCTEST() {
       return cASIOCTEST;
   }

   public String getCASINOVEST() {
       return cASINOVEST;
   }

   public String getCASIDICEST() {
       return cASIDICEST;
   }

   public boolean getLCARNETEST () {
       return lCARNETEST ;
   }

   public String getCRESENEEST() {
       return cRESENEEST;
   }

   public String getCRESFEBEST() {
       return cRESFEBEST;
   }

   public String getCRESMAREST() {
       return cRESMAREST;
   }

   public String getCRESABREST() {
       return cRESABREST;
   }

   public String getCRESMAYEST() {
       return cRESMAYEST;
   }

   public String getCRESJUNEST() {
       return cRESJUNEST;
   }

   public String getCRESJULEST() {
       return cRESJULEST;
   }

   public String getCRESAGOEST() {
       return cRESAGOEST;
   }

   public String getCRESSEPEST() {
       return cRESSEPEST;
   }

   public String getCRESOCTEST() {
       return cRESOCTEST;
   }

   public String getCRESNOVEST() {
       return cRESNOVEST;
   }

   public String getCRESDICEST() {
       return cRESDICEST;
   }

   public String getPNOMPADEST() {
       return pNOMPADEST;
   }

   public String getCAPEPADEST() {
       return cAPEPADEST;
   }

   public String getCNOMPADEST() {
       return cNOMPADEST;
   }

   public boolean getLPADQEPEST () {
       return lPADQEPEST ;
   }

   public Date getDNACPADEST() {
       return dNACPADEST;
   }

   public String getCLUGPADEST() {
       return cLUGPADEST;
   }

   public String getCPADNITEST() {
       return cPADNITEST;
   }

   public String getCPADLUGEST() {
       return cPADLUGEST;
   }

   public String getCPADTNTEST() {
       return cPADTNTEST;
   }

   public boolean getLPADFOTEST () {
       return lPADFOTEST ;
   }

   public String getCPROPADEST() {
       return cPROPADEST;
   }

   public String getCEMPPADEST() {
       return cEMPPADEST;
   }

   public String getCCARPADEST() {
       return cCARPADEST;
   }

   public String getCDIRPADEST() {
       return cDIRPADEST;
   }

   public String getCBARPADEST() {
       return cBARPADEST;
   }

   public String getCCIUPADEST() {
       return cCIUPADEST;
   }

   public String getCDEPPADEST() {
       return cDEPPADEST;
   }

   public String getCTELPADEST() {
       return cTELPADEST;
   }

   public String getCCELPADEST() {
       return cCELPADEST;
   }

   public String getCFAXPADEST() {
       return cFAXPADEST;
   }

   public String getCBIPPADEST() {
       return cBIPPADEST;
   }

   public String getCMAIPADEST() {
       return cMAIPADEST;
   }

   public String getPNOMMADEST() {
       return pNOMMADEST;
   }

   public String getCAPEMADEST() {
       return cAPEMADEST;
   }

   public String getCNOMMADEST() {
       return cNOMMADEST;
   }

   public boolean getLMADQEPEST () {
       return lMADQEPEST ;
   }

   public Date getDNACMADEST() {
       return dNACMADEST;
   }

   public String getCLUGMADEST() {
       return cLUGMADEST;
   }

   public String getCMADNITEST() {
       return cMADNITEST;
   }

   public String getCMADLUGEST() {
       return cMADLUGEST;
   }

   public String getCMADTNTEST() {
       return cMADTNTEST;
   }

   public boolean getLMADFOTEST () {
       return lMADFOTEST ;
   }

   public String getCPROMADEST() {
       return cPROMADEST;
   }

   public String getCEMPMADEST() {
       return cEMPMADEST;
   }

   public String getCCARMADEST() {
       return cCARMADEST;
   }

   public String getCDIRMADEST() {
       return cDIRMADEST;
   }

   public String getCBARMADEST() {
       return cBARMADEST;
   }

   public String getCCIUMADEST() {
       return cCIUMADEST;
   }

   public String getCDEPMADEST() {
       return cDEPMADEST;
   }

   public String getCTELMADEST() {
       return cTELMADEST;
   }

   public String getCCELMADEST() {
       return cCELMADEST;
   }

   public String getCFAXMADEST() {
       return cFAXMADEST;
   }

   public String getCBIPMADEST() {
       return cBIPMADEST;
   }

   public String getCMAIMADEST() {
       return cMAIMADEST;
   }

   public String getPNOMACUEST() {
       return pNOMACUEST;
   }

   public String getCAPEACUEST() {
       return cAPEACUEST;
   }

   public String getCNOMACUEST() {
       return cNOMACUEST;
   }

   public boolean getLACUQEPEST () {
       return lACUQEPEST ;
   }

   public Date getDNACACUEST() {
       return dNACACUEST;
   }

   public String getCLUGACUEST() {
       return cLUGACUEST;
   }

   public String getCACUNITEST() {
       return cACUNITEST;
   }

   public String getCACULUGEST() {
       return cACULUGEST;
   }

   public String getCACUTNTEST() {
       return cACUTNTEST;
   }

   public boolean getLACUFOTEST () {
       return lACUFOTEST ;
   }

   public String getCPROACUEST() {
       return cPROACUEST;
   }

   public String getCEMPACUEST() {
       return cEMPACUEST;
   }

   public String getCCARACUEST() {
       return cCARACUEST;
   }

   public String getCDIRACUEST() {
       return cDIRACUEST;
   }

   public String getCBARACUEST() {
       return cBARACUEST;
   }

   public String getCCIUACUEST() {
       return cCIUACUEST;
   }

   public String getCDEPACUEST() {
       return cDEPACUEST;
   }

   public String getCTE1ACUEST() {
       return cTE1ACUEST;
   }

   public String getCTE2ACUEST() {
       return cTE2ACUEST;
   }

   public String getCCELACUEST() {
       return cCELACUEST;
   }

   public String getCFAXACUEST() {
       return cFAXACUEST;
   }

   public String getCBIPACUEST() {
       return cBIPACUEST;
   }

   public String getCMAIACUEST() {
       return cMAIACUEST;
   }

   public String getCPARACUEST() {
       return cPARACUEST;
   }

   public String getCPAZSDOEST() {
       return cPAZSDOEST;
   }

   public String getCOBSLIBEST() {
       return cOBSLIBEST;
   }

   public String getCOBSRETEST() {
       return cOBSRETEST;
   }

   public String getCCOLE13EST() {
       return cCOLE13EST;
   }

   public String getCCOLE00EST() {
       return cCOLE00EST;
   }

   public String getCCOLE01EST() {
       return cCOLE01EST;
   }

   public String getCCOLE02EST() {
       return cCOLE02EST;
   }

   public String getCCOLE03EST() {
       return cCOLE03EST;
   }

   public String getCCOLE04EST() {
       return cCOLE04EST;
   }

   public String getCCOLE05EST() {
       return cCOLE05EST;
   }

   public String getCCOLE06EST() {
       return cCOLE06EST;
   }

   public String getCCOLE07EST() {
       return cCOLE07EST;
   }

   public String getCCOLE08EST() {
       return cCOLE08EST;
   }

   public String getCCOLE09EST() {
       return cCOLE09EST;
   }

   public String getCCOLE10EST() {
       return cCOLE10EST;
   }

   public String getCCOLE11EST() {
       return cCOLE11EST;
   }

   public String getCCOLE12EST() {
       return cCOLE12EST;
   }

   public String getCVOTESCEST() {
       return cVOTESCEST;
   }

   public String getCCODIGOMAT() {
       return cCODIGOMAT;
   }

   public String getCANOESTMAE() {
       return cANOESTMAE;
   }

   public ArrayList<DBFRecord> getRegistros() {
       return registros;
   }

   public ArrayList<String> getIds(String id) {

       ArrayList<String> ids = new ArrayList<String>();

       for (DBFRecord registro : registros) {
           ids.add((String)registro.getField(id));
       }

       return ids;
   }

   public void seek(String xCodigo,String cCodigo) {
       registro = dbf.getRecord(xCodigo,cCodigo);
       setRegistro();
   }

   public void setRegistro() {
       this.cCODIGOEST = (String)registro.getField("CCODIGOEST");
       this.cCODESTEST = (String)registro.getField("CCODESTEST");
       this.cPASWOREST = (String)registro.getField("CPASWOREST");
       this.cUSRWWWEST = (String)registro.getField("CUSRWWWEST");
       this.cPASWWWEST = (String)registro.getField("CPASWWWEST");
       this.lHAYWWWEST  = ((Boolean)registro.getField("LHAYWWWEST ")).booleanValue();
       this.cANOUSREST = (String)registro.getField("CANOUSREST");
       this.lGRUPOKEST  = ((Boolean)registro.getField("LGRUPOKEST ")).booleanValue();
       this.cGRUANTGRU = (String)registro.getField("CGRUANTGRU");
       this.cCODIGOGRU = (String)registro.getField("CCODIGOGRU");
       this.cNSALONGRU = (String)registro.getField("CNSALONGRU");
       this.lRETIROEST  = ((Boolean)registro.getField("LRETIROEST ")).booleanValue();
       this.dFECRETEST = (Date)registro.getField("DFECRETEST");
       this.nPERRETEST = ((Integer)registro.getField("NPERRETEST")).intValue();
       this.nULTRECEST = ((Integer)registro.getField("NULTRECEST")).intValue();
       this.nAPROBONOT = ((Integer)registro.getField("NAPROBONOT")).intValue();
       this.nAPRANTNOT = ((Integer)registro.getField("NAPRANTNOT")).intValue();
       this.lREPITEEST  = ((Boolean)registro.getField("LREPITEEST ")).booleanValue();
       this.lSICUPOEST  = ((Boolean)registro.getField("LSICUPOEST ")).booleanValue();
       this.lSIMATREST  = ((Boolean)registro.getField("LSIMATREST ")).booleanValue();
       this.dFECMATEST = (Date)registro.getField("DFECMATEST");
       this.cHORMATEST = (String)registro.getField("CHORMATEST");
       this.lESTNEWEST  = ((Boolean)registro.getField("LESTNEWEST ")).booleanValue();
       this.cFOLFINEST = (String)registro.getField("CFOLFINEST");
       this.cANOINGEST = (String)registro.getField("CANOINGEST");
       this.nNROLISEST = ((Integer)registro.getField("NNROLISEST")).intValue();
       this.nMOROSOEST = ((Integer)registro.getField("NMOROSOEST")).intValue();
       this.nNOMFACEST = ((Integer)registro.getField("NNOMFACEST")).intValue();
       this.nESTRATEST = ((Integer)registro.getField("NESTRATEST")).intValue();
       this.cNOMEPSEST = (String)registro.getField("CNOMEPSEST");
       this.cGRUPRHEST = (String)registro.getField("CGRUPRHEST");
       this.cCONCEPEST = (String)registro.getField("CCONCEPEST");
       this.cCODIGORUT = (String)registro.getField("CCODIGORUT");
       this.cCODIGOBUS = (String)registro.getField("CCODIGOBUS");
       this.cBOLETIEST = (String)registro.getField("CBOLETIEST");
       this.cTXTTEMEST = (String)registro.getField("CTXTTEMEST");
       this.cAPELLIEST = (String)registro.getField("CAPELLIEST");
       this.cNOMBREEST = (String)registro.getField("CNOMBREEST");
       this.dFECNACEST = (Date)registro.getField("DFECNACEST");
       this.cLUGNACEST = (String)registro.getField("CLUGNACEST");
       this.cDOCNITEST = (String)registro.getField("CDOCNITEST");
       this.cLUGNITEST = (String)registro.getField("CLUGNITEST");
       this.cTIPNITEST = (String)registro.getField("CTIPNITEST");
       this.lFOTNITEST  = ((Boolean)registro.getField("LFOTNITEST ")).booleanValue();
       this.lSEXFEMEST  = ((Boolean)registro.getField("LSEXFEMEST ")).booleanValue();
       this.cDIRECCEST = (String)registro.getField("CDIRECCEST");
       this.cBARRIOEST = (String)registro.getField("CBARRIOEST");
       this.cCIUDADEST = (String)registro.getField("CCIUDADEST");
       this.cDEPARTEST = (String)registro.getField("CDEPARTEST");
       this.cTELEFNEST = (String)registro.getField("CTELEFNEST");
       this.cTELCELEST = (String)registro.getField("CTELCELEST");
       this.cMAIESTEST = (String)registro.getField("CMAIESTEST");
       this.cPARNITEST = (String)registro.getField("CPARNITEST");
       this.cCODFAMEST = (String)registro.getField("CCODFAMEST");
       this.nTOTFACEST = ((Float)registro.getField("NTOTFACEST")).floatValue();
       this.nTOTPAGEST = ((Float)registro.getField("NTOTPAGEST")).floatValue();
       this.cNITCO1EST = (String)registro.getField("CNITCO1EST");
       this.cTIPCO1EST = (String)registro.getField("CTIPCO1EST");
       this.lNORCO1EST  = ((Boolean)registro.getField("LNORCO1EST ")).booleanValue();
       this.cNITCO2EST = (String)registro.getField("CNITCO2EST");
       this.cTIPCO2EST = (String)registro.getField("CTIPCO2EST");
       this.lNORCO2EST  = ((Boolean)registro.getField("LNORCO2EST ")).booleanValue();
       this.cNITCO3EST = (String)registro.getField("CNITCO3EST");
       this.cTIPCO3EST = (String)registro.getField("CTIPCO3EST");
       this.lNORCO3EST  = ((Boolean)registro.getField("LNORCO3EST ")).booleanValue();
       this.cNITCO4EST = (String)registro.getField("CNITCO4EST");
       this.cTIPCO4EST = (String)registro.getField("CTIPCO4EST");
       this.lNORCO4EST  = ((Boolean)registro.getField("LNORCO4EST ")).booleanValue();
       this.cASIENEEST = (String)registro.getField("CASIENEEST");
       this.cASIFEBEST = (String)registro.getField("CASIFEBEST");
       this.cASIMAREST = (String)registro.getField("CASIMAREST");
       this.cASIABREST = (String)registro.getField("CASIABREST");
       this.cASIMAYEST = (String)registro.getField("CASIMAYEST");
       this.cASIJUNEST = (String)registro.getField("CASIJUNEST");
       this.cASIJULEST = (String)registro.getField("CASIJULEST");
       this.cASIAGOEST = (String)registro.getField("CASIAGOEST");
       this.cASISEPEST = (String)registro.getField("CASISEPEST");
       this.cASIOCTEST = (String)registro.getField("CASIOCTEST");
       this.cASINOVEST = (String)registro.getField("CASINOVEST");
       this.cASIDICEST = (String)registro.getField("CASIDICEST");
       this.lCARNETEST  = ((Boolean)registro.getField("LCARNETEST ")).booleanValue();
       this.cRESENEEST = (String)registro.getField("CRESENEEST");
       this.cRESFEBEST = (String)registro.getField("CRESFEBEST");
       this.cRESMAREST = (String)registro.getField("CRESMAREST");
       this.cRESABREST = (String)registro.getField("CRESABREST");
       this.cRESMAYEST = (String)registro.getField("CRESMAYEST");
       this.cRESJUNEST = (String)registro.getField("CRESJUNEST");
       this.cRESJULEST = (String)registro.getField("CRESJULEST");
       this.cRESAGOEST = (String)registro.getField("CRESAGOEST");
       this.cRESSEPEST = (String)registro.getField("CRESSEPEST");
       this.cRESOCTEST = (String)registro.getField("CRESOCTEST");
       this.cRESNOVEST = (String)registro.getField("CRESNOVEST");
       this.cRESDICEST = (String)registro.getField("CRESDICEST");
       this.pNOMPADEST = (String)registro.getField("PNOMPADEST");
       this.cAPEPADEST = (String)registro.getField("CAPEPADEST");
       this.cNOMPADEST = (String)registro.getField("CNOMPADEST");
       this.lPADQEPEST  = ((Boolean)registro.getField("LPADQEPEST ")).booleanValue();
       this.dNACPADEST = (Date)registro.getField("DNACPADEST");
       this.cLUGPADEST = (String)registro.getField("CLUGPADEST");
       this.cPADNITEST = (String)registro.getField("CPADNITEST");
       this.cPADLUGEST = (String)registro.getField("CPADLUGEST");
       this.cPADTNTEST = (String)registro.getField("CPADTNTEST");
       this.lPADFOTEST  = ((Boolean)registro.getField("LPADFOTEST ")).booleanValue();
       this.cPROPADEST = (String)registro.getField("CPROPADEST");
       this.cEMPPADEST = (String)registro.getField("CEMPPADEST");
       this.cCARPADEST = (String)registro.getField("CCARPADEST");
       this.cDIRPADEST = (String)registro.getField("CDIRPADEST");
       this.cBARPADEST = (String)registro.getField("CBARPADEST");
       this.cCIUPADEST = (String)registro.getField("CCIUPADEST");
       this.cDEPPADEST = (String)registro.getField("CDEPPADEST");
       this.cTELPADEST = (String)registro.getField("CTELPADEST");
       this.cCELPADEST = (String)registro.getField("CCELPADEST");
       this.cFAXPADEST = (String)registro.getField("CFAXPADEST");
       this.cBIPPADEST = (String)registro.getField("CBIPPADEST");
       this.cMAIPADEST = (String)registro.getField("CMAIPADEST");
       this.pNOMMADEST = (String)registro.getField("PNOMMADEST");
       this.cAPEMADEST = (String)registro.getField("CAPEMADEST");
       this.cNOMMADEST = (String)registro.getField("CNOMMADEST");
       this.lMADQEPEST  = ((Boolean)registro.getField("LMADQEPEST ")).booleanValue();
       this.dNACMADEST = (Date)registro.getField("DNACMADEST");
       this.cLUGMADEST = (String)registro.getField("CLUGMADEST");
       this.cMADNITEST = (String)registro.getField("CMADNITEST");
       this.cMADLUGEST = (String)registro.getField("CMADLUGEST");
       this.cMADTNTEST = (String)registro.getField("CMADTNTEST");
       this.lMADFOTEST  = ((Boolean)registro.getField("LMADFOTEST ")).booleanValue();
       this.cPROMADEST = (String)registro.getField("CPROMADEST");
       this.cEMPMADEST = (String)registro.getField("CEMPMADEST");
       this.cCARMADEST = (String)registro.getField("CCARMADEST");
       this.cDIRMADEST = (String)registro.getField("CDIRMADEST");
       this.cBARMADEST = (String)registro.getField("CBARMADEST");
       this.cCIUMADEST = (String)registro.getField("CCIUMADEST");
       this.cDEPMADEST = (String)registro.getField("CDEPMADEST");
       this.cTELMADEST = (String)registro.getField("CTELMADEST");
       this.cCELMADEST = (String)registro.getField("CCELMADEST");
       this.cFAXMADEST = (String)registro.getField("CFAXMADEST");
       this.cBIPMADEST = (String)registro.getField("CBIPMADEST");
       this.cMAIMADEST = (String)registro.getField("CMAIMADEST");
       this.pNOMACUEST = (String)registro.getField("PNOMACUEST");
       this.cAPEACUEST = (String)registro.getField("CAPEACUEST");
       this.cNOMACUEST = (String)registro.getField("CNOMACUEST");
       this.lACUQEPEST  = ((Boolean)registro.getField("LACUQEPEST ")).booleanValue();
       this.dNACACUEST = (Date)registro.getField("DNACACUEST");
       this.cLUGACUEST = (String)registro.getField("CLUGACUEST");
       this.cACUNITEST = (String)registro.getField("CACUNITEST");
       this.cACULUGEST = (String)registro.getField("CACULUGEST");
       this.cACUTNTEST = (String)registro.getField("CACUTNTEST");
       this.lACUFOTEST  = ((Boolean)registro.getField("LACUFOTEST ")).booleanValue();
       this.cPROACUEST = (String)registro.getField("CPROACUEST");
       this.cEMPACUEST = (String)registro.getField("CEMPACUEST");
       this.cCARACUEST = (String)registro.getField("CCARACUEST");
       this.cDIRACUEST = (String)registro.getField("CDIRACUEST");
       this.cBARACUEST = (String)registro.getField("CBARACUEST");
       this.cCIUACUEST = (String)registro.getField("CCIUACUEST");
       this.cDEPACUEST = (String)registro.getField("CDEPACUEST");
       this.cTE1ACUEST = (String)registro.getField("CTE1ACUEST");
       this.cTE2ACUEST = (String)registro.getField("CTE2ACUEST");
       this.cCELACUEST = (String)registro.getField("CCELACUEST");
       this.cFAXACUEST = (String)registro.getField("CFAXACUEST");
       this.cBIPACUEST = (String)registro.getField("CBIPACUEST");
       this.cMAIACUEST = (String)registro.getField("CMAIACUEST");
       this.cPARACUEST = (String)registro.getField("CPARACUEST");
       this.cPAZSDOEST = (String)registro.getField("CPAZSDOEST");
       this.cOBSLIBEST = (String)registro.getField("COBSLIBEST");
       this.cOBSRETEST = (String)registro.getField("COBSRETEST");
       this.cCOLE13EST = (String)registro.getField("CCOLE13EST");
       this.cCOLE00EST = (String)registro.getField("CCOLE00EST");
       this.cCOLE01EST = (String)registro.getField("CCOLE01EST");
       this.cCOLE02EST = (String)registro.getField("CCOLE02EST");
       this.cCOLE03EST = (String)registro.getField("CCOLE03EST");
       this.cCOLE04EST = (String)registro.getField("CCOLE04EST");
       this.cCOLE05EST = (String)registro.getField("CCOLE05EST");
       this.cCOLE06EST = (String)registro.getField("CCOLE06EST");
       this.cCOLE07EST = (String)registro.getField("CCOLE07EST");
       this.cCOLE08EST = (String)registro.getField("CCOLE08EST");
       this.cCOLE09EST = (String)registro.getField("CCOLE09EST");
       this.cCOLE10EST = (String)registro.getField("CCOLE10EST");
       this.cCOLE11EST = (String)registro.getField("CCOLE11EST");
       this.cCOLE12EST = (String)registro.getField("CCOLE12EST");
       this.cVOTESCEST = (String)registro.getField("CVOTESCEST");
       this.cCODIGOMAT = (String)registro.getField("CCODIGOMAT");
       this.cANOESTMAE = (String)registro.getField("CANOESTMAE");
   }

   public void viewRegistro(String xCodigo,String cCodigo) {

       seek(xCodigo,cCodigo);

       System.out.println("-----------------------Detalle-de Registro-----------------------");
       System.out.println("CCODIGOEST:"+getCCODIGOEST());
       System.out.println("CCODESTEST:"+getCCODESTEST());
       System.out.println("CPASWOREST:"+getCPASWOREST());
       System.out.println("CUSRWWWEST:"+getCUSRWWWEST());
       System.out.println("CPASWWWEST:"+getCPASWWWEST());
       System.out.println("CANOUSREST:"+getCANOUSREST());
       System.out.println("CGRUANTGRU:"+getCGRUANTGRU());
       System.out.println("CCODIGOGRU:"+getCCODIGOGRU());
       System.out.println("CNSALONGRU:"+getCNSALONGRU());
       System.out.println("DFECRETEST:"+getDFECRETEST());
       System.out.println("NPERRETEST:"+getNPERRETEST());
       System.out.println("NULTRECEST:"+getNULTRECEST());
       System.out.println("NAPROBONOT:"+getNAPROBONOT());
       System.out.println("NAPRANTNOT:"+getNAPRANTNOT());
       System.out.println("DFECMATEST:"+getDFECMATEST());
       System.out.println("CHORMATEST:"+getCHORMATEST());
       System.out.println("CFOLFINEST:"+getCFOLFINEST());
       System.out.println("CANOINGEST:"+getCANOINGEST());
       System.out.println("NNROLISEST:"+getNNROLISEST());
       System.out.println("NMOROSOEST:"+getNMOROSOEST());
       System.out.println("NNOMFACEST:"+getNNOMFACEST());
       System.out.println("NESTRATEST:"+getNESTRATEST());
       System.out.println("CNOMEPSEST:"+getCNOMEPSEST());
       System.out.println("CGRUPRHEST:"+getCGRUPRHEST());
       System.out.println("CCONCEPEST:"+getCCONCEPEST());
       System.out.println("CCODIGORUT:"+getCCODIGORUT());
       System.out.println("CCODIGOBUS:"+getCCODIGOBUS());
       System.out.println("CBOLETIEST:"+getCBOLETIEST());
       System.out.println("CTXTTEMEST:"+getCTXTTEMEST());
       System.out.println("CAPELLIEST:"+getCAPELLIEST());
       System.out.println("CNOMBREEST:"+getCNOMBREEST());
       System.out.println("DFECNACEST:"+getDFECNACEST());
       System.out.println("CLUGNACEST:"+getCLUGNACEST());
       System.out.println("CDOCNITEST:"+getCDOCNITEST());
       System.out.println("CLUGNITEST:"+getCLUGNITEST());
       System.out.println("CTIPNITEST:"+getCTIPNITEST());
       System.out.println("CDIRECCEST:"+getCDIRECCEST());
       System.out.println("CBARRIOEST:"+getCBARRIOEST());
       System.out.println("CCIUDADEST:"+getCCIUDADEST());
       System.out.println("CDEPARTEST:"+getCDEPARTEST());
       System.out.println("CTELEFNEST:"+getCTELEFNEST());
       System.out.println("CTELCELEST:"+getCTELCELEST());
       System.out.println("CMAIESTEST:"+getCMAIESTEST());
       System.out.println("CPARNITEST:"+getCPARNITEST());
       System.out.println("CCODFAMEST:"+getCCODFAMEST());
       System.out.println("NTOTFACEST:"+getNTOTFACEST());
       System.out.println("NTOTPAGEST:"+getNTOTPAGEST());
       System.out.println("CNITCO1EST:"+getCNITCO1EST());
       System.out.println("CTIPCO1EST:"+getCTIPCO1EST());
       System.out.println("CNITCO2EST:"+getCNITCO2EST());
       System.out.println("CTIPCO2EST:"+getCTIPCO2EST());
       System.out.println("CNITCO3EST:"+getCNITCO3EST());
       System.out.println("CTIPCO3EST:"+getCTIPCO3EST());
       System.out.println("CNITCO4EST:"+getCNITCO4EST());
       System.out.println("CTIPCO4EST:"+getCTIPCO4EST());
       System.out.println("CASIENEEST:"+getCASIENEEST());
       System.out.println("CASIFEBEST:"+getCASIFEBEST());
       System.out.println("CASIMAREST:"+getCASIMAREST());
       System.out.println("CASIABREST:"+getCASIABREST());
       System.out.println("CASIMAYEST:"+getCASIMAYEST());
       System.out.println("CASIJUNEST:"+getCASIJUNEST());
       System.out.println("CASIJULEST:"+getCASIJULEST());
       System.out.println("CASIAGOEST:"+getCASIAGOEST());
       System.out.println("CASISEPEST:"+getCASISEPEST());
       System.out.println("CASIOCTEST:"+getCASIOCTEST());
       System.out.println("CASINOVEST:"+getCASINOVEST());
       System.out.println("CASIDICEST:"+getCASIDICEST());
       System.out.println("CRESENEEST:"+getCRESENEEST());
       System.out.println("CRESFEBEST:"+getCRESFEBEST());
       System.out.println("CRESMAREST:"+getCRESMAREST());
       System.out.println("CRESABREST:"+getCRESABREST());
       System.out.println("CRESMAYEST:"+getCRESMAYEST());
       System.out.println("CRESJUNEST:"+getCRESJUNEST());
       System.out.println("CRESJULEST:"+getCRESJULEST());
       System.out.println("CRESAGOEST:"+getCRESAGOEST());
       System.out.println("CRESSEPEST:"+getCRESSEPEST());
       System.out.println("CRESOCTEST:"+getCRESOCTEST());
       System.out.println("CRESNOVEST:"+getCRESNOVEST());
       System.out.println("CRESDICEST:"+getCRESDICEST());
       System.out.println("PNOMPADEST:"+getPNOMPADEST());
       System.out.println("CAPEPADEST:"+getCAPEPADEST());
       System.out.println("CNOMPADEST:"+getCNOMPADEST());
       System.out.println("DNACPADEST:"+getDNACPADEST());
       System.out.println("CLUGPADEST:"+getCLUGPADEST());
       System.out.println("CPADNITEST:"+getCPADNITEST());
       System.out.println("CPADLUGEST:"+getCPADLUGEST());
       System.out.println("CPADTNTEST:"+getCPADTNTEST());
       System.out.println("CPROPADEST:"+getCPROPADEST());
       System.out.println("CEMPPADEST:"+getCEMPPADEST());
       System.out.println("CCARPADEST:"+getCCARPADEST());
       System.out.println("CDIRPADEST:"+getCDIRPADEST());
       System.out.println("CBARPADEST:"+getCBARPADEST());
       System.out.println("CCIUPADEST:"+getCCIUPADEST());
       System.out.println("CDEPPADEST:"+getCDEPPADEST());
       System.out.println("CTELPADEST:"+getCTELPADEST());
       System.out.println("CCELPADEST:"+getCCELPADEST());
       System.out.println("CFAXPADEST:"+getCFAXPADEST());
       System.out.println("CBIPPADEST:"+getCBIPPADEST());
       System.out.println("CMAIPADEST:"+getCMAIPADEST());
       System.out.println("PNOMMADEST:"+getPNOMMADEST());
       System.out.println("CAPEMADEST:"+getCAPEMADEST());
       System.out.println("CNOMMADEST:"+getCNOMMADEST());
       System.out.println("DNACMADEST:"+getDNACMADEST());
       System.out.println("CLUGMADEST:"+getCLUGMADEST());
       System.out.println("CMADNITEST:"+getCMADNITEST());
       System.out.println("CMADLUGEST:"+getCMADLUGEST());
       System.out.println("CMADTNTEST:"+getCMADTNTEST());
       System.out.println("CPROMADEST:"+getCPROMADEST());
       System.out.println("CEMPMADEST:"+getCEMPMADEST());
       System.out.println("CCARMADEST:"+getCCARMADEST());
       System.out.println("CDIRMADEST:"+getCDIRMADEST());
       System.out.println("CBARMADEST:"+getCBARMADEST());
       System.out.println("CCIUMADEST:"+getCCIUMADEST());
       System.out.println("CDEPMADEST:"+getCDEPMADEST());
       System.out.println("CTELMADEST:"+getCTELMADEST());
       System.out.println("CCELMADEST:"+getCCELMADEST());
       System.out.println("CFAXMADEST:"+getCFAXMADEST());
       System.out.println("CBIPMADEST:"+getCBIPMADEST());
       System.out.println("CMAIMADEST:"+getCMAIMADEST());
       System.out.println("PNOMACUEST:"+getPNOMACUEST());
       System.out.println("CAPEACUEST:"+getCAPEACUEST());
       System.out.println("CNOMACUEST:"+getCNOMACUEST());
       System.out.println("DNACACUEST:"+getDNACACUEST());
       System.out.println("CLUGACUEST:"+getCLUGACUEST());
       System.out.println("CACUNITEST:"+getCACUNITEST());
       System.out.println("CACULUGEST:"+getCACULUGEST());
       System.out.println("CACUTNTEST:"+getCACUTNTEST());
       System.out.println("CPROACUEST:"+getCPROACUEST());
       System.out.println("CEMPACUEST:"+getCEMPACUEST());
       System.out.println("CCARACUEST:"+getCCARACUEST());
       System.out.println("CDIRACUEST:"+getCDIRACUEST());
       System.out.println("CBARACUEST:"+getCBARACUEST());
       System.out.println("CCIUACUEST:"+getCCIUACUEST());
       System.out.println("CDEPACUEST:"+getCDEPACUEST());
       System.out.println("CTE1ACUEST:"+getCTE1ACUEST());
       System.out.println("CTE2ACUEST:"+getCTE2ACUEST());
       System.out.println("CCELACUEST:"+getCCELACUEST());
       System.out.println("CFAXACUEST:"+getCFAXACUEST());
       System.out.println("CBIPACUEST:"+getCBIPACUEST());
       System.out.println("CMAIACUEST:"+getCMAIACUEST());
       System.out.println("CPARACUEST:"+getCPARACUEST());
       System.out.println("CPAZSDOEST:"+getCPAZSDOEST());
       System.out.println("COBSLIBEST:"+getCOBSLIBEST());
       System.out.println("COBSRETEST:"+getCOBSRETEST());
       System.out.println("CCOLE13EST:"+getCCOLE13EST());
       System.out.println("CCOLE00EST:"+getCCOLE00EST());
       System.out.println("CCOLE01EST:"+getCCOLE01EST());
       System.out.println("CCOLE02EST:"+getCCOLE02EST());
       System.out.println("CCOLE03EST:"+getCCOLE03EST());
       System.out.println("CCOLE04EST:"+getCCOLE04EST());
       System.out.println("CCOLE05EST:"+getCCOLE05EST());
       System.out.println("CCOLE06EST:"+getCCOLE06EST());
       System.out.println("CCOLE07EST:"+getCCOLE07EST());
       System.out.println("CCOLE08EST:"+getCCOLE08EST());
       System.out.println("CCOLE09EST:"+getCCOLE09EST());
       System.out.println("CCOLE10EST:"+getCCOLE10EST());
       System.out.println("CCOLE11EST:"+getCCOLE11EST());
       System.out.println("CCOLE12EST:"+getCCOLE12EST());
       System.out.println("CVOTESCEST:"+getCVOTESCEST());
       System.out.println("CCODIGOMAT:"+getCCODIGOMAT());
       System.out.println("CANOESTMAE:"+getCANOESTMAE());

       System.out.println();
   }

   public void viewRegistros(String xCodigo) {

       ArrayList<String> codigos = null;
       codigos = getIds(xCodigo);

       for (String codigo : codigos) {
            viewRegistro(xCodigo,codigo);
       } // for
   } // viewRegistros

} // class