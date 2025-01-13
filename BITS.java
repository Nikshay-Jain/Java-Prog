class BITS
{
    public static void main(String args[])
    {
        int i=5;
        int j=1;
        int k=-3;
        System.out.println("Bitwise AND "+(i&j));
        System.out.println("Bitwise OR "+(i|j));
        System.out.println("Bitwise XOR "+(i^j));
        System.out.println("Left Shift "+(k<<1));
        System.out.println("Right Shift "+(k>>1));                  //Fills leading bits with 0 for both +ve and -ve nos
        System.out.println("Unsigned Right Shift "+(k>>>1));        //Fills leading bits with 1 for -ve nos to maintain sign
    }
}