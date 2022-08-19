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
WebUI.navigateToUrl('http://confins-uat.taf.co.id/confins/')
WebUI.maximizeWindow()
WebUI.delay(1)


//INPUT ADMIN CREDENTIAL================================================================================================================================================================
WebUI.setText(findTestObject('Login/username'), 'HMS1248')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//SELECT ROLE================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/a_Select'))
WebUI.delay(3)


//SELECT MENU NEW APPLICATION================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/img_Welcome, HELEN MELIANA SETIAWAN, FLEET _179df6'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/a_New Application'))
WebUI.delay(3)


//INPUT APPLICATION FLEET================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/a_Add'))
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/input_Product Offering Name_ucLookupProdOff_8d93d5'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/FLEET/New Application - Customer/input_Product Offering Name_ucLookupProdOff_cb8174'),
	'fleet business vehicle nonpaket')
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/a_SEARCH'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/a_Select (1)'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/FLEET/New Application - Customer/input_Num Of Asset_ucINNumOfAssettxtInput'),
	'1')
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/a_Next'))
WebUI.delay(3)


//SELECT CUSTOMER================================================================================================================================================================
WebUI.scrollToElement(findTestObject('Object Repository/FLEET/New Application - Customer/input_Personal_rblCustType'), 0)
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/input_Personal_rblCustType'))
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/input_Customer Name_uclCustuclCustimb'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/FLEET/New Application - Customer/input_Customer Name_uclCustuclCustumdctl00u_91e5b7'),
	'CV BUANA JAYA')
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/New Application - Customer/select_AllCompany'), 'C', false)
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/a_SEARCH (1)'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/a_Select (2)'))
WebUI.delay(1)
WebUI.click(findTestObject('FLEET/New Application - Customer/input_-_lb_Form_SaveContCust'))
WebUI.delay(10)
WebUI.click(findTestObject('FLEET/New Application - Customer/input_-_lb_Form_SaveContGuar'))
WebUI.delay(5)


//INPUT APPLICATION DATA================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/FLEET/Application Data/input_MOU No_ucLookupMOUuclMOUimb'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/FLEET/Application Data/input_MOU No_ucLookupMOUuclMOUumdctl00ucSrp_0980e3'),
	'0021MOU20201200014')
WebUI.click(findTestObject('Object Repository/FLEET/Application Data/a_SEARCH'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Application Data/a_Select (1)'))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Application Data/input_Tenor_ucINTenortxtInput'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Application Data/input_Tenor_ucINTenortxtInput'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Application Data/input_Tenor_ucINTenortxtInput'), '36')
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/FLEET/Application Data/select_Select OneMONTHLYBIMONTHLYQuarterlyT_7ac454'))
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Application Data/select_Select OneMONTHLYBIMONTHLYQuarterlyT_7ac454'),
	'1', false)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Application Data/select_Select OneFixed RateFloat Rate'),
	'FXD', false)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Application Data/select_Select OneRegular Fixed InstallmentI_6fe75a'),
	'RF', false)
WebUI.delay(1)
WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Application Data/select_Select One18 JULI GIIAS 2019AAM VIRT_a6e317'), 0)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Application Data/select_Select One18 JULI GIIAS 2019AAM VIRT_a6e317'),
	'DEALER', false)
WebUI.click(findTestObject('Object Repository/FLEET/Application Data/input_Yes_rblIsFudiciaCovered'))
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Application Data/select_Select OneAuto Debit AFIAuto Debit B_40b1f3'),
	'ADBCA', false)
WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Application Data/select_Select OneLegal AddressCompany Addre_fd5966'), 0)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Application Data/select_Select OneLegal AddressCompany Addre_fd5966'),
	'1', false)
WebUI.click(findTestObject('Object Repository/FLEET/Application Data/a_Copy Address'))
//WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Application Data/input_-ext_ucAddrtxtPhnArea1'), 0)
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/FLEET/Application Data/input_-ext_ucAddrtxtPhnArea1'), '0548')
WebUI.setText(findTestObject('Object Repository/FLEET/Application Data/input_-ext_ucAddrtxtPhn1'), '26081')
WebUI.setText(findTestObject('Object Repository/FLEET/Application Data/input_-ext_ucAddrtxtPhoneExt1'), '678')
WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Application Data/input_-_lb_Form_SaveCont'), 0)
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Application Data/input_-_lb_Form_SaveCont'))
WebUI.delay(3)


//ADDING ASSET DATA================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_Add'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/input_Supplier Branch Name_ucLookupSupplBra_9efefd'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_Supplier Branch Address_ucLookupSuppl_6b0da6'), '%tangerang%')
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_SEARCH'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_Select (1)'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Asset Data/select_Select OneANDHIKA WIRABUANADEDE HERM_ff6943'),
	'29721', false)
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/input_Asset Name_ucLookupAssetMasteruclMasterimb'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_Asset Name_ucLookupAssetMasteruclMast_091a2a'), '%calya%')
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_SEARCH_1'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_Select_1'))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Asset Data/input_Asset Price_ucAssetPricetxtInput'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Asset Data/input_Asset Price_ucAssetPricetxtInput'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Asset Data/input_Asset Price_ucAssetPricetxtInput'), '250000000')
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Asset Data/input_Down Payment_ucDownPaymentPrcnttxtInput'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Asset Data/input_Down Payment_ucDownPaymentPrcnttxtInput'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Asset Data/input_Down Payment_ucDownPaymentPrcnttxtInput'), '30')
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/textarea_Notes_txtNotesMainAss'), 'notes')
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_No. Mesin_txtSerialNo1'), 'gj638asdasd9798ad')
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_No. Rangka_txtSerialNo2'), 'gjahs12j1231jasgd765')
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Asset Data/select_Select OneKomersial Jangka PanjangKo_70a155'),
	'O', false)
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_Manufacturing Year_txtManufacturingYear'), '2020')
WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Asset Data/input_MADE IN_rptAttributectl00txtAttrContent'), 0)
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_MADE IN_rptAttributectl00txtAttrContent'), 'Jepang')
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_CYLINDER_rptAttributectl01txtAttrContent'), '3')
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_TRANSMITION_rptAttributectl02txtAttrContent'), 'M')
WebUI.setText(findTestObject('Object Repository/FLEET/Asset Data/input_COLOR_rptAttributectl03txtAttrContent'), 'Black')
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_Save'))
WebUI.delay(5)


//ASSET DATA REGISTRATION================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/input_gjahsdg26387424gj123_gvAssetListctl02imbEdit'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/input_Self Usage_rblAssetUser'))
WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Asset Data/select_Select OneLegal AddressCompany Addre_fd5966'), 0)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Asset Data/select_Select OneLegal AddressCompany Addre_fd5966'),
	'LEGAL', false)
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_Copy'))
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/a_Save_1'))
WebUI.click(findTestObject('Object Repository/FLEET/Asset Data/input_-_lb_Form_SaveCont'))
WebUI.delay(3)


//ADDING INSURANCE========================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/input_gjahsdg26387424gj123_gvEntryInsctl02imbEdit'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Insurance Data/select_Select OneAAB - JKT FLEET OJK 2014TO_1e4367'),
	'235', false)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Insurance Data/select_Select OneGroupNon GroupRepeat Order'),
	'NG', false)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Insurance Data/select_Select OneALL RISKTLO'), 'ALL RISK',
	false)
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/a_Next'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/a_Calculate'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/a_Save'))
WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/input_-_lb_Form_Next'))
WebUI.click(findTestObject('Object Repository/FLEET/Insurance Data/input_-_lb_Form_SaveCont'))
WebUI.delay(3)


//ADDING FINANCIAL DATA=========================================================================================================================================================
WebUI.click(findTestObject('FLEET/Financial Data/input_-_lb_Form_SaveContLifeInsur'))
WebUI.delay(2)
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
WebUI.sendKeys(findTestObject('Object Repository/FLEET/FInancial Data New/input_This field is required_ucINRatetxtInput'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/FInancial Data New/input_This field is required_ucINRatetxtInput'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/FInancial Data New/input_This field is required_ucINRatetxtInput'),
	'13')
WebUI.click(findTestObject('Object Repository/FLEET/FInancial Data New/td_Select OneFlatEffectiveThis field is req_aab00b'))
WebUI.click(findTestObject('Object Repository/FLEET/FInancial Data New/input_Financial Data_lbCalculateFinancialData'))
WebUI.delay(2)
WebUI.scrollToElement(findTestObject('FLEET/FInancial Data New/input_-_lb_Form_SaveContFinDat'), 0)
WebUI.click(findTestObject('FLEET/FInancial Data New/input_-_lb_Form_SaveContFinDat'))
WebUI.delay(2)
WebUI.click(findTestObject('FLEET/FInancial Data New/input_-_lb_Form_SaveContComDat'))
WebUI.delay(2)
WebUI.click(findTestObject('FLEET/FInancial Data New/input_-_lb_Form_SaveContOtherDat'))


//OTHER INFO====================================================================================================================================================================================
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/select_Select OneYesNo'),
	'No', false)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/select_Select OneYesNo_1'),
	'No', false)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/select_Select OneYesNo_1_2'),
	'No', false)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/select_Select OneYesNo_1_2_3'),
	'No', false)
WebUI.click(findTestObject('FLEET/Other Info and Term n Condition/input_-_lb_Form_SaveOther'))
WebUI.delay(3)


//TERM & CONDITION====================================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/input_Yes_gvTermConditionctl02cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/input_Yes_gvTermConditionctl03cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/input_No_gvTermConditionctl04cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/input_No_gvTermConditionctl05cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/input_Yes_gvTermConditionctl06cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/input_Yes_gvTermConditionctl07cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/input_No_gvTermConditionctl08cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/input_Yes_gvTermConditionctl09cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/input_Yes_gvTermConditionctl10cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/input_No_gvTermConditionctl11cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/input_No_gvTermConditionctl12cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/input_No_gvTermConditionctl13cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/input_No_gvTermConditionctl14cbChecked'))
WebUI.delay(1)
WebUI.click(findTestObject('FLEET/Other Info and Term n Condition/input_-_lb_Form_SaveTerm'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Other Info and Term n Condition/span_Submit'))
WebUI.delay(1)
WebUI.acceptAlert()
WebUI.delay(5)


//CLOSE BROWSER====================================================================================================================================================================================
WebUI.closeBrowser()


