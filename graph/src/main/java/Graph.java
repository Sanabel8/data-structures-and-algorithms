import java.util.*;

public class Graph {

  private static Map<Vertex, List<Vertex>> adjVertices;
  private String value;

  public Graph() {
    adjVertices = new HashMap<>();
  }

  public void addVertex(String value) {
    Vertex vertex = new Vertex(value);
    adjVertices.putIfAbsent(vertex, new ArrayList<>());
  }

  public void addEdge(String value1, String value2) {
    Vertex v1 = new Vertex(value1);
    Vertex v2 = new Vertex(value2);
    adjVertices.get(v1).add(v2);
    adjVertices.get(v2).add(v1);
  }

//  public void removeVertex(String value) {
//    Vertex vertex = new Vertex(value);
//    adjVertices.values().stream().forEach(e -> e.remove(vertex));
//    adjVertices.remove(new Vertex(value));
//  }

//  public void removeEdge(String value1, String value2) {
//    Vertex vertex1 = new Vertex(value1);
//    Vertex vertex2 = new Vertex(value2);
//    List<Vertex> eV1 = adjVertices.get(vertex1);
//    List<Vertex> eV2 = adjVertices.get(vertex2);
//    if (eV1 != null)
//      eV1.remove(vertex2);
//    if (eV2 != null)
//      eV2.remove(vertex1);
//  }

  public int size() {
    return adjVertices.size();
  }

  public List<Vertex> getNeighborsForVertex(String value) {
    return adjVertices.get(new Vertex(value));
  }
  public Set<Vertex> getVertices(){
    return adjVertices.keySet();
  }
                //////////////cc36////////////////

   public Set<String> graphBreadthFirst(Graph graph, String root) {
      Set<String> visited = new LinkedHashSet<String>();
      Queue<String> queue = new LinkedList<String>();
      queue.add(root);
      visited.add(root);
      while (!queue.isEmpty()) {
        String vertex = queue.poll();
        for (Vertex v : graph.getNeighborsForVertex(vertex)) {
          if (!visited.contains(v.value)) {
            visited.add(v.value);
            queue.add(v.value);
          }
        }
      }
      return visited;
    }

               //////////////cc37////////////////

  public void addEdgeWithWeight(String data1, String data2, int weight) {
    Vertex v1 = new Vertex(data1, weight);
    Vertex v2 = new Vertex(data2, weight);

    adjVertices.get(v1).add(v2);
    adjVertices.get(v2).add(v1);
  }
  int cost;
  public Integer businessTrip(Graph graph, List<String> trips){
    cost = 0;
    int tripsSize = trips.size();

    for (int i = 0; i < tripsSize - 1; i ++){
      findPath(trips.get(i), trips.get(i + 1), graph);
    }
    return cost;
  }

  private void findPath(String trip1, String trip2, Graph graph){

    if (graph.getNeighborsForVertex(trip1) == null){
      return;
    }
    for (Vertex vertex: graph.getNeighborsForVertex(trip1)) {
      if (Objects.equals(trip2, vertex.value)){
        cost += vertex.weight;
      }
    }
  }


  ////////add getter And setter////////
  public Map<Vertex, List<Vertex>> getAdjVertices() {
    return adjVertices;
  }

  public void setAdjVertices(Map<Vertex, List<Vertex>> adjVertices) {
    this.adjVertices = adjVertices;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

}
