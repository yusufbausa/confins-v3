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

WebUI.setText(findTestObject('Object Repository/Customer/Job Data/input_Copyright  AdIns 2011. All Right Rese_f32c18'), 
    'ABW0572')

WebUI.setEncryptedText(findTestObject('Object Repository/Customer/Job Data/input_Copyright  AdIns 2011. All Right Rese_9b6a71'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Customer/Job Data/a_Select'))


WebUI.click(findTestObject('Object Repository/Customer/Job Data/input_-_lb_Form_SaveCont_Family'))

WebUI.click(findTestObject('Object Repository/Customer/Job Data/input_Profession Name_ucProfessionuclProfimb'))

WebUI.setText(findTestObject('Object Repository/Customer/Job Data/input_Profession Name_ucProfessionuclProfum_dd689e'), 
    '%')

WebUI.click(findTestObject('Object Repository/Customer/Job Data/a_SEARCH'))

WebUI.click(findTestObject('Object Repository/Customer/Job Data/a_Select (1)'))

WebUI.setText(findTestObject('Object Repository/Customer/Job Data/input_Professional No_txtProfNo'), '123456789')

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Job Data/select_Select OneANGGOTA ORGANISASIBENDAHAR_32c9a4'), 
    'D', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Job Data/select_Select OneCONTRACTOTHERSOWNERPERMANENT'), 
    'PERMANENT', true)

WebUI.click(findTestObject('Object Repository/Customer/Job Data/input_Industry Type Name_ucIndustryuclIndustryimb'))

WebUI.setText(findTestObject('Object Repository/Customer/Job Data/input_Economic Sector Name_ucIndustryuclInd_9fd7c2'), 
    '%')

WebUI.click(findTestObject('Object Repository/Customer/Job Data/a_SEARCH_1'))

WebUI.click(findTestObject('Object Repository/Customer/Job Data/a_Select_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Job Data/select_LARGEMEDIUMSMALL'), 'MEDIUM', true)

WebUI.click(findTestObject('Object Repository/Customer/Job Data/input_Penanaman Modal Asing_rblInvestmentType'))

WebUI.setText(findTestObject('Object Repository/Customer/Job Data/input_Number Of Employee_txtNoOfEmp'), '5000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Job Data/select_Select OneJanuaryFebruaryMarchAprilM_0d1bbe'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Customer/Job Data/input_Employment Establishment Date_ucEstab_03fc38'), 
    '2020')

WebUI.click(findTestObject('Object Repository/Customer/Job Data/input_-_lb_Form_SaveCont_Job'))

WebUI.closeBrowser()

