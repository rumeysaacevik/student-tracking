# student-tracking
Student affairs information system with Java

# 1) Main Purpose of the Project: 
The aim of the student tracking system is to enter grades and absences of teachers registered 
by admin and to keep track of students registered by admin. Detailed information about 
students and instructors can be followed.

# 2) Program Objects and Relationship:
   
2.1) adminLogin Object: Represents the admin. 

2.2) attendanceEntry Object: It represents the attendance entry screen by the instructor. 

2.3) courses Object: All courses are displayed by the admin and the selected course is removed. 

2.4) createCourses Object: Represents a new course registration made by admin. 

2.5) deletion Object: Represents deregistration by admin 

2.6) dropCourse Object: It represents that a course chosen by the student has been dropped by the student again. 

2.7) gradeEntry Object: Represents grades entered by the teacher  

2.8) homePage Object: Represents student and instructor login 

2.9) instructorLogin Object: Represents a list of actions the instructor wants to take 

2.10) instructors Object: Represents the listing of all instructors by the student so that information can be obtained  

2.11) registration Object: Represents student and teacher registration by admin. 

2.12) selectingCourse Object: Represent the student to view all courses and take the selected course 

2.13) studentLogin Object: Represents a list of actions the student wants to take 

# 3) Rules:
- The admin username and password are set automatically
- you will receive an error message when you try to log in with an unregistered student username
- you will receive an error message when you try to log in with an unregistered instructor username
- When entering a grade from an instructor, you will receive an error if you enter a grade that is not between 0 and 100.
- When you try to enter attendance information or grades for a student who is not registered, you will receive an error message.
- Multiple users cannot have the same ID.
- Multiple users cannot have the same student number.
- Multiple users cannot have the same username.
- You can delete courses one by one by selecting them. 
- You must select the student or instructor position during the registration process


![new 1](https://github.com/rumeysaacevik/student-tracking/assets/169652554/c57672b9-9ad0-420f-84b6-5b629b727b65)

![new 2](https://github.com/rumeysaacevik/student-tracking/assets/169652554/22a4b3a6-1501-4afd-934e-1bff77601ada)

![new 3](https://github.com/rumeysaacevik/student-tracking/assets/169652554/5f94f508-4d23-45ef-ac52-b6c24c38a447)


