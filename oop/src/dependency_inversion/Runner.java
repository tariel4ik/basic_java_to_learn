package dependency_inversion;

public class Runner {
    public static void main(String[] args) {
        Podel podel = new Podel();
        Shepherd shepherd = new Shepherd();
        Terrier terrier = new Terrier();
        Kennel kennel = new Kennel(podel, shepherd,terrier);
    }
}
