package testCases;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.slf4j.Logger;
import sapiens.contact.Contact;
import sapiens.login.Login;
import sapiens.policies.Idirect.Absa_Idirect;
import sapiens.policies.Idirect.Absa_Idirect_Multi;
import sapiens.policies.Idirect_Endorsement.Endorse;
import sapiens.searches.Searches;
import utility.WebDr;

import static org.slf4j.LoggerFactory.getLogger;

public class testFlow extends WebDr {

    private static final Logger logger = getLogger(testFlow.class);


    public testFlow(ExtentTest test, ExtentReports extent) {
        this.test = test;
        this.extent = extent;
    }

    public void executeTC(String flowName,String preferBrowser) throws Exception
    {
        try {
            switch (flowName) {
                case "flow_NewContactCreation":
                    logger.info("The current scenario is: " + flowName);
                    sapiens_NewContactCreation(preferBrowser);
                    break;
                case "absa_Idirect_Flow":
                    System.err.print("It working fine");
                    logger.info("The current scenario is: " + flowName);
                    absa_Idirect_Flow(preferBrowser);
                    break;
                case "absa_Idirect_MultiVerse":
                    System.err.print("The MultiVerse is ON ");
                    logger.info("The current scenario is: "+ flowName);
                    absa_Idirect_MultiVerse(preferBrowser);
                    System.err.print("The MultiVerse is OFF "+ flowName);
                    break;
                case "absa_Idirect_Endorsement":
                    System.err.println("The General Endorsement has Started");
                    logger.info("The current scenario is: "+ flowName);
                    absa_Idirect_Endorsement(preferBrowser);
                    System.err.println("The General Endorsement has Finished");

            }
        } catch (Exception e) {
            WriteStep(wdriver,flowName + " Status: ",flowName + " should be executed successfully",flowName + " didn't execute successfully","FAIL");
            wdriver.quit();
            logger.info(String.valueOf(e));
        }
    }

    /**
     * Flow for Creating a New Contact into Sapiens application
     * @param preferBrowser -   Chrome
     */
    public void sapiens_NewContactCreation(String preferBrowser) {
    	try{
            setup(preferBrowser);
            new Login(wdriver, test).applicationLogin();
            new Contact(wdriver, test).generalDetails();
            new Contact(wdriver, test).addresses();
            new Contact(wdriver, test).additionalData();
            new Contact(wdriver, test).paymentMeans();
            new Login(wdriver, test).applicationLogOut();
        }catch(Exception e){
            logger.info("Exception in sapiens_NewContactCreation is : " + e);
    	}
    }

    /**
     * Flow for Creating a New AbsaPlus Policy into Sapiens application
     * @param preferBrowser : Chrome
     */
    public void updateContactDetails(String preferBrowser) {
        try{
            setup(preferBrowser);
            new Login(wdriver, test).applicationLogin();
            new Contact(wdriver, test).selectRecentContact();
            new Contact(wdriver, test).updateContact();
            new Login(wdriver, test).applicationLogOut();
        }catch(Exception e){
            logger.info("Exception in sapiens_NewPolicyCreation is : " + e);
        }
    }

    /*
     * METHOD FOR COVERING MUTIPLE COVERS IN A POLICY FOR ABSA_IDIRECT
     */

    public void absa_Idirect_MultiVerse(String preferBrowser) {

        try {
            System.out.print("Multiverse Started");
            setup(preferBrowser);
            new Login(wdriver, test).applicationLogin();
            new Absa_Idirect_Multi(wdriver, test).selectRecentContact();
            new Absa_Idirect_Multi(wdriver, test).generalDetails();
            new Absa_Idirect_Multi(wdriver, test).multiCovers();
            String policyNumber = new Absa_Idirect_Multi(wdriver, test).paymentsDetails();
            new Searches(wdriver, test).searchPolicy(policyNumber);
//            new Claims(wdriver, test).claimThroughPolicy(policyNumber);
//            new Login(wdriver, test).applicationLogOut();

        } catch (Exception e) {
            logger.info("Exception in sapiens_Absa Idirect Flow is : " + e);
        }
    }
    /*
     * METHOD FOR COVERING SINGLE COVERS IN A POLICY FOR ABSA_IDIRECT
     */

    public void absa_Idirect_Flow(String preferBrowser){

        try{
            System.out.print("It working fine ");
            setup(preferBrowser);
            new Login(wdriver, test).applicationLogin();
            new Absa_Idirect(wdriver, test).selectRecentContact();
            new Absa_Idirect(wdriver, test).generalDetails();
            new Absa_Idirect(wdriver, test).linesOfBusiness();
            String policyNumber = new Absa_Idirect(wdriver, test).paymentsDetails();
            new Searches(wdriver, test).searchPolicy(policyNumber);
//            new Claims(wdriver, test).claimThroughPolicy(policyNumber);
//            new Login(wdriver, test).applicationLogOut();

        }catch (Exception e){
            logger.info("Exception in sapiens_Absa Idirect Flow is : "+e);
        }

    }
    public void absa_Idirect_Endorsement(String preferBrowser){

        try{
            System.out.print("It working fine ");
            setup(preferBrowser);
            new Login(wdriver, test).applicationLogin();
            new Endorse(wdriver,test).searchPolicy();
            new Endorse(wdriver,test).generalEndorsement();
            new Endorse(wdriver, test).linesOfBusiness();
            //new Endorse(wdriver,test).endorse();

//            new Claims(wdriver, test).claimThroughPolicy(policyNumber);
//            new Login(wdriver, test).applicationLogOut();

        }catch (Exception e){
            logger.info("Exception in sapiens_Absa Idirect Flow is : "+e);
        }

    }

    
}
