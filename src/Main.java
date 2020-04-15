public class Main {
    private static final String[] validName = {"C0318G", "C0220H","P9999M"};
    private static final String[] inValidName = {"M0318G", "P0323A","C0220I1"};

    public static void main(String[] args) {
        ClassName className = new ClassName();
        for (String classNameExp : validName) {
            boolean isValid = className.validate(classNameExp);
            System.out.println("ClassName " + classNameExp + " is validate: " + isValid);
        }

        System.out.println("=============================================");

        for (String classNameExp: inValidName) {
            boolean isValid = className.validate(classNameExp);
            System.out.println("ClassName " + classNameExp + " is validate: " + isValid);
        }
    }
}
