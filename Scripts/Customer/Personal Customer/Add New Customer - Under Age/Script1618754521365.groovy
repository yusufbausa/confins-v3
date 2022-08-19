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
import com.kms.katalon.core.webui.common.WebUiCommonHelper

//OPEN BROWSER & HIT URL
WebUI.openBrowser('')
WebUI.navigateToUrl('http://confins-uat.taf.co.id/confins/')
WebUI.maximizeWindow()


//INPUT CREDENTIAL------------------------------------------------------------------------------------------------------------------------------
WebUI.setText(findTestObject('Login/username'), 'ABW0572')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//SELEC PROFILE------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Login/btn_select_profile'))
WebUI.delay(5)


//SELECT MENU CUSTOMER------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Customer/New - Main Data/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'))
WebUI.delay(1)
WebUI.click(findTestObject('Customer/New - Main Data/a_Customer'))
WebUI.delay(1)
WebUI.click(findTestObject('Customer/New - Main Data/a_Customer_1'))
WebUI.delay(3)


//ADDING NEW CUSTOMER------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Customer/New - Main Data/a_Add Personal Customer'))
WebUI.delay(2)
WebUI.click(findTestObject('Customer/New - Main Data/input_Small Medium Enterprise_rblCustModel'))
WebUI.setText(findTestObject('Customer/New - Main Data/input_Customer Name_txtCustName'), 'Andira Twenty')
WebUI.selectOptionByValue(findTestObject('Customer/New - Main Data/select_Select OneAKTAKTPKIMSKITAPKITASKKNIK_89b50f'), 
    'KTP', false)
WebUI.setText(findTestObject('Customer/New - Main Data/input_ID Number_ucIdtxtCustIdNo'), '3131321010081118')
WebUI.setText(findTestObject('Customer/New - Main Data/input_ID Expired Date_ucIdExpiredDttxtDatePicker'), '10/10/2030')
WebUI.sendKeys(findTestObject('Customer/New - Main Data/input_ID Expired Date_ucIdExpiredDttxtDatePicker'), Keys.chord(Keys.ENTER))
WebUI.click(findTestObject('Customer/New - Main Data/input_Female_rblCustGender'))
WebUI.setText(findTestObject('Customer/New - Main Data/input__txtBirthPlace'), 'Jakarta')
WebUI.setText(findTestObject('Customer/New - Main Data/input__ucBirthDatetxtDatePicker'), '10/10/2008')
WebUI.sendKeys(findTestObject('Customer/New - Main Data/input__ucBirthDatetxtDatePicker'), Keys.chord(Keys.ENTER))
WebUI.setText(findTestObject('Customer/New - Main Data/input_NPWP_txtNpwp'), '123456789')
WebUI.setText(findTestObject('Customer/New - Main Data/input_Mother Maiden Name_txtMotherMaidenName'), 'Eleanor')
WebUI.click(findTestObject('Customer/New - Main Data/a_Next'))
WebUI.delay(3)


//ADDING MAIN DATA------------------------------------------------------------------------------------------------------------------------------
WebUI.selectOptionByValue(findTestObject('Customer/New - Main Data/select_Select OneMR.MRS.MS'), 'MR', false)
WebUI.setText(findTestObject('Customer/New - Main Data/input_Prefix Name_txtPrefixName'), 'Andira')
WebUI.setText(findTestObject('Customer/New - Main Data/input_Customer Suffix Name_txtSuffixName'), 'Twenty')
WebUI.setText(findTestObject('Customer/New - Main Data/input_Nick Name_txtNickName'), 'Andira')
WebUI.selectOptionByValue(findTestObject('Customer/New - Main Data/select_Select OneDivorceMarriedSingle'), 'SIN', false)
WebUI.selectOptionByValue(findTestObject('Customer/New - Main Data/select_Select OneWNAWNI'), 'WNI', false)
WebUI.verifyElementPresent(findTestObject('Customer/New - Main Data/select_Select OneBelum Tamat SDSederajatD1D_5f6d87'), 
    2)
WebUI.selectOptionByValue(findTestObject('Customer/New - Main Data/select_Select OneBelum Tamat SDSederajatD1D_5f6d87'), 
    'SMA', false)
WebUI.selectOptionByValue(findTestObject('Customer/New - Main Data/select_Select OneBudhaHINDUIslamKATOLIKKONF_03ebe1'), 
    'ISLAM', false)
WebUI.scrollToElement(findTestObject('Customer/New - Main Data/input_Mobile Phone 1_txtMblPhn1'), 0)
WebUI.setText(findTestObject('Customer/New - Main Data/input_Mobile Phone 1_txtMblPhn1'), '081234567890')
WebUI.scrollToElement(findTestObject('Customer/New - Main Data/input_-_lb_Form_SaveCont_MainData'), 0)
WebUI.click(findTestObject('Customer/New - Main Data/input_-_lb_Form_SaveCont_MainData'))
WebUI.delay(3)


//ADDING CUSTOMER ADDRESS------------------------------------------------------------------------------------------------------------------------------
//adding address legal
WebUI.click(findTestObject('Object Repository/Customer/Address/a_Add'))
WebUI.delay(2)
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Address/select_Select OneLegal AddressCompany Addre_087cee'), 
    '1', false)
WebUI.setText(findTestObject('Object Repository/Customer/Address/textarea_Address_ucAddrtxtOfficeAddr'), 'Jalan Gatot Subroto')
WebUI.setText(findTestObject('Object Repository/Customer/Address/input__ucAddrtxtRT'), '001')
WebUI.setText(findTestObject('Object Repository/Customer/Address/input__ucAddrtxtRW'), '002')
WebUI.click(findTestObject('Object Repository/Customer/Address/input_Zip Code_ucAddrucLookupZipCodeuclZipCodeimb'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Customer/Address/input_Kelurahan_ucAddrucLookupZipCodeuclZip_f8e874'), '%pancoran%')
WebUI.click(findTestObject('Object Repository/Customer/Address/a_SEARCH'))
WebUI.click(findTestObject('Object Repository/Customer/Address/a_Select (1)'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Customer/Address/input_Customer does not have fixedline_ucAd_c408ee'))
WebUI.scrollToElement(findTestObject('Object Repository/Customer/Address/input_Company Name_txtCoyName'), 0)
WebUI.setText(findTestObject('Object Repository/Customer/Address/input_Company Name_txtCoyName'), 'Belum Bekerja')
WebUI.scrollToElement(findTestObject('Object Repository/Customer/Address/a_Save'), 0)
WebUI.click(findTestObject('Object Repository/Customer/Address/a_Save'))
WebUI.delay(3)


//adding address residence------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Object Repository/Customer/Address/a_Add'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Customer/Address/a_Copy Address'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Address/select_Select OneLegal AddressCompany Addre_087cee'), 
    '3', false)
WebUI.setText(findTestObject('Object Repository/Customer/Address/input_Company Name_txtCoyName'), 'Belum Bekerja')
//WebUI.setText(findTestObject('Object Repository/Customer/Address/input_Company Name_txtCoyName'), 'PT. Maju Sentosa')
WebUI.scrollToElement(findTestObject('Object Repository/Customer/Address/a_Save'), 0)
WebUI.click(findTestObject('Object Repository/Customer/Address/a_Save'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Customer/Address/input_-_lb_Form_SaveCont_CustAddress'))
WebUI.delay(3)


//ADDING JOB DATA------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Object Repository/Customer/Job Data/input_-_lb_Form_SaveCont_Family'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Customer/Job Data - Under Age/input_Profession Name_ucProfessionuclProfimb'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Customer/Job Data - Under Age/input_Profession Name_ucProfessionuclProfum_dd689e'),
	'%pelajar%')
WebUI.click(findTestObject('Object Repository/Customer/Job Data - Under Age/a_SEARCH'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Customer/Job Data - Under Age/a_Select (1)'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Customer/Job Data - Under Age/input_-_lb_Form_SaveCont_Job'))
WebUI.delay(3)


//ADDING EMERGENCY CONTACT------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Object Repository/Customer/Emergency Contact/a_Add'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Customer/Emergency Contact/input_Name_txtEmergencyName'), 'Michael Sumacher')
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Emergency Contact/select_Select OneBROTHERCHILDEMERGENCYFAMIL_277f94'), 
    'FATHER', false)
WebUI.setText(findTestObject('Object Repository/Customer/Emergency Contact/input_Mobile Phone 1_ucEmergencyContactInfo_7cb76e'), 
    '081234567890')
WebUI.scrollToElement(findTestObject('Object Repository/Customer/Emergency Contact/textarea_Address_ucEmergencyAddrtxtOfficeAddr'), 
    0)
WebUI.setText(findTestObject('Object Repository/Customer/Emergency Contact/textarea_Address_ucEmergencyAddrtxtOfficeAddr'), 
    'Jalan Gatot Subroto')
WebUI.setText(findTestObject('Object Repository/Customer/Emergency Contact/input__ucEmergencyAddrtxtRT'), '001')
WebUI.setText(findTestObject('Object Repository/Customer/Emergency Contact/input__ucEmergencyAddrtxtRW'), '002')
WebUI.click(findTestObject('Object Repository/Customer/Emergency Contact/input_Zip Code_ucEmergencyAddrucLookupZipCo_2d34e3'))
WebUI.setText(findTestObject('Object Repository/Customer/Emergency Contact/input_Kelurahan_ucEmergencyAddrucLookupZipC_f7005e'), 
    '%pancoran%')
WebUI.click(findTestObject('Object Repository/Customer/Emergency Contact/a_SEARCH'))
WebUI.click(findTestObject('Object Repository/Customer/Emergency Contact/a_Select (1)'))
WebUI.delay(1)
WebUI.click(findTestObject('Customer/Emergency Contact/textarea_Address_ucEmergencyAddrtxtOfficeAddr'))
WebUI.delay(1)
WebUI.scrollToElement(findTestObject('Object Repository/Customer/Emergency Contact/a_Save'), 0)
WebUI.click(findTestObject('Object Repository/Customer/Emergency Contact/a_Save'))
WebUI.delay(3)


//ADDING FINANCIAL DATA------------------------------------------------------------------------------------------------------------------------------
WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Gross Monthly Income_txt_CustFinData__30f5c6'), 
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Gross Monthly Income_txt_CustFinData__30f5c6'), 
	Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Gross Monthly Income_txt_CustFinData__30f5c6'), 
	'6000000')

WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Gross Profit_txt_CustFinData_GrossPro_b5b446'), 
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Gross Profit_txt_CustFinData_GrossPro_b5b446'), 
	Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Gross Profit_txt_CustFinData_GrossPro_b5b446'), 
	'1000000')

WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Living Cost_txt_CustFinData_LivingCos_80b94f'), 
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Living Cost_txt_CustFinData_LivingCos_80b94f'), 
	Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Living Cost_txt_CustFinData_LivingCos_80b94f'), 
	'2000000')

WebUI.click(findTestObject('Object Repository/Customer/Financial Data New/input__btnCalculate'))
WebUI.click(findTestObject('Object Repository/Customer/Financial Data New/a_Add'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Financial Data New/select_Select OneALFINDO SEJAHTERA BANKALGE_184781'), 
    '9', false)
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Customer/Financial Data New/input_Bank Branch_ucBankStatementCustBankAc_667f61'), 
    'Kuningan')
WebUI.setText(findTestObject('Object Repository/Customer/Financial Data New/input_Bank Branch BI Code_ucBankStatementCu_451e6a'), 
    '12345')
WebUI.setText(findTestObject('Object Repository/Customer/Financial Data New/input_Account Name_ucBankStatementCustBankA_ae9b92'), 
    'Nick Twelve')
WebUI.setText(findTestObject('Object Repository/Customer/Financial Data New/input_Account No_ucBankStatementCustBankAcc_1ef84e'), 
    '123456789')
WebUI.click(findTestObject('Object Repository/Customer/Financial Data New/a_Save'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Customer/Financial Data New/input_-_lb_Form_SaveCont_FinancialData'))
WebUI.delay(3)



//ADDING OTHER ATTRIBUTES------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Object Repository/Customer/Other Attribute/input_Debitor Group_UCDebtGrpucBebtGroupimb'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Customer/Other Attribute/input_BI Code_UCDebtGrpucBebtGroupumdctl00u_f7ebbb'), 
    '2540')
WebUI.click(findTestObject('Object Repository/Customer/Other Attribute/a_SEARCH'))
WebUI.click(findTestObject('Object Repository/Customer/Other Attribute/a_Select'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Other Attribute/select_Select OneUsaha MikroUsaha KecilUsah_b2a708'), 
    '03', false)
WebUI.click(findTestObject('Object Repository/Customer/Other Attribute/input_-_lb_Form_Save_OtherAttribute'))
WebUI.takeFullPageScreenshot()
WebUI.delay(5)


//CHECK USER-------------------------------------------------------------------------------------------------------------------------------------------
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Check Customer/select_Select OnePersonalCompany'), 
    'P', false)
WebUI.setText(findTestObject('Object Repository/Customer/Check Customer/input_Customer Name_ucSearchtxtCustName_ltl_285ee7'), 
    'Nick Twelve')
WebUI.click(findTestObject('Object Repository/Customer/Check Customer/input_Address_ucSearchbtnSearch'))
WebUI.click(findTestObject('Object Repository/Customer/Check Customer/input_Jalan Gatot Subroto 001 002 PANCORAN _dc5b2d'))
WebUI.click(findTestObject('Object Repository/Customer/Check Customer/span_Save'))
WebUI.click(findTestObject('Object Repository/Customer/Check Customer/a_Cancel'))
WebUI.delay(10)


//FINISH & CLOSE BROWSER
WebUI.closeBrowser()

