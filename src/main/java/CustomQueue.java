public class CustomQueue {

    private Node first;
    private int queueSize = 0;

    public void enqueue(String element) {
        if(this.first == null) {
            this.first = new Node(element);
        }
        else {
            Node node = new Node(element);
            node.setNextNode(first);
            this.first = node;
        }
    }

    public String peek() {
        return first.getValue();
    }

    public String dequeue() {
        Node newFirst = first.getNextNode();
        String dequeueElement = first.getValue();
        this.first = newFirst;
        return dequeueElement;
    }
}
