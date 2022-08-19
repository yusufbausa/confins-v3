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

WebUI.openBrowser('')
WebUI.navigateToUrl('http://confins-uat.taf.co.id/confins/')


WebUI.setText(findTestObject('Object Repository/New Application (NEW)/Guarantor/Page_NEW CONFINS LOGIN PAGE/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 
    'ABW0572')
WebUI.setEncryptedText(findTestObject('Object Repository/New Application (NEW)/Guarantor/Page_NEW CONFINS LOGIN PAGE/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
    '8SQVv/p9jVScEs4/2CZsLw==')
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Guarantor/Page_NEW CONFINS LOGIN PAGE/input_Copyright  AdIns 2011. All Right Rese_ad9066'))
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Guarantor/Page_NEW CONFINS LOGIN PAGE/a_Select'))


WebUI.click(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/button_add_personal'))
WebUI.click(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/image_select_customer_name'))
WebUI.delay(1)
WebUI.setText(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/field_customer_name'), 
    'Patrick One')
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/select_customer_type'), 
    'P', false)
WebUI.click(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/button_search_customer_name'))
WebUI.delay(1)
WebUI.click(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/button_select_customer_name'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/select_customer_relationship'), 
    'GUARANTOR', false)
WebUI.click(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/button_save_guarantor'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Guarantor/Page_New Confins 1 - Main/input_-_lb_Form_SaveCont'))
WebUI.delay(3)


WebUI.closeBrowser()

