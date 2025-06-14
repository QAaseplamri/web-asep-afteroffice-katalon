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
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.interactions.Actions
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import org.openqa.selenium.WebDriver

WebUI.scrollToElement(findTestObject('Webtables/Elements/Links/links'), 0)

WebUI.click(findTestObject('Webtables/Elements/Links/links'))

WebUI.verifyElementText(findTestObject('Webtables/Elements/Links/text_links'), 'Links')

WebUI.scrollToElement(findTestObject('Webtables/Elements/Links/links_home'), 0)

//WebUI.click(findTestObject('Webtables/Elements/Links/links_home'))

TestObject link = findTestObject('Webtables/Elements/Links/links_home')

def element = WebUiCommonHelper.findWebElement(link, 10)

Actions action = new Actions(DriverFactory.getWebDriver())
action.keyDown(Keys.CONTROL).click(element).keyUp(Keys.CONTROL).build().perform()

WebDriver driver = DriverFactory.getWebDriver()

// Dapatkan semua tab (window handles)
ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles())

// Pindah ke tab ke-2 (index 1)
driver.switchTo().window(tabs[1])

WebUI.waitForElementPresent(findTestObject('Webtables/Elements/Links/verify_outputLinkHome'), 0)

WebUI.verifyElementVisible(findTestObject('Webtables/Elements/Links/verify_outputLinkHome'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

// Tutup tab saat ini (tab kedua)
driver.close()

// Kembali ke tab pertama
driver.switchTo().window(tabs[0])

//WebUI.click(findTestObject('Webtables/Elements/Links/links_homeDynamic'))

TestObject link1 = findTestObject('Webtables/Elements/Links/links_homeDynamic')
def element1 = WebUiCommonHelper.findWebElement(link1, 10)

action.keyDown(Keys.CONTROL).click(element1).keyUp(Keys.CONTROL).build().perform()

// Dapatkan semua tab (window handles)
ArrayList<String> tabs1 = new ArrayList<>(driver.getWindowHandles())

// Pindah ke tab ke-2 (index 1)
driver.switchTo().window(tabs1[1])

WebUI.waitForElementPresent(findTestObject('Webtables/Elements/Links/verify_outputLinkHome'), 0)

WebUI.verifyElementVisible(findTestObject('Webtables/Elements/Links/verify_outputLinkHome'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

// Tutup tab saat ini (tab kedua)
driver.close()

// Kembali ke tab pertama
driver.switchTo().window(tabs[0])

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

