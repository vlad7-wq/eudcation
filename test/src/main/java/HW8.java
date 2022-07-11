import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HW8 {
    public static void main(String[] args) {
        String str = "sausage, sausage, butter, milk.";
        text(str);
    }



    public static void text(String str) {
        Set<String> list=new HashSet<>(Arrays.asList(str.replace(".", "").split(", ")));
        for (String st:list) {
            String n=st.substring(0,1).toUpperCase();
            String m=st.substring(1);
            String result = n + m;
            System.out.println(result);
        }
    }
}
