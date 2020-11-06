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

    // Lazy initialization in singletons works by manually requesting to retrieve
    // the unique instance of the singleton. Each time the method getInstance is
    // called the method verifies if the unique instance has already been created,
    // otherwise it creates the singleton instance. This means that if the singleton
    // is never requested during runtime the instance will not be created.
    // Although it is not a resource-intensive implementation this approach is considered
    // not to be thread-safe which means that if multiple threads request the singleton instance
    // during runtime it is possible that additional instances of the singleton are created
    // which goes against the design pattern that specifies that only one instance of the singleton
    // can exist. Unfortunately, this behavior cannot be easily tested in an application
    // as it is mentioned in this webpage resource:
    // https://stackoverflow.com/questions/48772068/unit-test-the-thread-safety-of-a-singleton-class-in-java
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