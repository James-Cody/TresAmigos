/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAmigosView;

/**
 *
 * @author nfi91
 */
public class PointView 
{
    /*
    private boolean done;
    private String coordinates;
    
    public void displayPointView()
    {
        boolean done = false;
        do 
        {
        System.out.println(this.coordinates);
            String pointOption = this.getPointCoordinates();
            if(pointOption.toUpperCase().equals("Q"))
                return;
            this.doAction(pointOption);
            done = false;
        } while (!done);
    }

    private String getPointCoordinates() 
    {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) 
        {
            value = keyboard.nextLine();
            value = value.trim();
            break;
        }
        
        return value;
    }

    private boolean doAction(String choicePoint) 
    {
        choicePoint = choicePoint.toUpperCase();
        switch (choicePoint)
        {
            case "X":
                this.theXCoordinate();
                break;
            case "Y":
                this.theYCoordinate();
                break;
            case "P":
                this.displayPointCoordinate();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void theXCoordinate() 
    {
        this.coordinates = "\n"
                + "\n ---------------------------"
                + "\n | X-Coordinate             |"
                + "\n ---------------------------"
                + "\n Horizontal - The Longitude "
                + "\nQ - Quit"
                + "------------------------------";
        done = true;
    }

    private void theYCoordinate() 
    {
        this.coordinates = "\n"
                + "\n ---------------------------"
                + "\n | Y-Coordinate             |"
                + "\n ---------------------------"
                + "\n Vertical - The Latitude "
                + "\nQ - Quit"
                + "-------------------------------";
        done = true;
    }

    private void displayPointCoordinate() 
    {
        Point displayPoint = new Point();
        displayPoint.toString();
    }*/
}
