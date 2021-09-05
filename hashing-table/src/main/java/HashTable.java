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
    if (key == null){
      throw new IllegalArgumentException("null");
    }
    return get(key) != null;


  }

}
