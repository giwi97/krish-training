import java.util.LinkedList;

public class DFS {

	int noOfVertices;
	LinkedList<Integer> adjList[];
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	DFS(int noOfVertices) {

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
		
		boolean checked[] = new boolean[noOfVertices];

		searchFunc(root, checked);
		
	}
	
	void searchFunc(int root, boolean checked[]) {
		
		checked[root] = true;
		int temp = 0;

		System.out.println(root);
		
		for(int i = 0;i < adjList[root].size();i++) {
			
			temp = adjList[root].get(i);
			
			if(!checked[temp]) {
				searchFunc(temp, checked);
			}
			
		}
		
	}
	
	public static void main(String[] args) {

		DFS dfs = new DFS(7);
		
		dfs.addEdges(0, 1);
		dfs.addEdges(0, 3);
		dfs.addEdges(1, 5);
		dfs.addEdges(1, 2);
		dfs.addEdges(1, 3);
		dfs.addEdges(1, 6);
		dfs.addEdges(3, 2);
		dfs.addEdges(3, 4);
		dfs.addEdges(4, 2);
		dfs.addEdges(4, 6);
		
		System.out.println("DFS: ");
		
		dfs.search(0);
		
	}

}
