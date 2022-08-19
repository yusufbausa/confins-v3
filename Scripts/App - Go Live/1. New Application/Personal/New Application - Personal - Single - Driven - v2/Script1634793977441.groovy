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

//for excel csv save
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


//for accept alert
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



//NEW APPLICATION RETAIL PERSONAL SINGLE ASSET
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()


//INPUT CREDENTIAL-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.setText(findTestObject('Login/username'), username)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)
	
	
//SELECT PROFILE-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Login/btn_select_profile'))
//WebUI.delay(1)
	
	
//MENU APPLICATION-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_menu'))
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/menu_new_application'))
//WebUI.delay(1)
	
	
//ADD NEW APPLICATION-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
void part_1() {

WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_add_new_app'))
//WebUI.delay(1)
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/image_select_product'))
WebUI.setText(findTestObject('New Application (NEW)/New Application - Customer/field_product_name'), productOffer)
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_search_product'))
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_select_product'))

WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/field_asset_number'))
WebUI.doubleClick(findTestObject('New Application (NEW)/New Application - Customer/field_asset_number'))
//WebUI.sendKeys(findTestObject('New Application (NEW)/New Application - Customer/field_asset_number'), Keys.chord(Keys.CONTROL + 'a'))
//WebUI.sendKeys(findTestObject('New Application (NEW)/New Application - Customer/field_asset_number'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('New Application (NEW)/New Application - Customer/field_asset_number'), assetAmount)

WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_next'))
WebUI.delay(1)
	
}
	
//SELECT CUSTOMER-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
void part_2() {

WebUI.scrollToElement(findTestObject('New Application (NEW)/New Application - Customer/image_select_customer'), 0)
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/image_select_customer'))

WebUI.setText(findTestObject('New Application (NEW)/New Application - Customer/field_customer_name'), custName)
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/New Application - Customer/select_customer_type'), 'P', false)
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_search_customer'))
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_select_customer'))

WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_save_continue_customer'))
WebUI.delay(1)
	
	
//SELECT GUARANTOR
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_save_continue_guarantor'))
WebUI.delay(1)
	
}
	
//ADD APPLICATION DATA-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
void part_3() {

WebUI.sendKeys(findTestObject('New Application (NEW)/Application Data/field_tenor'), Keys.chord(Keys.CONTROL + 'a'))
WebUI.sendKeys(findTestObject('New Application (NEW)/Application Data/field_tenor'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('New Application (NEW)/Application Data/field_tenor'), tenor)
WebUI.sendKeys(findTestObject('New Application (NEW)/Application Data/field_tenor'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('New Application (NEW)/Application Data/select_payment_frequency'))

WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Application Data/select_payment_frequency'), '1', false)
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Application Data/select_interest_margin'), 'FXD', false)
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Application Data/select_installment_scheme'), 'RF', false)
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Application Data/select_app_source'), 'DEALER', false)
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Application Data/select_wop'), 'ADBCA', false)
	
WebUI.scrollToElement(findTestObject('New Application (NEW)/Application Data/select_address_copy'), 2)

WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Application Data/select_address_copy'), '1', false)
WebUI.click(findTestObject('New Application (NEW)/Application Data/button_copy_address'))

WebUI.setText(findTestObject('New Application (NEW)/Application Data/field_phone_area'), phoneArea)
WebUI.setText(findTestObject('New Application (NEW)/Application Data/field_phone__number'), phoneNumber)
WebUI.setText(findTestObject('New Application (NEW)/Application Data/field_phone_ext'), phoneExt)

WebUI.scrollToElement(findTestObject('New Application (NEW)/Application Data/button_save_continue_app_data'), 0)
WebUI.click(findTestObject('New Application (NEW)/Application Data/button_save_continue_app_data'))
WebUI.delay(1)
	
}
	
//ADD ASSET DATA-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
void part_4() {

WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_add_asset'))
//WebUI.delay(1)

WebUI.click(findTestObject('New Application (NEW)/Asset Data/image_select_supplier_branch'))
WebUI.delay(1)

WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_supplier_branch_address'), suppBranchAddress)
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_search_supplier_branch'))
WebUI.delay(1)

WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_select_supplier_branch'))
WebUI.delay(1)

WebUI.click(findTestObject('New Application (NEW)/Asset Data/select_sales'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Asset Data/select_sales'), '47763', false)
WebUI.delay(1)

WebUI.click(findTestObject('New Application (NEW)/Asset Data/image_select_asset_name'))
WebUI.delay(1)

WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_asset_name'), assetName)
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_search_asset_name'))
WebUI.delay(1)

WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_select_asset_name'))
WebUI.delay(1)

WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_asset_price'), Keys.chord(Keys.CONTROL + 'a'))
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_asset_price'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_asset_price'), assetPrice)

WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_down_payment'), Keys.chord(Keys.CONTROL + 'a'))
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_down_payment'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_down_payment'), assetDP)
	
WebUI.scrollToElement(findTestObject('New Application (NEW)/Asset Data/field_no_mesin'), 0)
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_no_mesin'), noMesin)
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_no_rangka'), noRangka)
//WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_no_plat'), noPlat)
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Asset Data/select_asset_usage'), 'P', false)
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_manufacture_year'), manufYear)
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_made_in'), madeIN)

WebUI.scrollToElement(findTestObject('New Application (NEW)/Asset Data/button_save_asset'), 0)

WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_save_asset'))
WebUI.delay(1)
	
//asset registration
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_asset_registration'))
WebUI.delay(1)

WebUI.click(findTestObject('New Application (NEW)/Asset Data/option_self_usage'))	

WebUI.scrollToElement(findTestObject('New Application (NEW)/Asset Data/select_address_copy_source'), 2)
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Asset Data/select_address_copy_source'),'LEGAL', false)
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_copy_address'))
WebUI.delay(1)

WebUI.scrollToElement(findTestObject('New Application (NEW)/Asset Data/button_save_asset_registration'), 2)
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_save_asset_registration'))
WebUI.delay(1)

WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_save_continue_asset_data'))
WebUI.delay(1)
}
	
//ADD INSURANCE DATA---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
void part_5() {

WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_edit_insurance'))
WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('New Application (NEW)/Insurance Data/select_insurance_name'), insuranceType, false)
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Insurance Data/select_rate_type'), 'NG', false)
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Insurance Data/select_main_coverage_type'), 'ALL RISK', false)
WebUI.delay(1)

WebUI.click(findTestObject('New Application (NEW)/Insurance Data/input_SRCC_cblAddCvgTypeName2'))
WebUI.delay(1)

WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_next'))
WebUI.delay(1)

WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_calculate_insurance'))
WebUI.delay(3)

WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_save_insurance'))
WebUI.delay(1)

WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_next_save'))
WebUI.delay(1)

WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_save_continue_insurance'))
WebUI.delay(1)
	
}
	
//ADD LIFE INSURANCE DATA---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
void part_6() {

WebUI.click(findTestObject('New Application (NEW)/Insurance Data/check_cover_life_insurance'))
WebUI.delay(1)
WebUI.selectOptionByLabel(findTestObject('New Application (NEW)/Insurance Data/select_life_insurance_name'), lifeInsuranceType, false)
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/check_customer_insured'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Insurance Data/select_premium_payment_method'), 'FO', false)
WebUI.delay(1)

WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_save_continue_life_insurance'))
WebUI.delay(1)
	
}
	
//ADD FINANCIAL DATA---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//WebUI.click(findTestObject('New Application (NEW)/Financial Data/input_Percentage_rblProvisionType'))
//WebUI.sendKeys(findTestObject('New Application (NEW)/Financial Data/field_provision_amount'),
//    Keys.chord(Keys.CONTROL + 'a'))
//WebUI.sendKeys(findTestObject('New Application (NEW)/Financial Data/field_provision_amount'),
//    Keys.chord(Keys.DELETE))
//WebUI.sendKeys(findTestObject('New Application (NEW)/Financial Data/field_provision_amount'),
//    provisionAmount)
//WebUI.delay(1)
	
void part_7() {

WebUI.click(findTestObject('New Application (NEW)/Financial Data/button_calculate_fee'))
WebUI.delay(1)

WebUI.click(findTestObject('New Application (NEW)/Financial Data/button_calculate'))
WebUI.delay(1)
	
WebUI.scrollToElement(findTestObject('New Application (NEW)/Financial Data/button_calculate_installment'), 0)
WebUI.click(findTestObject('New Application (NEW)/Financial Data/button_calculate_installment'))
WebUI.delay(1)

WebUI.scrollToElement(findTestObject('New Application (NEW)/Financial Data/button_save_continue_fin_data'), 30)
WebUI.click(findTestObject('New Application (NEW)/Financial Data/button_save_continue_fin_data'))
WebUI.delay(1)
	
	
//ADD COMISSION DATA---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('New Application (NEW)/Financial Data/button_save_continue_comm_data'))
WebUI.delay(1)
	
	
//ADD OTHER DATA---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('New Application (NEW)/Financial Data/button_save_continue_otherr_data'))
WebUI.delay(1)
	
}
	
//ADD OTHER INFO---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
void part_8() {

WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Other Data and Term n Condition/select_contract_employee_less_than_tenor'), 'No', false)
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Other Data and Term n Condition/select_rental_business_without_vehicle'), 'No', false)
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Other Data and Term n Condition/select_asset_for_online_transport'), 'No', false)
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Other Data and Term n Condition/select_fraud_indication'), 'No', false)
WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_save_continue_other_info'))
WebUI.delay(1)
	
}
	
//ADD TERM & CONDITION---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
void part_9() {

WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/check_fc_ktp_pemohon'))
WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/check_fc_kk'))
WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/check_fc_ijin_praktek'))
WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/check_fc_npwp'))
WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/check_fc_rek_tabungan'))
WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/check_doc_kepemilikan_rumah_PBB'))
WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/check_cover_buku_tabungan'))
WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/check_kk_atas_nama_stnk'))
WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/check_fc_ktp_pemohon_2'))
WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_save_continue_term_condition'))
WebUI.delay(1)


//get app number
	String appNo = WebUI.getText(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Get App No/field_app_no'))


//write to sheet credit approval
	FileInputStream fileCopCan = new FileInputStream (new File("C:\\Data Test\\New Application\\Credit Approval\\Credit Approval Data - Personal.xlsx"));
	XSSFWorkbook workbookCopCan = new XSSFWorkbook(fileCopCan);
	XSSFSheet sheetCopCan = workbookCopCan.getSheet("QA - App Personal");
	
		sheetCopCan.getRow(1).createCell(8).setCellValue(appNo);
		fileCopCan.close();
	
	FileOutputStream outFileCopCan = new FileOutputStream (new File("C:\\Data Test\\New Application\\Credit Approval\\Credit Approval Data - Personal.xlsx"));
	workbookCopCan.write(outFileCopCan);
	outFileCopCan.close();



//write to sheet PO to Go Live
	FileInputStream fileSurvey = new FileInputStream (new File("C:\\Data Test\\New Application\\PO to Go Live\\PO to Go Live.xlsx"));
	XSSFWorkbook workbookSurvey = new XSSFWorkbook(fileSurvey);
	XSSFSheet sheetSurvey = workbookSurvey.getSheet("QA - app 1");
	
		sheetSurvey.getRow(1).createCell(8).setCellValue(appNo);
		fileSurvey.close();
	
	FileOutputStream outFileSurvey = new FileOutputStream (new File("C:\\Data Test\\New Application\\PO to Go Live\\PO to Go Live.xlsx"));
	workbookSurvey.write(outFileSurvey);
	outFileSurvey.close();

	
}
	
//SUBMIT APPLICATION---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
void part_10() {

	
//Get running Driver
WebDriver myDriver = DriverFactory.getWebDriver()
	
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_submit_app'), 30)
WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_submit_app'))
WebUI.verifyAlertPresent(0)
WebUI.acceptAlert()
WebUI.delay(5)

//Accept alert
//myDriver.switchTo().alert().accept();

//WebUI.delay(5)




//write status to excel file
	String dataRow = dataRow;
	int rowData = Integer.parseInt(dataRow)

	FileInputStream file = new FileInputStream (new File("C:\\Data Test\\New Application\\Personal\\New Application - Personal - Single.xlsx"));
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	XSSFSheet sheet = workbook.getSheet("QA - App Personal 5");
	
	'Read data from excel'
//	String Data_fromCell=sheet.getRow(7).getCell(33).getStringCellValue("");
	
	'Write data to excel'
//	sheet.createRow(dataRow);
	sheet.getRow(rowData).createCell(0).setCellValue("Passed");
	file.close();
	
	FileOutputStream outFile = new FileOutputStream (new File("C:\\Data Test\\New Application\\Personal\\New Application - Personal - Single.xlsx"));
	workbook.write(outFile);
	outFile.close();
	
}
	
	
//call the class
part_1()
part_2()
part_3()
part_4()
part_5()
part_6()
part_7()
part_8()
part_9()
part_10()
	
	
//CLOSE BROWSER---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.closeBrowser()
