import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Auto [] auto = new Auto[3];
        String name, lider = "";
        int speed, dist = 0, newDist;
        for (int i = 0; i<auto.length; i++){
            System.out.println("Введите название машины № "+(i+1));
            name = scanner.next();
            while (true) {
                System.out.println("Введите скорость машины № " + (i + 1));
                if (scanner.hasNextInt()) {
                    speed = scanner.nextInt();
                    if (speed >= 0 && speed <= 250) {
                        break;
                    }
                    System.out.println("Скорость машины должна быть от 0 до 250");
                }
                else {
                    System.out.println("Скорость машины должна быть целым числом от 0 до 250");
                    scanner.next();
                }
            }
            auto[i] = new Auto (name, speed);
            newDist = Race.distantion(speed);
            if (dist <= newDist){
                lider = auto[i].name;
                dist = newDist;
            }
        }
        System.out.println("Самая быстрая машина: " + lider);
        scanner.close();
        //for (Auto value : auto) {
        //    System.out.println("Машина " + value.name + " Speed " + value.speed);
        //}

    }
}