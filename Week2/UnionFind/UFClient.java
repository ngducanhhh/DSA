import java.util.Scanner;
public class UFClient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int e = input.nextInt();
        int t = input.nextInt();
        UF uf = new UF(e);
        for(int i=0; i<t; ++i) {
            int x = input.nextInt();
            int y = input.nextInt();
            if(!uf.connected(x, y)) {
                uf.union(x, y);
                System.out.println(x + " " + y);
            }
        }
    }
}
