package innterface_marker;

public class Runner {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Airplane airplane = new Airplane();

        if(bird instanceof Alive){
            System.out.println("Птица живая!");
        }
        if(airplane instanceof  Alive){
            System.out.println("Самолет живой!");
        }else{
            System.out.println("Этот объект не живой");
        }
    }
}
