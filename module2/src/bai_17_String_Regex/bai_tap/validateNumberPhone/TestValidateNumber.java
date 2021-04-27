package bai_17_String_Regex.bai_tap.validateNumberPhone;

public class TestValidateNumber {
    private static ValidateNumberPhone validateNumberPhone;
    public static final String[] testValidNumberPhone = new String[]{"84-34567890","84-a8949393","00-0000.0000","84,00009999","aa-1111111"};

    public static void main(String[] args) {
        validateNumberPhone = new ValidateNumberPhone();
        for (String testValid : testValidNumberPhone){
            boolean isValid = validateNumberPhone.validate(testValid);
            System.out.println("Number is : "+testValid+" is valid "+isValid);
        }
    }
}
