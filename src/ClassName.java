import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String CLASS_NAME="^[CAP]\\d{4}[GHIKLM]$";
    public ClassName(){
     pattern=Pattern.compile(CLASS_NAME);
    }
    public boolean validate(String regex) {
         matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
