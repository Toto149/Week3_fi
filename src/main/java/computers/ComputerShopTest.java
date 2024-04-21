package computers;

import java.util.List;
public class ComputerShopTest {

    public static void main(String[] args){
        //Initialisierung der Computer Objekte
        Computer computer1 = new Computer(
                "Toshiba",
                5500,
                24,
                2000,
                8,
                27,
                ComputerType.DESKTOP_COMPUTER,
                GPU.RTX_4090,
                true
        );
        Computer computer2 = new Computer(
                "HP",
                4500,
                32,
                4000,
                8,
                32,
                ComputerType.DESKTOP_COMPUTER,
                GPU.RX_7900XTX,
                true
        );
        //Initialisierung des ComputerShop Objekts.
        ComputerShop computerShop = new ComputerShop(List.of(computer1,computer2));


        //Test der toString Methode des Computer Shops
        System.out.println(computerShop);
        //Test von calculate Profits:
        System.out.println(computerShop.calculateProfit());
    }
}
