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
WebUI.navigateToUrl('http://confins-uat.taf.co.id/confins/')
WebUI.maximizeWindow()


//input credential
WebUI.setText(findTestObject('Login/username'), 'DSM0877')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//select role
//WebUI.click(findTestObject('Asset Document/Transfer/Doc Receives/a_Select'))


//select menu document receive
WebUI.click(findTestObject('Asset Document/Transfer/Doc Receives/img_Welcome, DAIRINA MANIK, JAKARTA NORTH, _fa0b52'))
WebUI.selectOptionByValue(findTestObject('Asset Document/Transfer/Doc Receives/select_menu_asset_document'), 
    '121', false)
WebUI.click(findTestObject('Asset Document/Transfer/Doc Receives/span_Asset Document_rtPlus'))
WebUI.click(findTestObject('Asset Document/Transfer/Doc Receives/a_Receive'))
WebUI.delay(2)


//input cust credential
WebUI.selectOptionByValue(findTestObject('Asset Document/Transfer/Doc Receives/select_Select OneBALIKPAPANBANDUNGBANJARMAS_cfef0d'), 
    '252', false)
WebUI.click(findTestObject('Asset Document/Transfer/Doc Receives/tr_Branch AgreementSelect OneBALIKPAPANBAND_2fc06d'))
WebUI.setText(findTestObject('Asset Document/Transfer/Doc Receives/input_Agreement No_ucSearchtxtAgrmntNo_ltlAgrmntAgrmntNo'), 
    '1910001495')
WebUI.click(findTestObject('Asset Document/Transfer/Doc Receives/input_Chasis No_ucSearchbtnSearch'))
WebUI.delay(1)
WebUI.click(findTestObject('Asset Document/Transfer/Doc Receives/input_-_gvAssetListctl02imbRcv'))


//document receive process
WebUI.setText(findTestObject('Asset Document/Transfer/Doc Receives/input_Received From_txtReceivedFrom'), 
    'tangerang')
WebUI.sendKeys(findTestObject('Asset Document/Transfer/Doc Receives/input_Asset Tax Date_ucTaxDatetxtDatePicker'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Asset Document/Transfer/Doc Receives/input_Asset Tax Date_ucTaxDatetxtDatePicker'),
Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('Asset Document/Transfer/Doc Receives/input_Asset Tax Date_ucTaxDatetxtDatePicker'), 
    '01/08/2021')
WebUI.click(findTestObject('Asset Document/Transfer/Doc Receives/input_RECEIVE_gvDocListctl01cbAll'))
WebUI.click(findTestObject('Asset Document/Transfer/Doc Receives/a_Submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

