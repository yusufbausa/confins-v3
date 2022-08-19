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

//OPEN BROWSER
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()


//INPUT ADMIN CREDENTIAL
WebUI.setText(findTestObject('Login/username'), usernameCR)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//SELECT ROLE
WebUI.click(findTestObject('Object Repository/FLEET/Credit Review/a_Select'))
WebUI.delay(1)


//SELECT MENU CREDIT REVIEW
WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Credit Review/img_Welcome, ERIC LUSTON, FLEET JAKARTA, Cr_a38710'), 20)
WebUI.click(findTestObject('Object Repository/FLEET/Credit Review/img_Welcome, ERIC LUSTON, FLEET JAKARTA, Cr_a38710'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Credit Review/a_Credit Review'), 20)
WebUI.click(findTestObject('Object Repository/FLEET/Credit Review/a_Credit Review'))
WebUI.delay(1)


//INPUT CUST CREDENTIAL
WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Credit Review/input_Application No._ucSearchtxtAppNo_ltlAppAppNo'), 20)
WebUI.setText(findTestObject('Object Repository/FLEET/Credit Review/input_Application No._ucSearchtxtAppNo_ltlAppAppNo'), 
    appNo)
WebUI.click(findTestObject('Object Repository/FLEET/Credit Review/input_Task Claim By_ucSearchbtnSearch'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Credit Review/input_UNGRADED_gvCreditReviewctl02imbReview'), 20)
WebUI.click(findTestObject('Object Repository/FLEET/Credit Review/input_UNGRADED_gvCreditReviewctl02imbReview'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Object Repository/FLEET/Credit Review/a_APPROVAL RECOMMENDATION'), 20)
WebUI.click(findTestObject('Object Repository/FLEET/Credit Review/a_APPROVAL RECOMMENDATION'))
WebUI.delay(1)
WebUI.scrollToElement(findTestObject('FLEET/Credit Review/select_Select OneCredit Approval'), 0)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Credit Review/select_Select OneCredit Approval'), '158', 
    false)
WebUI.selectOptionByValue(findTestObject('Object Repository/FLEET/Credit Review/select_Select OneELU0538PWS1447'), '292206', 
    false)
WebUI.setText(findTestObject('Object Repository/FLEET/Credit Review/textarea_Notes_ucApvtxtNotes'), notes)
WebUI.scrollToElement(findTestObject('FLEET/Credit Review/textarea_Latar Belakang Debitur_rptApvRcmnd_a6b2b3'), 0)
WebUI.setText(findTestObject('Object Repository/FLEET/Credit Review/textarea_Latar Belakang Debitur_rptApvRcmnd_a6b2b3'), 
    review)
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/FLEET/Credit Review/textarea_Faktor - Faktor Mendukung_rptApvRc_3308d4'), 
    review)
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/FLEET/Credit Review/textarea_Faktor-Faktor Tidak  Kurang Menduk_e9ef39'), 
    review)
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/FLEET/Credit Review/textarea_Syarat-Syarat_rptApvRcmndtnctl03tx_381452'), 
    review)
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/FLEET/Credit Review/textarea_CA Calculation_rptApvRcmndtnctl04t_768d1e'), 
    review)
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/FLEET/Credit Review/a_Submit'))
WebUI.delay(5)


//CLOSE BROWSER
WebUI.closeBrowser()

