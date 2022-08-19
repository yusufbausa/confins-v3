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

//========================================================================================================================================================================
//WebUI.openBrowser('')
//WebUI.navigateToUrl('http://confins-uat.taf.co.id/confins/')
//WebUI.setText(findTestObject('Object Repository/REMEDIAL/Asset Appraisal/Director Approval/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 
//    'TWA0223CC4')
//WebUI.setEncryptedText(findTestObject('Object Repository/REMEDIAL/Asset Appraisal/Director Approval/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
//    '8SQVv/p9jVScEs4/2CZsLw==')
//WebUI.click(findTestObject('Object Repository/REMEDIAL/Asset Appraisal/Director Approval/input_Copyright  AdIns 2011. All Right Rese_ad9066'))
//WebUI.click(findTestObject('Object Repository/REMEDIAL/Asset Appraisal/Director Approval/a_Select'))
//WebUI.click(findTestObject('Object Repository/REMEDIAL/Asset Appraisal/Director Approval/a_Asset Appraisal Approval'))
//WebUI.setText(findTestObject('Object Repository/REMEDIAL/Asset Appraisal/Director Approval/input_Agreement No_ucSearchtxtAgrmntNo_ltlA_b25f48'), 
//    '1910570229')
//WebUI.click(findTestObject('Object Repository/REMEDIAL/Asset Appraisal/Director Approval/input_Value must be Date Format_ucSearchbtnSearch'))
//WebUI.click(findTestObject('Object Repository/REMEDIAL/Asset Appraisal/Director Approval/input_TWA0223CC4_gvTaskctl02ibProcess'))
//WebUI.selectOptionByValue(findTestObject('Object Repository/REMEDIAL/Asset Appraisal/Director Approval/select_Select OneApproveReject'), 
//    'Approve', true)
//WebUI.setText(findTestObject('Object Repository/REMEDIAL/Asset Appraisal/Director Approval/textarea_Notes_txtNotes'), 'notes')
//WebUI.click(findTestObject('Object Repository/REMEDIAL/Asset Appraisal/Director Approval/a_Submit'))
//WebUI.closeBrowser()
//========================================================================================================================================================================




//open browser
WebUI.openBrowser('')
WebUI.navigateToUrl('http://confins-uat.taf.co.id/confins/')
WebUI.maximizeWindow()


//input credential
WebUI.setText(findTestObject('Login/username'), 'TWA0223CC4')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//select role
WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_select_role'), 20)
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_select_role'))
WebUI.delay(1)


//select menu appraisal approval (homepage)
WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_menu_appraisal_approval'), 20)
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_menu_appraisal_approval'))
WebUI.delay(1)


//input cust credential (agreement no)
WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/field_agreement_number'), 20)
WebUI.setText(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/field_agreement_number'),
	'1911034694')
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_search'))
WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_process_approval'), 20)
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_process_approval'))
WebUI.delay(1)


//appraisal approval process
WebUI.waitForElementPresent(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/select_action'), 20)
WebUI.scrollToElement(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/select_action'), 0)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/select_action'),
	'Approve', false)
WebUI.delay(1)
WebUI.setText(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/field_notes'),
	'notes')
WebUI.click(findTestObject('COLLECTION/Asset Appraisal/Asset Appraisal Approval AR Head/button_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()