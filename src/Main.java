public class Main {
    public static void main(String[] args) {
      BonusMilesService service = new BonusMilesService();
      int myBonus = service.milies(10000);
        System.out.printf("Количество миль =" + myBonus);
    }
}