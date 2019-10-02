package prj05;

public class StackTestDriver {
    public static void main(String[] args){

        // test doubly linked list stack
        LinkedStack<String> dllTestStack = new LinkedStack<>();
        //DoublyLinkedList<String> DLL = new DoublyLinkedList<>();

        dllTestStack.push("one");
        dllTestStack.push("two");
        dllTestStack.push("three");
        dllTestStack.push("four");
        dllTestStack.push("five");

        System.out.println(dllTestStack.toString());

        dllTestStack.pop();
        dllTestStack.pop();
        System.out.println(dllTestStack.toString());


        //testing validator
        CallStackValidator tester = new CallStackValidator();

        // should validate

        String callStack = "A calls B B calls C C halts B halts A halts";
        System.out.println(tester.isValid(callStack));

        callStack = "A calls B B calls C C calls D D halts C calls E E halts C halts B halts A halts";
        System.out.println(tester.isValid(callStack));

        callStack = "A calls A A halts A halts";
        System.out.println(tester.isValid(callStack));

        callStack = "main calls functionA functionA calls testMe testMe halts functionA calls runRun runRun halts functionA halts main halts";
        System.out.println(tester.isValid(callStack));

        // Should fail

        callStack = "main calls A A calls B A calls C B halts C halts A halts main halts";
        System.out.println(tester.isValid(callStack));

        callStack = "A calls B B halts";
        System.out.println(tester.isValid(callStack));
    }
}
