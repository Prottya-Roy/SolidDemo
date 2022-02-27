package Demo;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineRestaurant {

    public static void main(String[] args) {
        String customerName;
        int command1, command2;
        int totalCost=0;

        int itemCode, quantity;
        String categoryName=null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our Restaurant...");
        System.out.println("Please enter your name : ");
        customerName = scanner.nextLine();
        Customer customer = new Customer(customerName);
        System.out.println("What would you like to do :");
        System.out.println(" 1. Order food \n 2. I entered here by mistake!!!");
        command1 = scanner.nextInt();
        if(command1==1){
            System.out.println("Select any Item category:");
            System.out.println("1. Rice\n2. Fish\n3. Meat");

            itemCode = scanner.nextInt();
            if(itemCode==1){
                System.out.println("Select rice Category:\n1. normal\n2. polao\n3. khicuri");
                itemCode = scanner.nextInt();
                System.out.println("Number of portions wanted : ");
                quantity=scanner.nextInt();
                if(itemCode==1){
                    categoryName= "normal";
                }
                else if(itemCode==2){
                    categoryName = "polao";
                }
                else{
                    categoryName="khicuri";
                }
                customer.placeOrderForFood("Rice",quantity, customerName, categoryName);
            }
            else if(itemCode==2){
                System.out.println("Select rice Category:\n1. Rui\n2. Small");
                itemCode = scanner.nextInt();
                System.out.println("Number of portions wanted : ");
                quantity=scanner.nextInt();
                if(itemCode==1){
                    categoryName= "rui";
                }
                else if(itemCode==2){
                    categoryName = "small";
                }
                customer.placeOrderForFood("Rice",quantity, customerName, categoryName);
            }
            else if(itemCode==3){
                System.out.println("Select rice Category:\n1. Chicken\n2. Beef");
                itemCode = scanner.nextInt();
                System.out.println("Number of portions wanted : ");
                quantity=scanner.nextInt();
                if(itemCode==1){
                    categoryName= "chicken";
                }
                else if(itemCode==2){
                    categoryName = "beef";
                }
                customer.placeOrderForFood("Rice",quantity, customerName, categoryName);
            }
            while (true){
                System.out.println("Do you still want to continue adding items?\n1. Yes.\n2.No");
                command2 = scanner.nextInt();
                if(command2==1){
                    System.out.println("Select any Item category:");
                    System.out.println("1. Rice\n2. Fish\n3.Meat");

                    itemCode = scanner.nextInt();
                    if(itemCode==1){
                        System.out.println("Select rice Category:\n1. normal\n2. polao\n3. khicuri");
                        itemCode = scanner.nextInt();
                        System.out.println("Number of portions wanted : ");
                        quantity=scanner.nextInt();
                        if(itemCode==1){
                            categoryName= "normal";
                        }
                        else if(itemCode==2){
                            categoryName = "polao";
                        }
                        else{
                            categoryName="khicuri";
                        }
                        customer.placeOrderForFood("Rice",quantity, customerName, categoryName);
                    }
                    else if(itemCode==2){
                        System.out.println("Select rice Category:\n1. Rui\n2. Katol\n3. Telapia\n4. Hilsha\n5. Shrimp\n6. Small Fish");
                        itemCode = scanner.nextInt();
                        System.out.println("Number of portions wanted : ");
                        quantity=scanner.nextInt();
                        if(itemCode==1){
                            categoryName= "rui";
                        }
                        else if(itemCode==2){
                            categoryName = "katol";
                        }
                        else if (itemCode==3){
                            categoryName = "telapia";
                        }
                        else if (itemCode==4){
                            categoryName = "hilsha";
                        }
                        else if (itemCode==5){
                            categoryName = "shrimp";
                        }
                        else if(itemCode==6){
                            categoryName = "small";
                        }
                        customer.placeOrderForFood("Fish",quantity, customerName, categoryName);
                    }
                    else if(itemCode==3){
                        System.out.println("Select rice Category:\n1. Chicken\n2. Beef\n3. Mutton\n4. Koyel");
                        itemCode = scanner.nextInt();
                        System.out.println("Number of portions wanted : ");
                        quantity=scanner.nextInt();
                        if(itemCode==1){
                            categoryName= "chicken";
                        }
                        else if(itemCode==2){
                            categoryName = "beef";
                        }
                        else if(itemCode==3){
                            categoryName = "mutton";
                        }
                        else if(itemCode==4){
                            categoryName = "koyel";
                        }
                        customer.placeOrderForFood("Meat",quantity, customerName, categoryName);
                    }
                }
                else if (command2==2){
                    break;
                }
            }

            System.out.println("Thanks for ordering food.\nWe recieved your order.\nHere is your slip.");
            customer.printCustomerDetails();
        }
        else{
            System.out.println("Thanks for being. Hope you return again and order food from us.");
        }


    }
}
