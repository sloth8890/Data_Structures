# Greedy Algorithm
## Introduction
A greedy algorithm is the problem solving approach of making a **locally optimal choice** at each stage with the hope of finding a global optimum. 

## Fractional Knapsack
*Given* set S of n items, with each item i having
- $b_i$ : a positive benefit
- $w_i$ : a positive weight
*Goal* : Choose items with maximum total benefit of weight at most W.
Let $x_i$ denote whether we take item $i$. 

**Objective**: maximise  $\qquad \sum_{i \in S} b_ix_i$ [maximise benefit]
*Constraint*: $\qquad \sum_{i \in S} w_ix_i \leq W$ [total weight is bounded]
					$x_i \in \{0, 1\}$ \[take item $i$, or not\]

## Interval Scheduling

## Interval Partitioning

## Shortest Path : Dijkstra

## Minimum Spanning Trees (MST)

### Prim's algorithm

### Kruskal's algorithm
