package projekte.autoErstellung;

import projekte.autoErstellung.fertigung_Controller.hersteller_Model.Audi;
import projekte.autoErstellung.fertigung_Controller.hersteller_Model.BMW;
import projekte.autoErstellung.fertigung_Controller.hersteller_Model.Ford;

public class EntryPoint {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // audi1 = eine Objekt Referenz
        System.out.println("********************** Audi **********************");
        Audi audi1 = new Audi();
        System.out.println(audi1.print());
        audi1.setFarbe(Audi.farben.get(1));
        audi1.setHasHeizbarInnenausstatung(true);
        audi1.setHasKupplung(true);
        System.out.println(audi1.print());

        System.out.println("********************** BMW **********************");
        BMW bmw1 = new BMW();
        System.out.println(bmw1.print());
        bmw1.setFarbe(BMW.farben.get(1));
        bmw1.setHasGetriebe(true);
        bmw1.setHasInnenausstatung(true);
        System.out.println(bmw1.print());

        System.out.println("********************** Ford **********************");
        Ford ford1 = new Ford();
        System.out.println(ford1.print());
        ford1.setFarbe(Ford.farben.get(1));
        ford1.setHasKupplung(true);
        ford1.setHasGetriebe(true);
        System.out.println(ford1.print());
    }

}
