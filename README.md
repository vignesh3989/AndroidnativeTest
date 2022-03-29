Page object model Framework developed using Java with TestNG - its an design pattern that creates an object repository for storing all web elements.
In Page Object Model, consider each web page of an application as a class file. Each class file will contain only corresponding web page elements.

Current framework can be able to work with android including physical devices, emulators.

Prerequisites:
An IDE (Eclipse/IntelliJ IDEA)
Appium Server
Android Studio

How to use this framework?

Clone the repository to your workspace.
In the testdata sheet --->Choose the test data you want to pass to the testcase from excel sheet.
The data from the excel sheet will be passed to the test method.
Run the testng.xml file. You can even run as mvn test which will trigger the testng.xml

How the framework works?

Dataprovider class is reponsible for reading the data in testdata.xlsx It sets the annotation of the test methods like description,dataprovider values read from the excel

How to run on different mobile devices or emulators?
Type adb devices in the cmd(Make sure adb is installed and path set correctly)
Device name can be anything but not null(Used to denote the device where you are running the test like e.g.MyDevice)

Other tips:
Reusable methods are placed in Baseclass.java and can be utilised in your tests.
Make sure that your appium server is up and running before starting the tests.

Features that can be automated are follows:
Reset password
Check all the menus and see if the content is available
change the country and check the content and also verify business critical scenarios like registration,login etc
deposit and withdraw money
verify bonus offers
Place a bet - Active bonuses screen
Verify withdrawls and deposits
Special offers
Account details - personal details,contact preferences,Account closure
Statistics with categories
Sports betting
Search feature






