import java.util.Scanner;

public class UFClient2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int e = input.nextInt();
        int t = input.nextInt();
        UF uf = new UF(e);
        int res = 1;
        for(int i=0; i<t; ++i) {
            int x = input.nextInt();
            int y = input.nextInt();
            if(!uf.connected(x, y)) {
                uf.union(x, y);
                if(uf.cnt!=1) res++;
            }
        }
        if(uf.cnt==1) {
            System.out.println(res);
        } else {
            System.out.println("FAILED");
        }
    }
}
