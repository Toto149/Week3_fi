package computers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ComputerShop {
    private List<Computer> computers  = new ArrayList<Computer>();

    public ComputerShop(List<Computer> computers){
        this.computers = computers;
    }

    public Computer addComputer(Computer computer){
        computers.add(computer);
        return computer;
    }
    @Override
    public String toString(){
       StringBuilder result = new StringBuilder();
       int i=1;
       for(Computer computer : computers){
           result.append("Computer ").append(i).append(": \n");
           result.append(computer.toString());
           result.append("\n\n");
           i++;
       }
        return result.toString();
    }
    public BigDecimal calculateProfit(){
        return this.computers.stream()
                .map(computer -> computer.getSellingPrice().subtract(computer.getBuyingPrice()))
                .reduce(((bigDecimal, bigDecimal2) -> bigDecimal.add(bigDecimal2))).orElse(BigDecimal.ZERO);
    }
}
