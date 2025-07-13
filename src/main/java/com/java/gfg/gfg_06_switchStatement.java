package com.java.gfg;

//Given an integer choice denoting the choice of the user and a list containing the single value R or
//two values L and B depending on the choice.
//If the user's choice is 1, calculate the area of the circle having the given radius(R).
//Else if the choice is 2, calculate the area of the rectangle with the given length(L) and breadth(B).


import java.util.List;

public class gfg_06_switchStatement {
    static double switchCase(int choice, List<Double> arr) {

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
