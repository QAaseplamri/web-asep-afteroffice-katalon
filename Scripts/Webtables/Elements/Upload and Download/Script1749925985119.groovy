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
import java.nio.file.*
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl(GlobalVariable.url)
//
//WebUI.maximizeWindow()
//
//WebUI.waitForElementVisible(findTestObject('Webtables/toolsQA'), 0)
//
//WebUI.verifyElementVisible(findTestObject('Webtables/toolsQA'))
//
//WebUI.scrollToElement(findTestObject('Webtables/element'), 0)
//
//WebUI.click(findTestObject('Webtables/element'))

WebUI.scrollToElement(findTestObject('Webtables/Elements/Upload and Download/uploadDanDownload'), 0)

WebUI.click(findTestObject('Webtables/Elements/Upload and Download/uploadDanDownload'))

WebUI.verifyElementText(findTestObject('Webtables/Elements/Upload and Download/text_uploadDanDownload'), 'Upload and Download')

WebUI.scrollToElement(findTestObject('Webtables/Elements/Upload and Download/button_download'), 0)

WebUI.click(findTestObject('Webtables/Elements/Upload and Download/button_download'))

WebUI.delay(15)

String downloadPath = 'C:/Users/ACER/Downloads'

String fileName = 'sampleFile.jpeg'

String fullPath = (downloadPath + '\\') + fileName

File downloadedFile = new File(fullPath)

if (downloadedFile.exists()) {
    println('File berhasil didownload: ' + fileName)
} else {
    KeywordUtil.markFailed('File tidak ditemukan: ' + fileName)
}

WebUI.uploadFile(findTestObject('Webtables/Elements/Upload and Download/button_pilihFile'), 'C:\\Users\\ACER\\Pictures\\test.png')

WebUI.verifyElementVisible(findTestObject('Webtables/Elements/Upload and Download/verify_output'))

WebUI.takeScreenshot()

