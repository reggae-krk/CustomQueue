import CustomException.EmptyQueueException;

public class CustomQueue {

    private Node first;
    private Node last;
    private int queueSize = 0;

    public void enqueue(String element) {
        if(this.first == null) {
            this.first = new Node(element);
        }
        else {
            Node node = new Node(element);
            updateLast();
            this.last.setNextNode(node);
        }
        queueSize++;
    }

    public String peek() {
        if (first != null) return first.getValue();
        else throw new EmptyQueueException("Queue is empty");
    }

    public String dequeue() {
        Node newFirst = first.getNextNode();
        String dequeueElement = first.getValue();
        this.first = newFirst;
        queueSize--;
        return dequeueElement;
    }

    public int getQueueSize() {
        return queueSize;
    }

    private void updateLast() {
        Node tempNode = this.first;
        while (tempNode.getNextNode() != null) {
            tempNode = tempNode.getNextNode();
        }
        this.last = tempNode;
    }
}
