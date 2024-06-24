package sharkHaunt;

public class Shark {
    private String kind;
    private int length;
    private String food;
    private String habitation;

    public Shark(String kind, int length, String food, String habitation){
        this.kind = kind;
        this.length = length;
        this.food = food;
        this.habitation = habitation;

    }
     public void setKind(){
        this.kind = kind;
     }
     public String getKind(){
        return this.kind;
     }
     public void setFood(){
        this.food = food;
     }
     public String getFood(){
        return this.food;
     }
     public void setLength(){
        this.length = length;
     }
     public int getLength(){
        return this.length;
     }
     public void setHabitation(){
        this.habitation = habitation;
     }
     public String getHabitation(){
        return this.habitation;
     }
     //The {kind} is {length} centimeters long, eats {food} and inhabits {habitation}.
     public String toString(){
        return String.format("The %s is %d centimeters long, eats %s and inhabits %s.",
                this.kind, this.length, this.food, this.habitation);

     }


}
