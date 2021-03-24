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
import internal.GlobalVariable as GlobalVariable


WebUI.openBrowser(GlobalVariable.RegalURL)

WebUI.maximizeWindow()

WebUI.sendKeys(findTestObject('HomePage/Search_area'), 'severe duty motors')

WebUI.waitForElementClickable(findTestObject('HomePage/Search_Button'), 5000)

WebUI.click(findTestObject('HomePage/Search_Button'))

if (WebUI.verifyElementPresent(findTestObject('Cookies'), 5, FailureHandling.OPTIONAL)) {
	WebUI.click(findTestObject('Cookies'))
}

WebUI.waitForElementClickable(findTestObject('ProductListPage/Brand_Filter'), 5000)

WebUI.click(findTestObject('ProductListPage/Brand_Filter'))

WebUI.waitForElementClickable(findTestObject('ProductListPage/ProductOne'), 30000)

WebUI.click(findTestObject('ProductListPage/ProductOne'))

if (WebUI.verifyElementPresent(findTestObject('Cookies'), 5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Cookies'))
}

WebUI.waitForElementClickable(findTestObject('ProductListPage/Product_Two'), 5000)

WebUI.click(findTestObject('ProductListPage/Product_Two'))

WebUI.waitForElementClickable(findTestObject('ProductListPage/CompareButton'), 5000)

WebUI.click(findTestObject('ProductListPage/CompareButton'))

WebUI.waitForElementClickable(findTestObject('ProductListPage/ProductOnCompareList'), 5000)

WebUI.click(findTestObject('ProductListPage/ProductOnCompareList'))

WebUI.waitForElementClickable(findTestObject('ProductListPage/RemoveFromCompareList'), 5000)

if (WebUI.verifyElementPresent(findTestObject('Cookies'), 5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Cookies'))
}

WebUI.click(findTestObject('ProductListPage/RemoveFromCompareList'))

if (WebUI.verifyElementPresent(findTestObject('Cookies'), 5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Cookies'))
}

WebUI.waitForElementClickable(findTestObject('ProductListPage/WhereToBuyButton'), 5000)

WebUI.click(findTestObject('ProductListPage/WhereToBuyButton'))

WebUI.closeBrowser()

