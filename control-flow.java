import java.util.Scanner;
class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //condition
        if(num > 0){
            System.out.println("Positive");
        }else if(num < 0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }

        //switch case for week days
        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error! Invalid input");
                break;
        }

        //For Loop
        for(int i=1; i<=num; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        //While Loop
        while(num > 0){
            System.out.print(num + " ");
            num--;
        }
        System.out.println();

        //Do While Loop
        do{
            System.out.print(num + " ");
            num++;
        }while(num < 5);
    }
}
