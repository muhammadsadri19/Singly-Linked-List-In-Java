package Module_SinglyLinkedList;

import java.util.NoSuchElementException;

public class SinglyLinkedList <E>{
    private ListNode<E> firstNode;
    private ListNode<E> lastNode;
    private String name;

    public SinglyLinkedList(){
        this("Linked List");
    }

    public SinglyLinkedList(String listname){
        name = listname;
        firstNode = lastNode = null;
    }

//Input data dari awal list
    public void insertAtFront(E insertItem){
        ListNode newNode = new ListNode(insertItem);

        if (isEmpety()){
            firstNode = lastNode = new ListNode<E>(insertItem);
        }else {
            newNode.next = firstNode;
            firstNode = newNode;
        }
    }

    //input data dari akhir list
    public void insertAtBack(E insertItem){
        ListNode newNode = new ListNode(insertItem);

        if (isEmpety()){
            firstNode = lastNode = new ListNode<E>(insertItem);
        }else {
            lastNode.next = newNode;
            lastNode = newNode;
        }
    }


    //Hapus data dari Awal list
    public E removeFromFront() throws NoSuchElementException {
        if (isEmpety()) {
            throw new NoSuchElementException(name + " masih kosong");
        }

        E removedItem = firstNode.data;

        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            ListNode<E> current = firstNode;

            current = firstNode;
            firstNode = current.next;
            current.next = null;
        }
        return removedItem;
    }

    //Hapus data dari akhir list
    public E removeFromBack()throws NoSuchElementException{
        if (isEmpety()){
            throw new NoSuchElementException(name + "masih kosong");
        }
        E removedItem = lastNode.data;

        if (firstNode == lastNode){
            firstNode = lastNode = null;
        }else {
            ListNode<E> current = firstNode;
            while (current.next != lastNode){
                current = current.next;
            }

            lastNode = current;
            current.next = null;
        }
        return removedItem;
    }


    private boolean isEmpety(){
        return firstNode == null;
    }

    //Tampilkan Data
    public void print(){
        if (isEmpety()){
            System.out.printf("Empty %s%n", name);
            return;
        }

        System.out.printf("The %s is: %n", name);
        ListNode<E> current = firstNode;

        while (current != null){
            System.out.printf("%s ", current.data);
            current = current.next;
        }
        System.out.println();
    }
}
