import java.util.Properties;

public class HelloWorld {

    private static Properties prop = System.getProperties();

    public static void main(String [] args) {
        System.out.println(prop.getProperty("environment"));
    }
}
