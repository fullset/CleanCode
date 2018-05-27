package args;

import java.util.Iterator;

/**
 * Created by Интернет on 26.04.2018.
 */
public interface ArgumentMarshaler {
    void set(Iterator<String> currentArgument) throws ArgsException;
}
