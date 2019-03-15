import java.util.*;
import java.io.*;

public class DataEditor {

    private String experimentor;
    private String journalNumber;

    private String GeneSifterName;


    private String HatchlingBatchID;
    private ArrayList InjectionModification;
    private int InjectionModificationSelect;

    private ArrayList RearingModification;
    private int RearingModificationSelect;
    private ArrayList RearingErrors;
    private int RearingErrorSelection;

    private String ExtractionID;
    private String ExtractionMethod;
    private int extractionPg#;
    private ArrayList ExtractionModification;
    private int ExtractionModificationSelect;


    private int timeFrozen;

    private PCRData PCRentry;
    private ArrayList PCRModification;
    private int PCRModificationSelect;
    private int PCRpg#;

    private int rowNum;
    private int wellNum;
    private ArrayList PCRErrors;
    private int PCRErrorSelect;

    private String errors;

    private static Scanner x;
    public static void main (String arg[]){

        Scanner sc = new Scanner(System.in);
        File DataSet = new File(CRISPRSTATdata.txt);
        String oldContent="";
        String response;


        //ask for your name
        //ask for journal number

        //System.out.println("What are you trying to do? /n ('e'=edit)")

        //System.out.println("New entry? ('n'/enter associated datapoint)");

        //if n
        System.out.println("What is your name? (Type the number of your name or other if not on the list");
        //if other type your first and last name



        System.out.println("Enter geneSifter filename (Following this format: SendOffdate_WellID_Gene_AEL#");
        //check if already entered
        //allow overrule
        boolean run=true;
        while (run) {
            String GeneSifterName = sc.toString();
            String[] GeneSifterNameParts = GeneSifterName.split("_");
            //MISSING check valid date
            if (GeneSifterNameParts.length!=4) run=false;
            if (GeneSifterNameParts[2].length()!=2) run=false;
            if (!GeneSifterNameParts[4].contains("AEL:")) run=false;
           //MISSING check valid time
            if (run==false) System.out.println("Please enter again with the following formate: SendOffdate_WellID_Gene_AEL:XhXm-YhYm");
        }


        System.out.println("Enter injection batch ID or n");
        response = sc.toString();
        if (response.equals("n")
        {

        }
        else if (response.equals)
        //if yes call injectionbatch(ID)
        //if no call injectionbatch()
        //if n make one
        System.out.println("New batch ID is GWUYEKDFGV /nPlease enter injection Date in the following Format: 12.29.2019")
        //check for correct format

    }
    public static void NewDataEntry(){
        System.out.println();
    }
    public static ArrayList<> pullUpBatch()
    {

    }
    public static void EditDataEntry(){

    }
    public static void NewOption(){

    }

}
