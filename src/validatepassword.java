import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validatepassword {

    public static void main(String[]args) {

        String password = "abcde1234@";
        System.out.println(hasSpecialCharcter(password));
        System.out.println(isSpace(password));
    }

    public static boolean isSpace(String password) {
        for (char currentChar : password.toCharArray()) {
            if (Character.isWhitespace(currentChar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasSpecialCharcter(String password) {
        Pattern sPattern = Pattern.compile("[a-zA-Z0-9]*");
        Matcher sMatcher = sPattern.matcher(password);

        if(!sMatcher.matches()) {
            return true;
        }
        return false;
    }


}


