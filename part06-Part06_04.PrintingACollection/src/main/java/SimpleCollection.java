
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
@Override
public String toString() {
    if (this.getElements().isEmpty()) {
        return "The collection " + this.name + " is empty.";
    }

    String result;
    if (elements.size() == 1) {
        result = "The collection " + this.name + " has 1 element:\n";
    } else {
        result = "The collection " + this.name + " has " + elements.size() + " elements:\n";
    }

    for (int i = 0; i < elements.size(); i++) {
        result += elements.get(i);
        if (i < elements.size() - 1) {
            result += "\n";
        }
    }

    return result;
}

}
