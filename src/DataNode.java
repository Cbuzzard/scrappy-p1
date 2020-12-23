public class DataNode {

    private int d;
    private DataNode nextNode;

    public DataNode(int d, DataNode nextNode) {
        this.d = d;
        this.nextNode = nextNode;
    }

    public DataNode(int d) {
        this.d = d;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public DataNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DataNode nextNode) {
        this.nextNode = nextNode;
    }
}
