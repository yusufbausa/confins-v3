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

//OPEN BROWSER================================================================================================================================================================================================================================================================================================================
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()


//INPUT ADMIN CREDENTIAL================================================================================================================================================================================================================================================================================================================
WebUI.setText(findTestObject('Login/username'), usernameAppr2)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//SELECT ROLE SERVICE HEAD
WebUI.click(findTestObject('Object Repository/Overcredit/Amendment agr trf approval/select_role_ca'))
WebUI.delay(1)


//SELECT MENU AGREEMENT TRANSFER APPROVAL from THINGS TO DO
WebUI.click(findTestObject('Object Repository/Overcredit/Amendment agr trf approval/btn_menu_agrmnt_appr_ttd'))
WebUI.delay(1)


//INPUT CUST CREDENTIAL
WebUI.setText(findTestObject('Object Repository/Overcredit/Amendment agr trf approval/field_agrmnt_no'), agreeNo)
WebUI.click(findTestObject('Object Repository/Overcredit/Amendment agr trf approval/btn_search'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Overcredit/Amendment agr trf approval/btn_process_agrmnt'))
WebUI.delay(1)


//AGREEMENT TRANSFER APPROVAL PROCESS
WebUI.selectOptionByValue(findTestObject('Object Repository/Overcredit/Amendment agr trf approval/select_action_approve'), 
    'Approve', false)
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Overcredit/Amendment agr trf approval/field_notes'), 'notes')
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Overcredit/Amendment agr trf approval/btn_submit_approval'))
WebUI.delay(5)


//CLOSE BROWSER
WebUI.closeBrowser()
