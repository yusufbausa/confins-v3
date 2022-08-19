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

//Login
WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://confins-uat.taf.co.id/CONFINS/')


//input admin credential
WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.setText(findTestObject('EKYC/Personal Single/Page_NEW CONFINS LOGIN PAGE (1)/input_Copyright  AdIns 2011. All Right Rese_e6b1e8'), 
    'ABW0572')

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.sendKeys(null, Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('Login/password'), 'password')

WebUI.click(findTestObject('Login/btn_login'))

//select role
WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.click(findTestObject('EKYC/Personal Single/Page_NEW CONFINS LOGIN PAGE (1)/a_Select'))


//select menu credit simulation
WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.click(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/img_Welcome, ANGGO BAGUS WICAKSONO, TANGERA_797734'))

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.click(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/a_Credit Simulation (1)'))


//credit simulation process
WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.click(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/a_Add (1)'))

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.setText(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_Customer Name_txtCustName (1)'), 
    'test')

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.click(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_Product Offering Name_ucLookupProdOff_8d93d5 (1)'))
WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.setText(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_Product Offering Name_ucLookupProdOff_cb8174 (1)'), 
    'INVESTASI NON PAKET')


WebUI.click(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/a_SEARCH (1)'))

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.click(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/a_Select (1)'))
WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.setText(findTestObject('Object Repository/EKYC/Multi Asset/Page_New Confins 1 - Main/input_Num Of Asset_ucINNumOfAssettxtInput'), 
    '2')

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Multi Asset/Page_New Confins 1 - Main/select_Select OneDivorceMarriedSingle'), 
    'SIN', false)


WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Page_New Confins 1 - Main/Tenor'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Page_New Confins 1 - Main/Tenor'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Page_New Confins 1 - Main/Tenor'))
WebUI.click(findTestObject('Object Repository/EKYC/Page_New Confins 1 - Main/Tenor'))
WebUI.setText(findTestObject('Object Repository/EKYC/Page_New Confins 1 - Main/Tenor'), '12')


WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.selectOptionByValue(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/select_Select OneRegular Fixed InstallmentI_3a182b (1)'), 
    'RF', true)

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.selectOptionByValue(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/select_Select OneMONTHLYBIMONTHLYQuarterlyT_7ac454 (1)'), 
    '1', true)

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.click(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_Cover Life Insurance_cbIsCoverLifeIns (1)'))

//WebUI.selectOptionByValue(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/select_Select OneASURANSI ASTRA SYARIAH, AS_9946c5'), 
//    '9', true)
WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/New Folder/Page_New Confins 1 - Main/select_Select OneASURANSI ASTRA SYARIAH, AS_9946c5'), 
    '9', true)

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.click(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_Customer Insured_cblCustomerInsured0 (1)'))

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.selectOptionByValue(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/select_Select OneFull On LoanFull PaymentPa_43fb00 (1)'), 
    'FO', true)

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.click(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/a_Next (1)'))

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.click(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/a_Add_1 (1)'))

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.click(findTestObject('Object Repository/EKYC/asset data/Page_New Confins 1 - Main/SupplierBranchName-Icon'))
WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.setText(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_Supplier Branch Name_ucLookupSupplBra_ef8106 (1)'), 
    'ARMADA AUTO TARA - TGR CIKOKOL 2')

WebUI.click(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/a_SEARCH_1 (1)'))

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.click(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/a_Select_1 (1)'))
WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.click(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_Asset Name_ucLookupAssetMasteruclMasterimb (1)'))
WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.setText(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_Asset Name_ucLookupAssetMasteruclMast_091a2a (1)'), 
    'TOYOTA AGYA 1.0 G M/T TRD')

WebUI.click(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/a_SEARCH_1_2 (1)'))

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.click(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/a_Select_1_2 (1)'))
WebUI.delay(2)


WebUI.waitForElementPresent(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_Asset Price_ucAssetPricetxtInput (1)'), 30)	
WebUI.verifyElementPresent(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_Asset Price_ucAssetPricetxtInput (1)'), 30)
WebUI.verifyElementClickable(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_Asset Price_ucAssetPricetxtInput (1)'))
WebUI.sendKeys(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_Asset Price_ucAssetPricetxtInput (1)'), 
    Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_Asset Price_ucAssetPricetxtInput (1)'), 
    Keys.chord(Keys.DELETE))
WebUI.setText(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_Asset Price_ucAssetPricetxtInput (1)'), 
    '120000000')

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.sendKeys(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_Down Payment_ucDownPaymentPrcnttxtInput (1)'), 
    Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_Down Payment_ucDownPaymentPrcnttxtInput (1)'), 
    Keys.chord(Keys.DELETE))
WebUI.setText(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_Down Payment_ucDownPaymentPrcnttxtInput (1)'), 
    '40')

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.selectOptionByValue(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/select_Select OneKomersial Jangka PanjangKo_70a155 (1)'), 
    'P', true)

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.click(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/a_Save (1)'))
WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.setText(findTestObject('Object Repository/EKYC/Multi Asset/Page_New Confins 1 - Main/input_Copy Asset                           _2e8113'), '1')

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.click(findTestObject('Object Repository/EKYC/Multi Asset/Page_New Confins 1 - Main/a_Copy'))

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.click(findTestObject('Object Repository/EKYC/Multi Asset/Page_New Confins 1 - Main/a_Next'))
WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.click(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_TOYOTA AGYA 1.0 G MT TRD_gvEntryInsct_6b1782 (1)'))

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.selectOptionByValue(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/select_Select OneGARDA OTOLITE INSURANCE'), 
    'INS002', true)
WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.click(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/a_Next_1 (1)'))

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.selectOptionByValue(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/select_Select OneALL RISKTLO (1)'), 
    '1', true)

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.click(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_Add. Premi Amount_ucInsrateSimulation_e9bf3a (1)'))

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.click(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/a_Calculate (1)'))
WebUI.delay(4)

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.click(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/a_Save_1 (1)'))
WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.click(findTestObject('Object Repository/EKYC/Multi Asset/Page_New Confins 1 - Main/input_EDIT_gvEntryInsctl02cbCheckIns'))

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.click(findTestObject('Object Repository/EKYC/Multi Asset/Page_New Confins 1 - Main/input_Insurance Data_lb_Form_CopyToAll'))

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.click(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/a_Next (1)'))
WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.click(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_Fees_lb_Form_CalcFee (1)'))
WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.click(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_Fees_lbCalculateFees (1)'))
WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.click(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_Fees_lbCalculateFees (1)'))
WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.click(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_Financial Data_lbCalculateFinancialData (1)'))
WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.click(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/a_Next (1)'))
WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.click(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/a_Next (1)'))
WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.setText(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_Mobile Phone_txtMblPhn1 (1)'), '081234567891')

WebUI.waitForElementPresent(findTestObject(''), 30)
WebUI.verifyElementPresent(findTestObject(''), 30)
WebUI.verifyElementClickable(findTestObject(''))
WebUI.setText(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_NPWP No_txtNpwpNo (1)'), '111212222233336')

//WebUI.waitForElementPresent(findTestObject(''), 30)
//WebUI.verifyElementPresent(findTestObject(''), 30)
//WebUI.verifyElementClickable(findTestObject(''))
//WebUI.setText(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/textarea_Job Address_txtOfficeAddr (1)'), 
//    'Jalan Gatot Subroto No. 123 Jakarta Selatan')
//
//WebUI.waitForElementPresent(findTestObject(''), 30)
//WebUI.verifyElementPresent(findTestObject(''), 30)
//WebUI.verifyElementClickable(findTestObject(''))
//WebUI.setText(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/textarea_Residence Address_txtResidenceAddr (1)'), 
//    'Jalan Gatot Subroto No. 123 Jakarta Selatan')

WebUI.waitForElementPresent(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/a_Save_1_2 (1)'), 30)
WebUI.verifyElementPresent(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/a_Save_1_2 (1)'), 30)
WebUI.verifyElementClickable(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/a_Save_1_2 (1)'))
WebUI.click(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/a_Save_1_2 (1)'))
WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Page_New Confins 1 - Main/Choose File'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Page_New Confins 1 - Main/Choose File'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Page_New Confins 1 - Main/Choose File'))
WebUI.uploadFile(findTestObject('Object Repository/EKYC/Page_New Confins 1 - Main/Choose File'), 'D:\\Capture.PNG')

WebUI.waitForElementPresent(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_Remarks_txtRemarks'), 30)
WebUI.verifyElementPresent(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_Remarks_txtRemarks'), 30)
WebUI.verifyElementClickable(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_Remarks_txtRemarks'))
WebUI.setText(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_Remarks_txtRemarks'), 'FOTOKOPI KTP PEMOHON')

WebUI.waitForElementPresent(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_Remarks_btnupload'), 30)
WebUI.verifyElementPresent(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_Remarks_btnupload'), 30)
WebUI.verifyElementClickable(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_Remarks_btnupload'))
WebUI.click(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/input_Remarks_btnupload'))
WebUI.delay(2)


void test() {
WebUI.waitForElementPresent(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/a_Submit (1)'), 30)
WebUI.verifyElementPresent(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/a_Submit (1)'), 30)
WebUI.click(findTestObject('EKYC/Personal Single/Page_New Confins 1 - Main (1)/a_Submit (1)'))
WebUI.verifyAlertPresent(20)
WebUI.acceptAlert()
}

test()


//close browser
WebUI.closeBrowser()

