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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell
import org.apache.poi.xssf.usermodel.XSSFCellStyle
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.lang.String
	
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
WebUI.click(findTestObject('Login/btn_select_profile'))
WebUI.delay(1)
	
	
//SELECT MENU CUSTOMER==========================================================================================================================================================================
WebUI.click(findTestObject('Customer/New - Main Data/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'))
WebUI.delay(1)
	
WebUI.click(findTestObject('Customer/New - Main Data/a_Customer'))
WebUI.delay(1)
	
WebUI.click(findTestObject('Customer/New - Main Data/a_Customer_1'))
WebUI.delay(1)
	
	
//ADDING NEW CUSTOMER==========================================================================================================================================================================
	
void part_1() {
	
WebUI.click(findTestObject('Customer/New - Main Data/a_Add Personal Customer'))
	
WebUI.setText(findTestObject('Customer/New - Main Data/input_Customer Name_txtCustName'), custName)
	
WebUI.selectOptionByValue(findTestObject('Customer/New - Main Data/select_Select OneAKTAKTPKIMSKITAPKITASKKNIK_89b50f'), 'KTP', false)
	
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
	
}
	
//ADDING MAIN DATA==========================================================================================================================================================================
	
void part_2() {
	
WebUI.selectOptionByValue(findTestObject('Customer/New - Main Data/select_Select OneMR.MRS.MS'), 'MR', false)
	
WebUI.setText(findTestObject('Customer/New - Main Data/input_Prefix Name_txtPrefixName'), prefixName)

WebUI.setText(findTestObject('Customer/New - Main Data/input_Customer Suffix Name_txtSuffixName'), suffixName)

WebUI.setText(findTestObject('Customer/New - Main Data/input_Nick Name_txtNickName'), nickName)

WebUI.selectOptionByValue(findTestObject('Customer/New - Main Data/select_Select OneDivorceMarriedSingle'), 'SIN', false)

WebUI.selectOptionByValue(findTestObject('Customer/New - Main Data/select_Select OneWNAWNI'), 'WNI', false)

WebUI.selectOptionByValue(findTestObject('Customer/New - Main Data/select_Select OneBelum Tamat SDSederajatD1D_5f6d87'),
	'S1', false)

WebUI.selectOptionByValue(findTestObject('Customer/New - Main Data/select_Select OneBudhaHINDUIslamKATOLIKKONF_03ebe1'),
	'KRISTEN', false)
//WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Customer/New - Main Data/input_Mobile Phone 1_txtMblPhn1'), 0)
WebUI.setText(findTestObject('Customer/New - Main Data/input_Mobile Phone 1_txtMblPhn1'), mobilePhone)

WebUI.scrollToElement(findTestObject('Customer/New - Main Data/input_-_lb_Form_SaveCont_MainData'), 0)
WebUI.click(findTestObject('Customer/New - Main Data/input_-_lb_Form_SaveCont_MainData'))
WebUI.delay(1)
	
}
	
//ADDING CUSTOMER ADDRESS==========================================================================================================================================================================
	
void part_3() {
	
//adding address legal
WebUI.click(findTestObject('Object Repository/Customer/Address/a_Add'))
WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Address/select_Select OneLegal AddressCompany Addre_087cee'),
	'1', false)

WebUI.setText(findTestObject('Object Repository/Customer/Address/textarea_Address_ucAddrtxtOfficeAddr'), address)

WebUI.setText(findTestObject('Object Repository/Customer/Address/input__ucAddrtxtRT'), rt)

WebUI.setText(findTestObject('Object Repository/Customer/Address/input__ucAddrtxtRW'), rw)

WebUI.click(findTestObject('Object Repository/Customer/Address/input_Zip Code_ucAddrucLookupZipCodeuclZipCodeimb'))
//WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Customer/Address/input_Kelurahan_ucAddrucLookupZipCodeuclZip_f8e874'), kelurahanSearch)

WebUI.click(findTestObject('Object Repository/Customer/Address/a_SEARCH'))

WebUI.click(findTestObject('Object Repository/Customer/Address/a_Select (1)'))

WebUI.click(findTestObject('Object Repository/Customer/Address/input_Customer does not have fixedline_ucAd_c408ee'))
	
WebUI.scrollToElement(findTestObject('Object Repository/Customer/Address/input_Company Name_txtCoyName'), 0)

WebUI.setText(findTestObject('Object Repository/Customer/Address/input_Company Name_txtCoyName'), company)
	
WebUI.scrollToElement(findTestObject('Object Repository/Customer/Address/a_Save'), 0)

WebUI.click(findTestObject('Object Repository/Customer/Address/a_Save'))
WebUI.delay(1)
	
//adding address residence==========================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/Customer/Address/a_Add'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Customer/Address/a_Copy Address'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Address/select_Select OneLegal AddressCompany Addre_087cee'),
	'3', false)

WebUI.setText(findTestObject('Object Repository/Customer/Address/input_Company Name_txtCoyName'), company)
//WebUI.setText(findTestObject('Object Repository/Customer/Address/input_Company Name_txtCoyName'), 'PT. Maju Sentosa')
WebUI.scrollToElement(findTestObject('Object Repository/Customer/Address/a_Save'), 0)

WebUI.click(findTestObject('Object Repository/Customer/Address/a_Save'))
WebUI.delay(1)
	
//adding address job==========================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/Customer/Address/a_Add'))
WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Address/select_Select OneLegal AddressResidence Address'),
	'LEGAL', false)

WebUI.click(findTestObject('Object Repository/Customer/Address/a_Copy Address'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Address/select_Select OneLegal AddressCompany Addre_087cee'),
	'4', false)

WebUI.setText(findTestObject('Object Repository/Customer/Address/input_Company Name_txtCoyName'), company)
//WebUI.setText(findTestObject('Object Repository/Customer/Address/input_Company Name_txtCoyName'), 'PT. Maju Sentosa')
WebUI.scrollToElement(findTestObject('Object Repository/Customer/Address/a_Save'), 0)

WebUI.click(findTestObject('Object Repository/Customer/Address/a_Save'))
//WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Customer/Address/input_-_lb_Form_SaveCont_CustAddress'))
WebUI.delay(1)
	
}
	
//ADDING JOB DATA==========================================================================================================================================================================
	
void part_4() {

WebUI.click(findTestObject('Object Repository/Customer/Job Data/input_-_lb_Form_SaveCont_Family'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Customer/Job Data/input_Profession Name_ucProfessionuclProfimb'))
//WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Customer/Job Data/input_Profession Name_ucProfessionuclProfum_dd689e'),
	'%')

WebUI.click(findTestObject('Object Repository/Customer/Job Data/a_SEARCH'))

WebUI.click(findTestObject('Object Repository/Customer/Job Data/a_Select (1)'))
//WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Customer/Job Data/input_Professional No_txtProfNo'), professionalNumber)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Job Data/select_Select OneANGGOTA ORGANISASIBENDAHAR_32c9a4'),
	'D', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Job Data/select_Select OneCONTRACTOTHERSOWNERPERMANENT'),
	'PERMANENT', false)

WebUI.click(findTestObject('Object Repository/Customer/Job Data/input_Industry Type Name_ucIndustryuclIndustryimb'))
//WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Customer/Job Data/input_Economic Sector Name_ucIndustryuclInd_9fd7c2'),
	'%')

WebUI.click(findTestObject('Object Repository/Customer/Job Data/a_SEARCH_1'))

WebUI.click(findTestObject('Object Repository/Customer/Job Data/a_Select_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Job Data/select_LARGEMEDIUMSMALL'), 'MEDIUM', false)

WebUI.click(findTestObject('Object Repository/Customer/Job Data/input_Penanaman Modal Asing_rblInvestmentType'))

WebUI.setText(findTestObject('Object Repository/Customer/Job Data/input_Number Of Employee_txtNoOfEmp'), numEmployee)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Job Data/select_Select OneJanuaryFebruaryMarchAprilM_0d1bbe'),
	'1', false)

WebUI.setText(findTestObject('Object Repository/Customer/Job Data/input_Employment Establishment Date_ucEstab_03fc38'),
	establishYear)

WebUI.click(findTestObject('Object Repository/Customer/Job Data/input_-_lb_Form_SaveCont_Job'))
WebUI.delay(1)
	
}
	
//ADDING EMERGENCY CONTACT==========================================================================================================================================================================
	
void part_5() {

WebUI.click(findTestObject('Object Repository/Customer/Emergency Contact/a_Add'))
WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Customer/Emergency Contact/input_Name_txtEmergencyName'), emContactName)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Emergency Contact/select_Select OneBROTHERCHILDEMERGENCYFAMIL_277f94'),
	'FATHER', false)

WebUI.setText(findTestObject('Object Repository/Customer/Emergency Contact/input_Mobile Phone 1_ucEmergencyContactInfo_7cb76e'),
	emCustPhone)

WebUI.scrollToElement(findTestObject('Object Repository/Customer/Emergency Contact/textarea_Address_ucEmergencyAddrtxtOfficeAddr'), 0)

WebUI.setText(findTestObject('Object Repository/Customer/Emergency Contact/textarea_Address_ucEmergencyAddrtxtOfficeAddr'),
	address)

WebUI.setText(findTestObject('Object Repository/Customer/Emergency Contact/input__ucEmergencyAddrtxtRT'), rt)

WebUI.setText(findTestObject('Object Repository/Customer/Emergency Contact/input__ucEmergencyAddrtxtRW'), rw)

WebUI.click(findTestObject('Object Repository/Customer/Emergency Contact/input_Zip Code_ucEmergencyAddrucLookupZipCo_2d34e3'))
//WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Customer/Emergency Contact/input_Kelurahan_ucEmergencyAddrucLookupZipC_f7005e'),
	kelurahanSearch)

WebUI.click(findTestObject('Object Repository/Customer/Emergency Contact/a_SEARCH'))

WebUI.click(findTestObject('Object Repository/Customer/Emergency Contact/a_Select (1)'))
//WebUI.delay(1)

WebUI.click(findTestObject('Customer/Emergency Contact/textarea_Address_ucEmergencyAddrtxtOfficeAddr'))
//WebUI.delay(1)
	
WebUI.scrollToElement(findTestObject('Object Repository/Customer/Emergency Contact/a_Save'), 10)
//WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Customer/Emergency Contact/a_Save'))
WebUI.delay(1)
	
}
	
//ADDING FINANCIAL DATA==========================================================================================================================================================================
	
void part_6() {

WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Gross Monthly Income_txt_CustFinData__30f5c6'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Gross Monthly Income_txt_CustFinData__30f5c6'),
	Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Gross Monthly Income_txt_CustFinData__30f5c6'),
	monthlyIncome)

WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Gross Profit_txt_CustFinData_GrossPro_b5b446'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Gross Profit_txt_CustFinData_GrossPro_b5b446'),
	Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Gross Profit_txt_CustFinData_GrossPro_b5b446'),
	grossProfit)

WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Living Cost_txt_CustFinData_LivingCos_80b94f'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Living Cost_txt_CustFinData_LivingCos_80b94f'),
	Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Customer/Financial Data New/input_Living Cost_txt_CustFinData_LivingCos_80b94f'),
	livingCost)

WebUI.click(findTestObject('Object Repository/Customer/Financial Data New/input__btnCalculate'))
WebUI.delay(1)
	
//Bank Account Normal==========================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/Customer/Financial Data New/a_Add'))
//WebUI.delay(1)

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
WebUI.click(findTestObject('Object Repository/Customer/Financial Data New/a_Add'))
//WebUI.delay(1)

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
//WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Customer/Financial Data New/a_Save'))
//WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Customer/Financial Data New/input_-_lb_Form_SaveCont_FinancialData'))
WebUI.delay(1)
	
}
	
//ADDING OTHER ATTRIBUTES==========================================================================================================================================================================
	
void part_7() {

WebUI.click(findTestObject('Object Repository/Customer/Other Attribute/input_Debitor Group_UCDebtGrpucBebtGroupimb'))

WebUI.setText(findTestObject('Object Repository/Customer/Other Attribute/input_BI Code_UCDebtGrpucBebtGroupumdctl00u_f7ebbb'),
	biCode)

WebUI.click(findTestObject('Object Repository/Customer/Other Attribute/a_SEARCH'))

WebUI.click(findTestObject('Object Repository/Customer/Other Attribute/a_Select'))
//WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Other Attribute/select_Select OneUsaha MikroUsaha KecilUsah_b2a708'),
	'03', false)
//WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Customer/Other Attribute/input_-_lb_Form_Save_OtherAttribute'))
WebUI.delay(5)

//write status to excel file
	String dataRow = dataRow;
	int rowData = Integer.parseInt(dataRow)

	FileInputStream file = new FileInputStream (new File("C:\\Data Test\\New Customer\\Data New Customer - Personal.xlsx"));
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	XSSFSheet sheet = workbook.getSheet("QA - Cust Per 8");
	
	'Read data from excel'
//	String Data_fromCell=sheet.getRow(7).getCell(33).getStringCellValue("");
	
	'Write data to excel'
//	sheet.createRow(dataRow);
	sheet.getRow(rowData).createCell(0).setCellValue("Passed");
	file.close();
	
	FileOutputStream outFile = new FileOutputStream (new File("C:\\Data Test\\New Customer\\Data New Customer - Personal.xlsx"));
	workbook.write(outFile);
	outFile.close();

	
}
	
part_1()
part_2()
part_3()
part_4()
part_5()
part_6()
part_7()
	
//FINISH & CLOSE BROWSER==========================================================================================================================================================================
WebUI.closeBrowser()
