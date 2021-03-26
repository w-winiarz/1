package com.company;
import java.io.File;


public class Animal {
    final public String species;
    private Double weight;
    public String name;
    public File pic;

    static final public double DEFAULT_ANIMAL_WEIGHT = 1.0;
    static final public double DEFAULT_DOG_WEIGHT = 1.0;
    static final public double DEFAULT_CAT_WEIGHT = 1.0;
    static final public double DEFAULT_COW_WEIGHT = 1.0;

public Animal(String species)
{
    this.species=species;
            switch(this.species)
            {
            case"dog":

                this.weight=DEFAULT_DOG_WEIGHT;
                break;

                case"cat":
                    this.weight=DEFAULT_CAT_WEIGHT;
                    break;
                case"cow":
                    this.weight=DEFAULT_COW_WEIGHT;
                    break;
                default:
                    this.weight=DEFAULT_ANIMAL_WEIGHT;
                    break;



            }
}
    void feed() {
        if (this.weight <= 0)
        {
            System.out.println("Sorry!");
        }
        else
        {
            this.weight += 1;
            System.out.println("Thx for food");
        }
    }

    void takeForAWalk()
        {
            if (this.weight <= 0)
            {
                System.out.println("Sorry!");
            }
            else
            {
                this.weight -= 1;
                System.out.println("Nice walk!");
            }


        }
}
