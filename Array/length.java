package Array;
    class personage {
        void array() {
            int[] age = new int[3];//3 is a length(size)

            age[0] = 10;
            age[1] = 20;
            age[2] = 40;
            System.out.println(age[0]);
            System.out.println(age[1]);
            System.out.println(age[2]);

            //lenght
            System.out.println(age.length);//length wii be 3 beacause size is 3.
    }
}
public class length {
    public static void main(String[] args) {
        personage p = new personage();
        p.array();
    }
}
