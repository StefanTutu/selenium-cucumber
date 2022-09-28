package ro.deloitte;

class FourthExercise_StudentExercise{
    int id;
    String name;
    String address;

    FourthExercise_StudentExercise(int id, String name, String address){
        this.id=id;  this.name=name;  this.address=address;  }

    public static void main(String args[]){
        FourthExercise_StudentExercise s1 = new FourthExercise_StudentExercise(1, "Ionut", "Bucharest");
        FourthExercise_StudentExercise s2 = new FourthExercise_StudentExercise(2, "John", "Romania");
        System.out.println(s1.name +s1.address);
        System.out.println(s2.name +s2.address);
    }
}

