public class SimpleCalculator {
    public static int add(int first, int second){
        int MAX_OF_INTEGER=Integer.MAX_VALUE;
        boolean isOutOfMax=(first/2+second/2>=MAX_OF_INTEGER/2);
        if (isOutOfMax){
            throw new RuntimeException("out of range exception");
        }
        return first + second;
    }

    public static int sub(int first, int second){
        int MIN_OF_INTEGER=Integer.MIN_VALUE;
        boolean isOutOfMin=(first/2-second/2<=MIN_OF_INTEGER/2);
        if (isOutOfMin){
            throw new RuntimeException("out of range exception");
        }
        return first - second;
    }
}


