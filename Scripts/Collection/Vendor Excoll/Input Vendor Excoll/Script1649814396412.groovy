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
WebUI.navigateToUrl('https://confins-qa.taf.co.id/confins/')


//input admin credential
WebUI.setText(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/input_Copyright  AdIns 2011. All Right Rese_e6b1e8'), 
    'YUH1851')
WebUI.setText(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/input_Copyright  AdIns 2011. All Right Rese_092e4f'), 
    'password')
WebUI.click(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/input_Copyright  AdIns 2011. All Right Rese_9109c2'))


//select role
WebUI.click(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/select_role'))


//select menu collection vendor maintenance
WebUI.click(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/btn_menu'))
WebUI.selectOptionByValue(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/select_menu_collection'), 
    '270', false)
WebUI.click(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/menu_collection_expense'))
WebUI.click(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/menu_vendor_maintenance'))


//add vendor process
WebUI.click(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/btn_add_vendor'))
WebUI.setText(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/field_vendor_code'), 'EC-07042022-JKT-01')
WebUI.selectOptionByValue(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/select_vendor_type'), 
    'C', false)
WebUI.selectOptionByValue(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/select_vendor_category'), 
    'E', false)


//corporate information
WebUI.setText(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/field_vendor_name'), 'PT KESANA KEMARI')
WebUI.setText(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/field_address'), 'JL GATOT SUBROTO 8')
WebUI.setText(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/field_rt'), '001')
WebUI.setText(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/field_rw'), '002')
WebUI.click(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/img_search_zipCode'))
WebUI.setText(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/field_kelurahan'), '%PANCORAN%')
WebUI.click(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/btn_search_zipCode'))
WebUI.click(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/btn_select_zipCode'))
WebUI.setText(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/field_mobile_phone_1'), '081234567890')


//director information
WebUI.setText(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/field_director_name'), 'ANGGA WICAKSANA')
WebUI.setText(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/field_director_id_no'), '3374020801710001')
WebUI.setText(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/field_director_sppi_no'), '8209101114001011')
WebUI.setText(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/field_sppi_period_start'), '07/04/2022')
WebUI.setText(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/field_sppi_period_end'), '07/04/2026')


//npwp information
WebUI.setText(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/field_npwp_name'), 'PT KESANA KEMARI')
WebUI.setText(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/field_npwp_no'), '743376010518001')
WebUI.click(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/check_same_as_corporate'))


//bank account info
WebUI.click(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/btn_bank_account'))
WebUI.click(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/img_search_bank_account'))
WebUI.setText(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/field_bank_name'), 'BANK CENTRAL ASIA')
WebUI.click(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/btn_search_bank_account'))
WebUI.click(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/select_bank_account'))
WebUI.setText(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/field_bank_branch'), 'SENAYAN')
WebUI.setText(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/field_bank_account_name'), 'ANGGA WICAKSANA')
WebUI.setText(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/field_bank_account_no'), '1234567890')
WebUI.click(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/btn_save_bank_account'))


//add new collection user
WebUI.click(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/btn_add_new_user'))
WebUI.selectOptionByValue(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/select_area'), '1', false)
WebUI.setText(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/field_employee_name'), 'ANGGA WICAKSANA ONE')
WebUI.setText(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/field_employee_id_no'), '3374020812720001')
WebUI.setText(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/field_employee_sppi_no'), '8209102214001020')
WebUI.setText(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/field_task_day'), '3')
WebUI.setText(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/field_period_start'), '07/04/2022')
WebUI.setText(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/field_period_end'), '07/04/2026')


WebUI.selectOptionByValue(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/select_branch_name'), '12', false)
WebUI.setText(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/field_pks_period_start'), '07/04/2022')
WebUI.setText(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/field_pks_period_end'), '07/04/2026')
WebUI.sendKeys(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/field_pks_period_end'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/btn_save_user'))


//save vendor
WebUI.click(findTestObject('Object Repository/COLLECTION/Vendor Excoll/Input Vendor Excoll/btn_save_vendor'))


//close browser
WebUI.closeBrowser()