public class HashTableNode <K ,V>{
  K key;
  V value;
  final int zipHashingCode;
  HashTableNode<K,V> next;

  public HashTableNode(K key, V value, int zipHashingCode) {
    this.key = key;
    this.value = value;
    this.zipHashingCode = zipHashingCode;

  }
}
