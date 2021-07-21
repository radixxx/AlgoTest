package data_structure.arrays.linkedList;

import java.util.NoSuchElementException;

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

  public int indexOf(int item){
    int index = 0;
    var current = first;

    while (current != null){
        if(current.value == item) return index;
        current = current.next;
        index++;
    }

    return -1;
  }

    public boolean contains(int item){
      return indexOf(item) != -1;
    }

    public void deleteFirst(){
      //[10 -> 20 -> 30]
      //first => 10

      if(isEmpty()) throw new NoSuchElementException();

      if(first == last){
          first = last = null;
          return;
      }

      var second = first.next;
      first.next = null;
      first = second;

    }

    public void deleteLast(){
        //[10 -> 20 -> 30]
        //last => 30
      if(isEmpty()) throw new NoSuchElementException();

      if(first == last){
          first = last = null;
          return;
      }

      var previous = getPrevious(last);
      last = previous;
      last.next = null;

    }

    private Node getPrevious(Node node){
        var current = first;
        while (current != null){
            if(current.next == node) return current;
            current = current.next;
        }

        return null;
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
