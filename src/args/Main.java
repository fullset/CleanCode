package args;

/**
 * Created by Интернет on 28.04.2018.
 */
public class Main {
    public static void main(String[] args){
        try {
            Args arg = new Args("l,p#,d*", args);
            boolean logging = arg.getBoolean('l');
            int port = arg.getInteger('p');
            String directory = arg.getString('d');
            System.out.printf("logging:\t%b\nport:\t%d\ndirectory:\t%s\n", logging, port, directory);
        } catch (ArgsException e){
            System.out.printf("Argument error: %s\n", e.errorMessage());
        }
    }
}
