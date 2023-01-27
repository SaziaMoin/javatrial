// find size and range of any datatype
public class findsizeandrange
{
    public static void main(String[] args) {
        System.out.println("size of integer = " +(Integer.SIZE/8)+" bytes");
        System.out.println("range = "+Integer.MIN_VALUE+ " to " +Integer.MAX_VALUE);

        System.out.println("size of character = " +(Character.SIZE/8)+" bytes");
        System.out.println("range = "+Character.MIN_VALUE+ " to " +Character.MAX_VALUE);

        System.out.println("size of float = " +(Float.SIZE/8)+" bytes");
        System.out.println("range = "+Float.MIN_VALUE+ " to " +Float.MAX_VALUE);

        System.out.println("size of byte = " +(Byte.SIZE/8)+" bytes");
        System.out.println("range = "+Byte.MIN_VALUE+ " to " +Byte.MAX_VALUE);

    }
}
