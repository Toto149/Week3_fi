package computers;

import lombok.Getter;
import lombok.Setter;


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


    public Computer(){

    }

    public Computer(String manufacturerName, int screenSizeInInch, boolean hasOSPreinstalled){
        this.manufacturerName = manufacturerName;
        this.screenSizeInInch = screenSizeInInch;
        this.hasOSPreinstalled = hasOSPreinstalled;
    }

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
                "Operating System:       " + (this.hasOSPreinstalled ? "Has OS preinstalled" : "Has not OS preinstalled");
    }



}
