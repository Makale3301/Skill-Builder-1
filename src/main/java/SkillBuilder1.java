import java.util.Scanner;

/**
 * Skill Builder 0
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userString = input.nextLine();
        float spice;
        spice= input.nextFloat();

        System.out.println("You're Jane's friend! ");
        System.out.println("\"What's your name?\"");

        System.out.println("Enter a floating-point number:");

        double mJohn = Math.pow(2.0,(Math.sqrt(5.0)/Math.pow(spice,3)))*(4.0/3.0);

        System.out.println("Well " + userString + ", the spice value resulted in " + mJohn);
        mJohn = (int)(mJohn*100)/100.0;
        System.out.println("And the converted value is "+ (mJohn));





    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();

        double wallArea = wallWidth * wallHeight;

        System.out.println("Wall area:" + " " + wallArea + " square feet" );

        double mkPaint = wallArea / squareFeetPerGallons;
        System.out.printf("Paint needed: %.2f gallons\n",mkPaint);

        int wholeNum = (int) Math.ceil((mkPaint / gallonsPerCan));
        System.out.println("Cans needed: " + ( wholeNum) + " can(s)");















        // TODO: Calculate and output the wall's area

        // TODO: Calculate and output the amount of paint in gallons needed to paint the wall

        // TODO: Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
    }
}
