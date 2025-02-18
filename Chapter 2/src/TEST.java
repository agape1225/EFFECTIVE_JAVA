import java.io.*;
import java.util.*;

public class TEST {
    Map<PhoneNumber, String> m = new HashMap<>();
    m.put(new PhoneNumber(707, 867, 5309), "JENNI" );

    m.get(new PhoneNumber(707, 867, 5309));

    private static final Comparator<PhoneNumber> COMPARATOR =
            Comparator.comparingInt((PhoneNumber pn) -> pn.areaCode)
                    .thenComparingInt(pn -> pn.prefix)
                    .thenComparingInt(pn -> on.lineNum);

    public int compareTo(PhoneNumber pn){
        return COMPARATOR.compare(this, pn);
    }

    @Override
    public int hasCode() {
        int result = Short.hashCode(areaCode);
        result = 31 * result + Short.hashCode(prefix);
        result = 31 * result + Short.hashCode(lineNum);

        return result;
    }

    /*
    * 이 전화번호의 문자열 표현을 반환한다.
    * 이 분자열은 "XXX-YYY-ZZZZ" 형태의 12글자로 구성된다.
    * XXX는 지역 코드, YYY는 프리픽스, ZZZZ는 가입자 번호다.
    * 각각의 대문자는 10진수 숫자 하나를 나타낸다.
    * */
    @Override
    public String toString() {

    }

    @Override
    public PhoneNumber clone() {
        try{
            return (PhoneNumber) super.clone();
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

    static String firstLineOfFile(String path, String defaultVal) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new FileReader(path));
                FileInputStream is = new FileInputStream("/Users/limjun-young/test.txt");
        ){
            return br.readLine();
        }catch (IOException e) {
            return defaultVal;
        }
    }

    static Comparator<Object> hashCodeOrder = Comparator.comparingInt(o -> o.hashCode());

    private static final Thing[] PRIVATE_VALUES = {};
    public static final Thing[] values() {
        return PRIVATE_VALUES.clone();
    }
    public  static final List<Thing> VALUES = Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));
}

public Yum(Yum yum){ ... };

public static Yum newInstance(Yum yum){ ... };

public static Set union(Set s1, Set s2) {
    Set result = new HashSet(s1);
    result.addAll(s2);
    return result;
}

public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
    Set<E> result = new HashSet<>(s1);
    result.addAll(s2);
    return result;
}

Stack<Number> numberStack = new Stack<>();
Iterable<Integer> integers = ...;
numberStack.pushAll(integers);
