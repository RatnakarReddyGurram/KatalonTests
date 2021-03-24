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

WebUI.waitForElementClickable(findTestObject('RegalBeloit/Login'), 5000)

WebUI.click(findTestObject('RegalBeloit/Login'))

if (WebUI.verifyElementPresent(findTestObject('Cookies'), 5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Cookies'))
}

WebUI.waitForElementClickable(findTestObject('RegalBeloit/LoginPage/Login'), 5000)

WebUI.click(findTestObject('RegalBeloit/LoginPage/Login'))

WebUI.sendKeys(findTestObject('RegalBeloit/LoginPage/UserName'), GlobalVariable.Username)

WebUI.sendKeys(findTestObject('RegalBeloit/LoginPage/Password'), GlobalVariable.Password)

WebUI.click(findTestObject('RegalBeloit/LoginPage/LoginButton'))

if (WebUI.verifyElementPresent(findTestObject('RegalBeloit/LoginPage/AccountSelectionWindow'), 5, FailureHandling.OPTIONAL)) {
    if (WebUI.verifyElementPresent(findTestObject('Cookies'), 5, FailureHandling.OPTIONAL)) {
        WebUI.click(findTestObject('Cookies'))
    }
    
    WebUI.click(findTestObject('RegalBeloit/LoginPage/RegalBeloit/Account5'))

    WebUI.click(findTestObject('RegalBeloit/LoginPage/RegalBeloit/Account4'))

    WebUI.click(findTestObject('RegalBeloit/LoginPage/RegalBeloit/MakeThisMydefaultAccount'))

    WebUI.click(findTestObject('RegalBeloit/LoginPage/RegalBeloit/NextButton'))
}

if (WebUI.verifyElementPresent(findTestObject('RegalBeloit/LoginPage/RegalBeloit/CloseButtonOnAddressPage'), 5, FailureHandling.OPTIONAL)) {
    if (WebUI.verifyElementPresent(findTestObject('Cookies'), 5, FailureHandling.OPTIONAL)) {
        WebUI.click(findTestObject('Cookies'))
    }
    
	WebUI.click(findTestObject('RegalBeloit/LoginPage/RegalBeloit/PrimaryAddress'))
	
    WebUI.click(findTestObject('RegalBeloit/LoginPage/RegalBeloit/ConfirmAddress'))
    
}

