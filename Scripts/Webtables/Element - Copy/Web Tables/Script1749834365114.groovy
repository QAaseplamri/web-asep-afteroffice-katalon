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

WebUI.scrollToElement(findTestObject('Webtables/Elements/Web Tables/webtables'), 0)

WebUI.click(findTestObject('Webtables/Elements/Web Tables/webtables'))

WebUI.verifyElementText(findTestObject('Webtables/Elements/Web Tables/text_webTables'), 'Web Tables')

WebUI.scrollToElement(findTestObject('Webtables/Elements/Web Tables/button_add'), 0)

WebUI.click(findTestObject('Webtables/Elements/Web Tables/button_add'))

WebUI.setText(findTestObject('Webtables/Elements/Web Tables/input_firstName'), 'Testing')

WebUI.setText(findTestObject('Webtables/Elements/Web Tables/input_lastName'), 'Automation')

WebUI.setText(findTestObject('Webtables/Elements/Web Tables/input_email'), 'automation@gmail.com')

WebUI.setText(findTestObject('Webtables/Elements/Web Tables/input_age'), '25')

WebUI.setText(findTestObject('Webtables/Elements/Web Tables/input_salary'), '10000000')

WebUI.setText(findTestObject('Webtables/Elements/Web Tables/input_department'), 'IT')

WebUI.scrollToElement(findTestObject('Webtables/Elements/Web Tables/button_submit'), 0)

WebUI.click(findTestObject('Webtables/Elements/Web Tables/button_submit'))

WebUI.clearText(findTestObject('Webtables/Elements/Web Tables/input_search'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Webtables/Elements/Web Tables/input_search'), Keys.chord('Automation', Keys.ENTER))

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Webtables/Elements/Web Tables/verify_output'))

