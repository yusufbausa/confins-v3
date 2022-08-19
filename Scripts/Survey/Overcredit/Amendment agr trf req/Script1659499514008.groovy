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

//OPEN BROWSER================================================================================================================================================================================================================================================================================================================
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()


//INPUT ADMIN CREDENTIAL================================================================================================================================================================================================================================================================================================================
WebUI.setText(findTestObject('Login/username'), usernameReq)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//SELECT ROLE================================================================================================================================================================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/Overcredit/Amendment agr trf req/select_role_cso'))
WebUI.delay(1)


//SELECT MENU AMENDMENT================================================================================================================================================================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/Overcredit/Amendment agr trf req/btn_menu'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/Overcredit/Amendment agr trf req/select_menu_amendment'), '156', 
    false)
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Overcredit/Amendment agr trf req/btn_menu_amendment_req'))
WebUI.delay(1)


//INPUT CUST CREDENTIAL================================================================================================================================================================================================================================================================================================================
WebUI.selectOptionByValue(findTestObject('Object Repository/Overcredit/Amendment agr trf req/select_amendment_type'), 'AGT', false)
WebUI.setText(findTestObject('Object Repository/Overcredit/Amendment agr trf req/field_agreement_number'), agreeNo)
WebUI.click(findTestObject('Object Repository/Overcredit/Amendment agr trf req/btn_search_agreement'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Overcredit/Amendment agr trf req/btn_action'))
WebUI.delay(1)


//AMENDMENT AGREEMENT TRANSFER PROCESS================================================================================================================================================================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/Overcredit/Amendment agr trf req/btn_next'))
WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Overcredit/Amendment agr trf req/expand_agr_trf_req'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Overcredit/Amendment agr trf req/img_search_agr_trf_to'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Overcredit/Amendment agr trf req/field_cust_name'), custName)
WebUI.click(findTestObject('Object Repository/Overcredit/Amendment agr trf req/btn_search_cust'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Overcredit/Amendment agr trf req/select_cust'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Overcredit/Amendment agr trf req/btn_req_survey'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Overcredit/Amendment agr trf req/check_fc_slip'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Overcredit/Amendment agr trf req/check_fc_rek'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Overcredit/Amendment agr trf req/check_fc_ktp_pemohon'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Overcredit/Amendment agr trf req/check_fc_ktp_penjamin'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Overcredit/Amendment agr trf req/check_fc_paspor'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Overcredit/Amendment agr trf req/check_fc_kk'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Overcredit/Amendment agr trf req/check_fc_ijin_praktek'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Overcredit/Amendment agr trf req/check_fc_npwp'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Overcredit/Amendment agr trf req/check_fc_rek_listrik'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Overcredit/Amendment agr trf req/check_doc_surat_kematian'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Overcredit/Amendment agr trf req/check_doc_pbb'))
WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Overcredit/Amendment agr trf req/select_reason'), '318', false)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/Overcredit/Amendment agr trf req/select_approved_by'), '383491', false)
WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Overcredit/Amendment agr trf req/field_notes'), 'notes')
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Overcredit/Amendment agr trf req/btn_save'))
WebUI.delay(3)


//CLOSE BROWSER================================================================================================================================================================================================================================================================================================================
WebUI.closeBrowser()

