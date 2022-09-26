package BasicSyntaxExer;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int people = Integer.parseInt(scanner.nextLine());
        String typeOfPeople = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double price = 0;

        if(dayOfWeek.equals("Friday")){
            if(typeOfPeople.equals("Students")){
                if(people >= 30){
                price = (people * 8.45) * 0.85;
                }else{
                price = people * 8.45;
                }
            }else if(typeOfPeople.equals("Business")){
                if(people >= 100){
                    price = (people - 10) * 10.90;
                }else{
                    price = people * 10.90;
                }
            } else if (typeOfPeople.equals("Regular")){
                if(people >= 10 && people<=20){
                    price = (people * 15) * 0.95;
                }else{
                    price = people * 15;
                }
            }
        } else if (dayOfWeek.equals("Saturday")){
            if(typeOfPeople.equals("Students")){
                if(people >= 30){
                    price = (people * 9.80) * 0.85;
                }else{
                    price = people * 9.80;
                }
            }else if(typeOfPeople.equals("Business")){
                if(people >= 100){
                    price = (people - 10) * 15.60;
                }else{
                    price = people * 15.60;
                }
            } else if (typeOfPeople.equals("Regular")){
                if(people >= 10 && people<=20){
                    price = (people * 20) * 0.95;
                }else{
                    price = people * 20;
                }
            }
        } else if (dayOfWeek.equals("Sunday")){
            if(typeOfPeople.equals("Students")){
                if(people >= 30){
                    price = (people * 10.46) * 0.85;
                }else{
                    price = people * 10.46;
                }
            }else if(typeOfPeople.equals("Business")){
                if(people >= 100){
                    price = (people - 10) * 16;
                }else{
                    price = people * 16;
                }
            } else if (typeOfPeople.equals("Regular")){
                if(people >= 10 && people<=20){
                    price = (people * 22.50) * 0.95;
                }else{
                    price = people * 22.50;
                }
            }

        }
        System.out.printf("Total price: %.2f",price);
    }
}
