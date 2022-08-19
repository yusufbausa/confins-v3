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
WebUI.maximizeWindow()


//navigate to shopee.co.id
WebUI.navigateToUrl('https://shopee.co.id/')
WebUI.delay(1)


//WebUI.waitForElementPresent(findTestObject('Object Repository/Test/btn_close'), 30)
//WebUI.verifyElementPresent(findTestObject('Object Repository/Test/btn_close'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/Test/btn_close'))
//WebUI.click(findTestObject('Object Repository/Test/btn_close'))
//WebUI.delay(1)

//WebUI.scrollToElement(findTestObject('Object Repository/Test/btn_next_category - Copy'), 0)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Test/btn_next_category'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Test/btn_next_category'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Test/btn_next_category'))
WebUI.click(findTestObject('Object Repository/Test/btn_next_category'))

//WebUI.scrollToElement(findTestObject('Object Repository/Test/img_kategori_kamera'), 0)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Test/img_kategori_kamera'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Test/img_kategori_kamera'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Test/img_kategori_kamera'))
WebUI.click(findTestObject('Object Repository/Test/img_kategori_kamera'))
WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/Test/img_kamera_analog'), 0)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Test/img_kamera_analog'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Test/img_kamera_analog'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Test/img_kamera_analog'))
WebUI.click(findTestObject('Object Repository/Test/img_kamera_analog'))
WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/Test/img_produk_kodak_m38'), 0)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Test/img_produk_kodak_m38'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Test/img_produk_kodak_m38'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Test/img_produk_kodak_m38'))
WebUI.click(findTestObject('Object Repository/Test/img_produk_kodak_m38'))
WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/Test/btn_beli sekarang'), 0)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Test/btn_beli sekarang'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Test/btn_beli sekarang'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/Test/btn_beli sekarang'))
WebUI.click(findTestObject('Object Repository/Test/btn_beli sekarang'))
WebUI.delay(6)


//close browser
WebUI.closeBrowser()

