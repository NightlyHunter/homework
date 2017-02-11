package Homework21;

/**
 * Created by user on 10.02.2017.
 */
public class Homework {
    public static int sumArray(int a[]){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;

    }
    public static int multiplyArray(int a[]){
        int multiply = -1;
        for (int i = 0; i < a.length; i++) {
            multiply = multiply * a[i];
        }
        return multiply;
    }
    public static int minArray(int a[]){
        int min=a[0];
        for (int i=0; i<a.length; i++){
            if (min>a[i])
                min=a[i];
        }
        return min;
    }
    public static int maxArray(int a[]){
        int max=a[0];
        for (int i=0; i<a.length; i++){
            if (max<a[i])
                max=a[i];
        }
        return max;

    }
    public static double doubleSumArray(double b[]){
        double doubleSum=0;
        for (int i=0; i<b.length; i++){
            doubleSum=doubleSum+b[i];
        }
        return doubleSum;
    }
    public static double multiplyDoubeleArray(double b[]){
        double multDouble=1;
        for (int i=0;i<b.length;i++){
            multDouble=multDouble*b[i];
        }
        return multDouble;
    }
    public static double minDoubleArray(double b[]){
        double doubleMin=b[0];
        for (int i=0; i<b.length; i++){
            if (doubleMin>b[i])
                doubleMin=b[i];
        }
        return doubleMin;
    }
    public static double maxDoubleArray(double b[]){
        double maxDouble=b[0];
        for (int i=0; i<b.length; i++){
            if (maxDouble<b[i])
                maxDouble=b[i];
        }
        return maxDouble;
    }
    public static String maxPostiveArrayValue(int a[]){
        int maxPositiveValue=0;
        String zero="no positive elements";
        for (int i=0;i<a.length;i++){
            if (maxPositiveValue<a[i])
                maxPositiveValue=a[i];
        }
        if (maxPositiveValue<=0) {
            return zero;
        }else
            return String.valueOf(maxPositiveValue);
    }
    public static String maxPositiveDoubleArrayValue(double b[]){
        double maxPositiveDoubleValue=0;
        String zero="no positive elements";
        for (int i=0;i<b.length;i++){
            if (maxPositiveDoubleValue<b[i])
                maxPositiveDoubleValue=b[i];
        }
        if (maxPositiveDoubleValue<=0) {
            return zero;
        }else
            return String.valueOf(maxPositiveDoubleValue);
    }
    public static int modulusIntArray(int a[]){
        int modulusInt=0;
        for (int i=0; i<a.length; i++) {
            modulusInt = a[0] % a[i];
        }
        return modulusInt;
    }
    public static double modulusDoubleArray(double b[]){
        double modulusDouble=0;
        for (int i=0; i<b.length; i++) {
            modulusDouble = b[0] % b[i];
        }
        return modulusDouble;
    }
    public static int secondIntMax(int a[]){
        int secondIntMax = a[0];
        int max=maxArray(a);
        for (int i = 0; i < a.length; i++) {
//            if (a[i] > max) {
//                max = a[i];
//            }
            if ((a[i] > secondIntMax) && (a[i] != max))
                secondIntMax = a[i];
        }
        return secondIntMax;
    }
    public static double secondDoubleMax(double b[]){
        double secondDoubleMax = b[0];
        double max=maxDoubleArray(b);
        for (int i = 0; i < b.length; i++) {
//            if (b[i] > max) {
//                max = b[i];
//            }
            if ((b[i] > secondDoubleMax) && (b[i] != max))
                secondDoubleMax = b[i];
        }
        return secondDoubleMax;
    }


    public static void main(String[] args) {
        int a[]={-15,-2,-240,-4,5,6,177,-8,-9,-10};
        double b[] = {1.5, 2.5, -3.5, 4.5, 6.5, 1.5, 2.5, 3.5, 5.5, 6.5};

        System.out.println("sum="+sumArray(a));
        System.out.println("min="+minArray(a));
        System.out.println("max="+maxArray(a));
        System.out.println("multiply="+multiplyArray(a));
        System.out.println("doubleSum="+doubleSumArray(b));
        System.out.println("myltiplyDoubleArray="+multiplyDoubeleArray(b));
        System.out.println("minimum value of double array="+minDoubleArray(b));
        System.out.println("maximum value of double array="+maxDoubleArray(b));
        System.out.println("maximum positive value="+maxPostiveArrayValue(a));
        System.out.println("maximum positive double value"+maxPositiveDoubleArrayValue(b));
        System.out.println("modulus int="+modulusIntArray(a));
        System.out.println("modulus double="+modulusDoubleArray(b));
        System.out.println("second int max="+secondIntMax(a));
        System.out.println("second double max="+secondDoubleMax(b));

    }
}
