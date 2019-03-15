import java.util.ArrayList;

public class DataType {

}

class injectionData extends DataType{
    private String HatchlingBatchID;
    private String gene;
    private String CRISPRbatch;
    private String injectionDate;
    private String AEL;
    private String injN;
    private String Injpg;
    private String HatchB;
    private String HatchC;
    private String Hatchpg;
    private ArrayList<String> InjectionModification;
}

class rearingData extends DataType{
    private ArrayList<String> populationTracker;
    private ArrayList<String> conditionsTracker;
    private ArrayList<String> RearingModification;
    private ArrayList<String> RearingErrors;
}
class extractionData extends DataType{
    private String ExtractionID;
    private String ExtractionMethod;
    private int extractionPg#;
    private ArrayList ExtractionModification;

}
class PCRData extends DataType{
    private String PCRbatchID;
    private String PCRdate;
    private String PCRmethod;
    private double FWprimerConc;
    private double RprimerConc;
    private double StatConc;
    private double annealTemp;
    private double denatureTemp;
    private int numberOfCycles;
    private ArrayList PCRModification;
    private int PCRpg#;
}