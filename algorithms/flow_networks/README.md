# Introduction

## Max Flow and Min Cut

### Flow
- *s(source)-t(sink) flow* is a function that satisfies three things
1. For each $e \in E$ : $0 \leq f(e) \leq c(e)$ (capacity) 
2. $e$ is saturated if $f(e) = c(e)$
3. For each $v \in V - \{s,t\}$ : sum of $e$ in $v$ of v = sum of $e$ out $v$
### Cut
- *s-t cut* is a partition (A, B) of V with $s \in A$ and $t \in B$
- The $capacity$ of a cut (A,B) is $cap(A,B) = \sum_{e \ out \ of \ A} c(e)$ 

We can find that **Max flow $\leq$ Min Cut**

Let $f$ be any flow, and let $(A,B)$ be any $s-t$ cut. 
The net flow sent across the cut is equal to the amount leaving $s$.
  $$v(f) = f^{out}(A) - f^{in}(A)$$
### Theorem
- The *flow from A to B* across the cut must be *less than or equal* to the capacity of the cut, because the flow itself is **constrained** by these capacities.
- This means that the value of any flow in the network can *never exceed* the capacity of any cut separating s and t.
### Ford-Fulkerson Algorithm
1. Initialise $f$ to $f(e) = 0$ for every edge e
2. Compute **residual network**, $G_f$
3. While there exists an $s-t$ path $p$ in $G_f$
	- $f = Augment(P,f)$
	- Update $G_f$
4. Return $f$
#### Running time 
Given $F$ is value of max flow, $n$ is number of nodes, and $m$ is number of edges
- Default running time: $O(mF)$ time
- With maximum bottleneck augmenting path finds a max flow : $O(m^2\log(F))$ time
- With shortest augmenting path finds a max flow in $O(nm^2)$ time

## Bipartite Matching

Finding a max cardinality matching given undirected, **bipartite** graph $G = (L \cup R, E)$



##   Marriage Theorem 

## Disjoint Paths
