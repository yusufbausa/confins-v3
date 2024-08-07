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


//OPEN BROWSER & HIT URL
WebUI.openBrowser('')
WebUI.navigateToUrl('http://confins-uat.taf.co.id/confins/')
WebUI.maximizeWindow()
WebUI.delay(2)


//INPUT CREDENTIAL---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
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


//ADDING NEW COMPANY CUSTOMER---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Object Repository/Corporate Customer/New - Main Data/a_Add Company Customer'))
WebUI.click(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Usaha Tidak Berbadan Hukum_rblCustModel'))
WebUI.setText(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Customer Name_ucCustMainInfotxt_Cust__01ad71'),
	'Nick Seven')
WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/New - Main Data/select_Select OneBadan Usaha Milik NegaraBa_146531'),
	'BUMS', false)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_NPWP_ucCustMainInfotxt_Cust_Npwp'),
	'12345987667')
WebUI.click(findTestObject('Object Repository/Corporate Customer/New - Main Data/a_Next'))
WebUI.delay(3)


//ADD CUSTOMER MAIN DATA---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Industry Type Name_ucLookupIndustryuclIndustryimb'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Industry Type Name_ucLookupIndustryuc_10aa69'),
	'%listrik%')
WebUI.click(findTestObject('Object Repository/Corporate Customer/New - Main Data/a_SEARCH'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Corporate Customer/New - Main Data/a_Select (1)'))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Number Of Employee_ucinNumOfEmptxtInput'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Number Of Employee_ucinNumOfEmptxtInput'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Number Of Employee_ucinNumOfEmptxtInput'),
	'1000')
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Establishment Date_ucDPEstablishmentD_d0d9ee'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Establishment Date_ucDPEstablishmentD_d0d9ee'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Establishment Date_ucDPEstablishmentD_d0d9ee'),
	'01/01/2006')
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Establishment Date_ucDPEstablishmentD_d0d9ee'),
	Keys.chord(Keys.ENTER))
WebUI.click(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_-_lb_Form_SaveCont_CustMainData'))
WebUI.delay(3)


//ADD CUSTOMER ADDRESS (LEGAL)---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Object Repository/Corporate Customer/Address/a_Add'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/Address/select_Select OneLegal AddressCompany Addre_087cee'),
	'1', false)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Address/textarea_Address_UCAddresstxtOfficeAddr'), 'Jalan Gatot Subroto')
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Address/input__UCAddresstxtRT'), '001')
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Address/input__UCAddresstxtRW'), '002')
WebUI.click(findTestObject('Object Repository/Corporate Customer/Address/input_Zip Code_UCAddressucLookupZipCodeuclZ_bb3e6e'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Address/input_Kelurahan_UCAddressucLookupZipCodeucl_96dda2'),
	'%pancoran%')
WebUI.click(findTestObject('Object Repository/Corporate Customer/Address/a_SEARCH'))
WebUI.click(findTestObject('Object Repository/Corporate Customer/Address/a_Select (1)'))
WebUI.delay(1)
WebUI.scrollToElement(findTestObject('Corporate Customer/Address/input_-ext_UCAddresstxtPhnArea1'), 0)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Address/input_-ext_UCAddresstxtPhnArea1'), '021')
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Address/input_-ext_UCAddresstxtPhn1'), '0812345')
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Address/input_-ext_UCAddresstxtPhoneExt1'), '678')
WebUI.scrollToElement(findTestObject('Corporate Customer/Address/a_Save'), 0)
WebUI.click(findTestObject('Object Repository/Corporate Customer/Address/a_Save'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Corporate Customer/Address/input_-_lb_Form_SaveCont_CustAddress'))
WebUI.delay(3)


//ADD MANAGEMENT - SHAREHOLDER (PERSONAL)---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//ADD PERSONAL 1
WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/a_Add Personal'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Full Name_ucCustMainDataPersonalucLoo_d7bb5c'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Customer Name_ucCustMainDataPersonalu_720b39'),
	'Patrick One')
WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/select_AllPersonal'),
	'P', false)
WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/a_SEARCH'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/a_Select'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/select_Select OneANGGOTA ORGANISASIBENDAHAR_32c9a4'),
	'D', false)
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Share ()_ucINSharePercentagePersonaltxtInput'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Share ()_ucINSharePercentagePersonaltxtInput'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Share ()_ucINSharePercentagePersonaltxtInput'),
	'35')
WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/a_Save'))
WebUI.delay(2)


//ADD PERSONAL 2
WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/a_Add Personal'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Full Name_ucCustMainDataPersonalucLoo_d7bb5c'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Customer Name_ucCustMainDataPersonalu_720b39'),
	'Patrick Two')
WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/select_AllPersonal'),
	'P', false)
WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/a_SEARCH'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/a_Select_1'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/select_Select OneANGGOTA ORGANISASIBENDAHAR_32c9a4'),
	'JPEXEC', false)
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Share ()_ucINSharePercentagePersonaltxtInput'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Share ()_ucINSharePercentagePersonaltxtInput'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Share ()_ucINSharePercentagePersonaltxtInput'),
	'65')
WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/a_Save'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Add Company_lb_Form_Continue_Management'))
WebUI.delay(3)


//ADD CONTACT INFORMATION---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Contact Information/input_Name_txt_CustEmergencyContact_Name'),
	'Patrick Two')
WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/Contact Information/select_Select OneANGGOTA ORGANISASIBENDAHAR_32c9a4'),
	'JPEXEC', false)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Contact Information/input_Mobile Phone 1_ucContactInfotxt_CustE_bdd5b9'),
	'08123456789')
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Contact Information/input_-_ucContactInfotxt_CustEmergencyCntct_1373c0'),
	'021')
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Contact Information/input_-_ucContactInfotxt_CustEmergencyCntct_Phn1'),
	'0812345')
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Contact Information/input_ext._ucContactInfotxt_CustEmergencyCn_c74a74'),
	'678')
WebUI.click(findTestObject('Object Repository/Corporate Customer/Contact Information/input_-_lb_Form_SaveCont_EmergencyContact'))
WebUI.delay(3)


//ADD FINANCIAL DATA---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Gross Monthly Income_txt_CustFinData__30f5c6'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Gross Monthly Income_txt_CustFinData__30f5c6'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Gross Monthly Income_txt_CustFinData__30f5c6'),
	'500000000')
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Gross Profit_txt_CustFinData_GrossPro_b5b446'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Gross Profit_txt_CustFinData_GrossPro_b5b446'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Gross Profit_txt_CustFinData_GrossPro_b5b446'),
	'350000000')
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Living Cost_txt_CustFinData_LivingCos_80b94f'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Living Cost_txt_CustFinData_LivingCos_80b94f'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Living Cost_txt_CustFinData_LivingCos_80b94f'),
	'200000000')
WebUI.click(findTestObject('Object Repository/Corporate Customer/Financial Data/input__btnCalculate'))
WebUI.delay(2)
WebUI.scrollToElement(findTestObject('Corporate Customer/Financial Data/a_Add'), 0)
WebUI.click(findTestObject('Object Repository/Corporate Customer/Financial Data/a_Add'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/Financial Data/select_Select OneALFINDO SEJAHTERA BANKALGE_184781'),
	'9', false)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Bank Branch_ucBankStatementCustBankAc_667f61'),
	'Senayan')
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Bank Branch BI Code_ucBankStatementCu_451e6a'),
	'12345')
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Account Name_ucBankStatementCustBankA_ae9b92'),
	'Nick Three')
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Account No_ucBankStatementCustBankAcc_1ef84e'),
	'123456789')
WebUI.click(findTestObject('Object Repository/Corporate Customer/Financial Data/a_Save'))
WebUI.delay(1)
WebUI.scrollToElement(findTestObject('Corporate Customer/Financial Data/input_-_lb_Form_SaveCont_FinancialData'), 0)
WebUI.click(findTestObject('Object Repository/Corporate Customer/Financial Data/input_-_lb_Form_SaveCont_FinancialData'))
WebUI.delay(3)


//ADD LEGAL DOCUMENT---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Object Repository/Corporate Customer/Legal Document/a_Add'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/Legal Document/select_Select OneAKTA PENDIRIANLAST AKTASiupTDP'),
	'AKTA', false)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Legal Document/input_Please select one_gvLegalDocumentctl0_b3d8b7'),
	'12345678987')
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Legal Document/input_concat(Only Number, Alphabet and , , _71437c'),
	'01/01/2006')
//WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Legal Document/input_concat(Only Number, Alphabet and , , _71437c'),
//	Keys.chord(Keys.ENTER))
WebUI.click(findTestObject('Object Repository/Corporate Customer/Legal Document/input__gvLegalDocumentctl02ucDPLegalDocDocExpiredDttxtDatePicker'))
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Legal Document/input__gvLegalDocumentctl02ucDPLegalDocDocExpiredDttxtDatePicker'),
	'01/01/2050')
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Legal Document/input__gvLegalDocumentctl02ucDPLegalDocDocExpiredDttxtDatePicker'),
	Keys.chord(Keys.ENTER))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Corporate Customer/Legal Document/input_-_lb_Form_SaveCont_LegalDocument'))
WebUI.delay(3)


//ADD OTHER ATTRIBUTE---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Object Repository/Corporate Customer/Other Attribute/input_Debitor Group_UCDebtGrpucBebtGroupimb'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Other Attribute/input_BI Code_UCDebtGrpucBebtGroupumdctl00u_f7ebbb'),
	'2540')
WebUI.click(findTestObject('Object Repository/Corporate Customer/Other Attribute/a_SEARCH'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Corporate Customer/Other Attribute/a_Select (1)'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/Other Attribute/select_Select OneUsaha MikroUsaha KecilUsah_b2a708'),
	'03', false)
WebUI.click(findTestObject('Object Repository/Corporate Customer/Other Attribute/input_-_lb_Form_SaveSubmit_OtherAttribute'))
WebUI.delay(5)


//CLOSING BROWSER---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.closeBrowser()



