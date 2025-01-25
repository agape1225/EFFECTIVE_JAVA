import java.util.Objects;

public class CaseInsensitiveString implements Comparable<CaseInsensitiveString>{
    private final String s;
    public CaseInsensitiveString(String s){
        this.s = Objects.requireNonNull(s);
    }



    @Override
    public boolean equals(Object o) {
        if(o instanceof CaseInsensitiveString)
            return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
        if(o instanceof String)
            return s.equalsIgnoreCase((String) o);

        return false;
    }

    @Override
    public int compareTo(CaseInsensitiveString cis) {
        return String.CASE_INSENSITIVE_ORDER.compare(s, cis.s);
    }
}
