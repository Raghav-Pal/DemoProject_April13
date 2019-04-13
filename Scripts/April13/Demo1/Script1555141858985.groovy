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

def num = 10

if (num > 0) {
    println('Number is positive')
} else {
    println('Number is negative')
}

def day = 'Saturday'

switch (day) {
    case 'Monday':
        println('Day is Monday')

        break
    case 'Tuesday':
        println('Day is Tuesday')

        break
    case 'Saturday':
        println('Day is Saturday')

        break
    default:
        println('Invalid day')

        break
}

for (def index : (0..1)) {
    println('Hello World')
}

def i = 1

while (i < 10) {
    println("Value of i is $i")

    i++
}



