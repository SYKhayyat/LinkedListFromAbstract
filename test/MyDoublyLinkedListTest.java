import org.junit.Test;

import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;


public class MyDoublyLinkedListTest {
    MyDoublyLinkedList2 myLinkedList = new MyDoublyLinkedList2();
    public void fillList(){
        myLinkedList.add("Zeraim");
        myLinkedList.add("Moed");
        myLinkedList.add("Nashim");
    }
    public ArrayList<String> returnCollection(int amount){
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            al.add("This is number " + i);
        }
        return al;
    }

    @Test
    public void sizeTest(){
        int i = myLinkedList.size();
        Assertions.assertEquals(0, i);
    }

    @Test
    public void sizeTest2(){
        myLinkedList.add("Zeraim");
        int i = myLinkedList.size();
        Assertions.assertEquals(1, i);
    }
    @Test
    public void sizeTest3(){
        fillList();
        int i = myLinkedList.size();
        Assertions.assertEquals(3, i);
    }

    @Test
    public void sizeTest4(){
        fillList();
        myLinkedList.add(1, "Mostly just Yerushalmi");
        int i = myLinkedList.size();
        Assertions.assertEquals(4, i);
    }

    @Test
    public void containsTest1(){
        boolean contains = myLinkedList.contains("Zeraim");
        Assertions.assertFalse(contains);
    }
    @Test
    public void containsTest2(){
        fillList();
        boolean contains = myLinkedList.contains("Nezikin");
        Assertions.assertFalse(contains);
    }
    @Test
    public void containsTest3(){
        fillList();
        boolean contains = myLinkedList.contains("Zeraim");
        Assertions.assertTrue(contains);
    }
    @Test
    public void containsTest4(){
        fillList();
        boolean contains = myLinkedList.contains("Moed");
        Assertions.assertTrue(contains);
    }
    @Test
    public void containsTest5(){
        fillList();
        boolean contains = myLinkedList.contains("Nashim");
        Assertions.assertTrue(contains);
    }
    @Test
    public void indexOfTest1(){
        int index = myLinkedList.indexOf("Zeraim");
        Assertions.assertEquals(-1, index);
    }
    @Test
    public void indexOfTest2(){
        fillList();
        int index = myLinkedList.indexOf("Nezikin");
        Assertions.assertEquals(-1, index);
    }
    @Test
    public void indexOfTest3(){
        fillList();
        int index = myLinkedList.indexOf("Zeraim");
        Assertions.assertEquals(0, index);
    }
    @Test
    public void indexOfTest4(){
        fillList();
        int index = myLinkedList.indexOf("Moed");
        Assertions.assertEquals(1, index);
    }
    @Test
    public void indexOfTest5(){
        fillList();
        int index = myLinkedList.indexOf("Nashim");
        Assertions.assertEquals(2, index);
    }

    @Test
    public void indexOfTest6(){
        fillList();
        int index = myLinkedList.indexOf(null);
        Assertions.assertEquals(-1, index);
    }

    @Test
    public void getTest1(){
        fillList();
        String gotten = myLinkedList.get(0);
        Assertions.assertEquals("Zeraim", gotten);
    }

    @Test
    public void getTest2(){
        fillList();
        String gotten = myLinkedList.get(1);
        Assertions.assertEquals("Moed", gotten);
    }

    @Test
    public void getTest3(){
        fillList();
        String gotten = myLinkedList.get(2);
        Assertions.assertEquals("Nashim", gotten);
    }

    @Test
    public void addIndexTest1(){
        fillList();
        myLinkedList.add(0, "Torah Shebiksav");
        String gotten = myLinkedList.get(0);
        Assertions.assertEquals("Torah Shebiksav", gotten);
    }

    @Test
    public void addIndexTest2(){
        fillList();
        myLinkedList.add(0, "Torah Shebiksav");
        String gotten = myLinkedList.get(1);
        Assertions.assertEquals("Zeraim", gotten);
    }

    @Test
    public void addIndexTest3(){
        fillList();
        myLinkedList.add(0, "Torah Shebiksav");
        String gotten = myLinkedList.get(2);
        Assertions.assertEquals("Moed", gotten);
    }

    @Test
    public void addIndexTest4(){
        fillList();
        myLinkedList.add(0, "Torah Shebiksav");
        String gotten = myLinkedList.get(3);
        Assertions.assertEquals("Nashim", gotten);
    }

    @Test
    public void addIndexTest5(){
        fillList();
        myLinkedList.add(1, "Mostly just Yerushalmi");
        String gotten = myLinkedList.get(0);
        Assertions.assertEquals("Zeraim", gotten);
    }

    @Test
    public void addIndexTest6(){
        fillList();
        myLinkedList.add(1, "Mostly just Yerushalmi");
        String gotten = myLinkedList.get(1);
        Assertions.assertEquals("Mostly just Yerushalmi", gotten);
    }

    @Test
    public void addIndexTest7(){
        fillList();
        myLinkedList.add(1, "Mostly just Yerushalmi");
        String gotten = myLinkedList.get(2);
        Assertions.assertEquals("Moed", gotten);
    }

    @Test
    public void addIndexTest8(){
        fillList();
        myLinkedList.add(1, "Mostly just Yerushalmi");
        String gotten = myLinkedList.get(3);
        Assertions.assertEquals("Nashim", gotten);
    }

    @Test
    public void addIndexTest9(){
        fillList();
        myLinkedList.add(3, "Nezikin");
        String gotten = myLinkedList.get(0);
        Assertions.assertEquals("Zeraim", gotten);
    }

    @Test
    public void addIndexTest10(){
        fillList();
        myLinkedList.add(3, "Nezikin");
        String gotten = myLinkedList.get(1);
        Assertions.assertEquals("Moed", gotten);
    }

    @Test
    public void addIndexTest11(){
        fillList();
        myLinkedList.add(3, "Nezikin");
        String gotten = myLinkedList.get(2);
        Assertions.assertEquals("Nashim", gotten);
    }

    @Test
    public void addIndexTest12(){
        fillList();
        myLinkedList.add(3, "Nezikin");
        String gotten = myLinkedList.get(3);
        Assertions.assertEquals("Nezikin", gotten);
    }

    @Test
    public void removeTest1(){
        fillList();
        myLinkedList.remove(0);
        int size = myLinkedList.size();
        Assertions.assertEquals(2, size);
    }

    @Test
    public void removeTest2(){
        fillList();
        myLinkedList.remove(0);
        String gotten = myLinkedList.get(0);
        Assertions.assertEquals("Moed", gotten);
    }

    @Test
    public void removeTest3(){
        fillList();
        myLinkedList.remove(0);
        String gotten = myLinkedList.get(1);
        Assertions.assertEquals("Nashim", gotten);
    }
    @Test
    public void removeTest4(){
        fillList();
        myLinkedList.remove(1);
        String gotten = myLinkedList.get(0);
        Assertions.assertEquals("Zeraim", gotten);
    }

    @Test
    public void removeTest5(){
        fillList();
        myLinkedList.remove(1);
        String gotten = myLinkedList.get(1);
        Assertions.assertEquals("Nashim", gotten);
    }
    @Test
    public void removeTest6(){
        fillList();
        myLinkedList.remove(2);
        String gotten = myLinkedList.get(0);
        Assertions.assertEquals("Zeraim", gotten);
    }

    @Test
    public void removeTest7(){
        fillList();
        myLinkedList.remove(2);
        String gotten = myLinkedList.get(1);
        Assertions.assertEquals("Moed", gotten);
    }

    @Test
    public void removeStringTest1(){
        fillList();
        myLinkedList.remove("Zeraim");
        int size = myLinkedList.size();
        Assertions.assertEquals(2, size);
    }

    @Test
    public void removeStringTest2(){
        fillList();
        myLinkedList.remove("Moed");
        int size = myLinkedList.size();
        Assertions.assertEquals(2, size);
    }

    @Test
    public void removeStringTest3(){
        fillList();
        myLinkedList.remove("Nashim");
        int size = myLinkedList.size();
        Assertions.assertEquals(2, size);
    }

    @Test
    public void removeStringTest4(){
        fillList();
        myLinkedList.remove("Nezikin");
        int size = myLinkedList.size();
        Assertions.assertEquals(3, size);
    }

    @Test
    public void setTest1(){
        fillList();
        myLinkedList.set(0, "Seder Zeraim");
        String gotten = myLinkedList.get(0);
        Assertions.assertEquals("Seder Zeraim", gotten);
    }

    @Test
    public void setTest2(){
        fillList();
        myLinkedList.set(0, "Seder Zeraim");
        String gotten = myLinkedList.get(1);
        Assertions.assertEquals("Moed", gotten);
    }

    @Test
    public void setTest3(){
        fillList();
        myLinkedList.set(1, "Seder Moed");
        String gotten = myLinkedList.get(1);
        Assertions.assertEquals("Seder Moed", gotten);
    }

    @Test
    public void setTest4(){
        fillList();
        myLinkedList.set(2, "Seder Nashim");
        String gotten = myLinkedList.get(2);
        Assertions.assertEquals("Seder Nashim", gotten);
    }

    @Test
    public void clearTest(){
        fillList();
        myLinkedList.clear();
        int size = myLinkedList.size();
        Assertions.assertEquals(0, size);
    }

    @Test
    public void addAllTest1(){
        ArrayList<String> al = returnCollection(0);
        myLinkedList.addAll(al);
        int size = myLinkedList.size();
        Assertions.assertEquals(0, size);
    }

    @Test
    public void addAllTest2(){
        ArrayList<String> al = returnCollection(0);
        fillList();
        myLinkedList.addAll(al);
        int size = myLinkedList.size();
        Assertions.assertEquals(3, size);
    }

    @Test
    public void addAllTest3(){
        ArrayList<String> al = returnCollection(4);
        myLinkedList.addAll(al);
        int size = myLinkedList.size();
        Assertions.assertEquals(4, size);
    }

    @Test
    public void addAllTest4(){
        ArrayList<String> al = returnCollection(4);
        fillList();
        myLinkedList.addAll(al);
        int size = myLinkedList.size();
        Assertions.assertEquals(7, size);
    }

    @Test
    public void addAllTest5(){
        ArrayList<String> al = returnCollection(4);
        fillList();
        myLinkedList.addAll(al);
        String gotten = myLinkedList.get(4);
        Assertions.assertEquals("This is number 1", gotten);
    }

    @Test
    public void addAllTest6(){
        ArrayList<String> al = returnCollection(4);
        fillList();
        myLinkedList.addAll(al);
        String gotten = myLinkedList.get(2);
        Assertions.assertEquals("Nashim", gotten);
    }

    @Test
    public void addAllIndexTest1(){
        ArrayList<String> al = returnCollection(0);
        myLinkedList.addAll(0, al);
        int size = myLinkedList.size();
        Assertions.assertEquals(0, size);
    }

    @Test
    public void addAllIndexTest2(){
        ArrayList<String> al = returnCollection(4);
        fillList();
        myLinkedList.addAll(0, al);
        int size = myLinkedList.size();
        Assertions.assertEquals(7, size);
    }

    @Test
    public void addAllIndexTest3(){
        ArrayList<String> al = returnCollection(4);
        fillList();
        myLinkedList.addAll(3, al);
        int size = myLinkedList.size();
        Assertions.assertEquals(7, size);
    }

    @Test
    public void addAllIndexTest4(){
        ArrayList<String> al = returnCollection(4);
        fillList();
        myLinkedList.addAll(2, al);
        int size = myLinkedList.size();
        Assertions.assertEquals(7, size);
    }

    @Test
    public void addAllIndexTest5(){
        ArrayList<String> al = returnCollection(4);
        fillList();
        myLinkedList.addAll(2, al);
        String gotten = myLinkedList.get(2);
        Assertions.assertEquals("This is number 0", gotten);
    }

    @Test
    public void addAllIndexTest6(){
        ArrayList<String> al = returnCollection(4);
        fillList();
        myLinkedList.addAll(2, al);
        String gotten = myLinkedList.get(6);
        Assertions.assertEquals("Nashim", gotten);
    }

    @Test
    public void containsAllTest1(){
        ArrayList<String> al = returnCollection(4);
        fillList();
        ArrayList<String> al2 = returnCollection(3);
        myLinkedList.addAll(al2);
        boolean contains = myLinkedList.containsAll(al);
        Assertions.assertTrue(!contains);
    }

    @Test
    public void containsAllTest2(){
        ArrayList<String> al = returnCollection(3);
        fillList();
        ArrayList<String> al2 = returnCollection(4);
        myLinkedList.addAll(al2);
        boolean contains = myLinkedList.containsAll(al);
        Assertions.assertTrue(contains);
    }

    @Test
    public void containsAllTest3(){
        ArrayList<String> al = returnCollection(4);
        fillList();
        ArrayList<String> al2 = returnCollection(3);
        myLinkedList.addAll(al2);
        fillList();
        myLinkedList.add("This is number 3");
        boolean contains = myLinkedList.containsAll(al);
        Assertions.assertTrue(contains);
    }

    @Test
    public void containsAllTest4(){
        ArrayList<String> al = returnCollection(0);
        fillList();
        boolean contains = myLinkedList.containsAll(al);
        Assertions.assertTrue(contains);
    }

    @Test
    public void containsAllTest5(){
        ArrayList<String> al = returnCollection(0);
        boolean contains = myLinkedList.containsAll(al);
        Assertions.assertTrue(contains);
    }

    @Test
    public void lastIndexOfTest1(){
        fillList();
        int index = myLinkedList.lastIndexOf("Zeraim");
        Assertions.assertEquals(0, index);
    }

    @Test
    public void lastIndexOfTest2(){
        fillList();
        int index = myLinkedList.lastIndexOf("Nezikin");
        Assertions.assertEquals(-1, index);
    }

    @Test
    public void lastIndexOfTest3(){
        fillList();
        myLinkedList.add("Zeraim");
        myLinkedList.add("'Cause chazarah's always good!");
        myLinkedList.add("If you don't chazer, forget it!");
        int index = myLinkedList.lastIndexOf("Zeraim");
        Assertions.assertEquals(3, index);
    }

    @Test
    public void retainAllTest1(){
        fillList();
        ArrayList<String> al = returnCollection(0);
        myLinkedList.retainAll(al);
        int size = myLinkedList.size();
        Assertions.assertEquals(0, size);
    }

    @Test
    public void retainAllTest2(){
        fillList();
        ArrayList<String> al = returnCollection(3);
        myLinkedList.retainAll(al);
        int size = myLinkedList.size();
        Assertions.assertEquals(0, size);
    }

    @Test
    public void retainAllTest3(){
        fillList();
        ArrayList<String> al = returnCollection(3);
        myLinkedList.addAll(al);
        myLinkedList.retainAll(al);
        int size = myLinkedList.size();
        Assertions.assertEquals(3, size);
    }

    @Test
    public void retainAllTest4(){
        fillList();
        ArrayList<String> al = returnCollection(3);
        myLinkedList.addAll(al);
        ArrayList<String> al2 = returnCollection(2);
        myLinkedList.retainAll(al2);
        int size = myLinkedList.size();
        Assertions.assertEquals(2, size);
    }

    @Test
    public void removeAllTest1(){
        fillList();
        ArrayList<String> al = returnCollection(0);
        myLinkedList.removeAll(al);
        int size = myLinkedList.size();
        Assertions.assertEquals(3, size);
    }

    @Test
    public void removeAllTest2(){
        fillList();
        ArrayList<String> al = returnCollection(3);
        myLinkedList.removeAll(al);
        int size = myLinkedList.size();
        Assertions.assertEquals(3, size);
    }

    @Test
    public void removeAllTest3(){
        fillList();
        ArrayList<String> al = returnCollection(4);
        myLinkedList.addAll(al);
        myLinkedList.removeAll(al);
        int size = myLinkedList.size();
        Assertions.assertEquals(3, size);
    }

    @Test
    public void removeAllTest4(){
        fillList();
        ArrayList<String> al = returnCollection(3);
        myLinkedList.addAll(al);
        ArrayList<String> al2 = returnCollection(2);
        myLinkedList.removeAll(al2);
        int size = myLinkedList.size();
        Assertions.assertEquals(4, size);
    }

    @Test
    public void toArrayTest1(){
        fillList();
        Object[] objArray = myLinkedList.toArray();
        Object gotten = (String) objArray[0];
        Assertions.assertEquals("Zeraim", gotten);
    }

    @Test
    public void toArrayTest2(){
        fillList();
        Object[] objArray = myLinkedList.toArray();
        String gotten = (String) objArray[2];
        Assertions.assertEquals("Nashim", gotten);
    }
}
