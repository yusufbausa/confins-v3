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


//select menu common setting
WebUI.click(findTestObject('Object Repository/EKYC/Master/New Office/btn_menu'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Master/New Office/select_menu_common_setting'), 'COMMON SETTING', false)
WebUI.click(findTestObject('Object Repository/EKYC/Master/New Office/expand_menu_office'))
WebUI.click(findTestObject('Object Repository/EKYC/Master/New Office/btn_menu_office'))
WebUI.delay(1)


//add office process
WebUI.click(findTestObject('Object Repository/EKYC/Master/New Office/btn_add'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/New Office/field_office_code'), officeCode)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/New Office/field_office_name'), officeName)
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Master/New Office/select_office_class'), officeClass, false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Master/New Office/select_organization_level'), orgLevel, false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Master/New Office/select_area'), area, false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Master/New Office/select_holiday_scheme'), holidayScheme, false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Master/New Office/select_working_hour_scheme'), workHourScheme, false)
WebUI.click(findTestObject('Object Repository/EKYC/Master/New Office/check_handling_office_mailing_zipCode'))
WebUI.setText(findTestObject('Object Repository/EKYC/Master/New Office/field_address'), address)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/New Office/field_rt'), rt)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/New Office/field_rw'), rw)
WebUI.click(findTestObject('Object Repository/EKYC/Master/New Office/img_search_zipCode'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/New Office/field_kelurahan'), kelurahan)
WebUI.click(findTestObject('Object Repository/EKYC/Master/New Office/btn_search'))
//WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/EKYC/Master/New Office/btn_select_zipCode'))
WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/EKYC/Master/New Office/field_phone_area'), phoneArea)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/New Office/field_phone'), phoneNumber)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/New Office/field_phone_area2'), phoneArea2)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/New Office/field_phone2'), phoneNumber2)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/New Office/field_fax_area'), faxArea)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/New Office/field_fax_number'), faxNumber)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/New Office/field_contact_person_name'), contactPersonName)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/New Office/fiield_contact_job_title'), contactPersonJob)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/New Office/field_mobile_phone'), mobilePhone)
WebUI.setText(findTestObject('Object Repository/EKYC/Master/New Office/field_email'), email)

WebUI.scrollToElement(findTestObject('Object Repository/EKYC/Master/New Office/field_office_code'), 30)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Master/New Office/btn_get_coordinate'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Master/New Office/btn_get_coordinate'))
WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/EKYC/Master/New Office/btn_save'))
WebUI.delay(5)


///close browser
WebUI.closeBrowser()

