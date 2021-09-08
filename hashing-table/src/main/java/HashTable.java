import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HashTable<K, V> {
  private List<Node<K, V>> list;
  int buckets;
  int size;

  public HashTable() {
    list = new ArrayList<>();
    buckets = 10;

    for (int i = 0; i < buckets; i++) {
      list.add(null);
    }
  }

  public int hash(K key) {
    return Objects.hash(key);
  }

  //i is index
  private int haveI(K key) {
    int hash = hash(key);
    int i = hash % buckets;
    i = i < 0 ? i * -1 : i;

    return i;
  }


  public void add(K key, V value) {

    int indexForBucket = haveI(key);
    int hash = hash(key);

    Node<K, V> node = list.get(indexForBucket);

    while (node != null) {
      if (node.key.equals(key) && node.hashCode == hash) {
        node.value = value;
        return;
      }
      node = node.next;
    }

    size++;
    node = list.get(indexForBucket);
    Node<K, V> newNode = new Node<>(key, value, hash);
    newNode.next = node;
    list.set(indexForBucket, newNode);

    if ((1.0 * size) / buckets >= 0.7) {
      List<Node<K, V>> current = list;
      list = new ArrayList<>();
      buckets = 2 * buckets;
      for (int index = 0; index < buckets; index++) {
        list.add(null);
      }

      for (Node<K, V> headNode : current) {
        while (headNode != null) {
          add(headNode.key, headNode.value);
          headNode = headNode.next;
        }
      }
    }
  }

  public V get(K key) {
    int bucketIndex = haveI(key);
    int hash = hash(key);

    Node<K, V> node = list.get(bucketIndex);
    while (node != null) {
      if (node.key.equals(key) && node.hashCode == hash) {
        return node.value;
      }

      node = node.next;
    }
    return null;
  }

  public boolean contains(K key) {
    if (key == null) {
      throw new IllegalArgumentException("null");
    }
    return get(key) != null;

  }

  public int getSize() {
    return size;
  }

  public boolean isEmpty() {
    return getSize() == 0;
  }


  public static ArrayList<String> insertionMethod(BinaryTrees binary1, BinaryTrees binary2) {

    if (binary1.root == null || binary2.root == null) {
      System.out.println("null");
      return null;
    }
    List<Integer> arr1 = (ArrayList<Integer>) binary1.preOrdeMethod(binary1.root);
    List<Integer> arr2 = (ArrayList<Integer>) binary2.preOrdeMethod(binary2.root);

    List<String> list = new ArrayList<>();
    List<String> list2 = new ArrayList<>();
    for (Integer element : arr1) {
      list.add(element.toString());
    }
    for (Integer element : arr2) {
      if (list.contains(element.toString())) {
        list2.add(element.toString());
      }
    }
    System.out.println(list2);
    return (ArrayList<String>) list2;
  }
  @Override
  public String toString() {
    return "HashTable{" +
      "list=" + list +
      ", buckets=" + buckets +
      ", size=" + size +
      '}';
  }


}
