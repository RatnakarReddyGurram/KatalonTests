package regal
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Test {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Navigate Regal Url")
	def NavigaterToUrl(String name) {
		WebUI.openBrowser(GlobalVariable.RegalURL)
		WebUI.maximizeWindow()
	}

	@When("Click on Login button")
	def LoginButton(int value) {
		WebUI.waitForElementClickable(findTestObject('RegalBeloit/Login'), 5000)

		WebUI.click(findTestObject('RegalBeloit/Login'))

		if (WebUI.verifyElementPresent(findTestObject('Cookies'), 5, FailureHandling.OPTIONAL)) {
			WebUI.click(findTestObject('Cookies'))
		}
	}

	@Then("User should navigate login page and click on login button")
	def LoginbuttonOnLoginPage(String status) {
		WebUI.waitForElementClickable(findTestObject('RegalBeloit/LoginPage/Login'), 5000)

		WebUI.click(findTestObject('RegalBeloit/LoginPage/Login'))
	}
	@Given("Enter username and password and click on signIn button ")
	def UserNameAndPassword(String status) {
		WebUI.sendKeys(findTestObject('RegalBeloit/LoginPage/UserName'), GlobalVariable.Username)

		WebUI.sendKeys(findTestObject('RegalBeloit/LoginPage/Password'), GlobalVariable.Password)

		WebUI.click(findTestObject('RegalBeloit/LoginPage/LoginButton'))
	}
}