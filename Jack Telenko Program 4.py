# -------------------------------------------------
# CSCI 127, Joy and Beauty of Data
# Program 4: Advising System
# Jack Telenko
# Last Modified:  11/6/18
# -------------------------------------------------
# Advising Program
# -------------------------------------------------
class Student: #create student class
    def __init__(self, firstName, lastName): #call constructor to iniate variables
        self.first = firstName
        self.last = lastName
        self.major = "" #set major as empty string
        self.major_troubles = False #setting majors and math to false so in def advise it says "if not false"
        self.math_troubles = False
    def get_first_name(self):
        return self.first
    
    def get_last_name(self):
        return self.last
    
    def get_major(self):
        return self.major
    
    def set_major(self, major):
        self.major = major
        
    def set_math_troubles(self, false):
        self.math_troubles = false

    def set_major_troubles(self, false):
        self.major_troubles = false

    def get_math_troubles(self):
        return self.math_troubles

    def get_major_troubles(self):
        return self.major_troubles

    def major_advising(self): #applies tp all majors
        print("because you are having troubles with your major:")
        print("--> visit your professor during office hours")
        print("--> visit your academic advisor")

    def math_advising(self): #applies to math
        print("because you are having troubles in math:")
        print("--> visit the Math Learning Center in Wilson 1-112")

class Generic_Major(Student): #creating a generic major class for people who have not declaired major yet
    def __init__(self, firstName, lastName):#(applies to all classes)=says go to student class which goes to main to retrieve all the info
        Student.__init__(self, firstName, lastName)
        Student.set_major(self, "Generic")

class CLS_Major(Student): #create class for other major types
    def __init__(self, firstName, lastName):
        Student.__init__(self, firstName, lastName)
        Student.set_major(self, "College of Letters and Sciences")

class COE_Major(Student):
    def __init__(self, firstName, lastName):
        Student.__init__(self, firstName, lastName)
        Student.set_major(self, "College of Engineering")

    def major_advising(self):
        print("because you are having troubles with your major:")
        print("--> visit the EMPower Student Center in Roberts 313")
        print("--> visit your professor during office hours")
        print("--> visit your academic advisor")
           
class Computer_Engineering_Major(Student):
    def __init__(self, firstName, lastName):
        Student.__init__(self, firstName, lastName)
        Student.set_major(self, "Computer Engineering")

    def major_advising(self):
        print("because you are having troubles with your major:")
        print("--> visit the EMPower Student Center in Roberts 313")
        print("--> visit your professor during office hours")
        print("--> visit your academic advisor")

class Physics_Major(Student):
    def __init__(self, firstName, lastName):
        Student.__init__(self, firstName, lastName)
        Student.set_major(self, "Physics")

    def major_advising(self):
        print("because you are having troubles with your major:")
        print("--> visit the Physics Learning Center in Barnard Hall 230")
        print("--> visit your professor during office hours")
        print("--> visit your academic advisor")

class Computer_Science_Major(Student):
    def __init__(self, firstName, lastName):
        Student.__init__(self, firstName, lastName)
        Student.set_major(self, "Computer Science")

    def major_advising(self):
        print("because you are having troubles with your major:")
        print("--> visit the CS Student Success Center in Barnard Hall 259")
        print("--> visit a CS professional advisor in Barnard Hall 357")
        print("--> visit the EMPower Student Center in Roberts 313")
        print("--> visit your professor during office hours")
        print("--> visit your academic advisor")
        




# -------------------------------------------------
# Do not change anything below this line
# -------------------------------------------------

def advise(student):
    print("Student:", student.get_first_name(), student.get_last_name())
    print("Major: " + student.get_major() + ", Major Troubles: " +
          str(student.get_major_troubles()) + ", Math Troubles: " +
          str(student.get_math_troubles()))
    print()
    if not student.get_math_troubles() and not student.get_major_troubles():
        print("No advising is necessary.  Keep up the good work!")
    else:
        student.major_advising()
        student.math_advising()
    print("------------------------------")

# -------------------------------------------------

def process(student):
    advise(student)
    student.set_major_troubles(True)
    student.set_math_troubles(True)
    advise(student)

# -------------------------------------------------

def main():

    # Every student has a major, even if it is "undeclared"
    msu_student = Generic_Major("jalen", "nelson")
    process(msu_student)

    msu_student.set_math_troubles(False)
    advise(msu_student)

    msu_student.set_math_troubles(True)
    msu_student.set_major_troubles(False)
    advise(msu_student)

    # A CLS (College of Letters and Science) major is a subclass of a Generic major
    msu_student = CLS_Major("emma", "phillips")
    process(msu_student)

    # A COE (College of Engineering) major is a subclass of a Generic major
    msu_student = COE_Major("camden", "miller")
    process(msu_student)

    # A Computer Engineering major is a subclass of a COE major
    msu_student = Computer_Engineering_Major("gabriel", "smith")
    process(msu_student)

    # A Physics major is a subclass of a CLS major
    msu_student = Physics_Major("lena", "hamilton")
    process(msu_student)

    # A Computer Science major is a subclass of a COE major
    msu_student = Computer_Science_Major("halley", "jones")
    process(msu_student)

    msu_student.set_math_troubles(False)
    advise(msu_student)

    msu_student.set_math_troubles(True)
    msu_student.set_major_troubles(False)
    advise(msu_student)
##
# -------------------------------------------------

main()
