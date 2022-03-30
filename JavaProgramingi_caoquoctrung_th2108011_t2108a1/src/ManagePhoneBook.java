import java.util.Scanner;

public class ManagePhoneBook {
    static PhoneBook phoneBook=new PhoneBook();
    static Scanner scanner=new Scanner(System.in);
    static String name;
    static String number;

    public ManagePhoneBook() {
    }

    @Override
    public String toString() {
        return name+":" +number;
    }

    public static void menu(){
        System.out.println("Phonebook");
        System.out.println("1.Insert phone");
        System.out.println("2.Look-up phone");
        System.out.println("3.Delete phone");
        System.out.println("4.Exit");
        System.out.println("========================");
    }

    public static void main(String[] args) {
        menu();
        while (true){

            System.out.println("Please choose an option:");
            int ch=scanner.nextInt();
            switch (ch){
                case 1:
                    insert();
                    break;
                case 2:
                    lookUp();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    return;
            }
        }
    }
    private static void insert(){
        scanner.nextLine();
        System.out.println("Input name:");
        name=scanner.nextLine();
        System.out.println("Input number phone:");
        number=scanner.nextLine();
        phoneBook.insert(name,number);
    }
    private static void lookUp(){
        scanner.nextLine();
        System.out.println("Please input name of person you want to search the phone");
        name=scanner.nextLine();
        phoneBook.lookUp(name);
    }
    private static void delete(){
        scanner.nextLine();
        System.out.println("Input name of person you want to remove:");
        name=scanner.nextLine();
        phoneBook.delete(name);
    }
}
