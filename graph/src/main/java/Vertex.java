import java.util.Objects;

public class Vertex {
  public String value;
  public int weight;

  public Vertex(String value) {
    this.value = value;
  }

  public Vertex(String value, int weight) {
    this.value = value;
    this.weight = weight;
  }

  //make Override for hashCode
  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Vertex vertex = (Vertex) o;
    return Objects.equals(value, vertex.value);
  }

  //make oerride toString
  @Override
  public String toString() {
    return "Vertex{" +
      "value='" + value + '\'' +
      '}';
  }
}
