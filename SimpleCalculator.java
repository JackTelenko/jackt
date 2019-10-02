package AllLabs;

public class SimpleCalculator {

    // Fields
    // TODO: We need a way to keep track of the running total here

    //keeping track of total. I used a double because when i tried to
    //use a float the math.pow operator said float was unacceptable
    double runningTotal = 0;

    // Constructor (default is the empty constructor, which works here)

    // Methods
    //while loop to check whether valid operator was entered and if not re-prompts user to enter valid operator
    public boolean checkUserOp(String op) {
        // FIXME: only return true only on valid arithmetic character, otherwise re-prompt user and return false
        while (op.equals("+")|| op.equals("-")|| op.equals("*")|| op.equals("^")|| op.equals("/")|| op.equals("="))
            return true;
            System.out.println("I need a valid operator. Please enter a new operator (+,-,^,*,/): ");
            return false;

    }


    //telling program what to do in each operator situation
    public void calculateAnswer(String op, double nextVal) {
        // TODO: depending on the operator and the next value, update the runningTotal
        if (op.equals("+")){
            runningTotal+=nextVal;
        }
        else if(op.equals("-")){
            runningTotal-=nextVal;
        }
        else if(op.equals("*")) {
            runningTotal *= nextVal;
        }
        else if(op.equals("/")) {
            runningTotal /= nextVal;
        }
        //math.pow operator to use power function
        else if(op.equals("^")) {
            runningTotal = Math.pow(runningTotal, nextVal);
        }

    }
    //printing running total
    public void printAnswer() {
        // TODO: print the answer for the user to see
        System.out.println("Total is now: " + runningTotal);
    }
}
