import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Articulation {

	int noOfVertices;
	int time = 0;
	LinkedList<Integer> adjList[];
	ArrayList<Integer> results;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	Articulation(int noOfVertices) {

		this.noOfVertices = noOfVertices;
		adjList = new LinkedList[noOfVertices];
		
		for(int i = 0;i < noOfVertices;i++) {
			
			adjList[i] = new LinkedList();
			
		}
		
	}
	
	void addEdges(int v, int w) {
		
		adjList[v].addFirst(w);
		adjList[w].addFirst(v);
		
	}
	
	void search(int root) {
		
		boolean checked[] = new boolean[noOfVertices];
        Map<Integer, Integer> vTime = new HashMap<>();
        Map<Integer, Integer> lTime = new HashMap<>();
        Map<Integer, Integer> parent = new HashMap<>();
        
		searchFunc(root, checked, vTime, lTime, parent);
		
		System.out.println("Articulation Points are: "+Arrays.toString(results.toArray()));
		
	}
	
	void searchFunc(int root, boolean checked[], Map<Integer, Integer> vTime, Map<Integer, Integer> lTime, Map<Integer, Integer> parent) {
		
		results = new ArrayList<>();
		checked[root] = true;
		int temp = 0;
		int childCounter = 0;
		boolean artculation = false;
		vTime.put(root, time);
		lTime.put(root, time);
		time++;

		//System.out.println(root);
		
		for(int i = 0;i < adjList[root].size();i++) {
			
			temp = adjList[root].get(i);
			
			if(!checked[temp]) {
				
				parent.put(temp, root);
				childCounter++;
				
				searchFunc(temp, checked, vTime, lTime, parent);
				
				
				if(vTime.get(root) <= lTime.get(temp)) {
					
					artculation = true;
					
				}else {
					
					int tempTime = lTime.get(root);
					lTime.put(root, Math.min(tempTime, lTime.get(temp)));
					
				}
				
			}else {
				
				int tempTime = lTime.get(root);
				lTime.put(root, Math.min(tempTime, vTime.get(temp)));
				
			}
			
		}
		
		if((childCounter > 1 && parent.get(root) == null) || (artculation && parent.get(root) != null)) {
			
			results.add(root);
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Articulation art = new Articulation(10);
		
		art.addEdges(1, 2);
		art.addEdges(1, 4);
		art.addEdges(2, 3);
		art.addEdges(3, 4);
		art.addEdges(3, 5);
		art.addEdges(3, 6);
		art.addEdges(5, 6);
		art.addEdges(6, 7);
		art.addEdges(7, 8);
		art.addEdges(7, 9);
		art.addEdges(8, 9);

		
		art.search(1);


	}

}
