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
WebUI.setText(findTestObject('Login/username'), usernameApprARH)
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
WebUI.click(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO to FRO Approval/btn_menu_escalate_approval_arh'))
WebUI.delay(1)


//input cust credential
WebUI.setText(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO to FRO Approval/field_agree_no'), 
    agreeNo)
WebUI.click(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO to FRO Approval/btn_search'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO to FRO Approval/btn_escalate_process'))
WebUI.delay(1)


//escalate approval process
WebUI.selectOptionByValue(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO to FRO Approval/select_action'), 
    'Approve', false)
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO to FRO Approval/field_notes'), 
    'notes')
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/COLLECTION/Escalate Bucket/Escalate Bucket DERO to FRO Approval/btn_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

