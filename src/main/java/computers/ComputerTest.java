package computers;

public class ComputerTest {

    public static void main(String[] args){
        Computer computer = new Computer("Toshiba", 25, true);
        Computer computerEmpty = new Computer();
        Computer computerComprehensive = new Computer("Toshiba",5500,
                32,2000,8,
                27,ComputerType.DESKTOP_COMPUTER,GPU.RTX_4070_TI,true);
        System.out.println("Computer Minimum");
        System.out.println(computer);
        System.out.println();
        System.out.println("Computer Empty");
        System.out.println(computerEmpty);
        System.out.println();
        System.out.println("Computer Comprehensive");
        System.out.println(computerComprehensive);
        computerComprehensive.setRamSizeInGB(computerComprehensive.getRamSizeInGB()*2);
        System.out.println();
        System.out.println("Computer Comprehensive New");
        System.out.println(computerComprehensive);

    }
}
