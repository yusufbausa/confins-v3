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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import java.io.FileInputStream as FileInputStream
import java.io.FileNotFoundException as FileNotFoundException
import java.io.FileOutputStream as FileOutputStream
import java.io.IOException as IOException
import org.apache.poi.ss.usermodel.Cell as Cell
import org.apache.poi.ss.usermodel.Row as Row
import org.apache.poi.xssf.usermodel.XSSFCell as XSSFCell
import org.apache.poi.xssf.usermodel.XSSFCellStyle as XSSFCellStyle
import org.apache.poi.xssf.usermodel.XSSFRow as XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import java.lang.String as String

//NEW APPLICATION RETAIL PERSONAL SINGLE ASSET
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()


//INPUT CREDENTIAL-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.setText(findTestObject('Login/username'), usernameInquiry)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//select role
WebUI.click(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO Request/select_ar_head_role'))
WebUI.delay(1)


//select menu supervisor activity
WebUI.click(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO Request/button_menu'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO Request/select_menu_collection'), 
    'COLLECTION', false)
WebUI.click(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO Request/select_menu_general_dero_fro'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket Inquiry/btn_menu_escalate_bucket_inquiry'))
WebUI.delay(1)


//input cust credential
WebUI.setText(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket Inquiry/field_agree_no'), agreeNo)
WebUI.click(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket Inquiry/btn_search'))
WebUI.delay(1)


//inquiry process
WebUI.click(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket Inquiry/agree_no'))
WebUI.delay(1)
WebUI.switchToWindowIndex(1)
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket Inquiry/tab_collection'))
WebUI.delay(1)


//scrapping coll bucket name value
WebUI.click(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket Inquiry/field_coll_bucket_name'))
WebUI.sendKeys(findWindowsObject(null), Keys.chord(Keys.DOWN))
WebUI.delay(1)
def collBucketName = WebUI.getText(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket Inquiry/field_coll_bucket_name'))
WebUI.delay(1)


//scrapping last bucket activity value
WebUI.click(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket Inquiry/last_bucket_activity'))
WebUI.sendKeys(findWindowsObject(null), Keys.chord(Keys.DOWN))
WebUI.delay(1)
def lastBucketActivity = WebUI.getText(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket Inquiry/last_bucket_activity'))
WebUI.takeScreenshot()
WebUI.delay(3)


	//validate coll group name and last bucket activity
	if (collBucketName.contains('FIELD OFFICER') && lastBucketActivity.contains('FIELD OFFICER')) {
	    KeywordUtil.markPassed('Coll Bucket ' + collBucketName + ' & ' + 'Last Bucket Activity ' + lastBucketActivity + ' Bucket Destination Sesuai')
	} else if (collBucketName.contains('FIELD REPOSSESSION OFFICER') && lastBucketActivity.contains('FIELD REPOSSESSION OFFICER')) {
	    KeywordUtil.markPassed('Coll Bucket ' + collBucketName + ' & ' + 'Last Bucket Activity ' + lastBucketActivity + ' Bucket Destination Sesuai')
	} else if (collBucketName.contains('RECOVERY AND SOLUTION OFFICER') && lastBucketActivity.contains('RECOVERY AND SOLUTION OFFICER')) {
	    KeywordUtil.markPassed('Coll Bucket ' + collBucketName + ' & ' + 'Last Bucket Activity ' + lastBucketActivity + ' Bucket Destination Sesuai')
	} else {
	    KeywordUtil.markFailed('Coll Bucket ' + collBucketName + ' & ' + lastBucketActivity + ' Bucket Destination Tidak Sesuai')
	}

	
WebUI.closeWindowIndex(1)
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

