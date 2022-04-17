public class Lab14A {
    public static void main(String [] args){
        //Referencing the object
        BuildingBlueprint buildingOne= new BuildingBlueprint();
        BuildingBlueprint buildingTwo= new BuildingBlueprint(30,30,0.75f);
        //Creating the object
        int a=buildingOne.getNumOfApartments();
        int s=buildingOne.getNumOfStories();
        float o=buildingOne.getOccupyRate();
        boolean isIt=buildingOne.getIsItOccupy();
        float conversion= (o*100);
        //Object Two
        int a2=buildingTwo.getNumOfApartments();
        int s2=buildingTwo.getNumOfStories();
        float o2=buildingTwo.getOccupyRate();
        boolean isIt2=buildingTwo.getIsItOccupy();
        float conversion2=  (o2*100);
        System.out.println("Year 2020:");
        System.out.println("Building 1 has "+s+" floors, "+a+" apartments, and is "+(conversion)+"% occupied. Full? "+isIt);
        System.out.println("Building 2 has "+s2+" floors, "+a2+" apartments, and is "+(conversion2)+"% occupied. Full? "+isIt2);
        System.out.println("Many years pass.");
        System.out.println("Year 2043:");
        buildingOne.setOccupyRate(0.0f);
        o= buildingOne.getOccupyRate();
        conversion=  (o*100);
        buildingTwo.setOccupyRate(1.0f);
        o2=buildingTwo.getOccupyRate();
        conversion2=  (o2*100);
        isIt2=buildingTwo.getIsItOccupy();
        System.out.println("Building 1 has "+s+" floors, "+a+" apartments, and is "+(conversion)+"% occupied. Full? "+buildingOne.getIsItOccupy());
        System.out.println("Building 2 has "+s2+" floors, "+a2+" apartments, and is "+(conversion2)+"% occupied. Full? "+buildingTwo.getIsItOccupy());
        System.out.print("\nLooks like people prefer taller buildings.");

    }
}
