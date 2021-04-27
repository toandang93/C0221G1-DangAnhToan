package bai_17_String_Regex.bai_tap.validateClass;

import java.util.regex.Pattern;

public class ValidateClass {
    private static final String CLASS_REGEX = "^[CAP]+[0-9]{4}+[GHIKLM]$";

    public ValidateClass() {
    }

    public boolean validate(String regex){
        return Pattern.matches(CLASS_REGEX,regex);
    }
}
