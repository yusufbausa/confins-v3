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

//OPEN BROWSER & HIT URL
WebUI.openBrowser('')
WebUI.navigateToUrl('http://confins-uat.taf.co.id/confins/')
WebUI.maximizeWindow()
WebUI.delay(2)


//INPUT CREDENTIAL------------------------------------------------------------------------------------------------------------------------------
WebUI.setText(findTestObject('Login/username'), 'ABW0572')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//SELEC PROFILE------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Login/btn_select_profile'))
WebUI.delay(5)


//SELECT MENU CUSTOMER------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Customer/New - Main Data/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'))
WebUI.delay(1)
WebUI.click(findTestObject('Customer/New - Main Data/a_Customer'))
WebUI.delay(1)
WebUI.click(findTestObject('Customer/New - Main Data/a_Customer_1'))
WebUI.delay(3)


//ADDING NEW COMPANY CUSTOMER
WebUI.click(findTestObject('Object Repository/Corporate Customer/New - Main Data/a_Add Company Customer'))
WebUI.click(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Usaha Tidak Berbadan Hukum_rblCustModel'))
WebUI.setText(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Customer Name_ucCustMainInfotxt_Cust__01ad71'), 
    'Nick Four')
WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/New - Main Data/select_Select OneBadan Usaha Milik NegaraBa_146531'), 
    'BUMS', false)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_NPWP_ucCustMainInfotxt_Cust_Npwp'), 
    '12345987655')
WebUI.click(findTestObject('Object Repository/Corporate Customer/New - Main Data/a_Next'))


//INPUT MAIN DATA
WebUI.click(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Industry Type Name_ucLookupIndustryuclIndustryimb'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Industry Type Name_ucLookupIndustryuc_10aa69'), 
    '%listrik%')
WebUI.click(findTestObject('Object Repository/Corporate Customer/New - Main Data/a_SEARCH'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Corporate Customer/New - Main Data/a_Select (1)'))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Number Of Employee_ucinNumOfEmptxtInput'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Number Of Employee_ucinNumOfEmptxtInput'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Number Of Employee_ucinNumOfEmptxtInput'), 
    '1000')
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Establishment Date_ucDPEstablishmentD_d0d9ee'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Establishment Date_ucDPEstablishmentD_d0d9ee'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Establishment Date_ucDPEstablishmentD_d0d9ee'), 
    '01/01/2006')
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_Establishment Date_ucDPEstablishmentD_d0d9ee'), 
    Keys.chord(Keys.ENTER))
WebUI.click(findTestObject('Object Repository/Corporate Customer/New - Main Data/input_-_lb_Form_SaveCont_CustMainData'))


//CLOSING BROWSER
WebUI.closeBrowser()

