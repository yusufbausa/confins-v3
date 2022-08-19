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
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()


//INPUT CREDENTIAL-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementClickable(findTestObject('Login/username'))
WebUI.setText(findTestObject('Login/username'), username)

WebUI.waitForElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementClickable(findTestObject('Login/password'))
WebUI.setText(findTestObject('Login/password'), password)

WebUI.waitForElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementClickable(findTestObject('Login/btn_login'))
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//SELECT PROFILE-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForElementPresent(findTestObject('Login/btn_select_profile'), 30)
WebUI.verifyElementPresent(findTestObject('Login/btn_select_profile'), 30)
WebUI.verifyElementClickable(findTestObject('Login/btn_select_profile'))
WebUI.click(findTestObject('Login/btn_select_profile'))
WebUI.delay(1)


//MENU APPLICATION-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

void part_1() {

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/New Application - Customer/button_menu'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/New Application - Customer/button_menu'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/New Application - Customer/button_menu'))
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_menu'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/New Application - Customer/menu_new_application'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/New Application - Customer/menu_new_application'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/New Application - Customer/menu_new_application'))
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/menu_new_application'))
WebUI.delay(1)


//ADD NEW APPLICATION-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForElementPresent(findTestObject('New Application (NEW)/New Application - Customer/button_add_new_app'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/New Application - Customer/button_add_new_app'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/New Application - Customer/button_add_new_app'))
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_add_new_app'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/New Application - Customer/image_select_product'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/New Application - Customer/image_select_product'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/New Application - Customer/image_select_product'))
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/image_select_product'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/New Application - Customer/field_product_name'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/New Application - Customer/field_product_name'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/New Application - Customer/field_product_name'))
WebUI.setText(findTestObject('New Application (NEW)/New Application - Customer/field_product_name'), productOffer)

WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_search_product'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/New Application - Customer/button_select_product'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/New Application - Customer/button_select_product'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/New Application - Customer/button_select_product'))
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_select_product'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/New Application - Customer/field_asset_number'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/New Application - Customer/field_asset_number'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/New Application - Customer/field_asset_number'))
WebUI.sendKeys(findTestObject('New Application (NEW)/New Application - Customer/field_asset_number'), Keys.chord(Keys.CONTROL + 'a'))
WebUI.sendKeys(findTestObject('New Application (NEW)/New Application - Customer/field_asset_number'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('New Application (NEW)/New Application - Customer/field_asset_number'), assetAmount)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/New Application - Customer/button_next'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/New Application - Customer/button_next'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/New Application - Customer/button_next'))
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_next'))
WebUI.delay(1)

}

//SELECT CUSTOMER-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

void part_2() {

WebUI.waitForElementPresent(findTestObject('Object Repository/New Application (NEW)/New Application - Customer/input_Personal_rblCustType'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/New Application (NEW)/New Application - Customer/input_Personal_rblCustType'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/New Application (NEW)/New Application - Customer/input_Personal_rblCustType'))
WebUI.click(findTestObject('Object Repository/New Application (NEW)/New Application - Customer/input_Personal_rblCustType'))

WebUI.scrollToElement(findTestObject('New Application (NEW)/New Application - Customer/image_select_customer'), 10)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/New Application - Customer/image_select_customer'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/New Application - Customer/image_select_customer'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/New Application - Customer/image_select_customer'))
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/image_select_customer'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/New Application - Customer/field_customer_name'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/New Application - Customer/field_customer_name'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/New Application - Customer/field_customer_name'))
WebUI.setText(findTestObject('New Application (NEW)/New Application - Customer/field_customer_name'), custName)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/New Application - Customer/select_customer_type'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/New Application - Customer/select_customer_type'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/New Application - Customer/select_customer_type'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/New Application - Customer/select_customer_type'), 'C', false)

WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_search_customer'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/New Application - Customer/button_select_customer'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/New Application - Customer/button_select_customer'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/New Application - Customer/button_select_customer'))
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_select_customer'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/New Application - Customer/button_save_continue_customer'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/New Application - Customer/button_save_continue_customer'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/New Application - Customer/button_save_continue_customer'))
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_save_continue_customer'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/New Application - Customer/button_save_continue_guarantor'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/New Application - Customer/button_save_continue_guarantor'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/New Application - Customer/button_save_continue_guarantor'))
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_save_continue_guarantor'))
WebUI.delay(1)

}

//ADD APPLICATION DATA-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

void part_3() {

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Application Data/field_tenor'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Application Data/field_tenor'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Application Data/field_tenor'))
WebUI.sendKeys(findTestObject('New Application (NEW)/Application Data/field_tenor'), Keys.chord(Keys.CONTROL + 'a'))
WebUI.sendKeys(findTestObject('New Application (NEW)/Application Data/field_tenor'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('New Application (NEW)/Application Data/field_tenor'), tenor)
WebUI.sendKeys(findTestObject('New Application (NEW)/Application Data/field_tenor'), Keys.chord(Keys.ENTER))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Application Data/select_payment_frequency'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Application Data/select_payment_frequency'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Application Data/select_payment_frequency'))
WebUI.click(findTestObject('New Application (NEW)/Application Data/select_payment_frequency'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Application Data/select_payment_frequency'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Application Data/select_payment_frequency'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Application Data/select_payment_frequency'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Application Data/select_payment_frequency'), '1', false)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Application Data/select_interest_margin'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Application Data/select_interest_margin'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Application Data/select_interest_margin'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Application Data/select_interest_margin'), 'FXD', false)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Application Data/select_installment_scheme'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Application Data/select_installment_scheme'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Application Data/select_installment_scheme'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Application Data/select_installment_scheme'), 'RF', false)

//WebUI.click(findTestObject('New Application (NEW)/Application Data/input_Advance_rblFirstInstType'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Application Data/select_app_source'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Application Data/select_app_source'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Application Data/select_app_source'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Application Data/select_app_source'), 'DEALER', false)

//WebUI.click(findTestObject('New Application (NEW)/Application Data/input_Yes_rblIsFudiciaCovered'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Application Data/select_wop'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Application Data/select_wop'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Application Data/select_wop'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Application Data/select_wop'), 
    'ADBCA', false)
WebUI.delay(1)

//WebUI.scrollToElement(findTestObject('New Application (NEW)/Application Data/select_address_copy'), 
//    0)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Application Data/select_address_copy'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Application Data/select_address_copy'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Application Data/select_address_copy'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Application Data/select_address_copy'), '1', false)

WebUI.scrollToElement(findTestObject('New Application (NEW)/Application Data/button_copy_address'), 0)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Application Data/button_copy_address'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Application Data/button_copy_address'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Application Data/button_copy_address'))
WebUI.click(findTestObject('New Application (NEW)/Application Data/button_copy_address'))
//WebUI.setText(findTestObject('New Application (NEW)/Application Data/field_phone_area'), '0')
//WebUI.setText(findTestObject('New Application (NEW)/Application Data/field_phone__number'), '08123456789')
//WebUI.setText(findTestObject('New Application (NEW)/Application Data/field_phone_ext'), 
//    '0')

WebUI.scrollToElement(findTestObject('New Application (NEW)/Application Data/button_save_continue_app_data'), 10)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Application Data/button_save_continue_app_data'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Application Data/button_save_continue_app_data'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Application Data/button_save_continue_app_data'))
WebUI.click(findTestObject('New Application (NEW)/Application Data/button_save_continue_app_data'))
WebUI.delay(1)

}

//ADD ASSET DATA-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

void part_4() {

//adding asset 1
WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/button_add_asset'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/button_add_asset'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/button_add_asset'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_add_asset'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/image_select_supplier_branch'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/image_select_supplier_branch'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/image_select_supplier_branch'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/image_select_supplier_branch'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/field_supplier_branch_address'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/field_supplier_branch_address'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/field_supplier_branch_address'))
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_supplier_branch_address'), suppBranchAddress)

WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_search_supplier_branch'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/button_select_supplier_branch'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/button_select_supplier_branch'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/button_select_supplier_branch'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_select_supplier_branch'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/select_sales'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/select_sales'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/select_sales'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Asset Data/select_sales'), '47763', false)


WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/image_select_asset_name'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/image_select_asset_name'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/image_select_asset_name'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/image_select_asset_name'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/field_asset_name'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/field_asset_name'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/field_asset_name'))
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_asset_name'), assetName)

WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_search_asset_name'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/button_select_asset_name'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/button_select_asset_name'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/button_select_asset_name'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_select_asset_name'))


WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/field_asset_price'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/field_asset_price'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/field_asset_price'))
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_asset_price'), Keys.chord(Keys.CONTROL + 'a'))
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_asset_price'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_asset_price'), assetPrice)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/field_down_payment'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/field_down_payment'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/field_down_payment'))
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_down_payment'), Keys.chord(Keys.CONTROL + 'a'))
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_down_payment'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_down_payment'), assetDP)

WebUI.scrollToElement(findTestObject('New Application (NEW)/Asset Data/field_no_mesin'), 10)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/field_no_mesin'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/field_no_mesin'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/field_no_mesin'))
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_no_mesin'), noMesin)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/field_no_rangka'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/field_no_rangka'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/field_no_rangka'))
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_no_rangka'), noRangka)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/field_no_plat'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/field_no_plat'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/field_no_plat'))
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_no_plat'), noPlat)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/select_asset_usage'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/select_asset_usage'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/select_asset_usage'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Asset Data/select_asset_usage'), 'O', false)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/field_manufacture_year'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/field_manufacture_year'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/field_manufacture_year'))
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_manufacture_year'), manufYear)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/field_made_in'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/field_made_in'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/field_made_in'))
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_made_in'), madeIN)

WebUI.scrollToElement(findTestObject('New Application (NEW)/Asset Data/button_save_asset'), 0)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/button_save_asset'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/button_save_asset'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/button_save_asset'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_save_asset'))
WebUI.delay(1)

//asset registration
WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/button_asset_registration'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/button_asset_registration'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/button_asset_registration'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_asset_registration'))
//WebUI.click(findTestObject('New Application (NEW)/Asset Data/option_self_usage'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/input_Self Usage_rblAssetUser'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/input_Self Usage_rblAssetUser'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/input_Self Usage_rblAssetUser'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/input_Self Usage_rblAssetUser'))
WebUI.delay(1)

WebUI.scrollToElement(findTestObject('New Application (NEW)/Asset Data/select_address_copy_source'), 10)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/select_address_copy_source'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/select_address_copy_source'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/select_address_copy_source'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Asset Data/select_address_copy_source'), 'LEGAL', false)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/button_copy_address'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/button_copy_address'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/button_copy_address'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_copy_address'))

WebUI.scrollToElement(findTestObject('New Application (NEW)/Asset Data/button_save_asset_registration'), 0)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/button_save_asset_registration'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/button_save_asset_registration'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/button_save_asset_registration'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_save_asset_registration'))
WebUI.delay(1)


//adding asset 2
WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/button_add_asset'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/button_add_asset'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/button_add_asset'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_add_asset'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/image_select_supplier_branch'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/image_select_supplier_branch'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/image_select_supplier_branch'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/image_select_supplier_branch'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/field_supplier_branch_address'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/field_supplier_branch_address'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/field_supplier_branch_address'))
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_supplier_branch_address'), suppBranchAddress)

WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_search_supplier_branch'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/button_select_supplier_branch'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/button_select_supplier_branch'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/button_select_supplier_branch'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_select_supplier_branch'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/select_sales'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/select_sales'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/select_sales'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Asset Data/select_sales'), '47763', false)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/image_select_asset_name'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/image_select_asset_name'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/image_select_asset_name'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/image_select_asset_name'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/field_asset_name'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/field_asset_name'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/field_asset_name'))
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_asset_name'), assetName2)

WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_search_asset_name'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/button_select_asset_name'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/button_select_asset_name'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/button_select_asset_name'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_select_asset_name'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/field_asset_price'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/field_asset_price'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/field_asset_price'))
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_asset_price'), Keys.chord(Keys.CONTROL + 'a'))
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_asset_price'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_asset_price'), assetPrice2)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/field_down_payment'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/field_down_payment'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/field_down_payment'))
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_down_payment'), Keys.chord(Keys.CONTROL + 'a'))
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_down_payment'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_down_payment'), assetDP2)

WebUI.scrollToElement(findTestObject('New Application (NEW)/Asset Data/field_no_mesin'), 10)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/field_no_mesin'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/field_no_mesin'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/field_no_mesin'))
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_no_mesin'), noMesin2)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/field_no_rangka'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/field_no_rangka'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/field_no_rangka'))
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_no_rangka'), noRangka2)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/field_no_plat'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/field_no_plat'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/field_no_plat'))
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_no_plat'), noPlat2)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/select_asset_usage'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/select_asset_usage'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/select_asset_usage'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Asset Data/select_asset_usage'), 'O', false)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/field_manufacture_year'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/field_manufacture_year'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/field_manufacture_year'))
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_manufacture_year'), manufYear)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/field_made_in'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/field_made_in'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/field_made_in'))
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_made_in'), madeIN)

WebUI.scrollToElement(findTestObject('New Application (NEW)/Asset Data/button_save_asset'), 10)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/button_save_asset'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/button_save_asset'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/button_save_asset'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_save_asset'))
WebUI.delay(1)

//asset registration
WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/input_HJAasd79843946148648_gvAssetListctl02imbEdit_2'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/input_HJAasd79843946148648_gvAssetListctl02imbEdit_2'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/input_HJAasd79843946148648_gvAssetListctl02imbEdit_2'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/input_HJAasd79843946148648_gvAssetListctl02imbEdit_2'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/input_Self Usage_rblAssetUser'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/input_Self Usage_rblAssetUser'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/input_Self Usage_rblAssetUser'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/input_Self Usage_rblAssetUser'))
WebUI.delay(1)

WebUI.scrollToElement(findTestObject('New Application (NEW)/Asset Data/select_address_copy_source'), 10)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/select_address_copy_source'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/select_address_copy_source'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/select_address_copy_source'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Asset Data/select_address_copy_source'), 'LEGAL', false)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/button_copy_address'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/button_copy_address'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/button_copy_address'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_copy_address'))

WebUI.scrollToElement(findTestObject('New Application (NEW)/Asset Data/button_save_asset_registration'), 10)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/button_save_asset_registration'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/button_save_asset_registration'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/button_save_asset_registration'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_save_asset_registration'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/button_save_continue_asset_data'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/button_save_continue_asset_data'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/button_save_continue_asset_data'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_save_continue_asset_data'))
WebUI.delay(1)

}

//ADD INSURANCE DATA---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

void part_5() {

//insurance asset 1
WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Insurance Data/button_edit_insurance'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Insurance Data/button_edit_insurance'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Insurance Data/button_edit_insurance'))
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_edit_insurance'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Insurance Data/select_insurance_name'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Insurance Data/select_insurance_name'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Insurance Data/select_insurance_name'))
WebUI.selectOptionByLabel(findTestObject('New Application (NEW)/Insurance Data/select_insurance_name'), insuranceType, false)

//WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Insurance Data/select_insurance_name'), 30)
//WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Insurance Data/select_insurance_name'), 30)
//WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Insurance Data/select_insurance_name'))
//WebUI.selectOptionByLabel(findTestObject('New Application (NEW)/Insurance Data/select_insurance_name'), 'Insurance Scheme 1', false)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Insurance Data/select_rate_type'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Insurance Data/select_rate_type'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Insurance Data/select_rate_type'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Insurance Data/select_rate_type'), 'NG', false)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Insurance Data/select_main_coverage_type'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Insurance Data/select_main_coverage_type'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Insurance Data/select_main_coverage_type'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Insurance Data/select_main_coverage_type'), 'ALL RISK', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Insurance Data/input_SRCC_cblAddCvgTypeName2'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Insurance Data/input_SRCC_cblAddCvgTypeName2'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Insurance Data/input_SRCC_cblAddCvgTypeName2'))
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/input_SRCC_cblAddCvgTypeName2'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Insurance Data/button_next'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Insurance Data/button_next'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Insurance Data/button_next'))
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_next'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Insurance Data/button_calculate_insurance'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Insurance Data/button_calculate_insurance'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Insurance Data/button_calculate_insurance'))
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_calculate_insurance'))
WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Insurance Data/button_save_insurance'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Insurance Data/button_save_insurance'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Insurance Data/button_save_insurance'))
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_save_insurance'))
WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Insurance Data/button_next_save'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Insurance Data/button_next_save'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Insurance Data/button_next_save'))
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_next_save'))
WebUI.delay(3)
//WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_save_continue_insurance'))
//WebUI.delay(3)

//insurance asset 2
WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Insurance Data/input_E 8723 IKI_gvEntryInsctl02imbEdit_2'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Insurance Data/input_E 8723 IKI_gvEntryInsctl02imbEdit_2'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Insurance Data/input_E 8723 IKI_gvEntryInsctl02imbEdit_2'))
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/input_E 8723 IKI_gvEntryInsctl02imbEdit_2'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Insurance Data/select_insurance_name'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Insurance Data/select_insurance_name'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Insurance Data/select_insurance_name'))
WebUI.selectOptionByLabel(findTestObject('New Application (NEW)/Insurance Data/select_insurance_name'), insuranceType, false)

//WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Insurance Data/select_insurance_name'), 30)
//WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Insurance Data/select_insurance_name'), 30)
//WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Insurance Data/select_insurance_name'))
//WebUI.selectOptionByLabel(findTestObject('New Application (NEW)/Insurance Data/select_insurance_name'), 'Insurance Scheme 1', false)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Insurance Data/select_rate_type'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Insurance Data/select_rate_type'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Insurance Data/select_rate_type'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Insurance Data/select_rate_type'), 'NG', false)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Insurance Data/select_main_coverage_type'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Insurance Data/select_main_coverage_type'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Insurance Data/select_main_coverage_type'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Insurance Data/select_main_coverage_type'), 'ALL RISK', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Insurance Data/input_SRCC_cblAddCvgTypeName2'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Insurance Data/input_SRCC_cblAddCvgTypeName2'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Insurance Data/input_SRCC_cblAddCvgTypeName2'))
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/input_SRCC_cblAddCvgTypeName2'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Insurance Data/button_next'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Insurance Data/button_next'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Insurance Data/button_next'))
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_next'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Insurance Data/button_calculate_insurance'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Insurance Data/button_calculate_insurance'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Insurance Data/button_calculate_insurance'))
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_calculate_insurance'))
WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Insurance Data/button_save_insurance'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Insurance Data/button_save_insurance'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Insurance Data/button_save_insurance'))
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_save_insurance'))
WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Insurance Data/button_next_save'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Insurance Data/button_next_save'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Insurance Data/button_next_save'))
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_next_save'))
WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Insurance Data/button_save_continue_insurance'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Insurance Data/button_save_continue_insurance'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Insurance Data/button_save_continue_insurance'))
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_save_continue_insurance'))
WebUI.delay(1)


//ADD LIFE INSURANCE DATA---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Insurance Data/button_save_continue_life_insurance'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Insurance Data/button_save_continue_life_insurance'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Insurance Data/button_save_continue_life_insurance'))
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_save_continue_life_insurance'))
WebUI.delay(1)

}

//ADD FINANCIAL DATA---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

void part_6() {

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Financial Data/button_calculate_fee'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Financial Data/button_calculate_fee'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Financial Data/button_calculate_fee'))
WebUI.click(findTestObject('New Application (NEW)/Financial Data/button_calculate_fee'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Financial Data/button_calculate'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Financial Data/button_calculate'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Financial Data/button_calculate'))
WebUI.click(findTestObject('New Application (NEW)/Financial Data/button_calculate'))

WebUI.scrollToElement(findTestObject('New Application (NEW)/Financial Data/button_calculate_installment'), 0)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Financial Data/button_calculate_installment'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Financial Data/button_calculate_installment'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Financial Data/button_calculate_installment'))
WebUI.click(findTestObject('New Application (NEW)/Financial Data/button_calculate_installment'))
WebUI.delay(5)

WebUI.scrollToElement(findTestObject('New Application (NEW)/Financial Data/button_save_continue_fin_data'), 0)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Financial Data/button_save_continue_fin_data'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Financial Data/button_save_continue_fin_data'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Financial Data/button_save_continue_fin_data'))
WebUI.click(findTestObject('New Application (NEW)/Financial Data/button_save_continue_fin_data'))
WebUI.delay(1)


//ADD COMISSION DATA---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Financial Data/button_save_continue_comm_data'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Financial Data/button_save_continue_comm_data'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Financial Data/button_save_continue_comm_data'))
WebUI.click(findTestObject('New Application (NEW)/Financial Data/button_save_continue_comm_data'))
WebUI.delay(1)


//ADD OTHER DATA---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Financial Data/button_save_continue_otherr_data'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Financial Data/button_save_continue_otherr_data'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Financial Data/button_save_continue_otherr_data'))
WebUI.click(findTestObject('New Application (NEW)/Financial Data/button_save_continue_otherr_data'))
WebUI.delay(1)

}

//ADD OTHER INFO---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

void part_7() {

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Other Data and Term n Condition/select_contract_employee_less_than_tenor'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Other Data and Term n Condition/select_contract_employee_less_than_tenor'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Other Data and Term n Condition/select_contract_employee_less_than_tenor'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Other Data and Term n Condition/select_contract_employee_less_than_tenor'), 
    'No', false)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Other Data and Term n Condition/select_rental_business_without_vehicle'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Other Data and Term n Condition/select_rental_business_without_vehicle'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Other Data and Term n Condition/select_rental_business_without_vehicle'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Other Data and Term n Condition/select_rental_business_without_vehicle'), 
    'No', false)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Other Data and Term n Condition/select_asset_for_online_transport'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Other Data and Term n Condition/select_asset_for_online_transport'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Other Data and Term n Condition/select_asset_for_online_transport'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Other Data and Term n Condition/select_asset_for_online_transport'), 
    'No', false)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Other Data and Term n Condition/select_fraud_indication'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Other Data and Term n Condition/select_fraud_indication'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Other Data and Term n Condition/select_fraud_indication'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Other Data and Term n Condition/select_fraud_indication'), 
    'No', false)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_save_continue_other_info'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_save_continue_other_info'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_save_continue_other_info'))
WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_save_continue_other_info'))
WebUI.delay(1)

}

//ADD TERM & CONDITION---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

void part_8() {

WebUI.waitForElementPresent(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_Yes_gvTermConditionctl02cbChecked'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_Yes_gvTermConditionctl02cbChecked'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_Yes_gvTermConditionctl02cbChecked'))
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_Yes_gvTermConditionctl02cbChecked'))

WebUI.waitForElementPresent(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_Yes_gvTermConditionctl03cbChecked'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_Yes_gvTermConditionctl03cbChecked'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_Yes_gvTermConditionctl03cbChecked'))
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_Yes_gvTermConditionctl03cbChecked'))

WebUI.waitForElementPresent(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_No_gvTermConditionctl04cbChecked'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_No_gvTermConditionctl04cbChecked'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_No_gvTermConditionctl04cbChecked'))
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_No_gvTermConditionctl04cbChecked'))

WebUI.waitForElementPresent(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_No_gvTermConditionctl05cbChecked'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_No_gvTermConditionctl05cbChecked'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_No_gvTermConditionctl05cbChecked'))
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_No_gvTermConditionctl05cbChecked'))

WebUI.waitForElementPresent(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_Yes_gvTermConditionctl06cbChecked'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_Yes_gvTermConditionctl06cbChecked'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_Yes_gvTermConditionctl06cbChecked'))
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_Yes_gvTermConditionctl06cbChecked'))

WebUI.waitForElementPresent(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_Yes_gvTermConditionctl07cbChecked'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_Yes_gvTermConditionctl07cbChecked'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_Yes_gvTermConditionctl07cbChecked'))
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_Yes_gvTermConditionctl07cbChecked'))

WebUI.waitForElementPresent(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_No_gvTermConditionctl08cbChecked'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_No_gvTermConditionctl08cbChecked'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_No_gvTermConditionctl08cbChecked'))
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_No_gvTermConditionctl08cbChecked'))

WebUI.waitForElementPresent(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_Yes_gvTermConditionctl09cbChecked'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_Yes_gvTermConditionctl09cbChecked'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_Yes_gvTermConditionctl09cbChecked'))
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_Yes_gvTermConditionctl09cbChecked'))

WebUI.waitForElementPresent(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_Yes_gvTermConditionctl10cbChecked'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_Yes_gvTermConditionctl10cbChecked'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_Yes_gvTermConditionctl10cbChecked'))
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_Yes_gvTermConditionctl10cbChecked'))

WebUI.waitForElementPresent(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_No_gvTermConditionctl11cbChecked'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_No_gvTermConditionctl11cbChecked'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_No_gvTermConditionctl11cbChecked'))
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_No_gvTermConditionctl11cbChecked'))

WebUI.waitForElementPresent(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_No_gvTermConditionctl12cbChecked'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_No_gvTermConditionctl12cbChecked'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_No_gvTermConditionctl12cbChecked'))
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_No_gvTermConditionctl12cbChecked'))

WebUI.waitForElementPresent(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_No_gvTermConditionctl13cbChecked'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_No_gvTermConditionctl13cbChecked'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_No_gvTermConditionctl13cbChecked'))
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_No_gvTermConditionctl13cbChecked'))

WebUI.waitForElementPresent(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_No_gvTermConditionctl14cbChecked'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_No_gvTermConditionctl14cbChecked'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_No_gvTermConditionctl14cbChecked'))
//WebUI.scrollToElement(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_No_gvTermConditionctl14cbChecked'), 0)
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Term n Condition - Corporate/input_No_gvTermConditionctl14cbChecked'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_save_continue_term_condition'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_save_continue_term_condition'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_save_continue_term_condition'))
//WebUI.scrollToElement(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_save_continue_term_condition'), 0)
WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_save_continue_term_condition'))
WebUI.delay(1)

}

//SAVE APPLICATION---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

void part_9() {

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_submit_app'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_submit_app'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_submit_app'))
WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_submit_app'))
WebUI.delay(1)
WebUI.acceptAlert()
WebUI.delay(5)

}


//CALL METHOD
part_1()
part_2()
part_3()
part_4()
part_5()
part_6()
part_7()
part_8()
part_9()

//CLOSE BROWSER---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.closeBrowser()

