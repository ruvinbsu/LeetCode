package com.leetcode.datastructure.graph.medium;

import java.util.*;

/**
 * Created by ruvinyusubov on 19/11/2017.
 */
public class CourseSchedule_207 {
    HashMap<Integer, ArrayList<Integer>> adjacencyLists;
    boolean[] marked;
    boolean[] visited;
    boolean isThereCycle;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        adjacencyLists = new HashMap<>();
        for (int[] arr : prerequisites) {
            int course = arr[0];
            int coursePrerequisite = arr[1];
            ArrayList<Integer> adjacencyList = adjacencyLists.get(course);
            if (adjacencyList == null) {
                adjacencyList = new ArrayList<>();
                adjacencyList.add(coursePrerequisite);
                adjacencyLists.put(course, adjacencyList);
            }
            else {
                adjacencyList.add(coursePrerequisite);
            }
        }

        Set<Integer> keys = adjacencyLists.keySet();
        marked = new boolean[10000];
        visited = new boolean[10000];
        isThereCycle = false;

        for (Integer course : keys) {
            dfs(course);
        }

        return !isThereCycle;
    }

    public void dfs(int course) {
        if (!marked[course]) {
            ArrayList<Integer> adjacentVerteces = adjacencyLists.get(course);

            if (adjacentVerteces != null) {
                marked[course] = true;
                visited[course] = true;
                for (Integer coursePrerequisite : adjacentVerteces) {
                    if (visited[coursePrerequisite]) {
                        isThereCycle = true;
                        return;
                    }

                    dfs(coursePrerequisite);
                }
            }
            visited[course] = false;
        }
    }
}
