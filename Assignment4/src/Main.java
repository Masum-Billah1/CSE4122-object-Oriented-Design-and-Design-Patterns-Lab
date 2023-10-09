public class Main {
    public static void main(String[] args) {
        // Create a housing complex
        Housing building = new Housing("123 Street");

        // Create the first floor of the building
        Housing floor1 = new Housing("Street - First Floor");

        // Add the first floor to the building complex
        int firstFloor = building.addStructure(floor1);

        // Create rooms on the first floor
        Room washroom1M = new Room("1F Men's Washroom");
        Room washtroom1W = new Room("1F Women's Washtroom");
        Room commonArea1 = new Room("1F Common Area");

        // Add rooms to the first floor
        int firstMens = floor1.addStructure(washroom1M);
        int firstWomens = floor1.addStructure(washtroom1W);
        int firstCommon = floor1.addStructure(commonArea1);

        // Enter the building complex
        building.enter();

        // Enter the current floor (first floor)
        Housing currentFloor = (Housing) building.getStructure(firstFloor);
        currentFloor.enter();

        // Enter the current room (Men's restroom)
        Room currentRoom = (Room) currentFloor.getStructure(firstMens);
        currentRoom.enter();

        // Switch to another room (Common Area)
        currentRoom = (Room) currentFloor.getStructure(firstCommon);
        currentRoom.enter();

        // Exit the building complex
        currentRoom.exit();
        currentFloor.exit();
        building.exit();
    }
}
