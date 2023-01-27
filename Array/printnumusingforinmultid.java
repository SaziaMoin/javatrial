package Array;
class number {
    void num() {
        int[][] n = {{27, 42, 77}, {26, 28, 20}};
        //for(int i =0; i < n.length;i++)
        for (int i = 0; i < 2; i++) {
            //for(int j=0; j < n[i].length ;j++)
            for (int j = 0; j < 3; j++) {
                System.out.println(n[i][j]);
            }
        }
    }
}
public class printnumusingforinmultid {
    public static void main(String[] args) {
    number n1=new number();
    n1.num();
    }
}
