import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PreAmp implements ReferenceInput {

    private List<Integer> data = new ArrayList<>();

    public PreAmp() {
    }

    @Override
    public void collect(DataNode d) {
        DataNode currentNode = d;
        while (currentNode != null) {
            data.add(currentNode.getD());
            currentNode = currentNode.getNextNode();
        }
    }

    @Override
    public String distribute() {
        return data.stream().map(String::valueOf)
                .collect(Collectors.joining(""));
    }
}
