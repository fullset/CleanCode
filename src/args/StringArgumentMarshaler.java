package args;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Интернет on 27.04.2018.
 */
public class StringArgumentMarshaler implements ArgumentMarshaler {
    private String stringValue = "";

    public void set(Iterator<String> currentArgument)throws ArgsException {
        try {
            stringValue = currentArgument.next();
        } catch (NoSuchElementException e){
            throw new ArgsException(ErrorCode.MISSING_STRING);
        }
    }

    public static String getValue(ArgumentMarshaler am) {
        if (am != null && am instanceof StringArgumentMarshaler)
            return ((StringArgumentMarshaler)am).stringValue;
        else
            return "";
    }
}
