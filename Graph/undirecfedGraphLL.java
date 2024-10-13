package javaDSAfreeCodeCamp.Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;




public class undirecfedGraphLL {
    
    private LinkedList<Integer>[] adj;
    private int V;
    private int E;

    

    public undirecfedGraphLL(int nodes){
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];
        for(int i = 0; i < nodes; i++){
            this.adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u , int v){
        this.adj[u].add(v);
        this.adj[v].add(u);
        E++;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(V + " vertics, " + E + " edges " + "\n" );
        for(int v = 0; v < V; v++){
            sb.append(v + ": ");
            for(int w : adj[v]){
                sb.append(w + " ");
            } 
            sb.append("\n");
        }
        return sb.toString();
    }
    
    public void bfsGraph(int s){
        boolean[] visited = new boolean[V];
        
        Queue<Integer> q = new LinkedList<>();
        q.offer(s);
        visited[s] = true;

        while(!q.isEmpty()){
            int u = q.poll();
            System.out.print(u +  " ");

            for(int v : adj[u]){
                if(!visited[v]){
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }

    }

    public void dfs(int s){
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[V];
        stack.push(s);
        while(!stack.isEmpty()){
            int u = stack.pop();
            if(!visited[u]){
                visited[u] = true;
                System.out.print(u + " ");
            
            for(int v : adj[u]){
                    if(!visited[v]){
                        // visited[v] = true; // wrong
                        stack.push(v);
                    }
            }
        }
        }
    }
    

    public void dfs1(){
        boolean[] visited = new boolean[V];
        for(int v = 0; v < V; v++){
            if(!visited[v]){
                dfs1(v, visited);
            }
        }
    }

    public void dfs1(int v , boolean[] visited){
        visited[v] = true;
        System.out.print(v + " ");
        for(int w : adj[v]){
            if(!visited[w]){
                dfs1(w ,visited);                       
            }
        }
    }
    
    public void dfs2(){
        boolean[] visited = new boolean[V];
        int[] compId = new int[V];
        int count = 0;
        for(int v = 0; v < V; v++){
            if(!visited[v]){
                dfs2(v , visited , compId , count);
                count++;
            }
        }
    }

    public void dfs2(int v , boolean[] visited , int[] compId , int count){
        visited[v] = true;
        compId[v] = count;
        for(int w : adj[v]){
            if(!visited[w]){
                dfs2(w , visited , compId , count);
            }
        }
    }

    public static void main(String[] args) {
        undirecfedGraphLL g =  new undirecfedGraphLL(5);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        g.addEdge(2, 4);
        // g.bfsGraph(0);
        g.dfs(0);
        
        
    }

}
