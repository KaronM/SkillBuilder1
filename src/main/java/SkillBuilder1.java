import java.util.Scanner;

/**
 * Skill Builder 1
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("You're Jane's friend!");
        System.out.println("\"What's your name?\"");
        String name = input.nextLine();

        System.out.println("Enter a floating-point number:");
        double spice = input.nextDouble();

        double cbSpice = Math.pow(3, spice);
        double sqrt5 = Math.sqrt(5);
        double spice2 = Math.pow(2, sqrt5/cbSpice);
        double finalS = (4.0/3.0) * spice2;

        System.out.println("Well " + name + ", the spice value resulted in " + finalS);

        System.out.printf("And the converted value is %.2f", finalS);
    }
    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);
        double wallHeight;
        double wallWidth;
        double wallArea;
        double gallonsPaintNeeded;
        int cansNeeded;

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        wallWidth = input.nextDouble();

        wallArea = (int)(wallWidth * wallHeight);
        System.out.println("Wall area: " + (int)wallArea + " square feet");

        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.printf("Paint needed: %.2f gallons", gallonsPaintNeeded);

        cansNeeded = (int)(java.lang.Math.ceil(gallonsPerCan * gallonsPaintNeeded));
        System.out.println("\nCans needed: " + cansNeeded + " can(s)");
    }
}
