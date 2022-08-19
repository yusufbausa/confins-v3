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


//NEW APPLICATION RETAIL PERSONAL SINGLE ASSET
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()


//INPUT CREDENTIAL-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.setText(findTestObject('Login/username'), usernameSVP)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)

//select role
WebUI.click(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO Request/select_national_svp_role'))
WebUI.delay(1)

//select menu supervisor activity
WebUI.click(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO Request/button_menu'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO Request/select_menu_collection'), 
    'COLLECTION', false)
WebUI.click(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO Request/select_menu_general'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO Request/btn_menu_spv_activity'))
WebUI.delay(1)


//input cust credential
WebUI.selectOptionByLabel(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO Request/select_coll_group'), 
    collGroup, false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO Request/select_coll_bucket_name'), 
    collBucketName, false)
WebUI.setText(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO Request/field_agree_no'), 
    agreeNo)
WebUI.click(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO Request/btn_search'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO Request/btn_escalate'))
WebUI.delay(1)


//escalate bucket request process
WebUI.takeScreenshot()
WebUI.selectOptionByLabel(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO Request/select_reason'), 
    reason, false)
WebUI.delay(1)
WebUI.selectOptionByLabel(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO Request/select_approved_by'), 
    approvedBy, false)
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO Request/field_notes'), 'catatan')
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO Request/btn_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

