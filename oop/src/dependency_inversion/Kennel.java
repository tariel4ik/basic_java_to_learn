package dependency_inversion;

public class Kennel {
    private Dog podel;
    private Dog shepherd;
    private Dog terrier;

    public Kennel(Dog podel, Dog shepherd, Dog terrier) {
        System.out.println("Конструктор для пуделя, овчарки и терьера");
        this.podel = podel;
        this.shepherd = shepherd;
        this.terrier = terrier;
    }
}
