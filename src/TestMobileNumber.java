import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMobileNumber {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[(][\\d]{2}[)]-[(][0][0-9]{9,10}[)]$");
        Matcher matcher1 = pattern.matcher("(84)-(0978489648)"); // true
        System.out.println(matcher1.matches());
        Matcher matcher2 = pattern.matcher("(84)-(098598669712)"); // false
        System.out.println(matcher2.matches());
        Matcher matcher3 = pattern.matcher("(84)-(087211abcs)"); // false
        System.out.println(matcher3.matches());
        Matcher matcher4= pattern.matcher("(84)-(0985986697)"); // true
        System.out.println(matcher4.matches());
    }
}
