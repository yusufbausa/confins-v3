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
WebUI.setText(findTestObject('Login/username'), usernameDeskColl)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//select role desk collection
WebUI.click(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO Approval/select_role_desk_coll'))
WebUI.delay(1)


//select menu collection escalate bucket approval from things to do
WebUI.click(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO Approval/btn_coll_esc_bucket_appr'))
WebUI.delay(1)


//input cust credential
WebUI.setText(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO Approval/field_agree_no'), 
    agreeNo)
WebUI.click(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO Approval/btn_search'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO Approval/btn_process_appr'))
WebUI.delay(1)


//escalate bucket approval process
WebUI.selectOptionByValue(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO Approval/select_action'), 
    'Approve', false)
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO Approval/field_notes'), 
    notes)
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO Approval/btn_submit_appr'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

