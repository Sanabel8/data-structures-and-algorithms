# Graphs

<!-- Short summary or background information -->

A graph is a data structure that consists of the following two components:

1. A finite set of vertices also called as nodes.
2. A finite set of ordered pair of the form (u, v) called as edge.

## Features

The graph should be represented as an adjacency list, and should include the following methods:

## add node

Arguments: value
Returns: The added node
Add a node to the graph

## add edge

Arguments: 2 nodes to be connected by the edge, weight (optional)
Returns: nothing
Adds a new edge between two nodes in the graph
If specified, assign a weight to the edge
Both nodes should already be in the Graph

## get nodes

Arguments: none
Returns all of the nodes in the graph as a collection (set, list, or similar)

## get neighbors

Arguments: node
Returns a collection of edges connected to the given node
Include the weight of the connection in the returned collection

## size

Arguments: none
Returns the total number of nodes in the graph

## Approach & Efficiency

<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

Gig o/complexity
space: o(n)
time :O(n)

## API

<!-- Description of each method publicly available in your Graph -->

```Graph graph = new Graph();

      graph.addVertex("sanabel");
      graph.addVertex("ahmad");
      graph.addVertex("tareq");
      graph.addVertex("yasmeen");
      graph.addVertex("kamleh");
      graph.addVertex("jamal");
      graph.addEdge("jamal", "kamleh");
      graph.addEdge("kamleh", "sanabel");
      graph.addEdge("sanabel", "yasmeen");
      graph.addEdge("tareq", "ahmad");
      graph.addEdge("ahmad", "yasmeen");
      graph.addEdge("tareq", "yasmeen");
      System.out.println(" print vertex in the graph: "+graph.getAdjVertices());
      System.out.println(" size (num of vertex ) in graph: "+graph.size());
      System.out.println(" get the Neighbors in graph: "+graph.getNeighborsForVertex("jamal"));
      System.out.println(" get the Neighbors in graph: "+graph.getNeighborsForVertex("sanabel"));
      System.out.println(" get the Neighbors in graph: "+graph.getNeighborsForVertex("ahmad"));
```

the results:

print vertex in the graph: {Vertex{value='tareq'}=[Vertex{value='ahmad'}, Vertex{value='yasmeen'}], Vertex{value='jamal'}=[Vertex{value='kamleh'}], Vertex{value='yasmeen'}=[Vertex{value='sanabel'}, Vertex{value='ahmad'}, Vertex{value='tareq'}], Vertex{value='kamleh'}=[Vertex{value='jamal'}, Vertex{value='sanabel'}], Vertex{value='sanabel'}=[Vertex{value='kamleh'}, Vertex{value='yasmeen'}], Vertex{value='ahmad'}=[Vertex{value='tareq'}, Vertex{value='yasmeen'}]}
size (num of vertex ) in graph: 6
get the Neighbors in graph: [Vertex{value='kamleh'}]
get the Neighbors in graph: [Vertex{value='kamleh'}, Vertex{value='yasmeen'}]
get the Neighbors in graph: [Vertex{value='tareq'}, Vertex{value='yasmeen'}]

# Challenge Summary - cc36 / graph-breadth-first

<!-- Description of the challenge -->

Implement a breadth-first traversal on a graph.

## Whiteboard Process

<!-- Embedded whiteboard image -->

![graph-breadth-first](graph/graph-breadth-first.jpg)

## Approach & Efficiency

<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

Gig o/complexity
time :O(n^2)
space: o(n)

## Solution

<!-- Show how to run your code, and examples of it in action -->

```Graph graph2 = new Graph();

    graph.addVertex("Pandora");
    graph.addVertex("Arendelle");
    graph.addVertex("Metroville");
    graph.addVertex("Monstroplolis");
    graph.addVertex("Narnia");
    graph.addVertex("Naboo");

    graph.addEdge("Pandora", "Arendelle");
    graph.addEdge("Arendelle", "Metroville");
    graph.addEdge("Arendelle", "Monstroplolis");
    graph.addEdge("Metroville", "Narnia");
    graph.addEdge("Monstroplolis", "Metroville");
    graph.addEdge("Naboo", "Narnia");
    graph.addEdge("Naboo", "Metroville");
    graph.addEdge("Naboo", "Monstroplolis");

    System.out.println(" print graph Breadth First: "+graph.graphBreadthFirst(graph,"Pandora"));

```
the ruselt :  print graph Breadth First: [Pandora, Arendelle, Metroville, Monstroplolis, Narnia, Naboo]


## Feature Tasks
Write the following method for the Graph class:
breadth first
Arguments: Node
Return: A collection of nodes in the order they were visited.
Display the collection



# Challenge Summary - Code Challenge: Class 37
<!-- Description of the challenge -->
Given a business trip itinerary, and an Alaska Airlines route map, is the trip possible with direct flights? If so, how much will the total trip cost be? 
Determine whether the trip is possible with direct flights, and how much it would cost.

## Whiteboard Process
<!-- Embedded whiteboard image -->
![]()

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Gig o/complexity
time :O(n^2)
space: o(n)


## Solution
<!-- Show how to run your code, and examples of it in action -->


## Feature Tasks
Write a function called business trip
Arguments: graph, array of city names
Return: cost or null



<!-- 
# Challenge Summary - Code Challenge: Class 38
<!-- Description of the challenge -->

## Whiteboard Process
<!-- Embedded whiteboard image -->
![]()

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Gig o/complexity
time :O(n^2)
space: o(n)


## Solution
<!-- Show how to run your code, and examples of it in action -->


## Feature Tasks -->
