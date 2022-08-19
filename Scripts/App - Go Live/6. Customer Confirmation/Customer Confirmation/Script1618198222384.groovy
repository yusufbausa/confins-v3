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

//OPENING BROWSER
WebUI.openBrowser('')
WebUI.navigateToUrl('http://confins-uat.taf.co.id/confins/')
WebUI.maximizeWindow()


//INPUT CREDENTIAL
WebUI.setText(findTestObject('Login/username'), 'MST1760')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//ACCESS MENU CUSTOMER CONFIRMATION
WebUI.click(findTestObject('Object Repository/Customer Confirmation/img_Welcome, AMAN ASTARI, TANGERANG, Sales _473e4a'))
WebUI.click(findTestObject('Object Repository/Customer Confirmation/a_Customer Confirmation'))
WebUI.delay(3)


//INPUT CUSTOMER APP NUMBER
WebUI.setText(findTestObject('Object Repository/Customer Confirmation/input_Application No_ucSearchtxtAppNo_ltlAgrmntAppNo'), 
    '0037APP20210300430')
WebUI.click(findTestObject('Object Repository/Customer Confirmation/input_Task Claim By_ucSearchbtnSearch'))
WebUI.delay(1)


//CUSTOMER CONFIRMATION PROCESS
WebUI.click(findTestObject('Object Repository/Customer Confirmation/input_MULTIGUNA NON PAKET_gvCustConfirmatio_98963a'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Customer Confirmation/input_Contact Person Name_txtCntctPerson'), 'Yayan Ruhiyan')
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Confirmation/select_Select OneBROTHERCHILDEMERGENCYFAMIL_277f94'), 
    'FATHER', false)
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Customer Confirmation/input_Agreement Date_ucdpAgrmntDttxtDatePicker'), 
    '01/01/2021')
WebUI.sendKeys(findTestObject('Object Repository/Customer Confirmation/input_Agreement Date_ucdpAgrmntDttxtDatePicker'), 
    Keys.chord(Keys.ENTER))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Customer Confirmation/textarea_Notes_txtNotes'), 'Notes')
WebUI.click(findTestObject('Object Repository/Customer Confirmation/a_Submit'))
WebUI.delay(5)


//CLOSING BROWSER
WebUI.closeBrowser()

