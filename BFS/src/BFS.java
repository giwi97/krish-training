import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	int noOfVertices;
	LinkedList<Integer> adjList[];
	
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	BFS(int noOfVertices) {

		this.noOfVertices = noOfVertices;
		adjList = new LinkedList[noOfVertices];
		
		for(int i = 0;i < noOfVertices;i++) {
			
			adjList[i] = new LinkedList();
			
		}
		
	}
	
	void addEdges(int v, int w) {
		
		adjList[v].add(w);
		
	}

	
	void search(int root) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		boolean checked[] = new boolean[noOfVertices];
		
		checked[root] = true;	
		int temp = 0;
		
		queue.add(root);
		
		while(queue.size() != 0) {
			
			root = queue.poll();
			
			System.out.println(root);
			
			for(int i = 0;i < adjList[root].size();i++) {
				
				temp = adjList[root].get(i);
				
				
				if(!checked[temp]) {
					
					checked[temp] = true;
					queue.add(temp);
					
				}
				
			}
			
		}
		
	}


	public static void main(String[] args) {
		
		BFS bfs = new BFS(7);
		
		bfs.addEdges(0, 1);
		bfs.addEdges(0, 3);
		bfs.addEdges(1, 5);
		bfs.addEdges(1, 2);
		bfs.addEdges(1, 3);
		bfs.addEdges(1, 6);
		bfs.addEdges(3, 2);
		bfs.addEdges(3, 4);
		bfs.addEdges(4, 2);
		bfs.addEdges(4, 6);
		
		System.out.println("BFS: ");
		
		bfs.search(0);


	}

}
