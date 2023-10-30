import java.util.*;
public class graphs {
   public class Edge{
    int src;
    int dest;
    int wt;
    public Edge(int src,int dest,int wt){
        this.src=src;
        this.dest=dest;
        this.wt=wt;
    }


    }

    public static void main(String args[]){
        int v=5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        for(int i=0;i<v;i++){
            graph[i]= new ArrayList<>(null);

        }

        // 0 vertex
        graph[0].add(new Edge(0,1,5));

        //1 vertex
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));

        //2 vertex and so on....

        //2's neighbour//
        for(int i=0; i<graph[2].size();i++){
            Edge e= graph[2].get(i);
            System.out.println(e.dest);
        }

    }
}
