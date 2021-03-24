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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Smoke Test Cases/A1-Login Test'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(7)

WebUI.sendKeys(findTestObject('HomePage/Search_area'), 'marathon')

WebUI.click(findTestObject('HomePage/Search_Button'))

WebUI.delay(5)

if (WebUI.verifyElementPresent(findTestObject('Cookies'), 5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Cookies'))
}

'add one product to cart \r\n'
WebUI.click(findTestObject('RegalBeloit/LoginPage/RegalBeloit/Productlist/addTocartButton'))

WebUI.mouseOver(findTestObject('RegalBeloit/LoginPage/RegalBeloit/ShoppingCartIcon'))

'click on view cart button\r\n'
WebUI.click(findTestObject('RegalBeloit/LoginPage/RegalBeloit/ViewCartButton'))

if (WebUI.verifyElementPresent(findTestObject('Cookies'), 5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Cookies'))
}

'Remove product from cart list\r\n'
WebUI.click(findTestObject('RegalBeloit/LoginPage/RegalBeloit/ShoppingCartPage/RemoveFromCart'))

WebUI.callTestCase(findTestCase('Smoke Test Cases/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

