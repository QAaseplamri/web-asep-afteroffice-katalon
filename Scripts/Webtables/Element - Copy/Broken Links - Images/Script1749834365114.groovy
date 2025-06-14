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

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl(GlobalVariable.url)
//
//WebUI.maximizeWindow()
//
//WebUI.waitForElementVisible(findTestObject('Webtables/Elements/toolsQA'), 0)
//
//WebUI.verifyElementVisible(findTestObject('Webtables/Elements/toolsQA'))
//
//WebUI.scrollToElement(findTestObject('Webtables/Elements/element'), 0)
//
//WebUI.click(findTestObject('Webtables/Elements/element'))

WebUI.scrollToElement(findTestObject('Webtables/Elements/Broken Links - Images/brokenLinksImages'), 0)

WebUI.click(findTestObject('Webtables/Elements/Broken Links - Images/brokenLinksImages'))

WebUI.verifyElementText(findTestObject('Webtables/Elements/Broken Links - Images/text_brokenLinksImages'), 'Broken Links - Images')

WebUI.scrollToElement(findTestObject('Webtables/Elements/Broken Links - Images/img_validImage'), 0)

WebUI.waitForElementPresent(findTestObject('Webtables/Elements/Broken Links - Images/img_validImage'), 0)

WebUI.verifyElementVisible(findTestObject('Webtables/Elements/Broken Links - Images/img_validImage'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Webtables/Elements/Broken Links - Images/img_brokenImage'), 0)

WebUI.verifyElementVisible(findTestObject('Webtables/Elements/Broken Links - Images/img_brokenImage'), FailureHandling.STOP_ON_FAILURE)

TestObject link = findTestObject('Webtables/Elements/Broken Links - Images/link_validLink')
def element = WebUiCommonHelper.findWebElement(link, 10)

Actions action = new Actions(DriverFactory.getWebDriver())
action.keyDown(Keys.CONTROL).click(element).keyUp(Keys.CONTROL).build().perform()

WebDriver driver = DriverFactory.getWebDriver()

// Dapatkan semua tab (window handles)
ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles())

// Pindah ke tab ke-2 (index 1)
driver.switchTo().window(tabs[1])

WebUI.waitForElementPresent(findTestObject('Webtables/Elements/Broken Links - Images/verify_outputLinkValid'), 0)

WebUI.verifyElementVisible(findTestObject('Webtables/Elements/Broken Links - Images/verify_outputLinkValid'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

// Tutup tab saat ini (tab kedua)
driver.close()

// Kembali ke tab pertama
driver.switchTo().window(tabs[0])

TestObject link1 = findTestObject('Webtables/Elements/Broken Links - Images/link_brokenLink')
def element1 = WebUiCommonHelper.findWebElement(link1, 10)

action.keyDown(Keys.CONTROL).click(element1).keyUp(Keys.CONTROL).build().perform()

// Dapatkan semua tab (window handles)
ArrayList<String> tabs1 = new ArrayList<>(driver.getWindowHandles())

// Pindah ke tab ke-2 (index 1)
driver.switchTo().window(tabs1[1])

//WebUI.sendKeys(findTestObject('Webtables/Elements/Broken Links - Images/link_brokenLink'), Keys.chord(Keys.CONTROL, Keys.COMMAND))

WebUI.waitForElementPresent(findTestObject('Webtables/Elements/Broken Links - Images/verify_outputBrokenLink'), 0)

WebUI.verifyElementVisible(findTestObject('Webtables/Elements/Broken Links - Images/verify_outputBrokenLink'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

// Tutup tab saat ini (tab kedua)
driver.close()

// Kembali ke tab pertama
driver.switchTo().window(tabs[0])


