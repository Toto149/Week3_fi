package computers;

//Ich nutze Lombok welches durch eine Annotation die Getter, Setter, etc. automatisch generieren lassen kann.
//Dokumentation der verschiedenen Annotationen: https://projectlombok.org/features/
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;

@Getter
@Setter
public class Computer{

    private String manufacturerName;
    private int processorClockSpeedInMHz;
    private int ramSizeInGB;
    private int hardDriveSizeInGB;
    private int numberOfUSBPorts;
    private int screenSizeInInch;
    private ComputerType computerType;
    private GPU gpu;
    private boolean hasOSPreinstalled;
    private static HashMap<String,BigDecimal> pricePerComponentMap = new HashMap<>() {{
        put("ram", BigDecimal.valueOf(1.99));
        put("processor", BigDecimal.valueOf(0.1));
        put("screen", BigDecimal.valueOf(9.99));
    }};
    private BigDecimal buyingPrice;
    private BigDecimal sellingPrice;

    public Computer(){
        sellingPrice = BigDecimal.valueOf(0);
    }

    public Computer(String manufacturerName, int screenSizeInInch, boolean hasOSPreinstalled){
        this.manufacturerName = manufacturerName;
        this.screenSizeInInch = screenSizeInInch;
        this.hasOSPreinstalled = hasOSPreinstalled;
        sellingPrice = BigDecimal.valueOf(0);
    }
    //Constructor mit mehr als 7 Parametern anscheinend nicht so gut. SonarLint beschwert sich.
    public Computer(String manufacturerName,
                    int processorClockSpeedInMHz,
                    int ramSizeInGB,
                    int hardDriveSizeInGB,
                    int numberOfUSBPorts,
                    int screenSizeInInch,
                    ComputerType computerType,
                    GPU gpu,
                    boolean hasOSPreinstalled){
        this.manufacturerName = manufacturerName;
        this.processorClockSpeedInMHz = processorClockSpeedInMHz;
        this.ramSizeInGB = ramSizeInGB;
        this.hardDriveSizeInGB = hardDriveSizeInGB;
        this.numberOfUSBPorts = numberOfUSBPorts;
        this.screenSizeInInch = screenSizeInInch;
        this.computerType = computerType;
        if(computerType == ComputerType.DESKTOP_COMPUTER){
            this.gpu = gpu;
        } else {
            this.gpu = null;
        }
        this.hasOSPreinstalled = hasOSPreinstalled;
        buyingPrice = BigDecimal.valueOf(ramSizeInGB).multiply(  pricePerComponentMap.get("ram"))
                .add(BigDecimal.valueOf(processorClockSpeedInMHz).multiply(pricePerComponentMap.get("processor")))
                .add(BigDecimal.valueOf(screenSizeInInch).multiply(pricePerComponentMap.get("screen")))
                .add(gpu.getPriceInEuro());
        sellingPrice = buyingPrice.multiply(BigDecimal.valueOf(1.2)).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public String toString(){
        return  "Manufacturer Name:      " + (this.manufacturerName == null ? "Manufacturer Name not given" : this.manufacturerName) + "\n" +
                "Clock Speed in MHz:     " + (this.processorClockSpeedInMHz == 0 ? "Clock speed not given" : this.processorClockSpeedInMHz +"MHz") + "\n" +
                "Ram size in GB:         " + (this.ramSizeInGB == 0 ? "Ram size not given" : this.ramSizeInGB + "GB") + "\n" +
                "Hard drive Space in GB: " + (this.hardDriveSizeInGB == 0 ? "Hard drive space not given" : this.hardDriveSizeInGB +"GB" ) + "\n" +
                "Number of USB-Ports:    " + (this.numberOfUSBPorts == 0 ? "Number of USB-Ports not given" : this.numberOfUSBPorts) + "\n" +
                "Screen size in inches:  " + (this.screenSizeInInch == 0 ? "Screen size not given" : this.screenSizeInInch+ "\"") + "\n" +
                "Computer type:          " + (this.computerType==null ? "Computer type not given" : this.computerType.toString()) + "\n" +
                "Graphic Card:           " + (this.gpu == null ? "Graphic Card not given" : this.gpu.toString()) + "\n" +
                "Operating System:       " + (this.hasOSPreinstalled ? "Has OS preinstalled" : "Has not OS preinstalled") + "\n" +
                "Selling Price:          " + (this.sellingPrice.equals(BigDecimal.valueOf(0)) ? "Has no price specified" : this.sellingPrice +"€");
    }



}
