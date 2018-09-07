import CustomException.EmptyQueueException;

public class CustomQueue {

    private Node first;
    private Node last;
    private int queueSize = 0;

    public void enqueue(String element, int priority) {
        if(this.first == null) {
            this.first = new Node(element, priority);
        }
        else {
            Node node = new Node(element, priority);
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
        String dequeueElement = null;
        if(first == null) throw new EmptyQueueException("Queue is empty");
        updatePriority();
        if (first.getPriority() == this.higestPriority) {
            Node newFirst = first.getNextNode();
            dequeueElement = first.getValue();
            this.first = newFirst;
        }
        else {
            Node tempNode = this.first;
            while (tempNode.getNextNode() != null) {
                Node previous = tempNode;
                tempNode = tempNode.getNextNode();
                if(tempNode.getPriority() == this.higestPriority) {
                    previous.setNextNode(tempNode.getNextNode());
                    dequeueElement = tempNode.getValue();
                }
            }
        }

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

    public boolean isEmpty() {
        if(first == null) return true;
        else return false;
    }
}
