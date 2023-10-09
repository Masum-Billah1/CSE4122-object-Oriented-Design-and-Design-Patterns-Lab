import java.util.ArrayList;

public class Housing implements IStructure {
    private ArrayList<IStructure> structures;
    private String address;

    public Housing(String address) {
        this.address = address;
        this.structures = new ArrayList<IStructure>();
    }

    @Override
    public String getName() {
        return this.address;
    }

    public int addStructure(IStructure component) {
        // Add a structure to this housing unit
        this.structures.add(component);
        return this.structures.size() - 1;
    }

    public IStructure getStructure(int componentNumber) {
        // Get a structure within this housing unit
        return this.structures.get(componentNumber);
    }

    @Override
    public void location() {
        // Describe the current location within this housing unit
        System.out.println("You are currently in " + this.getName() + ". It includes:");
        for (IStructure structure : this.structures) {
            System.out.println("- " + structure.getName());
        }
    }

    @Override
    public void enter() {
        // Describe entering this housing unit
        System.out.println("You have entered " + this.getName());
    }

    @Override
    public void exit() {
        // Describe exiting this housing unit
        System.out.println("You have left " + this.getName());
    }
}
