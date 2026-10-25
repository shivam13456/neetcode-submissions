class LinkedList {
    private class Node {
        private Node next;
        private int val;

        public Node (int val) {
            this.val = val;
        }

        public Node (int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.val; 
    }

    public void insertHead(int val) {
        Node node = new Node (val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size = size + 1;
    }

    public void insertTail(int val) {
        Node node = new Node (val);
        if (tail == null) {
            head = node;
            tail = node;
        }
        else {
            tail.next = node;
            tail = tail.next;
            // tail = node;
        }
        size = size + 1;
    }

    public boolean deleteFirst () {
        if (head == null) {
            return false;
        }
        head = head.next;
        size = size - 1;
        return true;
    }

    public boolean deleteLast() {
        if (head == null) {
            return false;
        }
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = head;
        for (int i = 0; i < size - 2; i++) {
            secondLast = secondLast.next;
        }
        tail = secondLast;
        tail.next = null;
        size = size - 1;
        return true;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= size) {
            return false;
        }
        if (index == 0) {
            deleteFirst();
            return true;
        }
        if (index == size - 1) {
            deleteLast();
            return true;
        }
        Node prev = head;

        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        size = size - 1;
        return true;
    }

    public ArrayList<Integer> getValues() {
        Node temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(temp.val);
            temp = temp.next;
        }
        return list;
    }
}
