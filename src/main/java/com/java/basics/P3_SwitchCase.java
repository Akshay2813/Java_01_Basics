package com.java.basics;
import java.util.List;
public class P3_SwitchCase {
    /*
    Given an integer choice denoting the choice of the user and a list containing the single value R or
    two values L and B depending on the choice.
    If the user's choice is 1, calculate the area of the circle having the given radius(R).
    Else if the choice is 2, calculate the area of the rectangle with the given length(L) and breadth(B).
    Note : A list arr[], containing the single value R or the two values L and B, as input parameters.
    Return the area of the
    desired geometrical figure. Use Math.PI for the value of pi.
    */
    static double switchCase(int choice, List<Double> arr) {
        // code here
        switch (choice)
        {
            case 1:
                double R= arr.get(0);
                return Math.PI * R*R;
            case 2:
                double L= arr.get(0);
                double B=arr.get(1);
                return L*B;
            default:
                return 0;
        }
    }
}

