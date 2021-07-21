package data_structure.arrays.linkedList;

public class LinkedListImpl {

    private class Node {
        private int value;
        private Node next; //to keep ref to next

        public Node(int value) {
            this.value = value;
        }
    }


    private Node first;
    private Node last;


  public void addFirst(int item){
      var node = new Node(item);
      node.value = item;

      if(first == null)
          first = last = node;
      else{
          first.next = node;
          first = node;
      }
  }

  public void addLast(int item){
        var node = new Node(item);
        node.value = item;

        if(first == null)
            first = last = node;
        else{
            last.next = node;
            last = node;
        }
  }


  private boolean isEmpty(){
      return first == null;
  }



    //TODO this methods:
    //addFirst
    //addLast
    //deleteFirst
    //deleteLast
    //contains
    //indexOf

}
