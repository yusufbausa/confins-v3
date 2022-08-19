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
WebUI.setText(findTestObject('Login/username'), usernameCollector)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)
												
												
//select role
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/btn_select'))
//WebUI.delay(1)
												
												
//select menu remedial expense request
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/btn_menu'))
WebUI.selectOptionByLabel(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_menu_remedial'),
	'REMEDIAL', false)
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/btn_menu_remedial_expense'))
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/menu_remedial_expense_request'))
WebUI.delay(1)
												
												
//input cust credential
WebUI.setText(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_agreement_no'), agreeNo)
WebUI.selectOptionByLabel(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_coll_bucket_name'), collBucketName, false)
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/btn_search'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/btn_action'))
WebUI.delay(1)
												
												
//remedial expense request process
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_ext_fee'))
WebUI.doubleClick(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_ext_fee'))
WebUI.sendKeys(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_ext_fee'),
	extFee)
//WebUI.delay(1)
												
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_settlement_fee'))
WebUI.doubleClick(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_settlement_fee'))
WebUI.sendKeys(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_settlement_fee'),
	settlementFee)
//WebUI.delay(1)

WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_mobilization_fee'))
WebUI.doubleClick(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_mobilization_fee'))
WebUI.sendKeys(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_mobilization_fee'),
	mobilizationFee)
//WebUI.delay(1)

WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_delivery_charges'))
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_delivery_charges'))
WebUI.doubleClick(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_delivery_charges'))
WebUI.sendKeys(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_delivery_charges'),
	deliveryCharges)
//WebUI.delay(1)
												
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_repossession_fee'))
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_repossession_fee'))
WebUI.doubleClick(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_repossession_fee'))
WebUI.sendKeys(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_repossession_fee'),
	repossessionFee)
WebUI.delay(2)
												
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_problem_type'))
WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_problem_type'),
	'P06', false)
WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_unit_holder'),
	'Customer', false)
WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_unit_location'),
	'REM_ULOC_IN_CITY', false)
WebUI.delay(1)

WebUI.setText(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_notes_analysis'),
	notes)
WebUI.delay(1)

WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/btn_calculate'))
WebUI.delay(5)
												
WebUI.selectOptionByLabel(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_handling_type'),
	handlingType, false)
WebUI.selectOptionByLabel(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_executor'),
	executor, false)
WebUI.setText(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_notes_action'),
	notes)
												
WebUI.setText(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_disburse_to'),
	disburseTo)
WebUI.setText(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_notes_remedial_expense'),
	notes)
												
WebUI.selectOptionByLabel(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_bank_name'),
	bankName, false)
WebUI.setText(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_bank_branch'),
	bankBranch)
WebUI.setText(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_account_no'),
	accountNo)
WebUI.setText(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_account_name'),
	accountName)
												
WebUI.selectOptionByLabel(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_reason'),
	'BIAYA PENYELESAIAN', false)
WebUI.selectOptionByLabel(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/select_approved_by'),
	approvedBy, false)
WebUI.setText(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/field_notes_approval_request'),
	notes)
WebUI.delay(1)
												
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Request v3/btn_submit'))
WebUI.delay(3)
												
												
//close browser
WebUI.closeBrowser()
												
												
