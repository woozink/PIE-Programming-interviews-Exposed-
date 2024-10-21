import java.util.*;


// return the larget value in an array of non-negative integers
// O(n)

public class CompareToMax{
    public static int compareToMax (int[] array, int n){

        // make sure that there is at least one element in the array
        if(n<=0){
            return -1;
        }

        // Set the largest value so far to the first array value
        int curMax = array[0];

        // Compare every number with the largest number so far
        for(int i = 1; i < n; i++){
            if(array[i] > curMax){
                curMax = array[i];
            }
        }
        return curMax;
    }


    public static main (String[] args){
        int[] array = {1,2,3,4};
        int n = array.length;

        System.out.println(compareToMax(array,n));
    }
}


// second
// O(n^2)
public class compareToAll {

    public static int compareToAll(int arr[], int n)){

        // make sure that there is at least one element in the array
        if (n<=0){
            return -1;
        }

        boolean isMax = true;

        for(int i = n-1; i > 0; i--){
            isMax = true;
            for(int j = 0; j<n; j++){
                // See if any value is greater
                if(arr[j]> arr[i]){
                    // arr[i] is not the largest value
                    isMax = false;
                    break;
                }
            }
            // if isMax is true, no longer value exists; arr[i] is max
            if(isMax) {
                return arr[i];
            }
        }


        return arr[0];
    }

    public static main (String[] args){
        int[] array = {1,2,3,4};
        int n = array.length;

        System.out.println(compareToMax(array,n));
    }

}

/*

Both of the function correctly return the maximumvalue
which one more efficient?

In CompareToMax, each array element was compared once to a maximum value. Thus, the n input
items are each examined once, resulting in n examinations.
This is considered O(n), usually referred to as linear time:
The time required to run the algorithm increases linearly with the number of input items.


 CompareToMax is O(n) and CompareToAll is O(n2). This means
that as the array grows, the number of comparisons in CompareToAll becomes much larger than CompareToMax



*/








