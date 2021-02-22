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

WebUI.waitForElementClickable(findTestObject('HomePage/Industries/industries'), 30000)

WebUI.mouseOver(findTestObject('HomePage/Industries/industries'))

WebUI.click(findTestObject('HomePage/Industries/GrainHandling'))

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('HomePage/Industries/MotorLink'), 30000)

WebUI.click(findTestObject('HomePage/Industries/MotorLink'))

WebUI.waitForElementClickable(findTestObject('HomePage/Industries/HVAC_Motor'), 30000)

WebUI.click(findTestObject('HomePage/Industries/HVAC_Motor'))

WebUI.delay(4)

WebUI.waitForElementClickable(findTestObject('HomePage/Industries/FanAndBowler'), 30000)

WebUI.click(findTestObject('HomePage/Industries/FanAndBowler'))

WebUI.waitForElementClickable(findTestObject('HomePage/Industries/MotorOne'), 30000)

WebUI.click(findTestObject('HomePage/Industries/MotorOne'))

WebUI.scrollToPosition(500, 0)

WebUI.waitForElementClickable(findTestObject('HomePage/Industries/MotorTwo'), 30000)

WebUI.click(findTestObject('HomePage/Industries/MotorTwo'))

WebUI.waitForElementClickable(findTestObject('ProductListPage/CompareButton'), 30000)

WebUI.click(findTestObject('ProductListPage/CompareButton'))

WebUI.waitForElementClickable(findTestObject('HomePage/Industries/ShowDifferenceOnly'), 30000)

WebUI.click(findTestObject('HomePage/Industries/ShowDifferenceOnly'))

WebUI.closeBrowser()

