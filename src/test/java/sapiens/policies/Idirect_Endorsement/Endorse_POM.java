package sapiens.policies.Idirect_Endorsement;

import utility.WebDr;

import java.util.HashMap;
import java.util.Map;

public class Endorse_POM {
    public static void Endorse_Factory(){
        Map<String, String> Endorse_POM = new HashMap<>();

        //ABSA_IDIRECT_ENDORSEMENTS_CODES_TO_BE_USED

        //FOR SEARCHING POLICY
        Endorse_POM.put("drpdwnRecentSelect","XPATH|//select[@id='finderKeySelect']");//Policies
        Endorse_POM.put("btnHide","XPATH|//div[@id='showHiedAllFieldsButton']//i");
        Endorse_POM.put("drpdwnExpander","XPATH|//span[contains(text(),'Search by Policy/Proposal Details')]");
        Endorse_POM.put("btnHide","XPATH|//div[@id='showHiedAllFieldsButton']//i");
        Endorse_POM.put("txtPolicyNumber","XPATH|//input[contains(@id,'policyNumber')]");
        Endorse_POM.put("drpdwnProductType","XPATH|//select[@id='productVOId']");//Absa idirect
        Endorse_POM.put("btnFind","XPATH|//button[@id='homepageButtonsB_Search'][text()='Find']");
        Endorse_POM.put("linkNewProposal", "XPATH|//a[@id='MainMenuPolicy_Link']");//To verify

        //FOR ENDORSEING POLICY

        Endorse_POM.put("btnGeneralEndorsement","XPATH|//a[contains(@title,'General Endorsement')]");
        Endorse_POM.put("btnAdd","XPATH|//a[@title='Add']");
        Endorse_POM.put("chkMigrated","XPATH|//label[@id='isMigratedPolicyCheckLabel']");
        Endorse_POM.put("drpdwnStaffIndicator","XPATH|//select[@id='staffIndicator']");//Staff Member
        Endorse_POM.put("drpdwnCategory","XPATH|//select[@id='CategoryVO']");//Request by Carrier
        Endorse_POM.put("drpdwnReason","XPATH|//select[@id='EndorsementReason']");//
        Endorse_POM.put("txtDescription","XPATH|//textarea[contains(@id,'endorsmentReasonVORowVO@remarks')]");//The Reason is accepted
        Endorse_POM.put("buttonupdate","XPATH|//button[text()='Update']");
        Endorse_POM.put("btnNext","XPATH|//button[@id='Next']");
        Endorse_POM.put("verfyDialogeBox","XPATH|//div[@id='BasicNotificationDialog']");
        Endorse_POM.put("clkOk","XPATH|//button[@id='DialogOK']");

        //FOR VERIFYING THE POLICY COVER
        Endorse_POM.put("verfyLOBPage","XPATH|//div[@title='Line of Business/Locations/Risk Object']");
        Endorse_POM.put("verfyLOBProperty","XPATH|//span[text()='Property']");
        Endorse_POM.put("verfyLOBMotorcar","XPATH|//span[text()='Motorcar']");
        Endorse_POM.put("verifyLOBAllrisk","XPATH|//span[text()='All Risk']");
        Endorse_POM.put("verifyLOBBoats","XPATH|//span[text()='Boats']");
        Endorse_POM.put("verifyLOBEE","XPATH|//span[text()='Electronic Equipment']");

        //FOR VERIFYING THE PRODUCTS
        Endorse_POM.put("verifyContents","XPATH|//span[text()='Contents']");
        Endorse_POM.put("verifyBuilding","XPATH|//span[text()='Building']");
        Endorse_POM.put("verifyVehicle","XPATH|//span[text()='Vehicle Comprehensive']");
        Endorse_POM.put("verifyMotorcycle","XPATH|//span[text()='Motorcycle Comprehensive']");
        Endorse_POM.put("verifyCaravan","XPATH|//span[text()='Caravan/Trailer Comprehensive']");

        Endorse_POM.put("btnDelete","XPATH|//a[@id='flattendListflattenedPolicyItems|Delete']//i");
        Endorse_POM.put("btnUpdate","XPATH|//a[@id='flattendListflattenedPolicyItems|Update']//i");
        Endorse_POM.put("basicNotification","XPATH|//div[@id='BasicNotificationDialog']");
        Endorse_POM.put("btnOkay","XPATH|//button[@id='DialogOK']");

        WebDr.page_Objects=Endorse_POM;

    }

}
