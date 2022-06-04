/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer E5
 */
public class doubleLLP_21 {
    node1_21 head, tail;
    public int size;

    public doubleLLP_21() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    private void addFirst(pembeli_21 item) {
        if (isEmpty()) {
            head = new node1_21(null, item, null);
            tail = head;
        } else {
            node1_21  newNode = new node1_21 (null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(pembeli_21 item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            node1_21 newNode = new node1_21(tail, item, null);
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public pembeli_21 removeFirst() {
        if (!isEmpty()) {
            pembeli_21 item = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            } else {
                head.prev = null;
            }
            size--;
            return item;
        } else {
            return null;
        }
    }

    public void print() {
        if (!isEmpty()) {
            node1_21 current = head;
            System.out.println("+++++++++++++++++++++++++++++++");
            System.out.println("Daftar Antrian Resto Royal Delish");
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println("|No.\t|Nama Customer\t\t|No hp");
            int i = 1;
            while (current != null) {
                System.out.println("|" + i + current.data);
                current = current.next;
                i++;
            }
            System.out.println("Total Antrian : " + size);
        } else {
            System.out.println("List masih kosong");
        }
    }
}
