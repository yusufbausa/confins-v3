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
	
	
//OPEN BROWSER & HIT URL==========================================================================================================================================================================
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()
//WebUI.delay(2)
	
	
//INPUT CREDENTIAL==========================================================================================================================================================================
WebUI.setText(findTestObject('Login/username'), username)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)
	
	
//SELEC PROFILE==========================================================================================================================================================================
WebUI.click(findTestObject('Login/btn_select_profile'))
//WebUI.delay(1)
	
	
//SELECT MENU CUSTOMER==========================================================================================================================================================================
WebUI.click(findTestObject('Customer/New - Main Data/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'))
//WebUI.delay(1)
WebUI.click(findTestObject('Customer/New - Main Data/a_Customer'))
//WebUI.delay(1)
WebUI.click(findTestObject('Customer/New - Main Data/a_Customer_1'))
//WebUI.delay(3)
	
	
//ADDING NEW COMPANY CUSTOMER==========================================================================================================================================================================
	
void part_1() {
WebUI.click(findTestObject('Object Repository/Corporate Customer/New - Main Data/a_Add Company Customer'))
WebUI.click(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Usaha Tidak Berbadan Hukum_rblCustModel'))
WebUI.setText(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Customer Name_ucCustMainInfotxt_Cust__01ad71'), custName)
WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/New - Main Data/select_Select OneBadan Usaha Milik NegaraBa_146531'), 'BUMS', false)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_NPWP_ucCustMainInfotxt_Cust_Npwp'), npwp)
WebUI.click(findTestObject('Object Repository/Corporate Customer/New - Main Data/a_Next'))
WebUI.delay(1)
	
}
	
//ADD CUSTOMER MAIN DATA==========================================================================================================================================================================
	
void part_2() {
WebUI.click(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Industry Type Name_ucLookupIndustryuclIndustryimb'))
WebUI.setText(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Industry Type Name_ucLookupIndustryuc_10aa69'), industryType)
WebUI.click(findTestObject('Object Repository/Corporate Customer/New - Main Data/a_SEARCH'))
WebUI.click(findTestObject('Object Repository/Corporate Customer/New - Main Data/a_Select (1)'))

WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Number Of Employee_ucinNumOfEmptxtInput'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Number Of Employee_ucinNumOfEmptxtInput'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Number Of Employee_ucinNumOfEmptxtInput'), employee)

WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Establishment Date_ucDPEstablishmentD_d0d9ee'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Establishment Date_ucDPEstablishmentD_d0d9ee'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Establishment Date_ucDPEstablishmentD_d0d9ee'), estDate)
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Establishment Date_ucDPEstablishmentD_d0d9ee'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_-_lb_Form_SaveCont_CustMainData'))
WebUI.delay(1)
	
}
	
//ADD CUSTOMER ADDRESS (LEGAL)==========================================================================================================================================================================
	
void part_3() {
WebUI.click(findTestObject('Object Repository/Corporate Customer/Address/a_Add'))
WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/Address/select_Select OneLegal AddressCompany Addre_087cee'), '1', false)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Address/textarea_Address_UCAddresstxtOfficeAddr'), address)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Address/input__UCAddresstxtRT'), rt)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Address/input__UCAddresstxtRW'), rw)
WebUI.click(findTestObject('Object Repository/Corporate Customer/Address/input_Zip Code_UCAddressucLookupZipCodeuclZ_bb3e6e'))
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Address/input_Kelurahan_UCAddressucLookupZipCodeucl_96dda2'), kelurahan)	
WebUI.click(findTestObject('Object Repository/Corporate Customer/Address/a_SEARCH'))
WebUI.click(findTestObject('Object Repository/Corporate Customer/Address/a_Select (1)'))

WebUI.scrollToElement(findTestObject('Corporate Customer/Address/input_-ext_UCAddresstxtPhnArea1'), 10)

WebUI.setText(findTestObject('Object Repository/Corporate Customer/Address/input_-ext_UCAddresstxtPhnArea1'), phoneArea)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Address/input_-ext_UCAddresstxtPhn1'), phoneNumber)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Address/input_-ext_UCAddresstxtPhoneExt1'), phoneExt)
WebUI.scrollToElement(findTestObject('Corporate Customer/Address/a_Save'), 10)


WebUI.click(findTestObject('Object Repository/Corporate Customer/Address/a_Save'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Corporate Customer/Address/input_-_lb_Form_SaveCont_CustAddress'))
WebUI.delay(1)
	
}
	
//ADD MANAGEMENT - SHAREHOLDER (PERSONAL)==========================================================================================================================================================================
	
void part_4() {
	
//ADD PERSONAL 1==========================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/a_Add Personal'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Full Name_ucCustMainDataPersonalucLoo_d7bb5c'))
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Customer Name_ucCustMainDataPersonalu_720b39'), shareName1)
WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/select_AllPersonal'), 'P', false)
WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/a_SEARCH'))
WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/a_Select'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/select_Select OneANGGOTA ORGANISASIBENDAHAR_32c9a4'), 'D', false)
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Share ()_ucINSharePercentagePersonaltxtInput'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Share ()_ucINSharePercentagePersonaltxtInput'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Share ()_ucINSharePercentagePersonaltxtInput'), '35')
WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/a_Save'))
WebUI.delay(1)
	
//ADD PERSONAL 2==========================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/a_Add Personal'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Full Name_ucCustMainDataPersonalucLoo_d7bb5c'))
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Customer Name_ucCustMainDataPersonalu_720b39'), shareName2)
WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/select_AllPersonal'), 'P', false)
WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/a_SEARCH'))
WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/a_Select_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/select_Select OneANGGOTA ORGANISASIBENDAHAR_32c9a4'), 'JPEXEC', false)
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Share ()_ucINSharePercentagePersonaltxtInput'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Share ()_ucINSharePercentagePersonaltxtInput'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Share ()_ucINSharePercentagePersonaltxtInput'), '65')

WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/a_Save'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Add Company_lb_Form_Continue_Management'))
WebUI.delay(1)
	
}
	
//ADD CONTACT INFORMATION==========================================================================================================================================================================
	
void part_5() {
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Contact Information/input_Name_txt_CustEmergencyContact_Name'), custEmergency)
WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/Contact Information/select_Select OneANGGOTA ORGANISASIBENDAHAR_32c9a4'), 'JPEXEC', false)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Contact Information/input_Mobile Phone 1_ucContactInfotxt_CustE_bdd5b9'), mobilePhone)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Contact Information/input_-_ucContactInfotxt_CustEmergencyCntct_1373c0'), phoneArea)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Contact Information/input_-_ucContactInfotxt_CustEmergencyCntct_Phn1'), phoneNumber)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Contact Information/input_ext._ucContactInfotxt_CustEmergencyCn_c74a74'), phoneExt)
WebUI.click(findTestObject('Object Repository/Corporate Customer/Contact Information/input_-_lb_Form_SaveCont_EmergencyContact'))
WebUI.delay(1)
	
}
	
//ADD FINANCIAL DATA==========================================================================================================================================================================
	
void part_6() {
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Gross Monthly Income_txt_CustFinData__30f5c6'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Gross Monthly Income_txt_CustFinData__30f5c6'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Gross Monthly Income_txt_CustFinData__30f5c6'), monthlyIncome)

WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Gross Profit_txt_CustFinData_GrossPro_b5b446'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Gross Profit_txt_CustFinData_GrossPro_b5b446'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Gross Profit_txt_CustFinData_GrossPro_b5b446'), grossProfit)

WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Living Cost_txt_CustFinData_LivingCos_80b94f'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Living Cost_txt_CustFinData_LivingCos_80b94f'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Living Cost_txt_CustFinData_LivingCos_80b94f'), livingCost)

WebUI.click(findTestObject('Object Repository/Corporate Customer/Financial Data/input__btnCalculate'))
WebUI.delay(1)
	
//Bank Account Normal==========================================================================================================================================================================
WebUI.scrollToElement(findTestObject('Corporate Customer/Financial Data/a_Add'), 10)

WebUI.click(findTestObject('Object Repository/Corporate Customer/Financial Data/a_Add'))
WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/Financial Data/select_Select OneALFINDO SEJAHTERA BANKALGE_184781'), '9', false)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Bank Branch_ucBankStatementCustBankAc_667f61'), 'Senayan')
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Bank Branch BI Code_ucBankStatementCu_451e6a'), '12345')
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Account Name_ucBankStatementCustBankA_ae9b92'), custName)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Account No_ucBankStatementCustBankAcc_1ef84e'), '123456789')
WebUI.click(findTestObject('Object Repository/Corporate Customer/Financial Data/a_Save'))
WebUI.delay(1)
	
	
//Bank Account Siap Dana==========================================================================================================================================================================
//WebUI.click(findTestObject('Object Repository/Corporate Customer/Financial Data/a_Add'))
//WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/Financial Data/select_Select OneALFINDO SEJAHTERA BANKALGE_184781'),
//	'9', false)
//WebUI.setText(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Bank Branch_ucBankStatementCustBankAc_667f61'),
//	'Kuningan')
//WebUI.setText(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Bank Branch BI Code_ucBankStatementCu_451e6a'),
//	'54321')
//WebUI.setText(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Account Name_ucBankStatementCustBankA_ae9b92'),
//	custName)
//WebUI.setText(findTestObject('Object Repository/Corporate Customer/Financial Data/input_Account No_ucBankStatementCustBankAcc_1ef84e'),
//	'987654321')
//WebUI.delay(1)
//WebUI.scrollToElement(findTestObject('Object Repository/Customer/Financial Data New/New Folder/select_OtherSiap Dana'), 0)
	
//	2)
//WebUI.click(findTestObject('Object Repository/Customer/Financial Data New/New Folder/select_OtherSiap Dana'))
//WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Financial Data New/New Folder/select_OtherSiap Dana'),
//	'4138', false)
//WebUI.click(findTestObject('Object Repository/Customer/Financial Data New/a_Save'))
//WebUI.delay(1)
WebUI.scrollToElement(findTestObject('Corporate Customer/Financial Data/input_-_lb_Form_SaveCont_FinancialData'), 10)

WebUI.click(findTestObject('Object Repository/Corporate Customer/Financial Data/input_-_lb_Form_SaveCont_FinancialData'))
WebUI.delay(1)
	
}
	
//ADD LEGAL DOCUMENT==========================================================================================================================================================================
	
void part_7() {
WebUI.click(findTestObject('Object Repository/Corporate Customer/Legal Document/a_Add'))
WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/Legal Document/select_Select OneAKTA PENDIRIANLAST AKTASiupTDP'), 'AKTA', false)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Legal Document/input_Please select one_gvLegalDocumentctl0_b3d8b7'), docNumber)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Legal Document/input_concat(Only Number, Alphabet and , , _71437c'), '01/01/2006')
//WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Legal Document/input_concat(Only Number, Alphabet and , , _71437c'),
//	Keys.chord(Keys.ENTER))
WebUI.click(findTestObject('Object Repository/Corporate Customer/Legal Document/input__gvLegalDocumentctl02ucDPLegalDocDocExpiredDttxtDatePicker'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Legal Document/input__gvLegalDocumentctl02ucDPLegalDocDocExpiredDttxtDatePicker'), '01/01/2050')
//WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Legal Document/input__gvLegalDocumentctl02ucDPLegalDocDocExpiredDttxtDatePicker'),
//	Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('Object Repository/Corporate Customer/Legal Document/a_Add'))
//WebUI.delay(1)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/Legal Document/Additional/select_Select OneAKTA PENDIRIANLAST AKTASiupTDP'), 'L_AKTA', false)
//WebUI.setText(findTestObject('Object Repository/Corporate Customer/Legal Document/Additional/input_Please select one_gvLegalDocumentctl0_b3d8b7'), docNumber)
//WebUI.setText(findTestObject('Object Repository/Corporate Customer/Legal Document/Additional/input_concat(Only Number, Alphabet and , , _71437c'), '10/10/2006')
//WebUI.click(findTestObject('Object Repository/Corporate Customer/Legal Document/Additional/input__gvLegalDocumentctl02ucDPLegalDocDocE_378404'))
//WebUI.delay(1)
//WebUI.setText(findTestObject('Object Repository/Corporate Customer/Legal Document/Additional/input__gvLegalDocumentctl02ucDPLegalDocDocE_378404'), '10/10/2050')
//WebUI.click(findTestObject('Object Repository/Corporate Customer/Legal Document/Additional/input_Value must be Date Format_gvLegalDocu_acc4f3'))
//
WebUI.click(findTestObject('Object Repository/Corporate Customer/Legal Document/input_-_lb_Form_SaveCont_LegalDocument'))
WebUI.delay(1)
	
}
	
//ADD OTHER ATTRIBUTE==========================================================================================================================================================================
	
void part_8() {
WebUI.click(findTestObject('Object Repository/Corporate Customer/Other Attribute/input_Debitor Group_UCDebtGrpucBebtGroupimb'))
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Other Attribute/input_BI Code_UCDebtGrpucBebtGroupumdctl00u_f7ebbb'), '2540')
WebUI.click(findTestObject('Object Repository/Corporate Customer/Other Attribute/a_SEARCH'))
WebUI.click(findTestObject('Object Repository/Corporate Customer/Other Attribute/a_Select (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/Other Attribute/select_Select OneUsaha MikroUsaha KecilUsah_b2a708'), '03', false)

WebUI.click(findTestObject('Object Repository/Corporate Customer/Other Attribute/input_-_lb_Form_SaveSubmit_OtherAttribute'))
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
	
//CLOSING BROWSER==========================================================================================================================================================================
WebUI.closeBrowser()
