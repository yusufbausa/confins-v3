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

//OPEN BROWSER================================================================================================================================================================
WebUI.openBrowser('')
WebUI.navigateToUrl('http://confins-uat.taf.co.id/confins/')
WebUI.maximizeWindow()
WebUI.delay(1)


//INPUT ADMIN CREDENTIAL================================================================================================================================================================
WebUI.setText(findTestObject('Login/username'), 'HMS1248')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//SELECT ROLE================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/FLEET/New Application - Customer/a_Select'))
WebUI.delay(3)


//INPUT APPLICATION DATA================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/FLEET/Application Data/input_MOU No_ucLookupMOUuclMOUimb'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/FLEET/Application Data/input_MOU No_ucLookupMOUuclMOUumdctl00ucSrp_0980e3'), 
    '0021MOU20201200014')
WebUI.click(findTestObject('Object Repository/FLEET/Application Data/a_SEARCH'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Application Data/a_Select (1)'))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Application Data/input_Tenor_ucINTenortxtInput'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Application Data/input_Tenor_ucINTenortxtInput'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Object Repository/FLEET/Application Data/input_Tenor_ucINTenortxtInput'), '36')
WebUI.delay(2)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Application Data/select_Select OneMONTHLYBIMONTHLYQuarterlyT_7ac454'), 
    '1', false)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Application Data/select_Select OneFixed RateFloat Rate'), 
    'FXD', false)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Application Data/select_Select OneRegular Fixed InstallmentI_6fe75a'), 
    'RF', false)
WebUI.delay(1)
WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Application Data/select_Select One18 JULI GIIAS 2019AAM VIRT_a6e317'), 0)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Application Data/select_Select One18 JULI GIIAS 2019AAM VIRT_a6e317'), 
    'DEALER', false)
WebUI.click(findTestObject('Object Repository/FLEET/Application Data/input_Yes_rblIsFudiciaCovered'))
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Application Data/select_Select OneAuto Debit AFIAuto Debit B_40b1f3'), 
    'ADBCA', false)
WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Application Data/select_Select OneLegal AddressCompany Addre_fd5966'), 0)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Application Data/select_Select OneLegal AddressCompany Addre_fd5966'), 
    '1', false)
WebUI.click(findTestObject('Object Repository/FLEET/Application Data/a_Copy Address'))
WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Application Data/input_-ext_ucAddrtxtPhnArea1'), 0)
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/FLEET/Application Data/input_-ext_ucAddrtxtPhnArea1'), '0548')
WebUI.setText(findTestObject('Object Repository/FLEET/Application Data/input_-ext_ucAddrtxtPhn1'), '26081')
WebUI.setText(findTestObject('Object Repository/FLEET/Application Data/input_-ext_ucAddrtxtPhoneExt1'), '678')
WebUI.scrollToElement(findTestObject('Object Repository/FLEET/Application Data/input_-_lb_Form_SaveCont'), 0)
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Application Data/input_-_lb_Form_SaveCont'))
WebUI.delay(3)


//CLOSE BROWSER================================================================================================================================================================
WebUI.closeBrowser()

