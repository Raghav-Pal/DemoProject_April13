import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as Keys

WebUI.openBrowser('https://google.com')

WebUI.setText(findTestObject('GoogleTest/Page_Google/input_Sign in_q'), 'hexaware')

not_run: WebUI.click(findTestObject('GoogleTest/Page_Google/input_Remove_btnK'))

//WebUI.sendKeys(findTestObject('GoogleTest/Page_Google/input_Sign in_q'),Keys.ENTER )
WebUI.sendKeys(findTestObject('Object Repository/Page_Google/input_Sign in_q'), Keys.chord(Keys.ENTER))

