package suporte;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.SimpleTimeZone;

public class Generator {
    public static String datahoraArquivo(){
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        return new SimpleDateFormat("yyyyMMddhhmmss").format(ts);
    }
}
