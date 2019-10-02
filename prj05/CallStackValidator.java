package prj05;

public class CallStackValidator {

    //isValid method to check statement

    public static boolean isValid(String calls) {

        Stack<String> stk = new LinkedStack<>();

        //splits string
        String strArray[] = calls.split(" ");

        for (int k = 0; k < strArray.length; k++) {
            if (k == 0) {
                stk.push(strArray[k]);
                //checks if statement says calls
            } else if (strArray[k].equals("calls")) {
                if (!stk.top().equals(strArray[k - 1])) {
                    return false;
                }
                stk.push(strArray[k + 1]);
            }
            //if halts it pops stack
            if (strArray[k].equals("halts")) {
                stk.pop();
            }
        }
        return stk.isEmpty();
    }
}
