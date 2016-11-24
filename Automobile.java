/**
 * Created by Cule on 11/23/2016.
 */
public class Automobile {
    int year = 0;
    String make = "";
    String model = "";
    String color = "";
    String name = "";
    int numOfGears = 0;
    int currentGear = 0;
    int operatingCycle = 0;
    int currentSpeed = 0;
    int distanceTraveled;

    public Automobile(int year, String make, String model, String color, String name, int numOfGears, int operatingCyle)
    {
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
        this.name = name;
        this.numOfGears = numOfGears;
        this.operatingCycle = operatingCycle;
    }

    public void setCurrentGear()
    {
        if (this.operatingCycle <= numOfGears)
        {
            this.currentGear = this.operatingCycle;
        }
    }

    public int getCurrentSpeed()
    {
        return this.currentSpeed;
    }

    public int getCurrentGear()
    {
        return this.currentGear;
    }

    public int getDistanceTraveled()
    {
        return this.distanceTraveled;
    }

    public void setDistanceTraveled()
    {
        this.distanceTraveled += this.currentSpeed;
    }

    public void setCurrentSpeed()
    {
        this.currentSpeed = this.currentGear * 10;
    }

    public void setOperatingCycle(int cycle)
    {
        this.operatingCycle = operatingCycle;
    }

}
