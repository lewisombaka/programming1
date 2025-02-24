package exercise;

public class pokemon {
    String name;
    int level;

    pokemon (){
        level = 1;
    }

    pokemon(String pName, int pLevel){
        name = pName;
        level = pLevel;
    }

    void attack(){
        System.out.println(name+ " attack!");
    }
}
