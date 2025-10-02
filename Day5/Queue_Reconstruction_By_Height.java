package ICP.Day5;

import java.util.*;

public class Queue_Reconstruction_By_Height {

    class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (x,y)->x[0]==y[0]?x[1]-y[1]:y[0]-x[0]);

        List<int[]> list = new ArrayList<>();
        for(int i=0; i<people.length; i++){
            list.add(people[i][1], people[i]);
        }
        return list.toArray(new int[people.length][2]);
    }
}
}
