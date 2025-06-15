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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.scrollToElement(findTestObject('Webtables/Forms/input_firstName'), 0)

WebUI.setText(findTestObject('Webtables/Forms/input_firstName'), firstName)

WebUI.setText(findTestObject('Webtables/Forms/input_lastName'), lastName)

WebUI.setText(findTestObject('Webtables/Forms/input_email'), email)

//WebUI.click(findTestObject('Webtables/Forms/radioButton_dynamic'))
String statusGender = gender

TestObject radioButtonGender = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('//label[normalize-space(.)=\'' + 
    statusGender) + '\']')

WebUI.click(radioButtonGender)

WebUI.setText(findTestObject('Webtables/Forms/input_mobileNumber'), mobileNumber)

WebUI.sendKeys(findTestObject('Webtables/Forms/input_dateOfBirth'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Webtables/Forms/input_dateOfBirth'), dateOfBirth)

WebUI.sendKeys(findTestObject('Webtables/Forms/input_dateOfBirth'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Webtables/Forms/input_subjects'), subjects)

WebUI.sendKeys(findTestObject('Webtables/Forms/input_subjects'), Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('Webtables/Forms/checkbox_dynamic'))
String statusHobbies = hobbies

TestObject checkboxHobbies = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('//label[normalize-space(.)=\'' + 
    statusHobbies) + '\']')

WebUI.click(checkboxHobbies)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Webtables/Forms/button_pilihFile'), 0)

WebUI.uploadFile(findTestObject('Webtables/Forms/button_pilihFile'), 'C:/Users/ACER/Pictures/test.png')

WebUI.setText(findTestObject('Webtables/Forms/input_currentAddress'), currentAddress)

WebUI.sendKeys(findTestObject('Webtables/Forms/input_selectState'), Keys.chord(state, Keys.ENTER))

WebUI.sendKeys(findTestObject('Webtables/Forms/input_selectCity'), Keys.chord(city, Keys.ENTER))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Webtables/Forms/button_submit'))

WebUI.verifyElementVisible(findTestObject('Webtables/Forms/verify_suksesSubmit'))

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Webtables/Forms/button_close'), 0)

WebUI.click(findTestObject('Webtables/Forms/button_close'))

