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

//open browser
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()


//input credential
WebUI.setText(findTestObject('Login/username'), usernameRSO)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//select role
WebUI.click(findTestObject('Collection Unblock/Collection Unblock Approval/select_role'))


//select menu 
WebUI.click(findTestObject('Collection Unblock/Collection Unblock Approval/btn_menu'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/Collection Unblock/Collection Unblock Approval/select_menu_collection'), 'COLLECTION', false)
WebUI.click(findTestObject('Object Repository/Collection Unblock/Collection Unblock Approval/menu_general'))
WebUI.click(findTestObject('Object Repository/Collection Unblock/Collection Unblock Approval/expand_menu_coll_unblock'))
WebUI.click(findTestObject('Collection Unblock/Collection Unblock Approval/btn_menu_coll_unblock_approval'))
WebUI.delay(1)


//input cust credential
WebUI.setText(findTestObject('Object Repository/Collection Unblock/Collection Unblock Approval/field_agreement_no'), agreeNo)
WebUI.click(findTestObject('Object Repository/Collection Unblock/Collection Unblock Approval/btn_search'))
WebUI.delay(1)
WebUI.click(findTestObject('Collection Unblock/Collection Unblock Approval/btn_process'))
WebUI.delay(1)


//coll unblock approval process
WebUI.selectOptionByValue(findTestObject('Object Repository/Collection Unblock/Collection Unblock Approval/select_action'), 
    'Approve', false)
WebUI.setText(findTestObject('Object Repository/Collection Unblock/Collection Unblock Approval/field_notes'), notes)

WebUI.click(findTestObject('Object Repository/Collection Unblock/Collection Unblock Approval/btn_submit'))
WebUI.delay(3)


//close browser
WebUI.closeBrowser()

