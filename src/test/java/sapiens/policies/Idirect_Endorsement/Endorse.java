package sapiens.policies.Idirect_Endorsement;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import sapiens.policies.Idirect.Absa_Idirect_POM;
import utility.WebDr;

import java.util.ArrayList;

import static org.slf4j.LoggerFactory.getLogger;

public class Endorse extends WebDr {
    private static final Logger logger = getLogger(Endorse.class);

    //Instance of the WebDriver
    public Endorse(WebDriver wdriver, ExtentTest test) {
        this.wdriver = wdriver;
        this.test = test;
    }
    String policyno ="PL-IDI6529635091";
    String category= null;
    String reason = null;




    public void searchPolicy(){
        try{
            Endorse_POM.Endorse_Factory();
            Thread.sleep(2000);
            click("btnHide","The Button is clicked");

            //selectValueFromDropdown("drpdwnRecentSelect","text","Policy","The Dropdown value is selected");
            click("drpdwnExpander","The Expander has been expanded");
            setText("txtPolicyNumber",policyno,"The Policy number should be placed");
            //selectValueFromDropdown("drpdwnProductType","text","Idirect","The Product Type Should be selected");
            click("btnFind","The Find Button is selected");
            if(exists("linkNewProposal",true,"The Value should be present")) {
                wdriver.findElement(By.xpath("//li[@id='Policies']//following::li/a[contains(text(),'"+policyno+"/00')]")).click();
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    //GENERAL ENODRSEMENT PAGE
    public void generalEndorsement(){

        try {
            Endorse_POM.Endorse_Factory();
            if (exists("btnGeneralEndorsement",true,"The General Endorsement button is present")) {
                click("btnGeneralEndorsement", "The General Endorsement Button should be clicked");
            }
            //FOR ENDORSEMENT REASONS
            click("btnAdd","The Add Button was clicked");
            //selectValueFromDropdown("drpdwnStaffIndicator","text","Staff Member","The Staff Indicator should be selected");
            Thread.sleep(2000);
            selectValueFromDropdown("drpdwnCategory","text","Request by Carrier","The Category should be select");
            selectValueFromDropdown("drpdwnReason","text","Add a clause to the policy/item","The Reason should be selected");
            Thread.sleep(2000);
            setText("txtDescription","Endorsement for testing","The Endorsement Description is given");
            click("buttonupdate","The Update Button is clicked");
            click("btnNext","The Next button is clicked");
            if (exists("verfyDialogeBox",true,"Dialogue box should be appear")){
                click("clkOk","The Ok Button is clicked");
                //click("btnNext","The Next button is clicked");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //ENDORSING PART

    public void endorse() {
        Endorse_POM.Endorse_Factory();
        // lABEL VALUE FOR THE COVERS
        String lblVehicle ="";
        String lblMotorcycle ="";
        String lblCaravan ="";
        String lblBoats ="";
        String lblAllRisk ="";
        String lblContents ="";
        String lblBuilding ="";
        String lblElectronics ="";

        // GET VALUES FROM THE EXCEL SHEET

        String sAddVehicle = getValue("AddVehicle");
        String sAddMotorcycle = getValue("AddMotorcycle");
        String sAddCaravan = getValue("AddCaravan");
        String sAddBoats = getValue("AddBoats");
        String sAddAllRisk = getValue("AddAllRisk");
        String sAddContents = getValue("AddContents");
        String sAddBuilding = getValue("AddBuilding");
        String sAddElectronics = getValue("AddElectronics");

        String delVehicle = "Yes";
        String delMotorCycle = "Yes";
        String delCaravan = "Yes";

        try{
            ArrayList<String> covers = new ArrayList<String>();

            //VEHICLE
            if (existsNoReport("verfyLOBMotorcar",true,"The Vehicle is present or not")){
                lblVehicle = getElement("verfyLOBMotorcar").getText();
                covers.add(lblVehicle.split("[ ]")[0]);
            }
            //MOTORCYCLE
            if (existsNoReport("verifyMotorcycle",true,"The Vehicle is present or not")){
                lblMotorcycle = getElement("verifyMotorcycle").getText();
                covers.add(lblMotorcycle.split("[ ]")[0]);
            }
            //CARAVAN
            if (existsNoReport("verifyCaravan",true,"The Vehicle is present or not")){
                lblCaravan = getElement("verifyCaravan").getText();
                covers.add(lblCaravan.split("[ ]")[0]);
            }
            //Property
            if (existsNoReport("verfyLOBProperty",true,"The Vehicle is present or not")){
                lblContents = getElement("verfyLOBProperty").getText();
                covers.add(lblContents.split("[ ]")[0]);
            }

            //ALLRISK
            if (existsNoReport("verifyLOBAllrisk",true,"The Vehicle is present or not")){
                lblAllRisk = getElement("verifyLOBAllrisk").getText();
                covers.add(lblAllRisk.split("[ ]")[0]);
            }
            //BOATS
            if (existsNoReport("verifyLOBBoats",true,"The Vehicle is present or not")){
                lblBoats = getElement("verifyLOBBoats").getText();
                covers.add(lblBoats.split("[ ]")[0]);
            }
            //ELECTRONICS
            if (existsNoReport("verifyLOBEE",true,"The Vehicle is present or not")){
                lblElectronics = getElement("verifyLOBEE").getText();
                covers.add(lblElectronics.split("[ ]")[0]);
            }

            System.err.println(covers);

            for (String i :covers){
                System.err.println(i);
                switch (i){
                    case"Motorcar":
                        if (exists("verifyVehicle",true,"The Vehicle is verifed")){
                            wdriver.findElement(By.xpath("//span[text()='Vehicle Comprehensive']//preceding::td//following::span[text()='ABARTH 500/695TBA']")).click();
                            if(delVehicle.equalsIgnoreCase("Yes")){
                                delete();
                            }else if (sAddVehicle.equalsIgnoreCase("Yes")){
                                //want to add the motorcar for vehicle
                            }
                        }
                        break;
                    case"Caravan/Trailer":
                        break;
                    case"Vehicle":
                        break;
                    case"Motorcycle":
                        break;
                    case"Boats":
                        break;


                }
            }



        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void delete(){
        try{
            click("btnDelete","The Delete Button is clicked");
            if (exists("basicNotification",true,"the Dialoguue Box is present")){
                click("btnOkay","The Okay Button is clicked");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
