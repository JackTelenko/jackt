# ---------------------------------------
# CSCI 127, Joy and Beauty of Data
# Program 1: GPA Calculator 
# Jack Telenko
# Last Modified: September 24, 2018 
# ---------------------------------------
# Out Lab #1, GPA Calculator
# ---------------------------------------
def main():

    numCourse = 0
    credit = 0.0
    totCred = 0.0
    totPoint = 0.0
    grade = 0.0
    count = 0

    numCourse = int(input("Enter number of courses you are taking: "))
    for count in range(count, numCourse): 
        print("For class #", count+1, ":")
        grade = input("Enter grade for course: ")
        credit = int(input("Enter credits for course: "))

        if grade == 'A' or grade == 'a':
            totPoint = totPoint + (credit * 4.0)
            totCred = totCred + credit
        elif grade == 'A-' or grade == 'a-':
            totPoint = totPoint + (credit * 3.7)
            totCred = totCred + credit
        elif grade == 'B+' or grade == 'b+':
            totPoint = totPoint + (credit * 3.3) 
            totCred = totCred + credit
        elif grade == 'B' or grade == 'b':
            totPoint = totPoint + (credit * 3.0)
            totCred = totCred + credit
        elif grade == 'B-' or grade == 'b-':
            totPoint = totPoint + (credit * 2.7)
            totCred = totCred + credit
        elif grade == 'C+' or grade == 'c+':
            totPoint = totPoint + (credit * 2.3)
            totCred = totCred + credit
        elif grade == 'C' or grade == 'c':
            totPoint = totPoint + (credit * 2.0)
            totCred = totCred + credit
        elif grade == 'C-' or grade == 'c-':
            totPoint = totPoint + (credit * 1.7)
            totCred = totCred + credit
        elif grade == 'D+' or grade == 'd+':
            totPoint = totPoint + (credit * 1.3)
            totCred = totCred + credit
        elif grade == 'D' or grade == 'd':
            totPoint = totPoint + (credit * 1.0)
            totCred = totCred + credit
        elif grade == 'F' or grade == 'f':
            totPoint = totPoint + (credit * 0.0)
            totCred = totCred + credit
        else:
            print("Enter valid number")
   
    gpa = (totPoint / totCred)
    gpa = round(gpa, 2)
    print ("Your GPA is: ", gpa)
	
main()
