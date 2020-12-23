public class RunScrappy {

    public static void main(String[] args) {

        DataNode dOne = new DataNode(1,  new DataNode(2));

        PreAmp scarlet = new PreAmp();

        scarlet.collect(dOne);

        System.out.println(scarlet.distribute());

    }

}
