import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDomain {

    public static void main(String[] args) {
        String url = "https://www.packtpub.com/application-development/mastering-java-9";
        String regex = "(http[s])(?:://)([w]{0,3}\\\\.?[a-zA-Z]+\\\\.[a-zA-Z]{2,3})(?:[/])(.*)";//regexr expression
        System.out.println(regex);

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(url);

        boolean foundMatches = matcher.find();
        if (foundMatches == true) {
            String protocol = matcher.group(1);//Extract groups into variables
            String domain = matcher.group(2);
            String path = matcher.group(3);
            System.out.println("Protocol: " + protocol);
            System.out.println("domain: " + domain);
            System.out.println("Path: " + path);
        }
    }
}
