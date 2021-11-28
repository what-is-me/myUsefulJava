import java.io.IOException;

public class Jin {
    public static char getchar() {
        char c = 0;
        try {
            c = (char) System.in.read();
        } catch (IOException e) {
            ;
        }
        return c;
    }

    public static String get() {
        String t = new String();
        while (t.isBlank()) {
            t = new String();
            char c = ' ';
            while ((c = getchar()) != ' ' && c != '\r' && c != '\n' && c != '\t')
                t += c;
        }
        return t.trim();
    }

    public static JString read() {
        char ch = getchar();
        boolean flag = false, flag2 = false;
        while (ch < '0' || ch > '9') {
            if (ch == '-')
                flag = true;
            ch = getchar();
        }
        String t = new String(flag ? "-" : "");
        while ((ch >= '0' && ch <= '9') || ch == '.') {
            if (ch == '.') {
                if (flag2) {
                    System.err.println("Too many dots!");
                    return new JString(t.trim());
                }
                flag2 = true;
            }
            t += ch;
            ch = getchar();
        }
        return new JString(t.trim());
    }

    public static String getline() {
        String t = new String();
        char c = ' ';
        while ((c = getchar()) != '\r' && c != '\n')
            t += c;
        return t;
    }
}

class JString {
    String s;

    JString() {
        s = new String();
    }

    JString(String s) {
        this.s = s;
    }

    public Integer to_Integer() {
        return Integer.valueOf(s);
    }

    public int to_int() {
        return Integer.valueOf(s).intValue();
    }

    public Double to_Double() {
        return Double.valueOf(s);
    }

    public double to_double() {
        return Double.valueOf(s).doubleValue();
    }

    public Long to_Long() {
        return Long.valueOf(s);
    }

    public long to_long() {
        return Long.valueOf(s).longValue();
    }

    public String to_String() {
        return s;
    }

}