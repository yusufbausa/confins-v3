import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
	
	
//OPEN BROWSER================================================================================================================================================================
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()
//WebUI.delay(1)
	
	
//INPUT ADMIN CREDENTIAL================================================================================================================================================================
WebUI.setText(findTestObject('Login/username'), username)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)
	
	
//SELECT ROLE================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/a_Select'))
//WebUI.delay(1)
	
	
//SELECT MENU NEW APPLICATION================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/img_Welcome, HELEN MELIANA SETIAWAN, FLEET _179df6'))
//WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/a_New Application'))
//WebUI.delay(1)
	
	
//INPUT APPLICATION FLEET================================================================================================================================================================
void part_1() {
	
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/a_Add'))
WebUI.delay(1)
	
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/input_Product Offering Name_ucLookupProdOff_8d93d5'))
WebUI.setText(findTestObject('Object Repository/FLEET/New Application - Customer/input_Product Offering Name_ucLookupProdOff_cb8174'), productOffer)
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/a_SEARCH'))
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/a_Select (1)'))
//WebUI.delay(1)
	
WebUI.sendKeys(findTestObject('Object Repository/FLEET/New Application - Customer/input_Num Of Asset_ucINNumOfAssettxtInput'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/New Application - Customer/input_Num Of Asset_ucINNumOfAssettxtInput'), Keys.chord(Keys.DELETE))
WebUI.setText(findTestObject('Object Repository/FLEET/New Application - Customer/input_Num Of Asset_ucINNumOfAssettxtInput'), assetAmount)
	
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/a_Next'))
WebUI.delay(1)
	
}
	
	
//SELECT CUSTOMER================================================================================================================================================================
	
void part_2() {
	
WebUI.scrollToElement(findTestObject('Object Repository/FLEET/New Application - Customer/input_Personal_rblCustType'), 0)

WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/input_Personal_rblCustType'))
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/input_Customer Name_uclCustuclCustimb'))
WebUI.setText(findTestObject('Object Repository/FLEET/New Application - Customer/input_Customer Name_uclCustuclCustumdctl00u_91e5b7'), custName)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/New Application - Customer/select_AllCompany'), 'C', false)
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/a_SEARCH (1)'))
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/a_Select (2)'))
WebUI.delay(1)

WebUI.click(findTestObject('FLEET/New Application - Customer/input_-_lb_Form_SaveContCust'))
WebUI.delay(1)

WebUI.click(findTestObject('FLEET/New Application - Customer/input_-_lb_Form_SaveContGuar'))
WebUI.delay(1)
	
}
	
	
//INPUT APPLICATION DATA================================================================================================================================================================
	
void part_3() {
	
WebUI.click(findTestObject('Object Repository/FLEET/Application Data/input_MOU No_ucLookupMOUuclMOUimb'))
WebUI.setText(findTestObject('Object Repository/FLEET/Application Data/input_MOU No_ucLookupMOUuclMOUumdctl00ucSrp_0980e3'), mouNo)
WebUI.click(findTestObject('Object Repository/FLEET/Application Data/a_SEARCH'))
WebUI.click(findTestObject('Object Repository/FLEET/Application Data/a_Select (1)'))
WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/FLEET/Application Data/input_Tenor_ucINTenortxtInput'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Application Data/input_Tenor_ucINTenortxtInput'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Application Data/input_Tenor_ucINTenortxtInput'), tenor)
	
WebUI.click(findTestObject('Object Repository/FLEET/Application Data/select_Select OneMONTHLYBIMONTHLYQuarterlyT_7ac454'))
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Application Data/select_Select OneMONTHLYBIMONTHLYQuarterlyT_7ac454'), '1', false)
	
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Application Data/select_Select OneFixed RateFloat Rate'), 'FXD', false)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Application Data/select_Select OneRegular Fixed InstallmentI_6fe75a'), 'RF', false)
	
WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Application Data/select_Select One18 JULI GIIAS 2019AAM VIRT_a6e317'), 0)

WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Application Data/select_Select One18 JULI GIIAS 2019AAM VIRT_a6e317'), 'DEALER', false)
WebUI.click(findTestObject('Object Repository/FLEET/Application Data/input_Yes_rblIsFudiciaCovered'))
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Application Data/select_Select OneAuto Debit AFIAuto Debit B_40b1f3'), 'ADBCA', false)

WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Application Data/select_Select OneLegal AddressCompany Addre_fd5966'), 0)

WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Application Data/select_Select OneLegal AddressCompany Addre_fd5966'), '1', false)
WebUI.click(findTestObject('Object Repository/FLEET/Application Data/a_Copy Address'))
//WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Application Data/input_-ext_ucAddrtxtPhnArea1'), 0)
//WebUI.delay(1)
	
WebUI.setText(findTestObject('Object Repository/FLEET/Application Data/input_-ext_ucAddrtxtPhnArea1'), phoneArea)
WebUI.setText(findTestObject('Object Repository/FLEET/Application Data/input_-ext_ucAddrtxtPhn1'), phoneNumber)
WebUI.setText(findTestObject('Object Repository/FLEET/Application Data/input_-ext_ucAddrtxtPhoneExt1'), phoneExt)
	
WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Application Data/input_-_lb_Form_SaveCont'), 0)

WebUI.click(findTestObject('Object Repository/FLEET/Application Data/input_-_lb_Form_SaveCont'))
WebUI.delay(1)
	
}
	
	
//ADDING ASSET DATA================================================================================================================================================================
	
void part_4() {
	
//Asset 1
	
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_Add'))
WebUI.delay(1)
	
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/input_Supplier Branch Name_ucLookupSupplBra_9efefd'))
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_Supplier Branch Address_ucLookupSuppl_6b0da6'), suppBranchAddress)
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_SEARCH'))
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_Select (1)'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/select_Select OneANDHIKA WIRABUANADEDE HERM_ff6943'))
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Asset Data/select_Select OneANDHIKA WIRABUANADEDE HERM_ff6943'), '29721', false)

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/input_Asset Name_ucLookupAssetMasteruclMasterimb'))
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_Asset Name_ucLookupAssetMasteruclMast_091a2a'), assetName)
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_SEARCH_1'))
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_Select_1'))
WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/FLEET/Asset Data/input_Asset Price_ucAssetPricetxtInput'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Asset Data/input_Asset Price_ucAssetPricetxtInput'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Asset Data/input_Asset Price_ucAssetPricetxtInput'), assetPrice)
	
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Asset Data/input_Down Payment_ucDownPaymentPrcnttxtInput'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Asset Data/input_Down Payment_ucDownPaymentPrcnttxtInput'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Asset Data/input_Down Payment_ucDownPaymentPrcnttxtInput'), assetDP)
	
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/textarea_Notes_txtNotesMainAss'), notes)
	
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_No. Mesin_txtSerialNo1'), noMesin)
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_No. Rangka_txtSerialNo2'), noRangka)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Asset Data/select_Select OneKomersial Jangka PanjangKo_70a155'), 'O', false)
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_Manufacturing Year_txtManufacturingYear'), manufYear)
	
WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Asset Data/input_MADE IN_rptAttributectl00txtAttrContent'), 10)
	
WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Asset Data/input_MADE IN_rptAttributectl00txtAttrContent'), 10)

WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_MADE IN_rptAttributectl00txtAttrContent'), madeIN)
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_CYLINDER_rptAttributectl01txtAttrContent'), cylinder)
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_TRANSMITION_rptAttributectl02txtAttrContent'), transmission)
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_COLOR_rptAttributectl03txtAttrContent'), color)
	
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_Save'))
WebUI.delay(1)
	
//Registration Asset 1
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/input_gjahsdg26387424gj123_gvAssetListctl02imbEdit'))
WebUI.delay(1)
	
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/input_Self Usage_rblAssetUser'))
	
WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Asset Data/select_Select OneLegal AddressCompany Addre_fd5966'), 10)

WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Asset Data/select_Select OneLegal AddressCompany Addre_fd5966'), 'LEGAL', false)
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_Copy'))
	
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_Save_1'))
WebUI.delay(1)
	
	
//Asset 2 =====================================================================================================================================================================
	
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_Add'))
WebUI.delay(1)
	
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/input_Supplier Branch Name_ucLookupSupplBra_9efefd'))
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_Supplier Branch Address_ucLookupSuppl_6b0da6'), suppBranchAddress)
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_SEARCH'))
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_Select (1)'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/select_Select OneANDHIKA WIRABUANADEDE HERM_ff6943'))
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Asset Data/select_Select OneANDHIKA WIRABUANADEDE HERM_ff6943'), '29721', false)

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/input_Asset Name_ucLookupAssetMasteruclMasterimb'))
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_Asset Name_ucLookupAssetMasteruclMast_091a2a'), assetName2)	
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_SEARCH_1'))
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_Select_1'))
WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/FLEET/Asset Data/input_Asset Price_ucAssetPricetxtInput'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Asset Data/input_Asset Price_ucAssetPricetxtInput'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Asset Data/input_Asset Price_ucAssetPricetxtInput'), assetPrice2)

WebUI.sendKeys(findTestObject('Object Repository/FLEET/Asset Data/input_Down Payment_ucDownPaymentPrcnttxtInput'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Asset Data/input_Down Payment_ucDownPaymentPrcnttxtInput'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Asset Data/input_Down Payment_ucDownPaymentPrcnttxtInput'), assetDP2)

WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/textarea_Notes_txtNotesMainAss'), notes)
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_No. Mesin_txtSerialNo1'), noMesin2)
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_No. Rangka_txtSerialNo2'), noRangka2)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Asset Data/select_Select OneKomersial Jangka PanjangKo_70a155'), 'O', false)
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_Manufacturing Year_txtManufacturingYear'), manufYear)
	
WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Asset Data/input_MADE IN_rptAttributectl00txtAttrContent'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Asset Data/input_MADE IN_rptAttributectl00txtAttrContent'), 10)

WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_MADE IN_rptAttributectl00txtAttrContent'), madeIN)
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_CYLINDER_rptAttributectl01txtAttrContent'), cylinder)
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_TRANSMITION_rptAttributectl02txtAttrContent'), transmission)
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_COLOR_rptAttributectl03txtAttrContent'), color)
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_Save'))
WebUI.delay(1)
	
//Registration Asset 2
WebUI.click(findTestObject('FLEET/Asset Data/Multi/button_registration_asset_2'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/input_Self Usage_rblAssetUser'))

WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Asset Data/select_Select OneLegal AddressCompany Addre_fd5966'), 10)

WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Asset Data/select_Select OneLegal AddressCompany Addre_fd5966'), 'LEGAL', false)
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_Copy'))

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_Save_1'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/input_-_lb_Form_SaveCont'))
WebUI.delay(1)
	
}
	
//ADDING INSURANCE========================================================================================================================================================================
	
void part_5() {
	
//Insurance Asset 1
WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/input_gjahsdg26387424gj123_gvEntryInsctl02imbEdit'))
WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Object Repository/FLEET/Insurance Data/select_Select OneAAB - JKT FLEET OJK 2014TO_1e4367'), insuranceType, false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/FLEET/Insurance Data/select_Select OneGroupNon GroupRepeat Order'), 'Non Group', false)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Insurance Data/select_Select OneALL RISKTLO'), 'ALL RISK', false)
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/a_Next'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/a_Calculate'))
WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/a_Save'))
WebUI.delay(1)
	
//Insurance Asset 2
WebUI.click(findTestObject('FLEET/Insurance Data/Multi/button_edit_insurance_no_2'))
WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Object Repository/FLEET/Insurance Data/select_Select OneAAB - JKT FLEET OJK 2014TO_1e4367'), 'COMMERCIAL', false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/FLEET/Insurance Data/select_Select OneGroupNon GroupRepeat Order'), 'Non Group', false)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Insurance Data/select_Select OneALL RISKTLO'), 'ALL RISK', false)
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/a_Next'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/a_Calculate'))
WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/a_Save'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/input_-_lb_Form_Next'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/input_-_lb_Form_SaveCont'))
WebUI.delay(1)
	
}
	
//ADDING FINANCIAL DATA=========================================================================================================================================================
	
void part_6() {
WebUI.click(findTestObject('FLEET/Financial Data/input_-_lb_Form_SaveContLifeInsur'))
WebUI.delay(1)
//WebUI.click(findTestObject('Object Repository/FLEET/Financial Data/input_Fees_lbCalculateFees'))
//WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Financial Data/input_This field is required_ucINRatetxtInput'), 0)
//WebUI.sendKeys(findTestObject('Object Repository/FLEET/Financial Data/input_This field is required_ucINRatetxtInput'),
//	Keys.chord(Keys.CONTROL + "a"))
//WebUI.sendKeys(findTestObject('Object Repository/FLEET/Financial Data/input_This field is required_ucINRatetxtInput'),
//Keys.chord(Keys.DELETE))
//WebUI.sendKeys(findTestObject('Object Repository/FLEET/Financial Data/input_This field is required_ucINRatetxtInput'), '13')
//WebUI.sendKeys(findTestObject('Object Repository/FLEET/Financial Data/input_This field is required_ucINRatetxtInput'),
//	Keys.chord(Keys.ENTER))
//WebUI.delay(3)
//WebUI.click(findTestObject('Object Repository/FLEET/Financial Data/input_Financial Data_lbCalculateFinancialData'))
//WebUI.acceptAlert()
//WebUI.click(findTestObject('Object Repository/FLEET/Financial Data/input_Financial Data_lbCalculateFinancialData'))
//WebUI.delay(5)
//WebUI.scrollToElement(findTestObject('FLEET/Financial Data/input_-_lb_Form_SaveContFindat'), 0)
//WebUI.click(findTestObject('FLEET/Financial Data/input_-_lb_Form_SaveContFindat'))
//WebUI.delay(2)
//WebUI.click(findTestObject('FLEET/Financial Data/input_-_lb_Form_SaveContComdat'))
//WebUI.delay(2)
//WebUI.click(findTestObject('FLEET/Financial Data/input_-_lb_Form_SaveContOtherdat'))
//WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/FLEET/FInancial Data New/input_Fees_lb_Form_CalcFee'))
WebUI.click(findTestObject('Object Repository/FLEET/FInancial Data New/input_Fees_lbCalculateFees'))

WebUI.scrollToElement(findTestObject('Object Repository/FLEET/FInancial Data New/input_This field is required_ucINRatetxtInput'), 0)

WebUI.sendKeys(findTestObject('Object Repository/FLEET/FInancial Data New/input_This field is required_ucINRatetxtInput'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/FInancial Data New/input_This field is required_ucINRatetxtInput'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/FInancial Data New/input_This field is required_ucINRatetxtInput'), effRate)

WebUI.click(findTestObject('Object Repository/FLEET/FInancial Data New/td_Select OneFlatEffectiveThis field is req_aab00b'))
WebUI.click(findTestObject('Object Repository/FLEET/FInancial Data New/input_Financial Data_lbCalculateFinancialData'))
WebUI.delay(1)

WebUI.scrollToElement(findTestObject('FLEET/FInancial Data New/input_-_lb_Form_SaveContFinDat'), 10)

WebUI.click(findTestObject('FLEET/FInancial Data New/input_-_lb_Form_SaveContFinDat'))
WebUI.delay(1)

WebUI.click(findTestObject('FLEET/FInancial Data New/input_-_lb_Form_SaveContComDat'))
WebUI.delay(1)

WebUI.click(findTestObject('FLEET/FInancial Data New/input_-_lb_Form_SaveContOtherDat'))
WebUI.delay(1)
	
}
	
//OTHER INFO====================================================================================================================================================================================
	
void part_7() {
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/select_Select OneYesNo'),
	'No', false)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/select_Select OneYesNo_1'),
	'No', false)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/select_Select OneYesNo_1_2'),
	'No', false)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/select_Select OneYesNo_1_2_3'),
	'No', false)
WebUI.click(findTestObject('FLEET/Other Info and Term n Condition/input_-_lb_Form_SaveOther'))
WebUI.delay(1)
	
}
	
	
//TERM & CONDITION====================================================================================================================================================================================
	
void part_8() {
WebUI.click(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/input_Yes_gvTermConditionctl02cbChecked'))
WebUI.click(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/input_Yes_gvTermConditionctl03cbChecked'))
WebUI.click(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/input_No_gvTermConditionctl04cbChecked'))
WebUI.click(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/input_No_gvTermConditionctl05cbChecked'))
WebUI.click(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/input_Yes_gvTermConditionctl06cbChecked'))
WebUI.click(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/input_Yes_gvTermConditionctl07cbChecked'))
WebUI.click(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/input_No_gvTermConditionctl08cbChecked'))
WebUI.click(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/input_Yes_gvTermConditionctl09cbChecked'))
WebUI.click(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/input_Yes_gvTermConditionctl10cbChecked'))
WebUI.click(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/input_No_gvTermConditionctl11cbChecked'))
WebUI.click(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/input_No_gvTermConditionctl12cbChecked'))
WebUI.click(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/input_No_gvTermConditionctl13cbChecked'))
WebUI.click(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/input_No_gvTermConditionctl14cbChecked'))

WebUI.click(findTestObject('FLEET/Other Info and Term n Condition/input_-_lb_Form_SaveTerm'))
WebUI.delay(1)


WebUI.verifyElementPresent(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/span_Submit'), 30)
WebUI.click(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/span_Submit'))
WebUI.verifyAlertPresent(0)
WebUI.acceptAlert()
WebUI.delay(3)
	
}
	
	
//CALL METHOD
part_1()
part_2()
part_3()
part_4()
part_5()
part_6()
part_7()
part_8()
	
	
//CLOSE BROWSER====================================================================================================================================================================================
WebUI.closeBrowser()
	
	
