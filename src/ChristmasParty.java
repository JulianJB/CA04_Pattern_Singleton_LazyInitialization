// In the year there are many parties,
// but there is only one Christmas party every year.
class ChristmasParty {

    // The unique instance of the singleton object
    private static ChristmasParty _instance;

    // The private access modifier prevent the creation of
    // additional instances from this class.
    private ChristmasParty() {
        ; // Do nothing
    }

    public static ChristmasParty getInstance() {
        // If the singleton has not been instantiated before create the unique instance
        if (_instance == null) {
            // Providing the singleton with a lazy initialization
            _instance = new ChristmasParty();
        }
        // Return the singleton static instance
        return _instance;
    }

    @Override
    public String toString() { // Comment this method to see the actual allocation in memory
        // Return the name for this year's Christmas party
        return "Christmas Party 2020";
    }
}