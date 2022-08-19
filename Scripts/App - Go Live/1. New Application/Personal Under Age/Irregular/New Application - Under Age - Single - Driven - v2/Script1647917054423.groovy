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

//OPENING BROWSER
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

void part_1() {

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/New Application - Customer/button_add_new_app'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/New Application - Customer/button_add_new_app'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/New Application - Customer/button_add_new_app'))
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_add_new_app'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/New Application - Customer/image_select_product'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/New Application - Customer/image_select_product'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/New Application - Customer/image_select_product'))
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/image_select_product'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/New Application - Customer/field_product_name'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/New Application - Customer/field_product_name'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/New Application - Customer/field_product_name'))
WebUI.setText(findTestObject('New Application (NEW)/New Application - Customer/field_product_name'), 
    productOffer)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/New Application - Customer/button_search_product'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/New Application - Customer/button_search_product'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/New Application - Customer/button_search_product'))
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_search_product'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/New Application - Customer/button_select_product'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/New Application - Customer/button_select_product'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/New Application - Customer/button_select_product'))
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_select_product'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/New Application - Customer/field_asset_number'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/New Application - Customer/field_asset_number'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/New Application - Customer/field_asset_number'))
WebUI.sendKeys(findTestObject('New Application (NEW)/New Application - Customer/field_asset_number'), 
    Keys.chord(Keys.CONTROL + 'a'))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('New Application (NEW)/New Application - Customer/field_asset_number'), 
    Keys.chord(Keys.DELETE))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('New Application (NEW)/New Application - Customer/field_asset_number'), 
    assetAmount)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/New Application - Customer/button_next'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/New Application - Customer/button_next'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/New Application - Customer/button_next'))
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_next'))
WebUI.delay(1)

}

//SELECT CUSTOMER-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

void part_2() {
	
WebUI.waitForElementPresent(findTestObject('New Application (NEW)/New Application - Customer/image_select_customer'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/New Application - Customer/image_select_customer'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/New Application - Customer/image_select_customer'))
WebUI.scrollToElement(findTestObject('New Application (NEW)/New Application - Customer/image_select_customer'), 0)
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/image_select_customer'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/New Application - Customer/field_customer_name'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/New Application - Customer/field_customer_name'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/New Application - Customer/field_customer_name'))
WebUI.setText(findTestObject('New Application (NEW)/New Application - Customer/field_customer_name'), 
    custName)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/New Application - Customer/select_customer_type'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/New Application - Customer/select_customer_type'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/New Application - Customer/select_customer_type'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/New Application - Customer/select_customer_type'), 'P', false)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/New Application - Customer/button_search_customer'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/New Application - Customer/button_search_customer'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/New Application - Customer/button_search_customer'))
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



//ADD GUARANTOR-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/button_add_personal'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/button_add_personal'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/button_add_personal'))
WebUI.click(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/button_add_personal'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/image_select_customer_name'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/image_select_customer_name'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/image_select_customer_name'))
WebUI.click(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/image_select_customer_name'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/field_customer_name'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/field_customer_name'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/field_customer_name'))
WebUI.setText(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/field_customer_name'),
	guarantorName)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/select_customer_type'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/select_customer_type'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/select_customer_type'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/select_customer_type'),
	'P', false)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/button_search_customer_name'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/button_search_customer_name'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/button_search_customer_name'))
WebUI.click(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/button_search_customer_name'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/button_select_customer_name'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/button_select_customer_name'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/button_select_customer_name'))
WebUI.click(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/button_select_customer_name'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/select_customer_relationship'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/select_customer_relationship'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/select_customer_relationship'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/select_customer_relationship'),
	'GUARANTOR', false)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/button_save_guarantor'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/button_save_guarantor'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/button_save_guarantor'))
WebUI.click(findTestObject('New Application (NEW)/Guarantor/Page_New Confins 1 - Main/button_save_guarantor'))
WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/New Application - Customer/button_save_continue_guarantor'), 50)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/New Application - Customer/button_save_continue_guarantor'), 50)
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
WebUI.delay(1)
WebUI.sendKeys(findTestObject('New Application (NEW)/Application Data/field_tenor'), Keys.chord(Keys.DELETE))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('New Application (NEW)/Application Data/field_tenor'), tenor)
WebUI.delay(1)
WebUI.sendKeys(findTestObject('New Application (NEW)/Application Data/field_tenor'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Application Data/select_payment_frequency'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Application Data/select_payment_frequency'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Application Data/select_payment_frequency'))
WebUI.click(findTestObject('New Application (NEW)/Application Data/select_payment_frequency'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Application Data/select_payment_frequency'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Application Data/select_payment_frequency'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Application Data/select_payment_frequency'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Application Data/select_payment_frequency'),
	'1', false)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Application Data/select_interest_margin'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Application Data/select_interest_margin'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Application Data/select_interest_margin'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Application Data/select_interest_margin'),
	'FXD', false)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Application Data/select_installment_scheme'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Application Data/select_installment_scheme'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Application Data/select_installment_scheme'))
WebUI.selectOptionByLabel(findTestObject('New Application (NEW)/Application Data/select_installment_scheme'),
	'Irregular Installment', false)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Application Data/select_app_source'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Application Data/select_app_source'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Application Data/select_app_source'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Application Data/select_app_source'),
	'DEALER', false)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Application Data/select_wop'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Application Data/select_wop'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Application Data/select_wop'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Application Data/select_wop'),
	'ADBCA', false)

WebUI.scrollToElement(findTestObject('New Application (NEW)/Application Data/select_address_copy'), 2)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Application Data/select_address_copy'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Application Data/select_address_copy'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Application Data/select_address_copy'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Application Data/select_address_copy'),
	'1', false)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Application Data/button_copy_address'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Application Data/button_copy_address'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Application Data/button_copy_address'))
WebUI.click(findTestObject('New Application (NEW)/Application Data/button_copy_address'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Application Data/field_phone_area'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Application Data/field_phone_area'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Application Data/field_phone_area'))
WebUI.setText(findTestObject('New Application (NEW)/Application Data/field_phone_area'), phoneArea)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Application Data/field_phone__number'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Application Data/field_phone__number'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Application Data/field_phone__number'))
WebUI.setText(findTestObject('New Application (NEW)/Application Data/field_phone__number'), phoneNumber)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Application Data/field_phone_ext'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Application Data/field_phone_ext'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Application Data/field_phone_ext'))
WebUI.setText(findTestObject('New Application (NEW)/Application Data/field_phone_ext'), phoneExt)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Application Data/button_save_continue_app_data'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Application Data/button_save_continue_app_data'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Application Data/button_save_continue_app_data'))
WebUI.scrollToElement(findTestObject('New Application (NEW)/Application Data/button_save_continue_app_data'), 0)
WebUI.delay(1)
WebUI.click(findTestObject('New Application (NEW)/Application Data/button_save_continue_app_data'))
WebUI.delay(1)

}

//ADD ASSET DATA-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

void part_4() {

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

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/button_search_supplier_branch'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/button_search_supplier_branch'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/button_search_supplier_branch'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_search_supplier_branch'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/button_select_supplier_branch'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/button_select_supplier_branch'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/button_select_supplier_branch'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_select_supplier_branch'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/select_sales'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/select_sales'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/select_sales'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/select_sales'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/select_sales'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/select_sales'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/select_sales'))
WebUI.selectOptionByLabel(findTestObject('New Application (NEW)/Asset Data/select_sales'),
	'MANDA', false)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/image_select_asset_name'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/image_select_asset_name'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/image_select_asset_name'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/image_select_asset_name'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/field_asset_name'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/field_asset_name'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/field_asset_name'))
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_asset_name'), assetName)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/button_search_asset_name'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/button_search_asset_name'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/button_search_asset_name'))
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
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/field_down_payment'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/field_down_payment'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/field_down_payment'))
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_down_payment'), Keys.chord(Keys.CONTROL + 'a'))
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_down_payment'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_down_payment'), assetDP)
WebUI.delay(1)

WebUI.scrollToElement(findTestObject('New Application (NEW)/Asset Data/field_no_mesin'), 0)
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
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Asset Data/select_asset_usage'),
	'P', false)

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

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/option_self_usage'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/option_self_usage'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/option_self_usage'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/option_self_usage'))

WebUI.scrollToElement(findTestObject('New Application (NEW)/Asset Data/select_address_copy_source'), 2)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/select_address_copy_source'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/select_address_copy_source'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/select_address_copy_source'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Asset Data/select_address_copy_source'),
	'LEGAL', false)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/button_copy_address'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/button_copy_address'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/button_copy_address'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_copy_address'))

WebUI.scrollToElement(findTestObject('New Application (NEW)/Asset Data/button_save_asset_registration'), 2)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/button_save_asset_registration'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/button_save_asset_registration'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/button_save_asset_registration'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_save_asset_registration'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Asset Data/button_save_continue_asset_data'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Asset Data/button_save_continue_asset_data'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Asset Data/button_save_continue_asset_data'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_save_continue_asset_data'))
WebUI.delay(1)

}

//ADD INSURANCE DATA---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

void part_5() {

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Insurance Data/button_edit_insurance'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Insurance Data/button_edit_insurance'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Insurance Data/button_edit_insurance'))
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_edit_insurance'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Insurance Data/select_insurance_name'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Insurance Data/select_insurance_name'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Insurance Data/select_insurance_name'))
WebUI.selectOptionByLabel(findTestObject('New Application (NEW)/Insurance Data/select_insurance_name'), 
    insuranceType, false)
WebUI.delay(1)

//WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Insurance Data/select_insurance_name'), 30)
//WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Insurance Data/select_insurance_name'), 30)
//WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Insurance Data/select_insurance_name'))
//WebUI.selectOptionByLabel(findTestObject('New Application (NEW)/Insurance Data/select_insurance_name'),
//	'Insurance Scheme 1', false)
//WebUI.delay(1)


WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Insurance Data/select_rate_type'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Insurance Data/select_rate_type'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Insurance Data/select_rate_type'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Insurance Data/select_rate_type'), 
    'NG', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Insurance Data/select_main_coverage_type'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Insurance Data/select_main_coverage_type'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Insurance Data/select_main_coverage_type'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Insurance Data/select_main_coverage_type'), 'ALL RISK', 
    false)
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
WebUI.delay(3)

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
//WebUI.click(findTestObject('New Application (NEW)/Insurance Data/check_cover_life_insurance'))
//WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Insurance Data/select_life_insurance_name'), 
//    2)
//WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Insurance Data/select_life_insurance_name'), 
//    '6', false)
//WebUI.click(findTestObject('New Application (NEW)/Insurance Data/check_customer_insured'))
//WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Insurance Data/select_premium_payment_method'), 
//    2)
//WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Insurance Data/select_premium_payment_method'), 
//    'FO', false)
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
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Financial Data/button_calculate'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Financial Data/button_calculate'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Financial Data/button_calculate'))
WebUI.click(findTestObject('New Application (NEW)/Financial Data/button_calculate'))
WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_entry_installment'), 0)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_entry_installment'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_entry_installment'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_entry_installment'))
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_entry_installment'))

WebUI.scrollToElement(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_choose_installment_file'), 0)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_choose_installment_file'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_choose_installment_file'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_choose_installment_file'))
WebUI.uploadFile(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_choose_installment_file'), fileUpload)
WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_upload_installment'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_upload_installment'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_upload_installment'))
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_upload_installment'))
WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_calculate_amortization'), 0)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_calculate_amortization'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_calculate_amortization'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_calculate_amortization'))
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Irregular - Upload Installment/btn_calculate_amortization'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Financial Data/button_save_continue_fin_data'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Financial Data/button_save_continue_fin_data'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Financial Data/button_save_continue_fin_data'))
WebUI.scrollToElement(findTestObject('New Application (NEW)/Financial Data/button_save_continue_fin_data'), 30)
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

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_slip_gaji'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_slip_gaji'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_slip_gaji'))
WebUI.click(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_slip_gaji'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_tabungan_rkoran'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_tabungan_rkoran'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_tabungan_rkoran'))
WebUI.click(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_tabungan_rkoran'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_ktp_pemohon'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_ktp_pemohon'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_ktp_pemohon'))
WebUI.click(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_ktp_pemohon'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_ktp_penjamin'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_ktp_penjamin'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_ktp_penjamin'))
WebUI.click(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_ktp_penjamin'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_kims_paspor'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_kims_paspor'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_kims_paspor'))
WebUI.click(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_kims_paspor'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_kk'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_kk'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_kk'))
WebUI.click(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_kk'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_ijin_praktek'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_ijin_praktek'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_ijin_praktek'))
WebUI.click(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_ijin_praktek'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_npwp'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_npwp'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_npwp'))
WebUI.click(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_npwp'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_rek_listrik'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_rek_listrik'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_rek_listrik'))
WebUI.click(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_rek_listrik'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Term n Condition - Under Age/doc_surat_kematian'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Term n Condition - Under Age/doc_surat_kematian'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Term n Condition - Under Age/doc_surat_kematian'))
WebUI.click(findTestObject('New Application (NEW)/Term n Condition - Under Age/doc_surat_kematian'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_ktp_suami_istri'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_ktp_suami_istri'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_ktp_suami_istri'))
WebUI.click(findTestObject('New Application (NEW)/Term n Condition - Under Age/fc_ktp_suami_istri'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Term n Condition - Under Age/doc_surat_menikah'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Term n Condition - Under Age/doc_surat_menikah'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Term n Condition - Under Age/doc_surat_menikah'))
WebUI.click(findTestObject('New Application (NEW)/Term n Condition - Under Age/doc_surat_menikah'))

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_save_continue_term_condition'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_save_continue_term_condition'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_save_continue_term_condition'))
WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_save_continue_term_condition'))
WebUI.delay(1)
}

//SUBMIT APPLICATION---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

void part_9() {

WebUI.waitForElementPresent(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_submit_app'), 30)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_submit_app'), 30)
WebUI.verifyElementClickable(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_submit_app'))
WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_submit_app'))

WebUI.acceptAlert()
WebUI.delay(3)

}

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

