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
WebUI.setText(findTestObject('Login/username'), username)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//select role
WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Release/a_Select'), 20)
WebUI.click(findTestObject('Object Repository/Asset Document/Release/a_Select'))
WebUI.delay(1)


//select menu asset transfer
WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Transfer/Request/img_Welcome, SUGIHARTINI, TANGERANG, CUSTOM_4127e5'), 20)
WebUI.click(findTestObject('Object Repository/Asset Document/Transfer/Request/img_Welcome, SUGIHARTINI, TANGERANG, CUSTOM_4127e5'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/Asset Document/Transfer/Request/select_LOAN ORIGINATIONACCOUNT MAINTENANCEASSET DOCUMENT MANAGEMENTDISBURSEMENTAMENDMENTINSURANCEMARKETINGAPPLICATION FOUNDATIONLIFE INSURANCECOLLECTIONSMS'), 
    '121', false)
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Asset Document/Transfer/Request/span_Borrow_rtPlus'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Transfer/Request/a_Request'), 20)
WebUI.click(findTestObject('Object Repository/Asset Document/Transfer/Request/a_Request'))
WebUI.delay(1)


//input cust credential
WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Transfer/Request/input_Agreement No_ucSearchtxtAgrmntNo_ltlAgrmntAgrmntNo'), 20)
WebUI.setText(findTestObject('Object Repository/Asset Document/Transfer/Request/input_Agreement No_ucSearchtxtAgrmntNo_ltlAgrmntAgrmntNo'), 
    agreeNo)
WebUI.click(findTestObject('Object Repository/Asset Document/Transfer/Request/input_Main Document Status_ucSearchbtnSearch'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Transfer/Request/input_MAIN DOCUMENT STATUS_gvAssetListctl02_484916'), 20)
WebUI.click(findTestObject('Object Repository/Asset Document/Transfer/Request/input_MAIN DOCUMENT STATUS_gvAssetListctl02_484916'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Asset Document/Transfer/Request/a_Add to Temp'))
WebUI.click(findTestObject('Object Repository/Asset Document/Transfer/Request/a_Next'))
WebUI.delay(1)


//asset transfer process
WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Transfer/Request/select_Select OneBALIKPAPANBANDUNGBANJARMAS_cfef0d'), 20)
WebUI.selectOptionByValue(findTestObject('Object Repository/Asset Document/Transfer/Request/select_Select OneBALIKPAPANBANDUNGBANJARMAS_cfef0d'), 
    '219', false)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/Asset Document/Transfer/Request/select_Select OnePEMEKARAN WILAYAH CABANG P_d94ccf'), 
    '329', false)
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Object Repository/Asset Document/Transfer/Request/select_Select OneSUG0793'), 20)
//WebUI.verifyElementClickable(findTestObject('Object Repository/Asset Document/Transfer/Request/select_Select OneSUG0793'))
//WebUI.selectOptionByValue(findTestObject('Object Repository/Asset Document/Transfer/Request/select_Select OneSUG0793'), 
//    '314507', false)
WebUI.selectOptionByValue(findTestObject('Object Repository/Asset Document/Transfer/Request/select_Select OneSUG0793'), approvedBy, false)
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Asset Document/Transfer/Request/textarea_Notes_ucApprovaltxtNotes'), notes)
WebUI.click(findTestObject('Object Repository/Asset Document/Transfer/Request/a_Submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

