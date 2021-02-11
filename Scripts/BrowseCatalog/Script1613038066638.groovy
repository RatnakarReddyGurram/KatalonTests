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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.RegalURL)

WebUI.sendKeys(findTestObject('HomePage/Search_area'), 'severe duty motors')

WebUI.waitForElementClickable(findTestObject('HomePage/Search_Button'), 0)

WebUI.click(findTestObject('HomePage/Search_Button'))

WebUI.click(findTestObject('ProductListPage/Brand_Filter'))

WebUI.click(findTestObject('ProductListPage/ProductOne'))

WebUI.click(findTestObject('HomePage/ProductList/TopScroll'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ProductListPage/Product_Two'))

WebUI.click(findTestObject('HomePage/ProductList/TopScroll'))

WebUI.click(findTestObject('ProductListPage/Product_Three'))

WebUI.click(findTestObject('ProductListPage/CompareButton'))

WebUI.click(findTestObject('ProductListPage/ProductOnCompareList'))

WebUI.scrollToPosition(0, 500)

WebUI.click(findTestObject('ProductListPage/RemoveFromCompareList'))

WebUI.scrollToPosition(500, 0)

WebUI.click(findTestObject('ProductListPage/WhereToBuyButton'))

WebUI.closeBrowser()

