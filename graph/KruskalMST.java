package graph;

import linear.Queue;
import priority.MinPriorityQueue;
import uf.UF_Tree_Weighted;

public class KruskalMST {
	//保存最小生成树的所有边
	private Queue<Edge> mst;
	//索引代表顶点，使用uf.connect(v,w)可以判断顶点v和顶点w是否在同一颗树中，使用uf.union(v,w)可以把顶点v所在的树和顶点w所在的树合并
	private UF_Tree_Weighted uf;
	//存储图中所有的边，使用最小优先队列，对边按照权重进行排序
	private MinPriorityQueue<Edge> pq;

	//根据一副加权无向图，创建最小生成树计算对象
	public KruskalMST(EdgeWeightedGraph G) {

	}

	//获取最小生成树的所有边
	public Queue<Edge> edges() {
		return null;
	}
}
