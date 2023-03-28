import java.util.ArrayList;
public class latihan1 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> Hewan = new ArrayList<>();
        ArrayList<String> DeleteHewan = new ArrayList<>();

        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");

        System.out.println("Before");
        System.out.println(Hewan);

        DeleteHewan.add(Hewan.get(1));
        DeleteHewan.add(Hewan.get(2));
        DeleteHewan.add(Hewan.get(3));

        Hewan.remove("Kelinci");
        Hewan.remove("Kambing");
        Hewan.remove("Unta");
        System.out.println("Hewan Yang Dihapus\t: ");
        System.out.println(DeleteHewan);

        System.out.println("After");
        System.out.println(Hewan);
    }
}