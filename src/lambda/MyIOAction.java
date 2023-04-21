package lambda;

import java.io.IOException;
import java.io.Reader;

interface MyIOAction {
    boolean ioAction(Reader rdr) throws IOException;
}
