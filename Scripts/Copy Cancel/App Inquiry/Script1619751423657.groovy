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
WebUI.navigateToUrl('http://confins-uat.taf.co.id/confins/')
WebUI.maximizeWindow()


//INPUT ADMIN CREDENTIAL================================================================================================================================================================================================================================================================================================================
WebUI.setText(findTestObject('Login/username'), 'ABW0572')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//SELECT ADMIN ROLE================================================================================================================================================================================================================================================================================================================
WebUI.click(findTestObject('Login/btn_select_profile'))
WebUI.delay(5)


//SELECT MENU APP INQUIRY================================================================================================================================================================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/COPY CANCEL/App Inquiry/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/COPY CANCEL/App Inquiry/span_Edit Application By SO_rtPlus'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/COPY CANCEL/App Inquiry/a_Application Inquiry'))
WebUI.delay(3)


//INPUT CUST CREDENTIAL================================================================================================================================================================================================================================================================================================================
WebUI.setText(findTestObject('Object Repository/COPY CANCEL/App Inquiry/input_Application No._ucSearchtxtAppNo_ltlAppAppNoSearch'), 
    '0021APP20210300050')
WebUI.click(findTestObject('Object Repository/COPY CANCEL/App Inquiry/input_Application Step_ucSearchbtnSearch'))
WebUI.delay(5)


//CLOSE BROWSER================================================================================================================================================================================================================================================================================================================
WebUI.closeBrowser()

