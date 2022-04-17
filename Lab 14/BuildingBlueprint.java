class BuildingBlueprint {
    private int numOfStories;
    private int numOfApartments;
    private float occupyRate;
    private boolean isItOccupy;
    //Constructor
    BuildingBlueprint(){
        numOfStories=10;
        numOfApartments=20;
        occupyRate=1.0f;
        isItOccupy=true;
    }
    public BuildingBlueprint(int numOfStories,int numOfApartments,float occupyRate){
        this.numOfStories=numOfStories;
        this.numOfApartments=numOfApartments;
        this.occupyRate=occupyRate;
        this.isItOccupy=false;
        if(this.occupyRate==1.0f){
            isItOccupy=true;
        }
    }
    //Methods
    public void setOccupyRate(float occupyRate) {
        this.occupyRate = occupyRate;
    }
    public float getOccupyRate() {
        return occupyRate;
    }
    public int getNumOfApartments() {
        return numOfApartments;
    }
    public int getNumOfStories() {
        return numOfStories;
    }
    public boolean getIsItOccupy() {
        if(this.occupyRate==1.0f){
            isItOccupy=true;
        }
        else{
            isItOccupy=false;
        }
        return isItOccupy;
    }
}
