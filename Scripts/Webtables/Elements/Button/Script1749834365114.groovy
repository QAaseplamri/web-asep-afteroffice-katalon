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

WebUI.scrollToElement(findTestObject('Webtables/Elements/Button/button'), 0)

WebUI.click(findTestObject('Webtables/Elements/Button/button'))

WebUI.verifyElementText(findTestObject('Webtables/Elements/Button/text_button'), 'Buttons')

WebUI.scrollToElement(findTestObject('Webtables/Elements/Button/button_doubleClickMe'), 0)

WebUI.doubleClick(findTestObject('Webtables/Elements/Button/button_doubleClickMe'))

WebUI.verifyElementText(findTestObject('Webtables/Elements/Button/verify_outputDoubleClick'), 'You have done a double click')

WebUI.rightClick(findTestObject('Webtables/Elements/Button/button_rightClickMe'))

WebUI.verifyElementText(findTestObject('Webtables/Elements/Button/verify_outputRightClick'), 'You have done a right click')

WebUI.click(findTestObject('Webtables/Elements/Button/button_clickMe'))

WebUI.verifyElementText(findTestObject('Webtables/Elements/Button/verify_outputClick'), 'You have done a dynamic click')

WebUI.takeScreenshot()
