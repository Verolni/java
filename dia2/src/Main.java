import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ejercicio 1: Calculadora Básica
//       System.out.println("Enter first number: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter second number: ");
//        int num2 = sc.nextInt();
//
//        System.out.println("the sum of the two numbers: "+(num1+num2));
//        System.out.println("the difference of the two numbers: "+(num1-num2));
//        System.out.println("the product of the two numbers: "+(num1*num2));
//        System.out.println("the quotient of the two numbers: "+(num1/num2));

        //Ejercicio 2: Verificador de Edad

//        System.out.println("Write your age");
//        int age = sc.nextInt();
//        if(age >= 18){
//            System.out.println("You are adult");
//        }else{
//            System.out.println("You are child");
//        }
        //Ejercicio 3: Conversor de Unidades
//        System.out.println("Enter a distance in Kilometers: ");
//        double distance = sc.nextDouble();
//        System.out.println("Enter height in mile: "+(distance*1.609));

        //Ejercicio 4: Calculadora de Índice de Masa Corporal (IMC)
//        System.out.println("Enter your weight in kg: ");
//        double weight = sc.nextDouble();
//        System.out.println("Enter your height in M: ");
//        double height = sc.nextDouble();
//        double IMC = weight /(height* height);
//        if (IMC < 18.5) {
//            System.out.println("You are underweight");
//        }else if (IMC < 25) {
//            System.out.println("You are underweight");
//        }else if (IMC < 30) {
//            System.out.println("You are underweight");
//        }else if (IMC < 35) {
//            System.out.println("You are underweight");
//        }


        //Ejercicio 5: Clasificador de Números
//        System.out.println("Enter number: ");
//        int num3 = sc.nextInt();
//        if(num3 > 0){
//            System.out.println("the number is positive");
//        }else{
//            System.out.println("the number is negative");
//        }
//        if(num3 % 2 == 0){
//            System.out.println("the number is even");
//        }else{
//            System.out.println("the number is odd");
//        }
        //Ejercicio 6: Calculadora de Días del Mes
//        System.out.println("Enter a month in number(1-12)");
//        int month = sc.nextInt();
//        switch (month){
//            case 1:
//                System.out.println("January have 31 days");
//            case 2:
//                System.out.println("february have 28 days");
//                case 3:
//                    System.out.println("march have 31 days");
//                    case 4:
//                        System.out.println("april have 30 days");
//                        case 5:
//                            System.out.println("may have 31 days");
//                            case 6:
//                                System.out.println("june have 30 days");
//                                case 7:
//                                    System.out.println("july have 31 days");
//                                    case 8:
//                                        System.out.println("august have 31 days");
//                                        case 9:
//                                            System.out.println("september have 30 days");
//                                            case 10:
//                                                System.out.println("october have 31 days");
//                                                case 11:
//                                                    System.out.println("november have 30 days");
//                                                    case 12:
//                                                        System.out.println("december have 31 days");
//                                                        break;
//            default:
//                System.out.println("Invalid month");
//
//
//
//
//        }
        //Ejercicio 7: Menú Interactivo
//        System.out.println("what math opration would you like to use?:\n addition = 1\n subtraction = 2\n multiplication = 3\n division = 4");
//        int op = sc.nextInt();
//        System.out.println("Enter first number");
//        int num1 = sc.nextInt();
//        System.out.println("Enter second number");
//        int num2 = sc.nextInt();
//        switch (op) {
//            case 1:
//                System.out.println(num1 + num2);
//                break;
//                case 2:
//                    System.out.println(num1 - num2);
//                    break;
//                     case 3:
//                        System.out.println(num1 * num2);
//                        break;
//                        case 4:
//                            System.out.println(num1 / num2);
//                             break;
//            default:
//                System.out.println("Invalid operation");
//
//        }
        //Ejercicio 8: Cálculo de Promedio
//        System.out.println("Enter first quality");
//        int q1 = sc.nextInt();
//        System.out.println("Enter second quality");
//        int q2 = sc.nextInt();
//        System.out.println("Enter third quality");
//        int q3 = sc.nextInt();
//        int prom = (q1 + q2 + q3) / 3;
//        if (prom >= 6) {
//            System.out.println("The student was approved with a average of " + prom + "%");
//        }else{ System.out.println("The student was not approved with a average of " + prom + "%");
//        }


//Ejercicio 9: Calculadora de Año Bisiesto
//        System.out.println("Enter a year");
//        int year = sc.nextInt();
//        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//            System.out.println(year + " is a leap year");
//        }else{
//            System.out.println(year + " is not a leap year");
//        }

        //Ejercicio 10: Calculadora de Propina
//        System.out.println("Enter the total price of bill (without points or commas)");
//        long total = sc.nextLong();
//        System.out.println("percentage of tips " );
//        double percentage = sc.nextDouble();
//        double tips = total*percentage/100;
//        System.out.println("The total price tips is " + tips);

//Ejercicio 11: Ordenando Tres Números
//        System.out.println("Enter first number: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter second number: ");
//        int num2 = sc.nextInt();
//        System.out.println("Enter third number: ");
//        int num3 = sc.nextInt();
//
//        if(num1 > num2 &&  num2 > num3){
//            System.out.println(num1 + " is greater than " + num2 + " and " + num3);
//        } else if(num1 > num3 &&  num3 > num2){
//            System.out.println(num1 + " is greater than " + num3 + " and " + num2);
//        }else if (num2 > num1 &&  num1 > num3){
//            System.out.println(num2 + " is greater than " + num1 + " and " + num3);
//        }else if (num2 > num3 &&  num3 > num1){
//            System.out.println(num2 + " is greater than " + num3 + " and " + num1);
//        }else if (num3 > num1 &&  num1 > num2){
//            System.out.println(num3 + " is greater than " + num1 + " and " + num2);
//        }else if (num3 > num2 &&  num2 > num1){
//            System.out.println(num3 + " is greater than " + num2 + " and " + num1);
//        }

        //Ejercicio 12: Generador de Horóscopo
//        System.out.println("enter your birth month");
//        String month = sc.nextLine();
//        System.out.println("enter your birth day");
//        int day = sc.nextInt();
//        switch (month) {
//            case "january":
//                if (day >= 20 && day <= 31) {
//                    System.out.println("You are Aquarium");
//                } else if(day <= 19 && day > 0){
//                    System.out.println("You are Pisces");
//                }else{
//                    System.out.println("Error");
//                }
//                break;
//            case "february":
//                if (day >= 20 && day <= 29) {
//                    System.out.println("You are Pisces");
//                }else if(day <= 19 && day > 0){
//                System.out.println("You are Aries");
//                }else{
//                    System.out.println("Error");
//                }
//                break;
//            case "march":
//                if (day >= 21 && day <= 31) {
//                    System.out.println("You are Aries");
//                }else if(day <= 20 && day > 0) {
//                    System.out.println("You are Taurus");
//                }else{
//                System.out.println("Error");
//            }
//
//                break;
//            case "april":
//                if (day >= 20 && day <= 30) {
//                    System.out.println("You are Taurus");
//                }else if(day <= 19 && day > 0) {
//                    System.out.println("You are Gemini");
//                }else{
//                System.out.println("Error");
//            }
//                break;
//            case "may":
//                if (day >= 21 && day <= 31) {
//                    System.out.println("You are Gemini");
//                }else if(day <= 19 && day > 0){
//                    System.out.println("You are Cancer");
//                }else{
//                System.out.println("Error");
//            }
//                break;
//            case "june":
//                if (day >= 21 && day <= 30) {
//                    System.out.println("You are Cancer");
//                }else if(day <= 19 && day > 0){
//                    System.out.println("Your are Leo");
//                }{
//                System.out.println("Error");
//            }
//                break;
//            case "july":
//                if (day >= 23 && day <= 31) {
//                    System.out.println("You are Leo");
//                }else if(day <= 22 && day > 0){
//                    System.out.println("You are Virgo");
//                }else{
//                System.out.println("Error");
//            }
//                break;
//            case "august":
//                if (day >= 23 && day <= 31) {
//                    System.out.println("You are Virgo");
//                }else if(day <=22 && day > 0){
//                    System.out.println("You are Libra");
//                }else{
//                System.out.println("Error");
//            }
//                break;
//            case "september":
//                if (day >= 23 && day <= 30) {
//                    System.out.println("You are Libra");
//                }else if(day <= 22 && day > 0){
//                System.out.println("You are Scorpio");
//                }else{
//                System.out.println("Error");
//            }
//                break;
//            case "october":
//                if (day >= 23 && day <= 31) {
//                    System.out.println("You are Aquarius");
//                }else if(day <= 22 && day > 0){
//                    System.out.println("You are Scorpio");
//                }else{
//                System.out.println("Error");
//            }
//                break;
//            case "november":
//                if (day >= 22 && day <= 30) {
//                    System.out.println("You are Scorpio");
//                }else if(day <= 21 && day > 0){
//                    System.out.println("You are Sagittarius");
//                }else{
//                System.out.println("Error");
//            }
//
//                break;
//
//                case "december":
//                    if (day >= 22 && day <= 31) {
//                        System.out.println("You are Sagittarius");
//                    }else if(day <= 21 && day > 0){
//                        System.out.println("You are Capricorn");
//                    }else{
//            System.out.println("Error");
//        }
//                    break;
//            default:
//                System.out.println("Invalid month");
//        }

        //Ejercicio 13: Calculadora de Tarifa de Taxi
//        System.out.println("Enter the amount of kilometers that you've spent on the trip");
//        double km = sc.nextDouble();
//        double tm =(km* 1550)+ 5200;
//        System.out.println("La tarifa a pagar es: "+tm+"$");

        //Ejercicio 14: Convertidor de Temperatura
//        System.out.println("ingrese si desea cambiar grados:\n C° a F°:1 \n F° a C°:2");
//        int op = sc.nextInt();
//        System.out.println("Ingrese los grados en numeros:");
//
//
//        switch (op) {
//            case 1:
//                int num = sc.nextInt();
//                int F = num*9/5 +32;
//                System.out.println(num+" C° son "+ F+"F°");
//
//                break;
//                case 2:
//                    int num2 = sc.nextInt();
//                    int C = (num2-32)*5/9;
//                    System.out.println(num2+"F° son "+ C+"C°");
//                    break;
//
//
//            default:
//                System.out.println("Error");
//        }

        //Ejercicio 15: Sistema de Calificaciones
//        System.out.println("Enter qualification number: ");
//        double qua = sc.nextInt();
//        if (qua >= 90 && qua <= 100) {
//            System.out.println(qua + "= A");
//        }else if (qua >= 80 && qua <= 91) {
//            System.out.println(qua + "= B");
//        }else if (qua >= 70 && qua <= 81) {
//            System.out.println(qua + "= C");
//        }else if (qua >= 60 && qua <= 71) {
//            System.out.println(qua + "= D");
//        }else if (qua >= 50 && qua <= 61) {
//            System.out.println(qua + "= E");
//        }else if (qua >= 40 && qua <= 51) {
//            System.out.println(qua + "= F");
//        }
        sc.close();
}
}