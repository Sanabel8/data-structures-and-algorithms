/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package code.challenge5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
  @Test public void testinsertEmptyLinked() {
    LinkedList test = new LinkedList();
    assertEquals("NULL", test.tostring());
  }

  @Test public void testMultipleNodes() {
    LinkedList list = new LinkedList();
    list.insert(4);
    list.insert(44);
    list.insert(444);
    list.insert(4444);
    assertEquals("{4444} ->{444} ->{44} ->{4} ->NULL", list.tostring());
  }
  @Test public void testGetHead() {
    LinkedList list = new LinkedList();
    list.append(4);
    list.append(44);
    list.append(444);
    list.append(4444);
    assertEquals("4", list.getHead());
    }

  @Test public void testappendMultipleNodes() {
    LinkedList test = new LinkedList();
    test.append(5);
    test.append(6);
    test.append(7);
    assertEquals("{5} ->{6} ->{7} ->NULL", test.tostring());
  }
  @Test  void testIncludes(){
    LinkedList test = new LinkedList();
    test.append(14);
    test.append(2);
    test.append(21);
    int data1 = 8;
    int data2 = 14;
    assertEquals(false, test.includes(data1));
    assertEquals(true, test.includes(data2));
  }

  @Test  void testTostring(){
    LinkedList test = new LinkedList();
    test.append(2);
    test.append(22);
    test.append(222);
    assertEquals("{2} ->{22} ->{222} ->NULL" , test.tostring());

  }
  // for code challenge 6
  @Test void testAppendedNodeInEnd(){
    LinkedList test1 = new LinkedList();
    test1.append(2);
    test1.append(22);
    test1.append(222);
    test1.append(5);
    assertEquals("{2} ->{22} ->{222} ->{5} ->NULL",test1.tostring());
  }
@Test void testAppendedMultipleAtEnd(){
  LinkedList test1 = new LinkedList();
  test1.append(2);
  test1.append(22);
  test1.append(222);
  test1.append(5);
  test1.append(6);
  test1.append(7);
  assertEquals("{2} ->{22} ->{222} ->{5} ->{6} ->{7} ->NULL",test1.tostring());
}
  @Test void testappendBefore(){
    LinkedList test1 = new LinkedList();
    test1.append(2);
    test1.append(22);
    test1.append(222);
    test1.append(2222);
    test1.insertBefore(22,1);
    assertEquals("{2} ->{1} ->{22} ->{222} ->{2222} ->NULL",test1.tostring());
  }
  @Test void testappendBeforeMiddle(){
    LinkedList test1 = new LinkedList();
    test1.append(2);
    test1.append(22);
    test1.append(222);
    test1.insertBefore(22,1);
    assertEquals("{2} ->{1} ->{22} ->{222} ->NULL",test1.tostring());
  }
  @Test void testappendAfter(){
    LinkedList test1 = new LinkedList();
    test1.append(2);
    test1.append(22);
    test1.append(222);
    test1.append(2222);
    test1.insertAfter(22,1);
    assertEquals("{2} ->{22} ->{1} ->{222} ->{2222} ->NULL",test1.tostring());
  }
  @Test void testappendAfterMiddleNode(){
    LinkedList test1 = new LinkedList();
    test1.append(2);
    test1.append(22);
    test1.append(222);
    test1.insertAfter(22,1);
    assertEquals("{2} ->{22} ->{1} ->{222} ->NULL",test1.tostring());
  }
  //insert before first node
  @Test void testinsertbeforefirstnode(){
    LinkedList test1 = new LinkedList();
    test1.append(2);
    test1.append(22);
    test1.append(222);
    test1.append(2222);
    test1.insertBefore(2,1);
    assertEquals("{1} ->{2} ->{22} ->{222} ->{2222} ->NULL",test1.tostring());
  }
  @Test void testappendAfterLastNode(){
    LinkedList test1 = new LinkedList();
    test1.append(2);
    test1.append(22);
    test1.append(222);
    test1.append(2222);
    test1.insertAfter(2222,1);
    assertEquals("{2} ->{22} ->{222} ->{2222} ->{1} ->NULL",test1.tostring());
  }
  // for code challenge 7
  @Test public void testKLocationHappyPath(){
    LinkedList test1 = new LinkedList();
    test1.append(2);
    test1.append(22);
    test1.append(222);
    test1.append(2222);
    test1.append(22222);
    assertEquals("k[3] = 22",test1.kLocation(3));
  }
  @Test public void testKLocationSize1(){
    LinkedList test1 = new LinkedList();
    test1.append(2);
    test1.append(22);
    test1.append(222);
    assertEquals("k[1] = 22",test1.kLocation(1));
  }
  @Test public void testKLocationNotPositive(){
    LinkedList test1 = new LinkedList();
    test1.append(2);
    test1.append(22);
    test1.append(222);
    assertEquals("Exception",test1.kLocation(-2));
  }
  @Test public void testKLocationSameLenght(){
    LinkedList test1 = new LinkedList();
    test1.append(2);
    test1.append(22);
    test1.append(222);
    assertEquals("k[2] = 2",test1.kLocation(2));
  }
  @Test public void testKLocationoverSize(){
    LinkedList test1 = new LinkedList();
    test1.append(2);
    test1.append(22);
    test1.append(222);
    assertEquals("Exception",test1.kLocation(5));
  }
@Test
public void testLinkedList_ziplist() {
  LinkedList list = new LinkedList();
  list.append(1);
  list.append(2);
  list.append(3);

  LinkedList list2 = new LinkedList();
  list2.append(4);
  list2.append(5);
  list2.append(6);

  LinkedList mergeList = new LinkedList();
  mergeList.head=mergeList.zipLists(list,list2);
  String result = mergeList.tostring();
  assertEquals("{1} ->{4} ->{2} ->{5} ->{3} ->{6} ->NULL",result.toString());
}
}


