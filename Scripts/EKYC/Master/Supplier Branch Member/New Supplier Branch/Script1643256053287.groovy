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
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_menu'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/menu_supplier'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_menu_supplier'))
WebUI.delay(3)

//input supp credential
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_supplier_name'), suppName)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_search_supplier'))
//WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_supplier_branch'))
WebUI.delay(1)


//add supplier branch process
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_add_supplier_branch'))
WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_supplier_branch_code'), branchCode)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_supplier_branch_name'), branchName)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/check_active'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_bpkb_aging'), bpkbAging)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_day_due_after_golive'), dueGolive)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_npwp_name'), npwpName)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_npwp_number'), npwpNumber)
WebUI.setText(findTestObject('EKYC/Master/Supplier Branch Member/Supplier Branch/field_address'), address)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_rt'), rt)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_rw'), rw)

WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/img_search_zipCode'))
//WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_kelurahan'), kelurahan)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_search_zipCode'))
//WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_select_zipCode'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_next'))
WebUI.delay(1)


//add address
WebUI.setText(findTestObject('EKYC/Master/Supplier Branch Member/Supplier Branch/field_address2'), address)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_rt2'), rt)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_rw2'), rw)

WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/img_search_zipCode2'))
//WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_kelurahan2'), kelurahan)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_search_zipCode2'))
//WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_select_zipCode2'))
WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_phone_area'), phoneArea)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_phone_number'), phoneNumber)
WebUI.setText(findTestObject('EKYC/Master/Supplier Branch Member/Supplier Branch/field_phone_ext'), phoneExt)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_save_address'))
WebUI.delay(2)


//add contact person
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_contact_name'), contactName)
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/select_job_title'), jobTitle, false)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_mobile_phone'), mobilePhone)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_phone_area2'), phoneArea)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_phone_number2'), phoneNumber)
WebUI.setText(findTestObject('EKYC/Master/Supplier Branch Member/Supplier Branch/field_phone_ext2'), phoneExt)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_email'), email)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_save_contact'))
WebUI.delay(2)


//add bank account
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_add_bank_account'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/img_search_bank_name'))
//WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_bank_name'), bankName)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_search_bank_name'))
//WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_select_bank_name'))
WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_bank_branch'), bankBranch)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_bi_code'), biCode)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_account_name'), branchName)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_account_number'), accountNumber)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/check_is_default_bank'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_save_bank'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_save_bank_account'))
WebUI.delay(1)


//add member office
WebUI.setText(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/field_member_office_name'), memberName)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_search_member'))
//WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/check_member'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_add_member'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/check_default_branch'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EKYC/Master/Supplier Branch Member/Supplier Branch/btn_save_and_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

