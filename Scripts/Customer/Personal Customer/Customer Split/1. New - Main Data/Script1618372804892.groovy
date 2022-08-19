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

WebUI.navigateToUrl('http://confins-uat.taf.co.id/confins/')

WebUI.setText(findTestObject('Customer/New - Main Data/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 'ABW0572')

WebUI.setEncryptedText(findTestObject('Customer/New - Main Data/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Customer/New - Main Data/input_Copyright  AdIns 2011. All Right Rese_ad9066'))

WebUI.click(findTestObject('Customer/New - Main Data/a_Select'))

WebUI.click(findTestObject('Customer/New - Main Data/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'))

WebUI.click(findTestObject('Customer/New - Main Data/a_Customer'))

WebUI.click(findTestObject('Customer/New - Main Data/a_Customer_1'))

WebUI.click(findTestObject('Customer/New - Main Data/a_Add Personal Customer'))

WebUI.setText(findTestObject('Customer/New - Main Data/input_Customer Name_txtCustName'), 'John Doe')

WebUI.selectOptionByValue(findTestObject('Customer/New - Main Data/select_Select OneAKTAKTPKIMSKITAPKITASKKNIK_89b50f'), 
    'KTP', true)

WebUI.setText(findTestObject('Customer/New - Main Data/input_ID Number_ucIdtxtCustIdNo'), '3131311010900000')

WebUI.setText(findTestObject('Customer/New - Main Data/input_ID Expired Date_ucIdExpiredDttxtDatePicker'), '10/10/2050')

WebUI.sendKeys(findTestObject('Customer/New - Main Data/input_ID Expired Date_ucIdExpiredDttxtDatePicker'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Customer/New - Main Data/input_Female_rblCustGender'))

WebUI.setText(findTestObject('Customer/New - Main Data/input__txtBirthPlace'), 'Jakarta')

WebUI.setText(findTestObject('Customer/New - Main Data/input__ucBirthDatetxtDatePicker'), '10/10/1990')

WebUI.sendKeys(findTestObject('Customer/New - Main Data/input__ucBirthDatetxtDatePicker'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Customer/New - Main Data/input_NPWP_txtNpwp'), '123456789')

WebUI.setText(findTestObject('Customer/New - Main Data/input_Mother Maiden Name_txtMotherMaidenName'), 'Mother')

WebUI.click(findTestObject('Customer/New - Main Data/a_Next'))

WebUI.selectOptionByValue(findTestObject('Customer/New - Main Data/select_Select OneMR.MRS.MS'), 'MR', true)

WebUI.setText(findTestObject('Customer/New - Main Data/input_Prefix Name_txtPrefixName'), 'John')

WebUI.setText(findTestObject('Customer/New - Main Data/input_Customer Suffix Name_txtSuffixName'), 'Doe')

WebUI.setText(findTestObject('Customer/New - Main Data/input_Nick Name_txtNickName'), 'John')

WebUI.selectOptionByValue(findTestObject('Customer/New - Main Data/select_Select OneDivorceMarriedSingle'), 'SIN', true)

WebUI.selectOptionByValue(findTestObject('Customer/New - Main Data/select_Select OneWNAWNI'), 'WNI', true)

WebUI.selectOptionByValue(findTestObject('Customer/New - Main Data/select_Select OneBelum Tamat SDSederajatD1D_5f6d87'), 
    'S1', true)

WebUI.selectOptionByValue(findTestObject('Customer/New - Main Data/select_Select OneBudhaHINDUIslamKATOLIKKONF_03ebe1'), 
    'KRISTEN', true)

WebUI.scrollToElement(findTestObject('Customer/New - Main Data/input_Mobile Phone 1_txtMblPhn1'), 0)

WebUI.setText(findTestObject('Customer/New - Main Data/input_Mobile Phone 1_txtMblPhn1'), '081234567890')

WebUI.scrollToElement(findTestObject('Customer/New - Main Data/input_-_lb_Form_SaveCont_MainData'), 0)

WebUI.click(findTestObject('Customer/New - Main Data/input_-_lb_Form_SaveCont_MainData'))

WebUI.closeBrowser()

