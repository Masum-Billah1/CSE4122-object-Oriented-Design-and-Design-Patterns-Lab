public class Room implements IStructure {
    private String name;

    public Room(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void location() {
        // Describe the current location
        System.out.println("You are currently in " + this.getName() + ". It includes:");
    }

    @Override
    public void enter() {
        // Describe entering the room
        System.out.println("You have entered " + this.getName());
    }

    @Override
    public void exit() {
        // Describe exiting the room
        System.out.println("You have left " + this.getName());
    }
}
