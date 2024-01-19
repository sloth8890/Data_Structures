# Graph


## Introduction
This repository

## Applications

### Breadth First Search (**BFS**)

The traversal begins from the root of the graph and visits all nodes at the current depth level before moving on to the nodes at the enxt depth level.

```java
void bfsSearch(int s) {
	boolean visited[] = new boolean[V];
	LinkedList<Integer> queue = new LinkedList<Integer>();

	visited[s] = true;
	queue.add(s);

	while(queue.size() != 0) {
		s = queue.poll();
		System.out.print(s + " ");

		Iterator<Integer> i = adj[s].listIterator();
		while (i.hasNext()) {
			int n = i.next();
			if (!visited[n]) {
				visited[n] = true;
				queue.add(n);
			}
		}
	}
}
```

More implementation can be covered in [GeeksForGeeks](https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/)

### Depth First Search (**DFS**)

The traversal begins from the root node and reach to the all possible neighbour nodes before backtracking.

```java
void dfsSearch(int v, boolean visited[]) {
	// update the current node as visited and print it
	visited[v] = true;
	System.out.print(v + " ");

	// recur for all the vertices adjacent to this
	// vertex
	Iterator<Integer> i = adj[v].listIterator();
	while (i.hasNext()) {
		int n = i.next();
		if (!visited[n]) {
			dfsSearch(n, visited);
		}
	}
}

```




More implementation can be found in [GeeksForGeeks](https://www.geeksforgeeks.org/depth-first-search-or-dfs-for-a-graph/?ref=header_search)