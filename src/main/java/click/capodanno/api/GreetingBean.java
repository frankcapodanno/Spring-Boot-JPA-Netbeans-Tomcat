package click.capodanno.api;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 * @author frank <francesco@capodanno.click>
 */
public class GreetingBean {
    
    String date;
    String str;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
    
    public GreetingBean() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        date = sdf.format(timestamp);
        this.str = "Basic API started go to /testdb for check the connection with the DB";
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
