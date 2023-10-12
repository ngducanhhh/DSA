import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class Solve {
    public static boolean check(List<Integer> arr, int n) {
        for(int i=0; i<n-1; ++i) {
            if(arr.get(i) > arr.get(i+1)) return false;
        }
        return true;
    }

    public static String printArray(List <Integer> arr) {
        int[] newArr = arr.stream().mapToInt(i -> i).toArray();
        return Arrays.stream(newArr).mapToObj(j -> String.valueOf(j)).collect(Collectors.joining(" "));
    }

    public static void insertionSort2(int n, List<Integer> arr) {
        // Write your code here
        if(check(arr, n)) {
            System.out.println(printArray(arr));
        } else {
            for(int i=1; i<n; ++i) {
                int j = i-1;
                int res = arr.get(i);
                while(j>=0 && arr.get(j) > res) {
                    arr.set(j+1, arr.get(j));
                    --j;
                }
                arr.set(j+1, res);
                System.out.println(printArray(arr));
            }
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Solve.insertionSort2(n, arr);

        bufferedReader.close();
    }
}
