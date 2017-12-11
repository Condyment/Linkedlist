
public class LIII {
	Node head;

    public LIII(int val) {
        head = new Node(val);
    }
    


    public void insert(int val) {
        Node currentNode = head;
        Node nextNode = head.next;

        if (currentNode.num > val) {
            Node tmpNode = head;
            head = new Node(val);
            head.next = tmpNode;
            return;
        }

        if (nextNode != null && nextNode.num > val) {
            currentNode.next = new Node(val);
            currentNode.next.next = nextNode;
            return;
        }

        while (nextNode != null && nextNode.num < val) {
            currentNode = nextNode;
            nextNode = nextNode.next;
        }

        currentNode.next = new Node(val);
        currentNode.next.next = nextNode;
    }

    public void delete(int val) {
        Node prevNode = null;
        Node currNode = head;

        if (head.num == val) {
            head = head.next;
            return;
        }

        while (currNode != null && currNode.num != val) {
            prevNode = currNode;
            currNode = currNode.next;
        }

        if (currNode == null) {
            System.out.println("A node with that value does not exist.");
        }
        else {
            prevNode.next = currNode.next;
        }

    }

    public void print() {
        Node tmpNode = head;
        while (tmpNode != null) {
            System.out.print(tmpNode.num + " -> ");
            tmpNode = tmpNode.next;
        }
        System.out.print("null");
    }
}
