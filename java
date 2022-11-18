// Java Program to find sum of elements in a given array
class Test {
    static int arr[] = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
 
    // method for sum of elements in an array
    static int sum()
    {
        int sum = 0; // initialize sum
        int i;
 
        // Iterate through all elements and add them to sum
        for (i = 0; i < arr.length; i++)
            sum += arr[i];
 
        return sum;
    }
 
    // Driver method
    public static void main(String[] args)
    {
        System.out.println("Sum of given array is "
                           + sum());
    }
}
