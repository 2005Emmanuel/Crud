package crud_console;

import java.util.Scanner;
import java.util.ArrayList;

public class Crud {
    public static void main(String[] args) {
        Main main_obj = new Main();
        main_obj.add_method();

    }

}

class Main {
    public void add_method() {
        
        // create
        ArrayList<String> words = new ArrayList<>();
        try (Scanner scanner_obj1 = new Scanner(System.in)) {
            System.out.println("Enter words ");
            for (int a = 0; a < 5; a++) {
                String create = scanner_obj1.nextLine();
                words.add(create);
            }

            // read
            try (Scanner r_obj = new Scanner(System.in)) {
                System.out.println("\ntype READ to see all words you entered");
                String r_words = r_obj.nextLine();
                switch (r_words) {
                    case "READ":
                        for (String i : words) {
                            System.out.println("you added  " + i);
                        }
                }

                // update
                try (Scanner obj3 = new Scanner(System.in)) {
                    System.out.println("\nEnter a number to update");
                    int update = obj3.nextInt();
                    switch (update) {
                        case 1:
                            Scanner obj4 = new Scanner(System.in);
                            System.out.println("\nEnter a word to update");
                            String update_words_1 = obj4.nextLine();
                            words.set(0, update_words_1);
                            System.out.println("\nsuccesfully updated\n");
                            for (String up_1 : words) {
                                System.out.println(up_1);
                            }
                            break;

                        case 2:
                            Scanner obj5 = new Scanner(System.in);
                            System.out.println("\nEnter a word to update");
                            String update_words_2 = obj5.nextLine();
                            words.set(1, update_words_2);
                            System.out.println("\nsuccesfully updated\n");
                            for (String up_2 : words) {
                                System.out.println(up_2);
                            }
                            break;

                        case 3:
                            Scanner obj6 = new Scanner(System.in);
                            System.out.println("\nEnter a word to update");
                            String update_words_3 = obj6.nextLine();
                            words.set(2, update_words_3);
                            System.out.println("\nsuccesfully updated\n");
                            for (String up_3 : words) {
                                System.out.println(up_3);
                            }
                            break;

                        case 4:
                            Scanner obj7 = new Scanner(System.in);
                            System.out.println("\nEnter a word to update");
                            String update_words_4 = obj7.nextLine();
                            words.set(3, update_words_4);
                            System.out.println("\nsuccesfully updated\n");
                            for (String up_4 : words) {
                                System.out.println(up_4);
                            }
                            break;

                        case 5:
                            Scanner obj8 = new Scanner(System.in);
                            System.out.println("\nEnter a word to update");
                            String update_words_5 = obj8.nextLine();
                            words.set(4, update_words_5);
                            System.out.println("\nsuccesfully updated\n");
                            for (String up_5 : words) {
                                System.out.println(up_5);
                            }
                            break;

                    }

                    // delete
                    try (Scanner obj2 = new Scanner(System.in)) {
                        System.out.println("\nEnter a number to delete");
                        int del = obj2.nextInt();
                        switch (del) {
                            case 1:
                                System.out.println("sucessfully deleted " + words.remove(0));
                                for (String d_1 : words) {
                                    System.out.println(d_1);
                                }
                                break;

                            case 2:
                                System.out.println("sucessfully deleted " + words.remove(1));
                                for (String d_2 : words) {
                                    System.out.println(d_2);
                                }
                                break;

                            case 3:
                                System.out.println("sucessfully deleted " + words.remove(2));
                                for (String d_3 : words) {
                                    System.out.println(d_3);
                                }
                                break;

                            case 4:
                                System.out.println("sucessfully deleted " + words.remove(3));
                                for (String d_4 : words) {
                                    System.out.println(d_4);
                                }
                                break;

                            case 5:
                                System.out.println("sucessfully deleted " + words.remove(4));
                                for (String d_5 : words) {
                                    System.out.println(d_5);
                                }
                                break;

                            case 6:
                                words.clear();
                                for (String d_6 : words) {
                                    System.out.println("sucessfully deleted all items " + d_6);
                                }

                                break;
                        }
                    }

                }
            }

        }

    }

}
