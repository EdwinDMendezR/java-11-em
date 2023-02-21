package nest.based.access.control;

public class OuterClass {

    public void someMethod() {
        InnerClass innerClass = new InnerClass();
        innerClass.innerMethod();
    }

    private static class InnerClass {
        private void innerMethod() {
            System.out.println("***** innerMethod *****");
        }
    }

    @SuppressWarnings("NestedClasse")
    static void foo() {
        new InnerClass().innerMethod();
    }

}
