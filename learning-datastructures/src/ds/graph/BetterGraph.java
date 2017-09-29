package ds.graph;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by Do My Duyen on 9/27/2017.
 */
public class BetterGraph {

    private int vCount;
    private boolean undirected = true;
    private Vertex[] vertexArray;
    private int counter;
    private Map<String, Integer> vertexMap = new HashMap<>();
    public BetterGraph(int vCount, String graphType) {
        this.vCount = vCount;
        if ("directed".equals(graphType)) {
            undirected = false;
        }
        vertexArray = new Vertex[vCount];
    }

    class Node {
        int index;
        Node next;

        Node(int index, Node next) {
            this.index = index;
            this.next = next;
        }
    }

    class Vertex {
        String name;
        Node adjaList;

        Vertex(String name) {
            this.name = name;
            this.adjaList = null;
        }

        Vertex(String name, Node adjaList) {
            this.name = name;
            this.adjaList = adjaList;
        }

        void viewAdjaList() {
            Node currentNode = adjaList;
            while (currentNode != null) {
                System.out.print(" --> " + vertexArray[currentNode.index].name);
                currentNode = currentNode.next;
            }
        }
    }

    public void addVertex(String name) {
        Vertex ver = new Vertex(name, null);
        vertexArray[counter] = ver;
        vertexMap.put(name, counter);
        counter++;
    }

    public void addEdge(String src, String dest) {
        int srcIdx = vertexMap.get(src);
        int destIdx = vertexMap.get(dest);
        vertexArray[srcIdx].adjaList = new Node(destIdx, vertexArray[srcIdx].adjaList);
        if (undirected) {
            vertexArray[destIdx].adjaList = new Node(srcIdx, vertexArray[destIdx].adjaList);
        }
    }

    public void print() {
        for(int i = 0 ; i < vertexArray.length ; i++) {
            System.out.print(vertexArray[i].name);
            vertexArray[i].viewAdjaList();
            System.out.println("\n");
        }
    }
}
