class Runner {

    public static void main(String[] args) {

        // Create attendees for the party
        ChristmasParty attendee1 = ChristmasParty.getInstance();
        ChristmasParty attendee2 = ChristmasParty.getInstance();

        // Print the attendees confirmed for the party,
        // notice how they are attending the same Christmas party.
        System.out.println("There is an attendee for the party: "  + attendee1); // :ChristmasParty@53d8d10a
        System.out.println("There is another attendee for the party: " + attendee2); // :ChristmasParty@53d8d10a

        System.exit(0);
    }
}