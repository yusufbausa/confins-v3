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
WebUI.navigateToUrl('http://confins-uat.taf.co.id/confins/')
WebUI.maximizeWindow()


//input credential
WebUI.setText(findTestObject('Login/username'), 'AEE1976')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//select role
WebUI.click(findTestObject('Object Repository/Credit Review/a_Select'))
WebUI.delay(3)


//select menu credit review
WebUI.click(findTestObject('Object Repository/Credit Review/img_Welcome, AEP SAEPUDIN, TANGERANG, Credi_d8a0e4'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Credit Review/a_Credit Review'))
WebUI.delay(2)


//input cust credential
WebUI.setText(findTestObject('Object Repository/Credit Review/input_Application No._ucSearchtxtAppNo_ltlAppAppNo'), '0037APP20210300566')
WebUI.click(findTestObject('Object Repository/Credit Review/input_Task Claim By_ucSearchbtnSearch'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Credit Review/input_UNGRADED_gvCreditReviewctl02imbReview'))
WebUI.delay(3)


//credit review process
WebUI.click(findTestObject('Object Repository/Credit Review/a_APPROVAL RECOMMENDATION'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/Credit Review/select_Select OneCredit Approval'), '158', false)
WebUI.selectOptionByValue(findTestObject('Object Repository/Credit Review/select_Select OneAEE1976GSR1977KRK1840LPR20_e665d3'), 
    '305156', false)
WebUI.setText(findTestObject('Object Repository/Credit Review/textarea_Notes_ucApvtxtNotes'), 'need approval')
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Credit Review/textarea_Latar Belakang Debitur_rptApvRcmnd_a6b2b3'), 'ok')
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Credit Review/textarea_Faktor - Faktor Mendukung_rptApvRc_3308d4'), 'ok')
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Credit Review/textarea_Faktor-Faktor Tidak  Kurang Menduk_e9ef39'), 'ok')
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Credit Review/textarea_Syarat-Syarat_rptApvRcmndtnctl03tx_381452'), 'ok')
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Credit Review/textarea_CA Calculation_rptApvRcmndtnctl04t_768d1e'), 'ok')
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Credit Review/a_Submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()

