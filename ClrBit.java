package Problems;
import java.util.*;
public class ClrBit {
    public static void main(String[] args) {
        int bit = 5;
        int positon = 2;
        int bitmarks = 1<<positon;
        int tildBit = ~(bitmarks);
        int clearBit = tildBit & bit ;
        System.out.println(clearBit);
    }
}
