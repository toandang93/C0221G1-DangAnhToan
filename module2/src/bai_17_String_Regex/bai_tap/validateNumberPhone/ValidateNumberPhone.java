package bai_17_String_Regex.bai_tap.validateNumberPhone;

import javafx.beans.binding.NumberBinding;

import java.util.regex.Pattern;

public class ValidateNumberPhone {
    private static final String NUMBER_REGEX = "^[0-9]{2}-[0-9]{8}$";

    public ValidateNumberPhone() {
    }
    public boolean validate(String regex){
        return Pattern.matches(NUMBER_REGEX,regex);
    }
}
