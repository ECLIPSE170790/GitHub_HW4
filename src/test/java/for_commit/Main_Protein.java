package for_commit;

public class Main_Protein {
    char aChar;
    byte aByte;
    short aShort;
    int anInt;
    long aLong;
    float aFloat;
    double aDouble;
    boolean aBoolean;

    String aString = "bla-bla";

    public static void main(String[] args) {
        Protein prot1 = new Protein("chocolate", "ON", true, false);
        Protein prot2 = new Protein("strawberry", "CGN", false, true);

        prot1.settip("izolyat");
        prot2.setVes(1);
        prot1.open();
        prot2.open();

        prot1.printAminoCount();
        prot2.printAmino();

       System.out.println(prot1.tip+" "+prot1.ves);
       // System.out.println(prot2.tip+" "+prot2.ves);
    }
}
