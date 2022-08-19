import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.keyword.builtin.CallTestCaseKeyword as CallTestCaseKeyword
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

// NEW APPLICATION RETAIL PERSONAL SINGLE ASSET
WebUI.openBrowser('')

WebUI.navigateToUrl(url)

WebUI.maximizeWindow()

//INPUT CREDENTIAL-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.setText(findTestObject('Login/username'), username)

WebUI.setText(findTestObject('Login/password'), password)

WebUI.click(findTestObject('Login/btn_login'))

//WebUI.delay(1)
//SELECT PROFILE-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Login/btn_select_profile'))

//WebUI.delay(1)
//MENU APPLICATION-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_menu'))

WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/menu_new_application')) 
//WebUI.delay(1)
//ADD NEW APPLICATION-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.delay(1)

//void part_1() {
    WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_add_new_app'))

    WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/image_select_product'))

    WebUI.setText(findTestObject('New Application (NEW)/New Application - Customer/field_product_name'), productOffer)

    WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_search_product'))

    WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_select_product'))

    WebUI.sendKeys(findTestObject('New Application (NEW)/New Application - Customer/field_asset_number'), Keys.chord(Keys.CONTROL + 
            'a'))

    WebUI.sendKeys(findTestObject('New Application (NEW)/New Application - Customer/field_asset_number'), Keys.chord(Keys.DELETE))

    WebUI.sendKeys(findTestObject('New Application (NEW)/New Application - Customer/field_asset_number'), assetAmount)

    if (assetAmount == 1) {
        WebUI.callTestCase(findTestCase('App - Go Live/1. New Application/Personal/New Application - Personal - Single - Driven - v2'), 
            [('custName') : custName, ('tenor') : tenor, ('phoneArea') : phoneArea, ('phoneNumber') : phoneNumber, ('phoneExt') : phoneExt
                , ('suppBranchAddress') : suppBranchAddress, ('assetName') : assetName, ('assetPrice') : assetPrice, ('assetDP') : assetDP
                , ('noMesin') : noMesin, ('noRangka') : noRangka, ('noPlat') : noPlat, ('manufYear') : manufYear, ('madeIN') : madeIN
                , ('provisionAmount') : provisionAmount, ('url') : url, ('insuranceType') : insuranceType, ('lifeInsuranceType') : lifeInsuranceType], 
            FailureHandling.STOP_ON_FAILURE)
    } else {
        WebUI.callTestCase(findTestCase('App - Go Live/1. New Application/Personal/New Application - Personal - Multi - Driven - v2'), 
            [('custName') : custName, ('tenor') : tenor, ('phoneArea') : phoneArea, ('phoneNumber') : phoneNumber, ('phoneExt') : phoneExt
                , ('suppBranchAddress') : suppBranchAddress, ('assetName') : assetName, ('assetPrice') : assetPrice, ('assetDP') : assetDP
                , ('noMesin') : noMesin, ('noRangka') : noRangka, ('noPlat') : noPlat, ('assetName2') : assetName2, ('assetPrice2') : assetPrice2
                , ('assetDP2') : assetDP2, ('noMesin2') : noMesin2, ('noRangka2') : noRangka2, ('noPlat2') : noRangka2, ('manufYear') : manufYear, ('madeIN') : madeIN
                , ('provisionAmount') : provisionAmount, ('url') : url, ('insuranceType') : insuranceType, ('lifeInsuranceType') : lifeInsuranceType], 
            FailureHandling.STOP_ON_FAILURE)
    }
    
    WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_next'))

    WebUI.delay(1)
//}

