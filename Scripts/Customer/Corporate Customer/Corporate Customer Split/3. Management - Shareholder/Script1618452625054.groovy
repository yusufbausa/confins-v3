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

WebUI.setText(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 
    'ABW0572')
WebUI.setEncryptedText(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
    '8SQVv/p9jVScEs4/2CZsLw==')
WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Copyright  AdIns 2011. All Right Rese_ad9066'))


//ADD PERSONAL 1
WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/a_Add Personal'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Full Name_ucCustMainDataPersonalucLoo_d7bb5c'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Customer Name_ucCustMainDataPersonalu_720b39'), 
    'Patrick One')
WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/select_AllPersonal'), 
    'P', false)
WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/a_SEARCH'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/a_Select'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/select_Select OneANGGOTA ORGANISASIBENDAHAR_32c9a4'), 
    'D', true)
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Share ()_ucINSharePercentagePersonaltxtInput'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Share ()_ucINSharePercentagePersonaltxtInput'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Share ()_ucINSharePercentagePersonaltxtInput'), 
    '35')
WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/a_Save'))
WebUI.delay(1)


//ADD PERSONAL 2
WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/a_Add Personal'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Full Name_ucCustMainDataPersonalucLoo_d7bb5c'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Customer Name_ucCustMainDataPersonalu_720b39'), 
    'Patrick Two')
WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/select_AllPersonal'), 
    'P', true)
WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/a_SEARCH'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/a_Select_1'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/select_Select OneANGGOTA ORGANISASIBENDAHAR_32c9a4'), 
    'JPEXEC', true)
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Share ()_ucINSharePercentagePersonaltxtInput'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Share ()_ucINSharePercentagePersonaltxtInput'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Share ()_ucINSharePercentagePersonaltxtInput'), 
    '65')
WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/a_Save'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Corporate Customer/Management - Shareholder/input_Add Company_lb_Form_Continue_Management'))
WebUI.delay(3)


//CLOSING BROWSER
WebUI.closeBrowser()

