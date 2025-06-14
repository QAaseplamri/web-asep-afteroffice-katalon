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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('Webtables/toolsQA'), 0)

WebUI.verifyElementVisible(findTestObject('Webtables/toolsQA'))

WebUI.scrollToElement(findTestObject('Webtables/element'), 0)

WebUI.click(findTestObject('Webtables/element'))

WebUI.click(findTestObject('Webtables/Elements/Text Box/textbox'))

WebUI.verifyElementText(findTestObject('Webtables/Elements/Text Box/text_textbox'), 'Text Box')

WebUI.setText(findTestObject('Webtables/Elements/Text Box/input_fullName'), 'Testing automation')

WebUI.setText(findTestObject('Webtables/Elements/Text Box/input_email'), 'testingautomation@gmail.com')

WebUI.setText(findTestObject('Webtables/Elements/Text Box/input_currentAddress'), 'Jakarta selatan')

WebUI.setText(findTestObject('Webtables/Elements/Text Box/input_permanentAddress'), 'Jakarta selatan')

WebUI.scrollToElement(findTestObject('Webtables/Elements/Text Box/button_submit'), 0)

WebUI.click(findTestObject('Webtables/Elements/Text Box/button_submit'))

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Webtables/Elements/Text Box/verify_output'))

