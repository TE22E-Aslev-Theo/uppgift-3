public class app {

    public static void main(String[] args) {
        System.out.println("Uppg A");
        int tal1 = 23;
        int tal2 = 45;
        int summa;
        int produkt;
        double kvot;
        summa = tal1 + tal2;
        System.out.println(tal1+" + "+tal2+" = "+summa);
        System.out.println(tal1+" - "+tal2+" = "+(tal1-tal2));
        int tal3 = 234232;
        int tal4 = 3424;
        produkt = tal4 * tal3;
        System.out.println(tal3+" x "+tal4+" = "+produkt);
        System.out.println(tal3+" x "+tal4+ "  x " + tal2 + " = " + (tal3 * tal2 * tal4));
        int tal5=10;
        int tal6=3;
        kvot = tal3/tal6;
        double kvot2 = Double.valueOf(tal1 / tal2);
        System.out.println(tal1+" / "+tal2+" = "+kvot2);
        System.out.println(tal3+" / "+tal6+" = "+kvot);
        System.out.println("Resten av "+ tal5+" / "+tal6+" = "+(tal5%tal6));
    }

    
}