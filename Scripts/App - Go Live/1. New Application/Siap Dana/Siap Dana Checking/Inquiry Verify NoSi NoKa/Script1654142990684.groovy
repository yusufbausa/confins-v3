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

import com.kms.katalon.core.util.KeywordUtil
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


//OPENING BROWSER
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()
	
	
//INPUT CREDENTIAL-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.setText(findTestObject('Login/username'), username)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)
	
	
//SELECT PROFILE-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Login/btn_select_profile'))
WebUI.delay(1)


//SELECT MENU APP INQUIRY
WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Inquiry Matching/btn_menu'))
WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Inquiry Matching/expand_menu_inquiry'))
WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Inquiry Matching/menu_inquiry'))
WebUI.delay(1)


//INPUT CUST CREDENTIAL
WebUI.setText(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Inquiry Matching/field_customer_name'), custName)
WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Inquiry Matching/btn_search'))
WebUI.delay(1)


//SCRAPPING APP REGULAR
WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Inquiry Matching/app_no_regular'))
WebUI.switchToWindowIndex(1)
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Inquiry Matching/tab_asset_data'))
WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Inquiry Matching/no_mesin_regular'), 5)
def nosi = WebUI.getText(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Inquiry Matching/no_mesin_regular'))
def noka = WebUI.getText(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Inquiry Matching/no_rangka_regular'))
WebUI.takeFullPageScreenshot()
WebUI.delay(1)

WebUI.closeWindowIndex(1)
WebUI.switchToWindowIndex(0)
WebUI.delay(1)


//SCRAPPING APP SIAP DANA 1
WebUI.scrollToElement(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Inquiry Matching/app_no_siapdana_1'), 0)
WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Inquiry Matching/app_no_siapdana_1'))
WebUI.switchToWindowIndex(1)
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Inquiry Matching/tab_asset_data'))
WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Inquiry Matching/no_mesin_siapdana_1'), 5)
def nosiSD1 = WebUI.getText(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Inquiry Matching/no_mesin_siapdana_1'))
def nokaSD1 = WebUI.getText(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Inquiry Matching/no_rangka_siapdana_1'))
WebUI.takeFullPageScreenshot()
WebUI.delay(1)

	if (nosiSD1.contains('SD1') && nokaSD1.contains('SD1')) {
		KeywordUtil.markPassed("NoSi & NoKa SD1 " + nosiSD1 + " & " + nokaSD1 + " have correct prefix")	
	} else {
		KeywordUtil.markFailed("NoSi & NoKa SD1 should use SD1 as prefix")
	}

WebUI.closeWindowIndex(1)
WebUI.switchToWindowIndex(0)
WebUI.delay(1)


//SCRAPPING APP SIAP DANA 2
WebUI.scrollToElement(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Inquiry Matching/app_no_siapdana_2'), 0)
WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Inquiry Matching/app_no_siapdana_2'))
WebUI.switchToWindowIndex(1)
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Inquiry Matching/tab_asset_data'))
WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Inquiry Matching/no_mesin_siapdana_1'), 5)

def nosiSD2 = WebUI.getText(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Inquiry Matching/no_mesin_siapdana_1'))
def nokaSD2 = WebUI.getText(findTestObject('Object Repository/SIAP DANA/Siap Dana Matching/Inquiry Matching/no_rangka_siapdana_1'))
WebUI.takeFullPageScreenshot()
WebUI.delay(1)

	if (nosiSD2.contains('SD1') && nokaSD2.contains('SD1')) {
		KeywordUtil.markPassed("NoSi & NoKa SD2 " + nosiSD2 + " & " + nokaSD2 + " have correct prefix")		
	} else {
		KeywordUtil.markFailed("NoSi & NoKa SD2 should use SD1 as prefix")
	}


	if (nosiSD1 == nosiSD2 && nokaSD1 == nokaSD2) {
		KeywordUtil.markPassed("NoSi SD1 " + nosiSD1 + " and " + " NoSi SD2 " + nosiSD2 + " have SD1 as prefix.")
		KeywordUtil.markPassed("NoKa SD1 " + nokaSD1 + " and " + " NoKa SD2 " + nokaSD2 + " have SD1 as prefix.")
		
	} else {
		KeywordUtil.markFailed("NoSi SD1 " + nosiSD1 + " and " + " NoSi SD2 " + nosiSD2 + " have different prefix.")
		KeywordUtil.markFailed("NoKa SD1 " + nokaSD1 + " and " + " NoKa SD2 " + nokaSD2 + " have different prefix.")
	}

WebUI.closeWindowIndex(1)
WebUI.delay(5)


//CLOSE BROWSER
WebUI.closeBrowser()

