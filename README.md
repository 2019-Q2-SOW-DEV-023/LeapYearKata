##Leap Years##

This application checks if a year is a leap year, so that there is an extra day as February 29 and total 366 days in those years.

####Acceptance Criteria:####

1. All years divisible by 400 are leap years (example, 2000 was a leap year)
2. All years divisible by 100 but not by 400 are NOT leap years (example, 1700, 1800, 1900, 2100 are not leap years)
3. All years divisible by 4 but not by 100 are leap years (example, 2008, 2012, 2016 are leap years)
4. All years not divisible by 4 are Not leap years (example, 2017, 2018, 2019 are not leap years).

**Additional rule:**

1. All years divisible by 4000 are NOT leap years

####Running the tests:####

**From command prompt:**

1. After checking out the project from Github, Open a command prompt window and go to the directory of the project.

2. Run "mvn clean test"

**From IDE:**

1. Import as Maven project

2. Run As Maven test

####Running the test coverage:####

1. From cmd, navigate to the project directory, run "mvn clean verify"  
OR,  
From IDE, Run as Maven verify
2. Go to the project directory -> target -> site -> jacoco -> index.html  
This is the HTML report of the coverage, can be opened in any browser
3. We can further drill down to the detail level of report  
[Note: Main class LeapYearLauncher is not covered by any test case]


####Launching the application:####

From IDE, launch the Main class: LeapYearLauncher.java with arguments as years.
It accepts multiple years separated by space. 
It can only accept valid years (i.e positive integers). 

Example, if we pass the arguments as-  
2016 1700 2000

After run we can see the result in console as-  
2016 isLeapYear? : true  
1700 isLeapYear? : false  
2000 isLeapYear? : true  


