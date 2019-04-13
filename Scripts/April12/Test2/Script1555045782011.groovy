import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hexaware.com/')

WebUI.click(findTestObject('Object Repository/Page_Hexaware - IT BPO Consulting and Next-Generation Services/dialog_This site would like to place a cookie on your browser to help us better deliver relevant and valuable content to youOKCancel'))

WebUI.click(findTestObject('Object Repository/Page_Hexaware - IT BPO Consulting and Next-Generation Services/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Page_Hexaware - IT BPO Consulting and Next-Generation Services/a_SERVICES'))

WebUI.click(findTestObject('Object Repository/Page_Hexaware - IT BPO Consulting and Next-Generation Services/a_Business Intelligence and Analytics'))

WebUI.closeBrowser()

