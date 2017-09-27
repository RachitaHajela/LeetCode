package com.edu;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by Rachita on 9/22/2017.
 */
@SuppressWarnings("ALL")
public class CutOffTreesForGolf {
    public int cutOffTree(List<List<Integer>> forest) {
        int numOfSteps = 0;
        PriorityQueue<TreeIndex> pq = new PriorityQueue<>(new Comparator<TreeIndex>() {
            @Override
            public int compare(TreeIndex o1, TreeIndex o2) {
                return o1.height - o2.height;
            }
        });

        for(int i =0; i< forest.size(); i++) {
            for(int j = 0; j< forest.get(i).size(); j++) {
                if(forest.get(i).get(j) > 1) {
                    TreeIndex tr = new TreeIndex(forest.get(i).get(j),i,j);
                    pq.add(tr);
                }
            }
        }
        TreeIndex cur=new TreeIndex(1, 0, 0);
        while(!pq.isEmpty()){
            TreeIndex next=pq.poll();
            int steps=canReach(forest, cur.locI, cur.locJ, next);
            if(steps==-1)
                return -1;
            numOfSteps+=steps;
            cur=next;
        }

        return numOfSteps;
    }

    class TreeIndex {
        int height;
        int locI;
        int locJ;

        TreeIndex(int h, int i, int j) {
            height = h;
            locI = i;
            locJ = j;
        }
    }

    public int canReach(List<List<Integer>> forest, int x, int y, TreeIndex next){
        int m=forest.size();
        int n=forest.get(0).size();
        boolean[][] visited= new boolean[m][n];
        LinkedList<int[]> queue = new LinkedList<int[]>();
        queue.add(new int[]{x, y});
        visited[x][y]=true;
        int steps=0;
        int[][] dir={{-1,0},{1,0},{0,-1},{0,1}};
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0; i<size; i++){
                int[] cur=queue.poll();
                if(cur[0]==next.locI && cur[1]==next.locJ)
                    return steps;
                for(int[] d: dir){
                    int nx=cur[0]+d[0];
                    int ny=cur[1]+d[1];
                    if(nx>=0 && nx<m && ny>=0 && ny<n && forest.get(nx).get(ny)!=0 && !visited[nx][ny]){
                        visited[nx][ny]=true;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
            steps++;
        }
        return -1;
    }

    //instead of this : do a BFS.
   /* private int numOfMoves(List<List<Integer>> forest, int currI, int currJ, int locI, int locJ, int moves) {
        if(currI < 0 || currI >= forest.size() || currJ < 0 || currJ >= forest.get(currI).size()) {
            return -1;
        }
        if(forest.get(currI).get(currJ) == 0) {  //obstacle
            return 0;
        }
        if(currI == locI && currJ == locJ) {
            System.out.println("MOves: "+moves);
            return moves;
        }
        int curMoves = Integer.MAX_VALUE;
        // int up = numOfMoves(forest,currI-1,currJ,locI,locJ,moves+1);
        int down = numOfMoves(forest,currI+1,currJ,locI,locJ,moves+1);
//int left = numOfMoves(forest,currI,currJ-1,locI,locJ,moves+1);
        int right = numOfMoves(forest,currI,currJ+1,locI,locJ,moves+1);


        if(down != -1) {
            curMoves = Math.min(curMoves,down);
        }

        if(right != -1) {
            curMoves = Math.min(curMoves,right);
        }
        return  curMoves+moves;
    }*/
}
