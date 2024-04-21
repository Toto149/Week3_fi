package computers;

public enum ComputerType {

    DESKTOP_COMPUTER("Desktop Computer"),
    LAPTOP("Laptop");

    private final String computerTypeName;

    ComputerType(String computerTypeName){
        this.computerTypeName = computerTypeName;

    }
    @Override
    public String toString(){
        return this.computerTypeName;
    }
}
