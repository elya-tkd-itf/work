package v_4;

public class Main {

    public static void main(String[] args) {
	    Client client1 = new Client("Jack");
	    Client client2 = new Client("Mark");

	    Company company1 = new Company("Samsung");
	    Company company2 = new Company("Asos");

	    Conversation conversation1 = new Conversation(client1, company1);
	    Conversation conversation2 = new Conversation(client2, company2);

	    client1.sendMessage(0, "Добрый день");
	    company1.sendMessage(0, "Здравствуйте! Чем могу помочь?");

		client2.sendMessage(0, "abcd");
		company2.sendMessage(0, "efgh");
		client2.sendMessage(0, "ijkl");
		company2.sendMessage(0, "mnop");

		conversation1.printAllMessanges();
		System.out.println();
		conversation2.printAllMessanges();
    }
}
