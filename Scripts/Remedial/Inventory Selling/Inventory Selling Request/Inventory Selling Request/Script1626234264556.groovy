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
WebUI.setText(findTestObject('Login/username'), 'BES0097')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//select role (Jakarta Central Inventory)
WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Asset to Pool/button_select_role'), 20)
WebUI.scrollToElement(findTestObject('COLLECTION/Confirm Asset to Pool/button_select_role'), 0)
WebUI.click(findTestObject('COLLECTION/Confirm Asset to Pool/button_select_role'))
WebUI.delay(1)


WebUI.click(findTestObject('Object Repository/REMEDIAL/Inventory Selling/Inventory Selling Req/img_Welcome, BACHTERA ESPANALDY, JAKARTA CE_8175fc'))

WebUI.selectOptionByValue(findTestObject('Object Repository/REMEDIAL/Inventory Selling/Inventory Selling Req/select_LOAN ORIGINATIONACCOUNT'), 
    '402', false)

WebUI.click(findTestObject('Object Repository/REMEDIAL/Inventory Selling/Inventory Selling Req/a_Inventory Selling'))

WebUI.click(findTestObject('Object Repository/REMEDIAL/Inventory Selling/Inventory Selling Req/a_Inventory Selling Request'))

WebUI.setText(findTestObject('Object Repository/REMEDIAL/Inventory Selling/Inventory Selling Req/input_Agreement No_ucSearchtxtAgrmntNo_ltlAgrmntAgrmntNoSearch'), 
    '1919602247')

WebUI.click(findTestObject('Object Repository/REMEDIAL/Inventory Selling/Inventory Selling Req/input_Value must be Date Format_ucSearchbtnSearch'))

WebUI.click(findTestObject('Object Repository/REMEDIAL/Inventory Selling/Inventory Selling Req/input_MHKM5EA3JJK128869_gvGridctl02imbEdit'))

WebUI.setText(findTestObject('Object Repository/REMEDIAL/Inventory Selling/Inventory Selling Req/input_Delete_gvListBiddersctl02txtBidderName'), 
    'bidder name')

WebUI.setText(findTestObject('Object Repository/REMEDIAL/Inventory Selling/Inventory Selling Req/input_Delete_gvListBiddersctl02ucBiddAmttxtInput'), 
    '50000000')

WebUI.setText(findTestObject('Object Repository/REMEDIAL/Inventory Selling/Inventory Selling Req/input__gvListBiddersctl02ucBiddDttxtDatePicker'), 
    '06/03/2021')

WebUI.setText(findTestObject('Object Repository/REMEDIAL/Inventory Selling/Inventory Selling Req/input_Auction Fee_ucAuctionFeetxtInput'), 
    '5000000')

WebUI.click(findTestObject('Object Repository/REMEDIAL/Inventory Selling/Inventory Selling Req/input_Net Selling Amount_ucNetSellingAmttxtInput'))

WebUI.setText(findTestObject('Object Repository/REMEDIAL/Inventory Selling/Inventory Selling Req/input_Net Selling Amount_ucNetSellingAmttxtInput'), 
    '50000000')

WebUI.click(findTestObject('Object Repository/REMEDIAL/Inventory Selling/Inventory Selling Req/input_Value must be Date Format_gvListBidde_56d73b'))

WebUI.click(findTestObject('Object Repository/REMEDIAL/Inventory Selling/Inventory Selling Req/a_Calculate'))

WebUI.selectOptionByValue(findTestObject('Object Repository/REMEDIAL/Inventory Selling/Inventory Selling Req/select_Select OneINVENTORYDIRECT SELLINGOPE_1feb91'), 
    '463', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/REMEDIAL/Inventory Selling/Inventory Selling Req/select_Select OneTWA0223CC4'), 
    '28017', false)

WebUI.setText(findTestObject('Object Repository/REMEDIAL/Inventory Selling/Inventory Selling Req/textarea_Notes_ucApprovaltxtNotes'), 
    'notes')

WebUI.click(findTestObject('Object Repository/REMEDIAL/Inventory Selling/Inventory Selling Req/a_Submit'))

WebUI.closeBrowser()

