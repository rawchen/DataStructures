package graph;

import linear.Queue;

public class Graph {
	//顶点数目
	private final int V;
	//边的数目
	private int E;
	//邻接表
	private Queue<Integer>[] adj;

	public Graph(int V) {
		//初始化顶点数量
		this.V = V;
		//初始化边的数量
		this.E = 0;
		//初始化邻接表
		this.adj = new Queue[V];

		for (int i = 0; i < adj.length; i++) {
			adj[i] = new Queue<Integer>();
		}
	}


	//获取顶点数目
	public int V() {
		return V;
	}

	//获取边的数目
	public int E() {
		return E;
	}

	//向图中添加一条边 v-w
	public void addEdge(int v, int w) {

	}

	//获取和顶点v相邻的所有顶点
	public Queue<Integer> adj(int v) {
		return null;
	}
}