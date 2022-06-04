/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer E5
 */
public class doubleLL_21 {
    Node_21 head, tail;
    public int size;

    public doubleLL_21() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    private void addFirst(pesanan_21 item) {
        if (isEmpty()) {
            head = new Node_21(null, item, null);
            tail = head;
        } else {
            Node_21 newNode = new Node_21(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(pesanan_21 item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node_21 newNode = new Node_21(tail, item, null);
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public pesanan_21 removeFirst() {
        if (!isEmpty()) {
            pesanan_21 item = head.data;
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
            Node_21 current = head;
            System.out.println("+++++++++++++++++++++++++++++++");
            System.out.println("Daftar Pesanan Resto Royal Delish");
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println("|No.\t|Nama Pesanan\t\t|Harga");
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        } else {
            System.out.println("List masih kosong");
        }
    }

    public void printSortByName() {
        if (!isEmpty()) {
            Node_21 current = head;
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println("Daftar Pesanan Resto Royal Delish");
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println("|No.\t|Nama Pesanan\t\t|Harga");
            int i = 0;
            while (i < size) {
                int j = i + 1;
                while (j < size) {
                    if (current.data.namaPesanan.charAt(0) < current.next.data.namaPesanan.charAt(0)) {
                        pesanan_21 temp = current.data;
                        current.data = current.next.data;
                        current.next.data = temp;
                    }
                    current = current.next;
                    j++;
                }
                current = head;
                i++;
            }
        } else {
            System.out.println("List masih kosong");
        }
    }

    public void printSum() {
        if (!isEmpty()) {
            Node_21 current = head;
            int sum = 0;
            while (current != null) {
                sum += current.data.harga;
                current = current.next;
            }
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println("TOTAL PENDAPATAN");
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println("Pendapatan hari ini : " + sum);
        } else {
            System.out.println("List masih kosong");
        }
    }
}
