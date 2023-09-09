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

    String insure = getValue("Insure");
    String productType = getValue("Product_Type");
    String lineOfBusiness = getValue("Line_Of_Business");
    String underwriting1 = getValue("Underwriting1");

    //PROPERTY VARIABLES
    String buildingUsedFor = getValue("Building_UsedFor");
    String typeOfBuilding = getValue("Type_Of_Building");
    String typeOfArea = getValue("Type_Of_Area");
    String PropertyOccupiedDay = getValue("occupied_during_day");
    String unOccupiedDays = getValue("Unoccupied_Days");
    String ResidentialProperty = getValue("Does_the_property_border");
    String xn_residental_property = getValue("Specify Xn residental property");
    String wallConstruction = getValue("Wall_Construction");
    String roofConstruction = getValue("Roof_Construction");
    String isThereThatched = getValue("Is there a thatched lapa");
    String thatchedfloor_area = getValue("Thatched Lapa hut floor area");
    String SizeOfLapaExceed = getValue("Does the Size of Lapa");
    String SabsaApproved = getValue("Do you have a SABS");
    String conductor = getValue("Waive_Lightning_Conductor");
    String building_completed = getValue("Is_the_building_completed");
    String burglaries_atproperty = getValue("Have_you_had_any_ burglaries_at_the_property");
    String high_security_complex = getValue("Is_the_property_in_a_high_security_complex");
    String areThereHighWalls = getValue("Are_there_1.8m_high_walls");
    String PerimeterWall = getValue("Are_there_Razor_wire_along_the_perimeter_wall");
    String isThereAnElectronicGate = getValue("Is_there_an_electronic_gate?");
    String is_24hrsSecurityOnGates = getValue("Is_there_24hr_security_or_access_control_on_gates?");
    String isThereElectricFencing = getValue("Is_there_electric_fencing?");
    String is_24HrsSecurityGuardPatrol = getValue("Is_there_a_24-hour_security_guard_patrol");
    String numberOfOutBuildings = getValue("NumberOfOutBuildings");
    String propertysurveyTcuried = getValue("Property_Survey_Tcuired");
    String gasappliances = getValue("Are_there_any_Gas_appliances_or_equipment");
    String BusinessConducted = getValue("Is_there_any_business_conducted_on_the_property");
    String BusinessFullDescription = getValue("Please_provide_a_full_description");
    String geysers = getValue("Geysers");
    String solarGeysers = getValue("Solar_Geysers");
    String AreYouOffTheEskom = getValue("Are you off the Eskom_City Power Grid");
    String DoYouHaveAGenerator = getValue("Do you have a generator");
    String IsGeneratorConnected = getValue("Is Generator Connected to power backup");
    String bondApplicable = getValue("Bond_Applicable");
    String sumInsuredMainBuilding = getValue("SumInsuredMainBuilding");
    String sumInsuredOutBuilding = getValue("SumInsuredOutBuilding");
    String flat = getValue("Flat");
    String CompulsoryExcess = getValue("Compulsoryexcess");
    String BuildingInsuranceFor = getValue("Have you had uninterrupted 36 months?");
    String NoOfClaim12Months = getValue("Number of claims or losses in the past 12 months");
    String Is13To24Months = getValue("Number of claims or losses in the past 13 to 24 months");
    String NoOfClaimPast25To36Months = getValue("Number of claims or losses in the past 25 to 36 months");
    String NotesBuilding = getValue("Notes Building");
    String registeredOwner = getValue("Registered_Owner");
    String alarmInstalled = getValue("Alarm_Installed");
    String waveAlarm = getValue("Wave_Alarm");
    String burglarBarsMainDwelling = getValue("BurglarBarsMainDwelling");
    String waiveBurglarBars = getValue("Waive_Burglar_Bars");
    String waiveSecurityGates = getValue("waive_security_gates");
    String inventoryRequired = getValue("Inventory_Required");
    String businessContext = getValue("BusinessContext");
    String BusinessContentsFlatExcess = getValue("businessContentsFlatExcess");

    //BOATS VARIABLES
    String territorialLetterProvided = getValue("Territorial_Letter_Provided");
    String territorialCountries = getValue("Territorial_Countries");
    String itemType = getValue("Item_Type");
    String boatStoredWhenNotInUse = getValue("BoatStoredWhenNotInUse");
    String vehicleUsedFor = getValue("VehicleUsedFor");
    String yearOfManufacture = getValue("YearOfManufacture");
    String make = getValue("Make");
    String description = getValue("Description");
    String hullCode = getValue("Hull_Code");
    String isWatercraftFinanced = getValue("Watercraft_Financed");
    String financeCompany = getValue("Finance_Company");
    String financeAgreementNumber = getValue("FinanceAgreementNumber");
    String boatSpeed = getValue("Boat_Speed");
    String insuranceAmount = getValue("Insurance_Amount");
    String inboardSumInsured = getValue("InboardSumInsured");
    String outboardSumInsured = getValue("OutboardSumInsured");
    String uninterruptedWatercraftInsurance = getValue("UninterruptedWatercraftInsurance");
    String claimsInPast12Months = getValue("Claims_In_Past_12_Months");
    String claimsInPast24Months = getValue("Claims_In_Past_24_Months");
    String claimsInPast36Months = getValue("Claims_In_Past_36_Months");

    //MOTORCAR VARIABLES
    String vehicleID = getValue("Vehicle_ID");
    String vehicleParkDuringDay = getValue("VehicleParkDuringDay");
    String dayTimeParkingCovered = getValue("DayTimeParkingCovered");
    String dayTimeParkingLocked = getValue("DayTimeParkingLocked");
    String vehicleParkDuringNight = getValue("VehicleParkDuringNight");
    String nightTimeParkingCovered = getValue("NightTimeParkingCovered");
    String nightTimeParkingLocked = getValue("NightTimeParkingLocked");
//    String vehicleUsedFor = getValue("VehicleUsedFor");
//    String yearOfManufacture = getValue("YearOfManufacture");
//    String make = getValue("Make");
    String modelVariant = getValue("Model_Variant");
    String insuredForRetailOrCustom = getValue("InsuredForRetailOrCustom");
    String motorFinance=getValue("MotorFinance");
//    String financeCompany = getValue("Finance_Company");
    String immobiliserMake = getValue("Immobiliser_Make");
    String regularDriver = getValue("Regular_Driver");
    String driverLicenseType = getValue("DriverLicenseType");
    String drivingCertificate = getValue("Driving_Certificate");
//    String itemType = getValue("Item_Type");
//    String insuranceAmount = getValue("Insurance_Amount");

    //ALL RISK
    String specifiedAllRiskCover = getValue("SpecifiedAllRiskCover");
//    String description = getValue("Description");
//    String insuranceAmount = getValue("Insurance_Amount");



    //ELECTRONIC VARIABLES
    String itemForBusinessPurpose = getValue("ItemForBusinessPurpose");
    String computerType = getValue("Computer_Type");
//    String make = getValue("Make");
//    String insuranceAmount = getValue("Insurance_Amount");

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

    //LINE OF BUSINESS CODE

    public void linesOfBusiness() {

        Absa_Idirect_POM.Idirect_Factory();

        try {
            if (insure.equalsIgnoreCase("Motorcycle")
                    || insure.equalsIgnoreCase("Caravan / Trailer")
                    || productType.equalsIgnoreCase("Private Insure") && insure.equalsIgnoreCase("Vehicle")
//                    || lineOfBusiness.equalsIgnoreCase("All Risk")
                    || lineOfBusiness.equalsIgnoreCase("electronicEquipment")
                    || lineOfBusiness.equalsIgnoreCase("Boats")){
                selectValueFromList("listLineOfBusiness", "Property", "Select Line of Business/Locations/Risk Object");
                click("btnUpdate", "Click Update");
                if (exists("labelClauses", true, "Clauses Screen")) {
                    click("btnNext", "Click Next");
                    if (exists("labelCustomerRiskObjectNumber", true, "Search by Customer Risk Object Number")) {
                        click("btnAddLocationsRiskObjects", "Click Add Button");
                        property();
                        click("btnEndCoversSelection", "Click End Covers Selection");
                        if (existsNoReport("labelUWContains", true, "Underwriting Screen Exists")) {
                            logger.info("Under writing alert is present");
                            if (existsNoReport("labelUWNumberOfDropdown1", true, "Underwriting Dropdown Exists") && existsNoReport("labelUWNumberOfDropdown2", true, "Underwriting Dropdown Exists")) {
                                logger.info("Under writing two dropdown is present");
                                selectValueFromDropdown("drpDwnUWValidation", "text", underwriting1, "Select UW alert");
                                selectValueFromDropdown("drpDwnUWValidation2", "text", underwriting1, "Select UW alert");
                                click("btnUWNext", "Select Next button");
                            } else if (existsNoReport("labelUWNumberOfDropdown1", true, "Underwriting Dropdown Exists")) {
                                logger.info("Under writing one dropdown is present");
                                selectValueFromDropdown("drpDwnUWValidation", "text", underwriting1, "Select UW alert");
                                click("btnUWNext", "Select Next button");

                            } else if (existsNoReport("labelUWNumberOfDropdown1", true, "Underwriting Dropdown Exists") && existsNoReport("labelUWNumberOfDropdown3", true, "Underwriting Dropdown Exists") && existsNoReport("labelUWNumberOfDropdown2", true, "Underwriting Dropdown Exists")) {
                                logger.info("Under writing three dropdown is present");
                                selectValueFromDropdown("drpDwnUWValidation", "text", underwriting1, "Select UW alert dropdown 1");
                                selectValueFromDropdown("drpDwnUWValidation2", "text", underwriting1, "Select UW alert dropdown 2");
                                selectValueFromDropdown("drpDwnUWValidation3", "text", underwriting1, "Select UW alert dropdown 3");
                                click("btnUWNext", "Select Next button");
                            }


                        }
                        if (getElements("locationsRiskObjectsCount").size() > 2) {
                            click("btnNextCustomerRiskObjectNumber", "Click Next Button");
                        }
                    }
                }
            }
            System.err.println(lineOfBusiness);
            selectValueFromList("listLineOfBusiness", lineOfBusiness, "Select Line of Business/Locations/Risk Object");
            click("btnUpdate", "Click Update");
            if (exists("labelClauses", true, "Clauses Screen Exists")) {
                click("btnNext", "Click Next");
                if (exists("labelCustomerRiskObjectNumber", true, "Search by Customer Risk Object Number Exists")) {
                    click("btnAddLocationsRiskObjects", "Click Add Button");
                    switch (lineOfBusiness) {
                        case "Property":
                            property();
                            break;
                        case "Motorcar":
                            motorcar();
                            break;
                        case "All Risk":
                            allRisk();
                            break;
                        case "Boats":
                            boats();
                            break;
                        case "Electronic Equipment":
                            electronicEquipment();
                            break;
                    }
                    if (existsNoReport("btnEndCoversSelection", true, "Underwriting Screen Exists")) {
                        click("btnEndCoversSelection", "Click End Covers Selection");

//method to approve uW
                        if (existsNoReport("labelUWContains", true, "Underwriting Screen Exists")) {
                            logger.info("Under writing alert is present");
                            if (existsNoReport("labelUWNumberOfDropdown1", true, "Underwriting Dropdown Exists") && existsNoReport("labelUWNumberOfDropdown2", true, "Underwriting Dropdown Exists")) {
                                logger.info("Under writing two dropdown is present");
                                selectValueFromDropdown("drpDwnUWValidation", "text", underwriting1, "Select UW alert");
                                selectValueFromDropdown("drpDwnUWValidation2", "text", underwriting1, "Select UW alert");
                                click("btnUWNext", "Select Next button");
                            } else if (existsNoReport("labelUWNumberOfDropdown1", true, "Underwriting Dropdown Exists")) {
                                logger.info("Under writing one dropdown is present");
                                selectValueFromDropdown("drpDwnUWValidation", "text", underwriting1, "Select UW alert");
                                click("btnUWNext", "Select Next button");
                            } else if (existsNoReport("labelUWNumberOfDropdown1", true, "Underwriting Dropdown Exists") && existsNoReport("labelUWNumberOfDropdown3", true, "Underwriting Dropdown Exists") && existsNoReport("labelUWNumberOfDropdown2", true, "Underwriting Dropdown Exists")) {
                                logger.info("Under writing three dropdown is present");
                                selectValueFromDropdown("drpDwnUWValidation", "text", underwriting1, "Select UW alert dropdown 1");
                                selectValueFromDropdown("drpDwnUWValidation2", "text", underwriting1, "Select UW alert dropdown 2");
                                selectValueFromDropdown("drpDwnUWValidation3", "text", underwriting1, "Select UW alert dropdown 3");
                                click("btnUWNext", "Select Next button");
                            }
                        }
                        if (getElements("locationsRiskObjectsCount").size() > 2) {
                            click("btnNextCustomerRiskObjectNumber", "Click Next Button");
                            click("btnEndRiskDetails", "Click End Risk Details Button");
                            if (existsNoReport("labelUWContains", true, "Underwriting Screen Exists")) {
                                logger.info("Under writing alert is present");
                                if (existsNoReport("labelUWNumberOfDropdown1", true, "Underwriting Dropdown Exists") && existsNoReport("labelUWNumberOfDropdown2", true, "Underwriting Dropdown Exists")) {
                                    logger.info("Under writing two dropdown is present");
                                    selectValueFromDropdown("drpDwnUWValidation", "text", underwriting1, "Select UW alert");
                                    selectValueFromDropdown("drpDwnUWValidation2", "text", underwriting1, "Select UW alert");
                                    click("btnUWNext", "Select Next button");
                                } else if (existsNoReport("labelUWNumberOfDropdown1", true, "Underwriting Dropdown Exists")) {
                                    logger.info("Under writing one dropdown is present");
                                    selectValueFromDropdown("drpDwnUWValidation", "text", underwriting1, "Select UW alert");
                                    click("btnUWNext", "Select Next button");

                                } else if (existsNoReport("labelUWNumberOfDropdown1", true, "Underwriting Dropdown Exists") && existsNoReport("labelUWNumberOfDropdown3", true, "Underwriting Dropdown Exists") && existsNoReport("labelUWNumberOfDropdown2", true, "Underwriting Dropdown Exists")) {
                                    logger.info("Under writing three dropdown is present");
                                    selectValueFromDropdown("drpDwnUWValidation", "text", underwriting1, "Select UW alert dropdown 1");
                                    selectValueFromDropdown("drpDwnUWValidation2", "text", underwriting1, "Select UW alert dropdown 2");
                                    selectValueFromDropdown("drpDwnUWValidation3", "text", underwriting1, "Select UW alert dropdown 3");
                                    click("btnUWNext", "Select Next button");
                                }


                            }
                            if (existsNoReport("labelPayments", true, "Payments Screen Exists")) {
                                logger.info("Policy Lines Of Business Details Captured Successfully");
                            }
                        }
                    }
                }

            }

        }


        catch (Exception e) {
            logger.info("Exception in Maintain Policy Lines Of Business is : " + e);
        }
    }

    //PROPERTY COVER
    public void property() {

        Absa_Idirect_POM.Idirect_Factory();
        try {
            //Property Address
            if (exists("labelPropertyAddress", true, "Property Address Exists")) {
                click("chkBoxRiskAddressSame", "Click Risk Address Same CheckBox");
                //Property General Details
                if (insure.equalsIgnoreCase("Building")) {
                    click("chkBoxBuilding", "Click Building CheckBox");
                } else if (insure.equalsIgnoreCase("Contents")
                        || productType.equalsIgnoreCase("Private Insure") && insure.equalsIgnoreCase("Vehicle")
                        || insure.equalsIgnoreCase("Motorcycle")
                        || insure.equalsIgnoreCase("Caravan / Trailer")
//                        || lineOfBusiness.equalsIgnoreCase("All Risk")
                        || lineOfBusiness.equalsIgnoreCase("Electronic Equipment")
                        || lineOfBusiness.equalsIgnoreCase("Boats")
                        || lineOfBusiness.equalsIgnoreCase("Personal Accident")) {
                    click("chkBoxContents", "Click Contents CheckBox");
                }
                selectValueFromDropdown("drpDwnBuildingUsedFor", "text", buildingUsedFor, "Select Building Be Used For");
                selectValueFromDropdown("drpDwnTypeOfBuilding", "text", typeOfBuilding, "Select Type Of Building");
                selectValueFromDropdown("drpDwnTypeOfArea", "text", typeOfArea, "Select Type Of Area");
                //click("chkBoxIsBuildingOccupied", "Click Is Building Occupied CheckBox");
                Thread.sleep(5000);
                setText("txtBoxOccupiedSinceDate", getCurrentDate(), "Enter Occupied Since Date");
                Thread.sleep(5000);
                if (PropertyOccupiedDay.equalsIgnoreCase("Y")) {
                    click("chkBoxIsPropOccupiedDuringDay", "Click is Prop Occupied DuringDay Label");
                    setText("txtBoxUnoccupiedDays", unOccupiedDays, "Enter Number of Consecutive Unoccupied Days");
                }

                if (ResidentialProperty.equalsIgnoreCase("Y")) {
                    click("chkBoxDoes_the_property_border_aXn_residential_property", "Click is Prop border checkbox Label");
                    selectValueFromDropdown("drpDwnSpecifyNonResidential", "text", xn_residental_property, "Selectedpecify xn residental property");
                }
                selectValueFromDropdown("drpDwnWallConstruction", "text", wallConstruction, "Select Wall Construction");
                Thread.sleep(3000);
                selectValueFromDropdown("drpDwnRoofConstruction", "text", roofConstruction, "Select Roof Construction");
                if (isThereThatched.equalsIgnoreCase("Y")) {
                    click("chkBoxIsThereThatched", "Clicked Is there a thatched lapa within 3 meters of main dwelling");
                    selectValueFromDropdown("drpDwnThatchedHutFloor", "text", thatchedfloor_area, "Selected Thatched Lapa hut floor area");
                    if (SizeOfLapaExceed.equalsIgnoreCase("Y")) {
                        click("chkBoxDoesSizeOfLapa", "Clicked Is there a thatched lapa within 3 meters of main dwelling");
                        if (SabsaApproved.equalsIgnoreCase("Y")) {
                            click("chkDoesYouHaveASabsaApprovedLightingConductor", "Clicked Is there a thatched lapa within 3 meters of main dwelling");
                        }
                    }
                }
                if (conductor.equalsIgnoreCase("Y")) {
                    click("chkWaive_Lightning_Conductor", "Clicked Waive lighting Conductor");
                }
                if (building_completed.equalsIgnoreCase("Y")) {
                    click("chkIs_the_building_completed", "Clicked Is the building completed");
                }
                if (burglaries_atproperty.equalsIgnoreCase("Y")) {
                    click("chkHave_you_had_any_burglaries_at_the_property", "Clicked have you had any burglaries at the property");
                }

                if (high_security_complex.equalsIgnoreCase("Y")) {
                    click("chkIs_the_property_in_a_high_security_complex", "Clicked Is the property in a high security complex");
                    if (areThereHighWalls.equalsIgnoreCase("Y")) {
                        click("chkAreThereHighWalls", "Clicked Are there 1.8m high walls");
                        if (PerimeterWall.equalsIgnoreCase("Y")) {
                            click("chkAreThereRazorWireAlongThePerimeterWall", "Clicked Are there Razor wire along the perimeter wall");
                            if (isThereAnElectronicGate.equalsIgnoreCase("Y")) {
                                click("chkIsThereAnElectronicGate", "Clicked Is there an electronic gate?");
                                if (is_24hrsSecurityOnGates.equalsIgnoreCase("Y")) {
                                    click("chkIsThere24hrsSecurityOrAccessControlOnGates", "Clicked Is there 24hr security or access control on gates?");
                                    if (isThereElectricFencing.equalsIgnoreCase("Y")) {
                                        click("chkIsThereElectricFencing", "Clicked Is there electric fencing? ");
                                        if (is_24HrsSecurityGuardPatrol.equalsIgnoreCase("Y")) {
                                            click("chkIsThereA24HrsSecurityGuardPatrol", "Clicked Is there 24 hrs Security Guard patrol");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                setText("txtBoxNumberOfOutBuildings", numberOfOutBuildings, "Enter How Many Out Buildings are there");
                if (propertysurveyTcuried.equalsIgnoreCase("Y")) {
                    click("chkPropertySurveyRequired", "Clicked Property Survey Required");
                    setText("txtBoxDateRiskSurveyRequested", getCurrentDate(), "Enter Date Risk Survey Requested");
                    setText("txtBoxDateRiskSurveyReceived", getCurrentDate(), "Enter Date Risk Survey Received");
                }
                if (gasappliances.equalsIgnoreCase("Y")) {

                    click("chkAreThereAnyGasAppliancesOrEquipment", "Click Are There Any Gas Appliances Or Equipment");
                }
//                if (GasPipeConnections.equalsIgnoreCase("Y")) {
//
//                    click("chkAreThereAnyGasPipeConnections", "Click Are There Any Gas Pipe Connections");
//                }
                if (BusinessConducted.equalsIgnoreCase("Y")) {
                    click("chkIsThereAnyBusinessConductedOnTheProperty", "Click is There Any Business Conducted On The Property");
                    setText("chkTypeOfBusinessDescription", BusinessFullDescription, "Enter Number of Consecutive Unoccupied Days");
                }
//                setText("txtBoxPlotQuestionnarieRequested", getCurrentDate(), "Enter Survey Requested");
//                setText("txtBoxplotQuestionnarieRecevied", getCurrentDate(), "Enter Survey Received");

                if (insure.equalsIgnoreCase("Building")) {
                    //Building Details
                    setText("txtBoxNoOfGeysers", geysers, "Enter Number of Geysers");
                    setText("txtBoxNoOfSolarGeysers", solarGeysers, "Enter Number of Solar Geysers");
                    if (AreYouOffTheEskom.equalsIgnoreCase("Y")) {

                        click("chkAreYouOffTheEskom/CityPowerGrid", "Click Are you off the Eskom/City Power Grid");
                    }
                    if (DoYouHaveAGenerator.equalsIgnoreCase("Y")) {

                        click("chkDoYouHaveAGenerator", "Click Do you have a generator");
                        if (IsGeneratorConnected.equalsIgnoreCase("Y")) {

                            click("chkIsGeneratorConnectedToPowerBackup", "Click Is Generator Connected to power backup");

                        }
                        setText("txtBoxDateCertificateRequested", getCurrentDate(), "Enter Date certificate Requested");
                        setText("txtBoxDateCertificateReceived", getCurrentDate(), "Enter Date certificate Received");


                    }

                    // selectValueFromDropdown("drpDwnCoverType", "text", CoverType, "Select Cover type");
                    selectValueFromDropdown("drpDwnBondApplicable", "text", bondApplicable, "Select Bond Applicable");
                    setText("txtBoxSumInsuredMainBuilding", sumInsuredMainBuilding, "Enter Sum Insured of Main Building");
                    setText("txtBoxSumInsuredOutBuilding", sumInsuredOutBuilding, "Enter Sum Insured Out Buildings");
                    Thread.sleep(4000);
                    selectValueFromDropdown("drpDwnFlatBuilding", "text", flat, "Select Flat");
                    setText("txtBoxCompulsoryExcess", CompulsoryExcess, "Enter Compulsory excess");
                    if (BuildingInsuranceFor.equalsIgnoreCase("Y")) {
                        click("txtBoxHaveYouHadUnInterruptedBuildingInsuranceFor", "Click Is Generator Connected to power backup");
                    }
                    setText("txtBoxNoOfClaimPast12Months", NoOfClaim12Months, "Enter Number of claims or losses in the past 12 months");
                    setText("txtBoxNoOfClaimPast13To24Months", Is13To24Months, "Enter Number of claims or losses in the past 13 to 24 months");
                    setText("txtBoxNoOfClaimPast25To36Months", NoOfClaimPast25To36Months, "Enter Number of claims or losses in the past 25 to 36 months");
                    // setText("txtBoxnoOfClaimPast37To48Months", NoOfClaimPast37To48Months, "Enter Number of claims or losses in the past 37 to 48 months");
                    //  setText("txtBoxnoOfClaimPast49To60Months", NoOfClaimPast49To60Months, "Enter Number of claims or losses in the past 49 to 60 months");
                    setText("txtBoxNotesBuilding", NotesBuilding, "Enter Notes Building");
                    selectValueFromDropdown("drpDwnRegisteredOwnerBuilding", "text", registeredOwner, "Select Registered Owner");
                } else if (insure.equalsIgnoreCase("Contents")
                        || productType.equalsIgnoreCase("Private Insure") && insure.equalsIgnoreCase("Vehicle")
                        || insure.equalsIgnoreCase("Motorcycle")
                        || insure.equalsIgnoreCase("Caravan / Trailer")
//                        || lineOfBusiness.equalsIgnoreCase("All Risk")
//                        || lineOfBusiness.equalsIgnoreCase("Electronic Equipment")
                        || lineOfBusiness.equalsIgnoreCase("Boats")
                        || lineOfBusiness.equalsIgnoreCase("Personal Accident")) {
//                    if (productType.equalsIgnoreCase("Private Insure")) {
//                        click("chkBoxIsPropertyInHighSecurity", "Click Is Property In High Security CheckBox");
//                        click("chkBoxAreThereHighWalls", "Click Are There High Walls CheckBox");
//                        click("chkBoxRazorWirePerimeterWall", "Click Razor Wire Perimeter Wall CheckBox");
//                        click("chkBoxOpenFieldsAroundProperty", "Click Open Fields Around Property CheckBox");
//                        click("chkBoxElectronicFencing", "Click Electronic Fencing CheckBox");
//                        click("chkBoxElectronicGate", "Click Electronic Gate CheckBox");
//                        click("chkBoxSecurityOnGate", "Click Security On Gate CheckBox");
//                        click("chkBoxSecurityGuardPatrol", "Click Security Guard Patrol CheckBox");
//                    }
                    //House Content Details
                    selectValueFromDropdown("drpDwnAlarmInstalled", "text", alarmInstalled, "Select Alarm Installed");
                    if (waveAlarm.equalsIgnoreCase("Y")) {
                        click("chkBoxWaiveAlarm", "Click Waive Alarm");
                    }

                    click("chkBoxAlarmProfessionallyInstalled", "Click Alarm Professionally Installed CheckBox");
                    click("chkBoxAlarmInfraRedDetectors", "Click Alarm InfraRed Detectors CheckBox");
                    click("chkBoxAlarmWorkingOrder", "Click Alarm Working Order CheckBox");
                    selectValueFromDropdown("drpDwnBurglarBarsMainDwelling", "text", burglarBarsMainDwelling, "Select Burglar Bars Main Dwelling");
                    if (waiveBurglarBars.equalsIgnoreCase("Y")) {
                        click("chkBoxWaiveBurglarBars", "Click Waive Burglar Bars");
                    }
                    Thread.sleep(1000);
                    /*
                    selectValueFromDropdown("drpDwnExternalDoorMainDwelling", "text", externalDoorMainDwelling, "Select Burglar Bars Outbuilding1");
                    if (exists("drpDwnBurglarBarsOutbuilding",true,"The value should be present")) {
                        selectValueFromDropdown("drpDwnBurglarBarsOutbuilding", "text", burglarBarsOutbuilding, "Select Burglar Bars Outbuilding2");
                    }
                    if (exists("drpDwnExternalDoorOutbuilding",true,"The value should be present")) {
                        selectValueFromDropdown("drpDwnExternalDoorOutbuilding", "text", externalDoorOutbuilding, "Select External Door Outbuilding");
                    }
                     */

                    if (waiveSecurityGates.equalsIgnoreCase("Y")) {
                        click("chkBoxWaiveSecurityGates", "Click Waive Security Gates");
                    }
                    if (inventoryRequired.equalsIgnoreCase("Y")) {
                        click("chkBoxInventoryRequired", "Click Inventory Required");
                        setText("txtBoxInventoryRequestedDate", getCurrentDate(), "Enter Inventory Requested Date");
                        setText("txtBoxInventoryReceivedDate", getCurrentDate(), "Enter Inventory Received Date");

                    }
                    if (businessContext.equalsIgnoreCase("Y")) {
                        click("chkBoxBusinessContents", "Click Business Contents");
                        setText("txtBoxBusinessContentsFlatExcess", BusinessContentsFlatExcess, "Enter Main Dwelling Sum Insured");

                    }
                    click("chBoxAdditionalTheft","The Theft is clicked additionally");
                    setText("txtBoxCompulsoryExcessContents", CompulsoryExcess, "Enter Main Dwelling Sum Insured");


                    //                    if (!productType.equalsIgnoreCase("Private Insure")){
//                        setText("txtBoxInventoryRequestedDate", getCurrentDate(), "Enter Inventory Requested Date");
//                        setText("txtBoxInventoryReceivedDate", getCurrentDate(), "Enter Inventory Received Date");
//                    }
                    setText("txtBoxMainDwellingSumInsured", sumInsuredMainBuilding, "Enter Main Dwelling Sum Insured");
                    setText("txtBoxOutbuildingSumInsured", sumInsuredOutBuilding, "Enter Outbuilding Sum Insured");
                    selectValueFromDropdown("drpDwnFlatContents", "text", flat, "Select Flat");
                    if (BuildingInsuranceFor.equalsIgnoreCase("Y")) {
                        click("txtBoxContentHaveYouHadUnInterruptedBuildingInsuranceFor", "Click Content Have You Had UnInterrupted Building Insurance For");
                    }
                    setText("txtBoxContentNoOfClaimPast12Months", NoOfClaim12Months, "Enter Number of claims or losses in the past 12 months");
                    setText("txtBoxContentNoOfClaimPast13", Is13To24Months, "Enter Number of claims or losses in the past 13 to 24 months");
                    setText("txtBoxContentNoOfClaimPast25", NoOfClaimPast25To36Months, "Enter Number of claims or losses in the past 25 to 36 months");
                    setText("txtBoxContentNotesBuilding", NotesBuilding, "Enter Notes Building");
                    selectValueFromDropdown("drpDwnRegisteredOwnerContents", "text", registeredOwner, "Select Registered Owner");
                }
                click("btnNext", "Click Next Button");


                if (existsNoReport("labelUWContains", true, "Blocking Screen Exists")) {
                    logger.info("Under writing blocking alert is present");
                    if (exists("imgHome1", true, "Home Image Exists")) {
                        click("btnUserMenu", "Click on User Menu Dropdown");
                        click("elmntLogOff", "Click LogOff Element");
                        if (exists("dialogLogOff", true, "Confirm Logoff Dialog Box")) {
                            click("btnOKUw", "Click OK Button");
                            Thread.sleep(5000);
                            if (exists("linkChangePassword", true, "Login Page")) {
                                logger.info("User LogOut Successful");
                                wdriver.quit();
                            }
                        }
                    }

                }


//                if (exists("labelPropertyAdditionalDetails", true, "Property Additional Details")) {
//                    click("btnNext", "Click Next Button");
//                if (exists("labelPropertyTechnicalReport", true, "Property Technical Report")) {
//                    //Building
//                    setText("txtBoxYearBuilt", yearBuilt, "Enter Year Built");
//                    //First Aid Resources
//                    selectValueFromDropdown("drpDwnYearlyMaintenance", "text", yearlyMaintenance, "Select Yearly Maintenance");
//                    //Standards Match
//                    selectValueFromDropdown("drpDwnElectricalStandards", "text", electricalStandards, "Select Electrical Standards");
//                    selectValueFromDropdown("drpDwnHeatingStandards", "text", heatingStandards, "Select Heating Standards");
//                    selectValueFromDropdown("drpDwnInflammableStandards", "text", inflammableStandards, "Select Inflammable Standards");
//                    selectValueFromDropdown("drpDwnWoodPlasticStandards", "text", woodPlasticStandards, "Select Wood Plastic Standards");
//                    selectValueFromDropdown("drpDwnStorageStandards", "text", storageStandards, "Select Storage Standards");
//                    click("btnNext", "Click Next Button");
//                    if (exists("labelFireAllRiskSpecificData", true, "Fire All Risk Specific Data Exists")) {
//                        click("btnNext", "Click Next Button");
                if (existsNoReport("labelCoverSelection", true, "Cover Selection Exists")) {
                    logger.info("Property " + insure + " Details Captured Successfully");
                }
//                    }
//                }
//                }
            }
        } catch (Exception e) {
            logger.info("Exception in Property Details is : " + e);
        }
    }


//MOTORCAR COVER
    public void motorcar() {
        Absa_Idirect_POM.Idirect_Factory();

        try {
            if (exists("labelMotorRiskObjectDetails", true, "Insured General Details Exists")) {
                //Identifiers
                Thread.sleep(1000);
                click("labelEngine","Click Vehicle ID No/Chassis No");
                setText("txtBoxVehicleID", vehicleID, "Enter Vehicle ID No/Chassis No");
                click("btnIdentifierUpdate", "Click Update Button");
                //Risk Address
                click("chkBoxIsRiskAddSameAsPhysical", "Click Is Risk Address Same As Physical Address? CheckBox");
                click("chkBoxIsWorkAddSameAsRisk", "Click Is Work Address Same As Risk Address? CheckBox");
                selectValueFromDropdown("drpDwnWhatToInsure", "text", insure, "Select What Do You Want To Insure Dropdown");
                if (insure.equalsIgnoreCase("Vehicle") || insure.equalsIgnoreCase("Motorcycle")) {
                    //Vehicle General Details
                    selectValueFromDropdown("drpDwnVehicleParkDuringDay", "text", vehicleParkDuringDay, "Select Vehicle Park During Day ? Dropdown");
                    selectValueFromDropdown("drpDwnDayTimeParkingCovered", "text", dayTimeParkingCovered, "Select Day Time Parking Covered ? Dropdown");
                    selectValueFromDropdown("drpDwnDayTimeParkingLocked", "text", dayTimeParkingLocked, "Select Day Time Parking Locked ? Dropdown");
                    selectValueFromDropdown("drpDwnVehicleParkDuringNight", "text", vehicleParkDuringNight, "Select Vehicle Park During Night ? Dropdown");
                    selectValueFromDropdown("drpDwnNightTimeParkingCovered", "text", nightTimeParkingCovered, "Select Night Time Parking Covered ? Dropdown");
                    selectValueFromDropdown("drpDwnNightTimeParkingLocked", "text", nightTimeParkingLocked, "Select Night Time Parking Locked ? Dropdown");
                    selectValueFromDropdown("drpDwnVehicleUsedFor", "text", vehicleUsedFor, "Select Vehicle Be Used For ? Dropdown");
                    selectValueFromDropdown("drpDwnYearOfManufacture", "text", yearOfManufacture, "Select Year Of Manufacture Dropdown");
                    selectValueFromDropdown("drpDwnMake", "text", make, "Select Make Dropdown");
                    selectValueFromDropdown("drpDwnModelVariant", "text", modelVariant, "Select Model Variant Dropdown");
                    //  selectValueFromDropdown("drpDwnYearOfManufacture", "text", yearOfManufacture, "Select Year Of Manufacture Dropdown");
                    selectValueFromDropdown("drpDwnInsuredForRetailOrCustom", "text", insuredForRetailOrCustom, "Select Insured For Retail Or Custom ? Dropdown");

                    //Finance
                    if (motorFinance.equalsIgnoreCase("Y")){
                        click("chBoxFinance","The Check Box should be clicked");
                        selectValueFromDropdown("drpDwnFinance","text",financeCompany,"The Finance Company name should be clicked");
                    }
                    click("chkBoxImmobiliser", "Click Immobiliser CheckBox");
                    selectValueFromDropdown("drpDwnImmobiliserMake", "text", immobiliserMake, "Select Immobiliser Make Dropdown");
//                    setText("txtBoxInsuranceValue", insuranceAmount, "Enter Insurance Value");

                    //Registered Owner Details
                    selectValueFromDropdown("drpDwnRegisteredOwner", "text", registeredOwner, "Select Registered Owner");
                    //Driver Details
                    selectValueFromDropdown("drpDwnRegularDriver", "text", regularDriver, "Select Regular Driver");
                    selectValueFromDropdown("drpDwnDriverLicenseType", "text", driverLicenseType, "Select Regular Driver License Type Dropdown");
                    if (insure.equalsIgnoreCase("Motorcycle")) {
                        selectValueFromDropdown("drpDwnDrivingCertificate", "text", drivingCertificate, "Select Defensive Driving Certificate Dropdown");
                    }
                    click("chkBoxIsVehicleRegInSouthAfrica", "Click Is Vehicle Registered In South Africa ? CheckBox");
                } else if (insure.equalsIgnoreCase("Caravan / Trailer")) {
                    //Caravan/Trailer General Details
                    selectValueFromDropdown("drpDwnItemType", "text", itemType, "Select Item Type Dropdown");
                    selectValueFromDropdown("drpDwnVehicleParkDuringNight", "text", vehicleParkDuringNight, "Select Vehicle Park During Night ? Dropdown");
                    selectValueFromDropdown("drpDwnVehicleUsedFor", "text", vehicleUsedFor, "Select Vehicle Be Used For ? Dropdown");
                    click("chkBoxIsCarvanParkUnderNet", "Click Is Carvan Parked Under Hail");
                    setText("txtBoxMakeModelCaravan", make, "Enter Make/Model");
                    setText("txtBoxCaravanInsuredValue", insuranceAmount, "Enter Caravan Insured Value");
                    selectValueFromDropdown("drpDwnYearOfManufactureCaravan", "text", yearOfManufacture, "Select Caravan Year Of Manufacture Dropdown");
//                    click("chkBoxRequireCreditShortFall", "Click Require Credit ShortFall ?");
                }
                click("btnNext", "Click Next Button");
                if (exists("labelCoverSelection", true, "Cover Selection Exists")) {
                    logger.info("Motorcar - " + insure + " Details Captured Successfully");
                }
            }
        } catch (Exception e) {
            logger.info("Exception in Motorcar Details is : " + e);
        }
    }


    //ALL RISK COVER
    public void allRisk() {

        Absa_Idirect_POM.Idirect_Factory();

        try {
            if (exists("labelAllRiskDetails", true, "All Risk Details")) {
                selectValueFromDropdown("drpDwnAddressList", "index", "1", "Select Address");

                //  selectValueFromDropdown("drpDwnAddressList", "text", address, "Select Address");
                selectValueFromDropdown("drpDwnRiskToInsure", "text", insure, "Select Risk To Insure");
                if (insure.equalsIgnoreCase("Specified All Risk Cover")) {
                    selectValueFromDropdown("drpDwnSpecifiedAllRiskCover", "text", specifiedAllRiskCover, "Select Specified All Risk Cover");
                }
                setText("txtBoxDescription", description, "Enter Description");
                setText("txtBoxSumInsured", insuranceAmount, "Enter Sum Insured");
                click("btnFinish", "Click Finish Button");
                if (exists("labelCoverSelection", true, "Cover Selection Exists")) {
                    logger.info("All Risk - " + insure + " Details Captured Successfully");
                }
            }
        } catch (Exception e) {
            logger.info("Exception in All Risk is : " + e);
        }
    }


    //BOATS COVER
    public void boats() {

        Absa_Idirect_POM.Idirect_Factory();

        try {
            if (exists("labelBoatDetails", true, "Boat Details")) {
                //Risk Address
                click("chkBoxRiskAddressSame", "Click Is Risk Address Same As Physical Address? CheckBox");
                //Boat Details
                if (territorialLetterProvided.equalsIgnoreCase("Yes")) {
                    click("chkBoxTerritorialLetterProvided", "Click Territorial Letter Provided");
                    String defaultTerritorialCountry = getText("LabelTerritorialCountries", "Territorial Countries Default Value");
                    if (!territorialCountries.equalsIgnoreCase(defaultTerritorialCountry)) {
                        selectValueFromDropdown("drpDwnTerritorialCountries", "text", territorialCountries, "Select Territorial Countries");
                    }
                    setText("txtBoxLetterFromDate", getCurrentDate(), "Enter Letter From Date");
                    setText("txtBoxLetterToDate", getCurrentDate(), "Enter Letter To Date");
                }
                selectValueFromDropdown("drpDwnBoatType", "text", itemType, "Select Item Type");
                selectValueFromDropdown("drpDwnBoatStoredWhenNotInUse", "text", boatStoredWhenNotInUse, "Select Boat Stored When Not In Use");
                selectValueFromDropdown("drpDwnBoatUsedFor", "text", vehicleUsedFor, "Select Boat Used For");
                selectValueFromDropdown("drpDwnBoatYearOfManufacture", "text", yearOfManufacture, "Select Year Of Manufacture");
                setText("txtBoxBoatMakeModel", make, "Enter Make Model");
                setText("txtBoxBoatDescription", description, "Enter Description");
                selectValueFromDropdown("drpDwnBoatHullCode", "text", hullCode, "Select Hull Code");
                if (isWatercraftFinanced.equalsIgnoreCase("Yes")) {
                    click("chkBoxIsTheWatercraftFinanced", "Click Is The Watercraft Financed");
                    selectValueFromDropdown("drpDwnFinanceCompany", "text", financeCompany, "Select Finance Company");
                    setText("txtBoxFinanceAgreementNumber", financeAgreementNumber, "Enter Finance Agreement Number");
                }
                selectValueFromDropdown("drpDwnBoatSpeed", "text", boatSpeed, "Select Boat Speed");
                if (exists("txtBoxHullSumInsured",true,"The watercraft value is selected")) {
                    setText("txtBoxHullSumInsured", insuranceAmount, "Enter Hull Sum Insured");
                }
                if (exists("txtBoxHullSumInsured",true,"The watercraft value is selected")) {
                    setText("txtBoxInboardSumInsured", inboardSumInsured, "Enter InBoard Sum Insured");
                }
                if (exists("txtBoxHullSumInsured",true,"The watercraft value is selected")) {
                    setText("txtBoxOutboardSumInsured", outboardSumInsured, "Enter OutBoard Sum Insured");
                }
                if (uninterruptedWatercraftInsurance.equalsIgnoreCase("Yes")) {
                    click("chkBoxUninterruptedWatercraft36Mon", "Click Uninterrupted Watercraft");
                    setText("txtBoxLossesInPast12Months", claimsInPast12Months, "Enter Claims In Past 12 Months");
                    setText("txtBoxLossesInPast13To24Mon", claimsInPast24Months, "Enter Claims In Past 24 Months");
                    setText("txtBoxLossesInPast25To36Mon", claimsInPast36Months, "Enter Claims In Past 36 Months");
                }
                click("btnFinish", "Click Finish Button");
                if (exists("labelCoverSelection", true, "Cover Selection Exists")) {
                    logger.info("Boats - " + itemType + " Details Captured Successfully");
                }
            }
        } catch (Exception e) {
            logger.info("Exception in Boats is : " + e);
        }
    }

    //ELECTRONIC
    public void electronicEquipment(){
        Absa_Idirect_POM.Idirect_Factory();
        try{
            if (exists("labelElectronic",true,"The Label is present")) {
                selectValueFromDropdown("drpDwnAddress", "index", "1", "Select Address");
                if (itemForBusinessPurpose.equalsIgnoreCase("Yes")) {
                    click("chkBoxItemForBusinessPurpose", "Click Item For Business Purpose");
                }
            }
            selectValueFromDropdown("drpDwnType","text",computerType,"The Electronic Type was selected");
            selectValueFromDropdown("drpDwnFlat","value","1","The value is selected");
            setText("txtBoxMake",make,"The Make is selected");
            setText("txtBoxModel","2019","The Model is Selected");
            setText("txtBoxElectronicEquipmentSumInsured",insuranceAmount,"The Sum Insured value is clicked");
            setText("txtBoxSerialNumber","T5639200","The Serial Number should be selected");
            setText("txtBoxIMEINumber","U6778973839089849","The IMEI Number should be selected");
        }catch (Exception e){
            logger.info("Excepetion must be thrown on this");
        }
    }

    //ENDORSING PART
    /*
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
    }*/

}
