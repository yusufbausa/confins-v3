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
WebUI.setText(findTestObject('Login/username'), usernameSU)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)


//select role
WebUI.click(findTestObject('Object Repository/EKYC/Master/New Office/select_role'))
//WebUI.delay(1)


//select menu supplier
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/button_menu'))
//WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/menu_supplier'))
//WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_menu_supplier'))
//WebUI.delay(3)

//add supplier process
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_add_supplier'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_supplier_code'), suppCode)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_supplier_name'), suppName)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_supplier_legal_name'), suppLegalName)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_supplier_short_name'), suppShortName)
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/select_supplier_class'), suppClass, false)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_tdp'), tdp)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_siup'), siup)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_collaboration_start_date'), date)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/td_Collaboration Start Date'))

WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/img_search_main_supplier'))
//WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_supplier_holding'), suppHolding)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_search_supplier_holding'))
//WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_select_supplier_holding'))
WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/select_incentive_card'), incentiveCard, false)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/check_active'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_coa_prepaid_ap'), baseCoaPrepaid)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_base_coa_ap'), baseCoa)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_npwp_no'), npwpNumber)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_address1'), address)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_rt1'), rt)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_rw1'), rw)

WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/img_search_zipCode1'))
//WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_kelurahan1'), kelurahan)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_search_zipCode1'))
//WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_select_zipCode1'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_next'))
WebUI.delay(3)

//supplier registration
//add address
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_address2'), address)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_rt2'), rt)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_rw2'), rw)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/img_search_zipCode2'))
//WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_kelurahan2'), kelurahan)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_search_zipCode2'))
//WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_select_zipCode2'))
WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_phone_area'), phoneArea)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_phone_number'), phoneNumber)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_phone_ext'), phoneExt)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_save_address'))
WebUI.delay(3)

//add contact person
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_contact_name'), contactName)
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/select_job_title'), jobTitle, false)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_mobile_phone'), mobilePhone)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_phone_area2'), phoneArea)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_phone_number2'), phoneNumber)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_phone_ext2'), phoneExt)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_email'), email)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_save_contact'))
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_save_owner'))
WebUI.delay(2)


//add bank account
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_add_bank_account'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/img_search_bank_name'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_bank_name'), bankName)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_search_bank_name'))
//WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_select_bank_name'))

WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_bank_branch'), bankBranch)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_bi_code'), biCode)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_account_name'), suppName)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/field_account_number'), accountNumber)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/check_is_default'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_save_bank_account'))
WebUI.delay(1)


//save & submit
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier/btn_save_and_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()


