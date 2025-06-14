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

WebUI.scrollToElement(findTestObject('Webtables/Elements/Links/links'), 0)

WebUI.click(findTestObject('Webtables/Elements/Links/links'))

WebUI.verifyElementText(findTestObject('Webtables/Elements/Links/text_links'), 'Links')

WebUI.scrollToElement(findTestObject('Webtables/Elements/Links/links_home'), 0)

WebUI.click(findTestObject('Webtables/Elements/Links/links_home'))

WebUI.waitForElementPresent(findTestObject('Webtables/Elements/Links/verify_outputLinkHome'), 0)

WebUI.verifyElementVisible(findTestObject('Webtables/Elements/Links/verify_outputLinkHome'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Webtables/Elements/Links/links_homeDynamic'))

WebUI.waitForElementPresent(findTestObject('Webtables/Elements/Links/verify_outputLinkHome'), 0)

WebUI.verifyElementVisible(findTestObject('Webtables/Elements/Links/verify_outputLinkHome'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Webtables/Elements/Links/links_created'), 0)

WebUI.click(findTestObject('Webtables/Elements/Links/links_created'))

WebUI.verifyElementText(findTestObject('Webtables/Elements/Links/verify_response'), 'Link has responded with staus 201 and status text Created')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Webtables/Elements/Links/links_noContent'))

WebUI.verifyElementText(findTestObject('Webtables/Elements/Links/verify_response'), 'Link has responded with staus 204 and status text No Content')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Webtables/Elements/Links/links_moved'))

WebUI.verifyElementText(findTestObject('Webtables/Elements/Links/verify_response'), 'Link has responded with staus 301 and status text Moved Permanently')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Webtables/Elements/Links/links_badRequest'))

WebUI.verifyElementText(findTestObject('Webtables/Elements/Links/verify_response'), 'Link has responded with staus 400 and status text Bad Request')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Webtables/Elements/Links/links_unauthorized'))

WebUI.verifyElementText(findTestObject('Webtables/Elements/Links/verify_response'), 'Link has responded with staus 401 and status text Unauthorized')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Webtables/Elements/Links/links_forbidden'))

WebUI.verifyElementText(findTestObject('Webtables/Elements/Links/verify_response'), 'Link has responded with staus 403 and status text Forbidden')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Webtables/Elements/Links/links_notFound'))

WebUI.verifyElementText(findTestObject('Webtables/Elements/Links/verify_response'), 'Link has responded with staus 404 and status text Not Found')

WebUI.takeScreenshot()

