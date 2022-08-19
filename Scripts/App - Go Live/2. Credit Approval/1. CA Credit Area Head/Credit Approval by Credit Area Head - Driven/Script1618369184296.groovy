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

//OPENING BROWSER------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()
WebUI.delay(1)


//INPUT CREDENTIAL------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.setText(findTestObject('Login/username'), usernameCAH)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//SELECTING PIC------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Object Repository/Credit Approval/Credit Approval by Credit Area Head/a_Select'))
WebUI.delay(5)


//ACCESSING MENU APPROVAL BY DECISION ENGINE------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Object Repository/Credit Approval/Credit Approval by Credit Area Head/img_Welcome, TENGKU IKA TIARA CHRISDI, TANG_390e37'))
WebUI.click(findTestObject('Object Repository/Credit Approval/Credit Approval by Credit Area Head/a_Credit Approval with Decision Engine'))
WebUI.delay(5)


//INPUTING CUSTOMER CREDENTIAL------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.setText(findTestObject('Object Repository/Credit Approval/Credit Approval by Credit Area Head/input_Application No._ucSearchtxtAppNo_ltlAppAppNo'), 
    appNumber)
WebUI.click(findTestObject('Object Repository/Credit Approval/Credit Approval by Credit Area Head/input_Value must be Date Format_ucSearchbtnSearch'))
WebUI.delay(3)


//APPROVAL PROCESS------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Object Repository/Credit Approval/Credit Approval by Credit Area Head/a_Process'))
WebUI.delay(3)
WebUI.scrollToElement(findTestObject('Credit Approval/Credit Approval by Credit Area Head/input_Customer Income_ucCustIncometxtInput'), 
    2)
WebUI.verifyElementPresent(findTestObject('Credit Approval/Credit Approval by Credit Area Head/input__lb_Form_CalcInstRatio'), 
    2)
WebUI.click(findTestObject('Object Repository/Credit Approval/Credit Approval by Credit Area Head/input__lb_Form_CalcInstRatio'))
WebUI.delay(5)
WebUI.scrollToElement(findTestObject('Credit Approval/Credit Approval by Credit Area Head/textarea_Syarat-Syarat_rptApvRcmndtnctl03tx_381452'), 
    0)
WebUI.verifyElementPresent(findTestObject('Credit Approval/Credit Approval by Credit Area Head/textarea_Syarat-Syarat_rptApvRcmndtnctl03tx_381452'), 
    2)
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Credit Approval/Credit Approval by Credit Area Head/textarea_Syarat-Syarat_rptApvRcmndtnctl03tx_381452'), 
    syarat2)
WebUI.delay(1)
//WebUI.scrollToElement(findTestObject('Object Repository/Credit Approval/Credit Approval by Credit Area Head/select_Select OneApproveRejectRequest'), 
//    2)
WebUI.selectOptionByValue(findTestObject('Object Repository/Credit Approval/Credit Approval by Credit Area Head/select_Select OneApproveRejectRequest'), 
    'Approve', false)
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Credit Approval/Credit Approval by Credit Area Head/textarea_Notes_txtNotes'), 
    notes)
WebUI.delay(3)
WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Approval/Credit Approval by Credit Area Head/a_Submit'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Approval/Credit Approval by Credit Area Head/a_Submit'), 2)
WebUI.verifyElementClickable(findTestObject('Object Repository/Credit Approval/Credit Approval by Credit Area Head/a_Submit'))
WebUI.click(findTestObject('Object Repository/Credit Approval/Credit Approval by Credit Area Head/a_Submit'))
WebUI.delay(5)


//CLOSING BROWSER------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.closeBrowser()

