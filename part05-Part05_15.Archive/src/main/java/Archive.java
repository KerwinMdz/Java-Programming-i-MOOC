public class Archive {
    private String name;
    private String identifier;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    // Method for testing equality
    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Archive)) {
            return false;
        }

        Archive comparedItem = (Archive) compared;

        return this.identifier.equals(comparedItem.identifier);
    }
}