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

//OPEN BROWSER & HIT URL==========================================================================================================================================================================
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()


//INPUT CREDENTIAL==========================================================================================================================================================================
WebUI.setText(findTestObject('Login/username'), username)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//SELEC PROFILE==========================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Login/btn_select_profile'), 20)
WebUI.click(findTestObject('Login/btn_select_profile'))
WebUI.delay(1)


//SELECT MENU CUSTOMER==========================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Customer/New - Main Data/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'), 20)
WebUI.click(findTestObject('Customer/New - Main Data/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Customer/New - Main Data/a_Customer'), 20)
WebUI.click(findTestObject('Customer/New - Main Data/a_Customer'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Customer/New - Main Data/a_Customer_1'), 20)
WebUI.click(findTestObject('Customer/New - Main Data/a_Customer_1'))
WebUI.delay(1)


//ADDING NEW CUSTOMER==========================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Customer/New - Main Data/a_Add Personal Customer'), 20)
WebUI.click(findTestObject('Customer/New - Main Data/a_Add Personal Customer'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Customer/New - Main Data/input_Customer Name_txtCustName'), 20)
WebUI.setText(findTestObject('Customer/New - Main Data/input_Customer Name_txtCustName'), custName)
WebUI.selectOptionByValue(findTestObject('Customer/New - Main Data/select_Select OneAKTAKTPKIMSKITAPKITASKKNIK_89b50f'), 
    'KTP', false)
WebUI.setText(findTestObject('Customer/New - Main Data/input_ID Number_ucIdtxtCustIdNo'), idNumber)
WebUI.setText(findTestObject('Customer/New - Main Data/input_ID Expired Date_ucIdExpiredDttxtDatePicker'), idExpired)
WebUI.sendKeys(findTestObject('Customer/New - Main Data/input_ID Expired Date_ucIdExpiredDttxtDatePicker'), Keys.chord(Keys.ENTER))
WebUI.click(findTestObject('Customer/New - Main Data/input_Female_rblCustGender'))
WebUI.setText(findTestObject('Customer/New - Main Data/input__txtBirthPlace'), birthPlace)
WebUI.setText(findTestObject('Customer/New - Main Data/input__ucBirthDatetxtDatePicker'), birthDate)
WebUI.sendKeys(findTestObject('Customer/New - Main Data/input__ucBirthDatetxtDatePicker'), Keys.chord(Keys.ENTER))
WebUI.setText(findTestObject('Customer/New - Main Data/input_NPWP_txtNpwp'), npwp)
WebUI.setText(findTestObject('Customer/New - Main Data/input_Mother Maiden Name_txtMotherMaidenName'), motherName)
WebUI.click(findTestObject('Customer/New - Main Data/a_Next'))
WebUI.delay(1)


//ADDING MAIN DATA==========================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Customer/New - Main Data/select_Select OneMR.MRS.MS'), 20)
WebUI.selectOptionByValue(findTestObject('Customer/New - Main Data/select_Select OneMR.MRS.MS'), 'MR', false)
WebUI.setText(findTestObject('Customer/New - Main Data/input_Prefix Name_txtPrefixName'), prefixName)
WebUI.setText(findTestObject('Customer/New - Main Data/input_Customer Suffix Name_txtSuffixName'), suffixName)
WebUI.setText(findTestObject('Customer/New - Main Data/input_Nick Name_txtNickName'), nickName)
WebUI.selectOptionByValue(findTestObject('Customer/New - Main Data/select_Select OneDivorceMarriedSingle'), 'SIN', false)
WebUI.selectOptionByValue(findTestObject('Customer/New - Main Data/select_Select OneWNAWNI'), 'WNI', false)
WebUI.verifyElementPresent(findTestObject('Customer/New - Main Data/select_Select OneBelum Tamat SDSederajatD1D_5f6d87'), 
    2)
WebUI.selectOptionByValue(findTestObject('Customer/New - Main Data/select_Select OneBelum Tamat SDSederajatD1D_5f6d87'), 
    'S1', false)
WebUI.selectOptionByValue(findTestObject('Customer/New - Main Data/select_Select OneBudhaHINDUIslamKATOLIKKONF_03ebe1'), 
    'KRISTEN', false)
WebUI.scrollToElement(findTestObject('Customer/New - Main Data/input_Mobile Phone 1_txtMblPhn1'), 0)
WebUI.delay(1)
WebUI.setText(findTestObject('Customer/New - Main Data/input_Mobile Phone 1_txtMblPhn1'), mobilePhone)
WebUI.scrollToElement(findTestObject('Customer/New - Main Data/input_-_lb_Form_SaveCont_MainData'), 0)
WebUI.click(findTestObject('Customer/New - Main Data/input_-_lb_Form_SaveCont_MainData'))
WebUI.delay(1)


//ADDING CUSTOMER ADDRESS==========================================================================================================================================================================
//adding address legal
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Address/a_Add'), 20)
WebUI.click(findTestObject('Object Repository/Customer/Address/a_Add'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Address/select_Select OneLegal AddressCompany Addre_087cee'), 20)
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Address/select_Select OneLegal AddressCompany Addre_087cee'), 
    '1', false)
WebUI.setText(findTestObject('Object Repository/Customer/Address/textarea_Address_ucAddrtxtOfficeAddr'), address)
WebUI.setText(findTestObject('Object Repository/Customer/Address/input__ucAddrtxtRT'), rt)
WebUI.setText(findTestObject('Object Repository/Customer/Address/input__ucAddrtxtRW'), rw)
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Address/input_Zip Code_ucAddrucLookupZipCodeuclZipCodeimb'), 20)
WebUI.click(findTestObject('Object Repository/Customer/Address/input_Zip Code_ucAddrucLookupZipCodeuclZipCodeimb'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Customer/Address/input_Kelurahan_ucAddrucLookupZipCodeuclZip_f8e874'), kelurahanSearch)
WebUI.click(findTestObject('Object Repository/Customer/Address/a_SEARCH'))
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Address/a_Select (1)'), 20)
WebUI.click(findTestObject('Object Repository/Customer/Address/a_Select (1)'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Address/input_Customer does not have fixedline_ucAd_c408ee'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Address/input_Customer does not have fixedline_ucAd_c408ee'), 2)
WebUI.click(findTestObject('Object Repository/Customer/Address/input_Customer does not have fixedline_ucAd_c408ee'))
WebUI.scrollToElement(findTestObject('Object Repository/Customer/Address/input_Company Name_txtCoyName'), 0)
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Customer/Address/input_Company Name_txtCoyName'), company)
WebUI.scrollToElement(findTestObject('Object Repository/Customer/Address/a_Save'), 0)
WebUI.click(findTestObject('Object Repository/Customer/Address/a_Save'))
WebUI.delay(1)

//adding address residence==========================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Address/a_Add'), 20)
WebUI.click(findTestObject('Object Repository/Customer/Address/a_Add'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Address/a_Copy Address'), 20)
WebUI.click(findTestObject('Object Repository/Customer/Address/a_Copy Address'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Address/select_Select OneLegal AddressCompany Addre_087cee'), 
    '3', false)
WebUI.setText(findTestObject('Object Repository/Customer/Address/input_Company Name_txtCoyName'), company)
//WebUI.setText(findTestObject('Object Repository/Customer/Address/input_Company Name_txtCoyName'), 'PT. Maju Sentosa')
WebUI.scrollToElement(findTestObject('Object Repository/Customer/Address/a_Save'), 0)
WebUI.click(findTestObject('Object Repository/Customer/Address/a_Save'))
WebUI.delay(1)

//adding address job==========================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Address/a_Add'), 20)
WebUI.click(findTestObject('Object Repository/Customer/Address/a_Add'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Address/select_Select OneLegal AddressResidence Address'), 20)
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Address/select_Select OneLegal AddressResidence Address'), 
    'LEGAL', false)
WebUI.click(findTestObject('Object Repository/Customer/Address/a_Copy Address'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Address/select_Select OneLegal AddressCompany Addre_087cee'), 
    '4', false)
WebUI.setText(findTestObject('Object Repository/Customer/Address/input_Company Name_txtCoyName'), company)
//WebUI.setText(findTestObject('Object Repository/Customer/Address/input_Company Name_txtCoyName'), 'PT. Maju Sentosa')
WebUI.scrollToElement(findTestObject('Object Repository/Customer/Address/a_Save'), 0)
WebUI.click(findTestObject('Object Repository/Customer/Address/a_Save'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Address/input_-_lb_Form_SaveCont_CustAddress'), 20)
WebUI.click(findTestObject('Object Repository/Customer/Address/input_-_lb_Form_SaveCont_CustAddress'))
WebUI.delay(1)


//ADDING JOB DATA==========================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Job Data/input_-_lb_Form_SaveCont_Family'), 20)
WebUI.click(findTestObject('Object Repository/Customer/Job Data/input_-_lb_Form_SaveCont_Family'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Job Data/input_Profession Name_ucProfessionuclProfimb'), 20)
WebUI.click(findTestObject('Object Repository/Customer/Job Data/input_Profession Name_ucProfessionuclProfimb'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Customer/Job Data/input_Profession Name_ucProfessionuclProfum_dd689e'), 
    '%')
WebUI.click(findTestObject('Object Repository/Customer/Job Data/a_SEARCH'))
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Job Data/a_Select (1)'), 20)
WebUI.click(findTestObject('Object Repository/Customer/Job Data/a_Select (1)'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Job Data/input_Professional No_txtProfNo'), 20)
WebUI.setText(findTestObject('Object Repository/Customer/Job Data/input_Professional No_txtProfNo'), professionalNumber)
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Job Data/select_Select OneANGGOTA ORGANISASIBENDAHAR_32c9a4'), 
    'D', false)
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Job Data/select_Select OneCONTRACTOTHERSOWNERPERMANENT'), 
    'PERMANENT', false)
WebUI.click(findTestObject('Object Repository/Customer/Job Data/input_Industry Type Name_ucIndustryuclIndustryimb'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Customer/Job Data/input_Economic Sector Name_ucIndustryuclInd_9fd7c2'), 20)
WebUI.verifyElementPresent(findTestObject('Customer/Job Data/input_Economic Sector Name_ucIndustryuclInd_9fd7c2'), 2)
WebUI.setText(findTestObject('Object Repository/Customer/Job Data/input_Economic Sector Name_ucIndustryuclInd_9fd7c2'), 
    '%')
WebUI.click(findTestObject('Object Repository/Customer/Job Data/a_SEARCH_1'))
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Job Data/a_Select_1'), 20)
WebUI.click(findTestObject('Object Repository/Customer/Job Data/a_Select_1'))
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Job Data/select_LARGEMEDIUMSMALL'), 20)
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Job Data/select_LARGEMEDIUMSMALL'), 'MEDIUM', false)
WebUI.click(findTestObject('Object Repository/Customer/Job Data/input_Penanaman Modal Asing_rblInvestmentType'))
WebUI.setText(findTestObject('Object Repository/Customer/Job Data/input_Number Of Employee_txtNoOfEmp'), numEmployee)
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Job Data/select_Select OneJanuaryFebruaryMarchAprilM_0d1bbe'), 
    '1', false)
WebUI.setText(findTestObject('Object Repository/Customer/Job Data/input_Employment Establishment Date_ucEstab_03fc38'), 
    establishYear)
WebUI.click(findTestObject('Object Repository/Customer/Job Data/input_-_lb_Form_SaveCont_Job'))
WebUI.delay(1)


//ADDING EMERGENCY CONTACT==========================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Emergency Contact/a_Add'), 20)
WebUI.click(findTestObject('Object Repository/Customer/Emergency Contact/a_Add'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Emergency Contact/input_Name_txtEmergencyName'), 20)
WebUI.setText(findTestObject('Object Repository/Customer/Emergency Contact/input_Name_txtEmergencyName'), emContactName)
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Emergency Contact/select_Select OneBROTHERCHILDEMERGENCYFAMIL_277f94'), 
    'FATHER', false)
WebUI.setText(findTestObject('Object Repository/Customer/Emergency Contact/input_Mobile Phone 1_ucEmergencyContactInfo_7cb76e'), 
    emCustPhone)
WebUI.scrollToElement(findTestObject('Object Repository/Customer/Emergency Contact/textarea_Address_ucEmergencyAddrtxtOfficeAddr'), 
    0)
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Customer/Emergency Contact/textarea_Address_ucEmergencyAddrtxtOfficeAddr'), 
    address)
WebUI.setText(findTestObject('Object Repository/Customer/Emergency Contact/input__ucEmergencyAddrtxtRT'), rt)
WebUI.setText(findTestObject('Object Repository/Customer/Emergency Contact/input__ucEmergencyAddrtxtRW'), rw)
WebUI.click(findTestObject('Object Repository/Customer/Emergency Contact/input_Zip Code_ucEmergencyAddrucLookupZipCo_2d34e3'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Customer/Emergency Contact/input_Kelurahan_ucEmergencyAddrucLookupZipC_f7005e'), 
    kelurahanSearch)
WebUI.click(findTestObject('Object Repository/Customer/Emergency Contact/a_SEARCH'))
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Emergency Contact/a_Select (1)'), 20)
WebUI.click(findTestObject('Object Repository/Customer/Emergency Contact/a_Select (1)'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Customer/Emergency Contact/textarea_Address_ucEmergencyAddrtxtOfficeAddr'), 20)
WebUI.click(findTestObject('Customer/Emergency Contact/textarea_Address_ucEmergencyAddrtxtOfficeAddr'))
WebUI.delay(1)
WebUI.scrollToElement(findTestObject('Object Repository/Customer/Emergency Contact/a_Save'), 0)
WebUI.click(findTestObject('Object Repository/Customer/Emergency Contact/a_Save'))
WebUI.delay(1)


//ADDING FINANCIAL DATA==========================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Financial Data New/input_Gross Monthly Income_txt_CustFinData__30f5c6'), 20)
WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Gross Monthly Income_txt_CustFinData__30f5c6'), 
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Gross Monthly Income_txt_CustFinData__30f5c6'), 
	Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Gross Monthly Income_txt_CustFinData__30f5c6'), 
	monthlyIncome)
WebUI.delay(1)
WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Gross Profit_txt_CustFinData_GrossPro_b5b446'), 
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Gross Profit_txt_CustFinData_GrossPro_b5b446'), 
	Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Gross Profit_txt_CustFinData_GrossPro_b5b446'), 
	grossProfit)
WebUI.delay(1)
WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Living Cost_txt_CustFinData_LivingCos_80b94f'), 
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Living Cost_txt_CustFinData_LivingCos_80b94f'), 
	Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Living Cost_txt_CustFinData_LivingCos_80b94f'), 
	livingCost)
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Customer/Financial Data New/input__btnCalculate'))
WebUI.delay(2)

//Bank Account Normal==========================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Financial Data New/a_Add'), 20)
WebUI.click(findTestObject('Object Repository/Customer/Financial Data New/a_Add'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Financial Data New/select_Select OneALFINDO SEJAHTERA BANKALGE_184781'), 
    '9', false)
WebUI.setText(findTestObject('Object Repository/Customer/Financial Data New/input_Bank Branch_ucBankStatementCustBankAc_667f61'), 
    bankBranch)
WebUI.setText(findTestObject('Object Repository/Customer/Financial Data New/input_Bank Branch BI Code_ucBankStatementCu_451e6a'), 
    bankCode)
WebUI.setText(findTestObject('Object Repository/Customer/Financial Data New/input_Account Name_ucBankStatementCustBankA_ae9b92'), 
    custName)
WebUI.setText(findTestObject('Object Repository/Customer/Financial Data New/input_Account No_ucBankStatementCustBankAcc_1ef84e'), 
    accountNumber)
WebUI.click(findTestObject('Object Repository/Customer/Financial Data New/a_Save'))
WebUI.delay(1)

//Bank Account Siap Dana==========================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Financial Data New/a_Add'), 20)
WebUI.click(findTestObject('Object Repository/Customer/Financial Data New/a_Add'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Financial Data New/select_Select OneALFINDO SEJAHTERA BANKALGE_184781'),
	'9', false)
WebUI.setText(findTestObject('Object Repository/Customer/Financial Data New/input_Bank Branch_ucBankStatementCustBankAc_667f61'),
	bankBranch2)
WebUI.setText(findTestObject('Object Repository/Customer/Financial Data New/input_Bank Branch BI Code_ucBankStatementCu_451e6a'),
	bankCode)
WebUI.setText(findTestObject('Object Repository/Customer/Financial Data New/input_Account Name_ucBankStatementCustBankA_ae9b92'),
	custName)
WebUI.setText(findTestObject('Object Repository/Customer/Financial Data New/input_Account No_ucBankStatementCustBankAcc_1ef84e'),
	accountNumber)
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Financial Data New/New Folder/select_OtherSiap Dana'),
	'4138', false)
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Customer/Financial Data New/a_Save'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Customer/Financial Data New/input_-_lb_Form_SaveCont_FinancialData'))
WebUI.delay(1)


//ADDING OTHER ATTRIBUTES==========================================================================================================================================================================
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Other Attribute/input_Debitor Group_UCDebtGrpucBebtGroupimb'), 20)
WebUI.click(findTestObject('Object Repository/Customer/Other Attribute/input_Debitor Group_UCDebtGrpucBebtGroupimb'))
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Other Attribute/input_BI Code_UCDebtGrpucBebtGroupumdctl00u_f7ebbb'), 20)
WebUI.setText(findTestObject('Object Repository/Customer/Other Attribute/input_BI Code_UCDebtGrpucBebtGroupumdctl00u_f7ebbb'), 
    biCode)
WebUI.click(findTestObject('Object Repository/Customer/Other Attribute/a_SEARCH'))
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Other Attribute/a_Select'), 20)
WebUI.click(findTestObject('Object Repository/Customer/Other Attribute/a_Select'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Object Repository/Customer/Other Attribute/select_Select OneUsaha MikroUsaha KecilUsah_b2a708'), 20)
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Other Attribute/select_Select OneUsaha MikroUsaha KecilUsah_b2a708'), 
    '03', false)
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Customer/Other Attribute/input_-_lb_Form_Save_OtherAttribute'))
WebUI.delay(3)


//CHECK USER==========================================================================================================================================================================
//WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Check Customer/select_Select OnePersonalCompany'), 
//    'P', true)
//WebUI.setText(findTestObject('Object Repository/Customer/Check Customer/input_Customer Name_ucSearchtxtCustName_ltl_285ee7'), 
//    custName)
//WebUI.click(findTestObject('Object Repository/Customer/Check Customer/input_Address_ucSearchbtnSearch'))
//WebUI.delay(1)
//WebUI.click(findTestObject('Object Repository/Customer/Check Customer/input_Jalan Gatot Subroto 001 002 PANCORAN _dc5b2d'))
//WebUI.delay(2)
//WebUI.click(findTestObject('Object Repository/Customer/Check Customer/a_Cancel'))
//WebUI.delay(2)


//FINISH & CLOSE BROWSER==========================================================================================================================================================================
WebUI.closeBrowser()

