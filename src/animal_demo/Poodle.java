package animal_demo;

public class Poodle extends Dog{
    private int curlyRanking;

    public Poodle(String name, int age, String hairType, int curlyRanking){
        super(name,age,hairType,"Poodle");
        this.curlyRanking = curlyRanking;
    }

    public Poodle(String name, int age, String hairType, String breed,int curlyRanking){
        super(name,age,hairType,breed);
        this.curlyRanking = curlyRanking;
    }

    public void prance(){
        System.out.printf("%s pranced around in a dignified manner",this.getName());
    }
}
