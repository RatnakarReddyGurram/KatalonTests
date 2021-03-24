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

WebUI.openBrowser(GlobalVariable.RegalURL)

WebUI.maximizeWindow()

if (WebUI.verifyElementPresent(findTestObject('Cookies'), 5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Cookies'))
}

WebUI.mouseOver(findTestObject('HomePage/ProductList/Products'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('HomePage/ProductList/Bearings'), 5000)

WebUI.mouseOver(findTestObject('HomePage/ProductList/Bearings'))

WebUI.mouseOver(findTestObject('HomePage/ProductList/Product_bearing_mounter'))

WebUI.click(findTestObject('HomePage/ProductList/Product_bearing_mounter_ball'))

if (WebUI.verifyElementPresent(findTestObject('Cookies'), 5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Cookies'))
}

WebUI.closeBrowser()

