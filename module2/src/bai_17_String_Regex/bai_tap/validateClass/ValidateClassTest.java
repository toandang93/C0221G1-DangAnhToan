package bai_17_String_Regex.bai_tap.validateClass;

public class ValidateClassTest {
    private static ValidateClass validateClass;
    public static final String[] validClass = new String[]{"C0318G"};
    public static final String[] invalidClass = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
        validateClass = new ValidateClass();
        for (String testClass : validClass){
            boolean isvalid = validateClass.validate(testClass);
            System.out.println("Class is "+testClass+" is valid: "+ isvalid);
        }
        for (String testClass : invalidClass){
            boolean isvalid = validateClass.validate(testClass);
            System.out.println("Class is "+testClass+" is va lid : "+ isvalid);
        }
    }
}
