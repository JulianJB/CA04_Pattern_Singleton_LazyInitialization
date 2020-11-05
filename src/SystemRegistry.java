// A computer has many system files and registries,
// but there is only one system registry file.
class SystemRegistry {

    // The unique instance of the singleton object
    private static SystemRegistry _instance;

    // The private access modifier prevent the creation of
    // additional instances from this class.
    private SystemRegistry() {
        ; // Do nothing
    }

    public static SystemRegistry getInstance() {
        // If the singleton has not been instantiated before create the unique instance
        if (_instance == null) {
            // Providing the singleton with a lazy initialization
            _instance = new SystemRegistry();
        }
        // Return the singleton static instance
        return _instance;
    }

    // Other useful methods of the system registry singleton
    void writeEntry() {}

    void deleteEntry() {}

    void backupRegistry() {}
}