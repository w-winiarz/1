package com.company;
import java.io.File;


public class Animal

{
    final public String species;
    private Double weight;
    public String name;
    public File pic;

public Animal(String species,Double weight,String name)
{
    this.species = species;
    this.weight = weight;
    this.name = name;



}



    void feed()
    {
        if(weight<=0)
        {System.out.println("NIE ŻYJE!!!");}
        else{
        weight+=1;
        System.out.println("Thx for food");}
    }

    void takeForAWalk()
{

    weight-=1;
    if(weight=0) {System.out.println("Nie żyje");}
   if (weight>0)
        { weight-=1;
        System.out.println("Wyszedłeś na spacer");}
   if(weight<0)
   {System.out.println("NIE ŻYJE!!!!");}

}


}
