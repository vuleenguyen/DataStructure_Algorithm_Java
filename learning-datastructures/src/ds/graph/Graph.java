package ds.graph;

import java.util.ArrayList;

/**
 * Created by Do My Duyen on 9/27/2017.
 */
public class Graph {

    private int vCount; // number of vertices
    private int eCount; // number of edges

    private ArrayList[] adjacents;

    public Graph(int vCount) {
        this.vCount = vCount;
        adjacents = new ArrayList[vCount];
        for(int i = 0; i < adjacents.length; i++) {
            adjacents[i] = new ArrayList<Integer>();
        }
    }

    public void addEdge(int src, int dest) {
        adjacents[src].add(dest);
        eCount++;
    }

    public Object[] adj(int src) {
        return new Object[]{adjacents[src]};
    }


}
