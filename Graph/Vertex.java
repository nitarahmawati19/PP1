package Graph;

public class Vertex {
    private char label; // Label dari vertex
    private boolean wasVisited; 

    public Vertex(char lab) {
        this.label = lab;
        this.wasVisited = false;
    }

    // getter untuk label
    public char getLabel() {
        return label;
    }

    // setter untuk label
    public void setLabel(char label) {
        this.label = label;
    }

    // getter untuk wasVisited
    public boolean wasVisited() {
        return wasVisited;
    }

    // setter untuk wasVisited
    public void setVisited(boolean wasVisited) {
        this.wasVisited = wasVisited;
    }
}
