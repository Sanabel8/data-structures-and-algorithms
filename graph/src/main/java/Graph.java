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
