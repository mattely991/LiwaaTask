Getting Started:
1. install Eclipse java photon :
https://www.eclipse.org/downloads/
2. Install Java Development Kit 8:
https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html#license-lightbox
3 . After Opening Eclipse ; install TestNG from Help << Eclipse marketplace,; by typing "TESNG" in the "Find" text area under "Search" tab.

To Open The Project:
1. Select File > Import;  In the import window, expand Maven, select "Existing Maven Projects", and click on "Next"
2.  Click on "Browse" and choose your project directory , then select your project from the "Project" Area and click on "Finish"


The Test Cases Covered the following (you can find them under Github Package>> Search.Java class :
1. Opening github.com should show a search box in the header panel, with placeholder text of �Search Github�.  >> @test Method : Part3_1
2.Searching for the text (repo) �python/cpython� should take the user to a new page showing a list of repos under a title �X repository results�, X being a number of matching repos.  >> @test Method: part 3_2
3.The first result for the search term should be the repo �python/cpython� with the following URL, https://github.com/python/cpython @test Method: Part 3_3
4. Clicking on the repo, should open its page. >>@test Method : Part 3_3
5.Within the readme section, confirm the existence of the CI statuses bar, like the following.>>@test Method : Part 4_4 


How To Run the Tests:
There is an XML file "Run_TestCases.xml" which include the tests under "Serach.Java" class .
1. Right Click on this file 
2. Choose "Run as TestNG Suite"
3. After finishing the run , you can see the report under "test-output" folder , 


Notes: 
1. I use Chrome  Version 85.0.4183.121 . So make sure that your chrome browser is 85
3. Build Path for Java 1.8 ; you can check this by :
a. Right Click on the project 
b. Choose "properties"
c. Check that Java build  path should be 1.8


Happy Testing !!!
