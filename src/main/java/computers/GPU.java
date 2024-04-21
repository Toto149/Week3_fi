package computers;

import lombok.Getter;

@Getter
public enum GPU {


    RTX_4090("RTX 4090 24GB", GPUManufacturer.NVIDIA, 1999),
    RTX_4080_SUPER("RTX 4080 Super 16GB", GPUManufacturer.NVIDIA, 1200),
    RTX_4070_TI_SUPER("RTX 4070 Ti Super 16GB", GPUManufacturer.NVIDIA, 900),
    RTX_4070_TI("RTX 4070 Ti 12GB", GPUManufacturer.NVIDIA, 800),
    RTX_4070_SUPER("RTX 4070 Super 12GB", GPUManufacturer.NVIDIA, 650),
    RTX_4070("RTX 4070 12GB", GPUManufacturer.NVIDIA, 550),
    RTX_4060_TI_16GB("RTX 4060 Ti 16GB", GPUManufacturer.NVIDIA, 450),
    RTX_4060_TI_8GB("RTX 4060 Ti 8GB", GPUManufacturer.NVIDIA, 350),
    RTX_4060("RTX 4060 8GB", GPUManufacturer.NVIDIA, 300),

    RX_7900XTX("RX 7900 XTX 24GB",GPUManufacturer.AMD, 1000),
    RX_7900XT("RX 7900 XT 20GB",GPUManufacturer.AMD, 800),
    RX_7800GRE("RX 7800 GRE 16GB",GPUManufacturer.AMD, 600),
    RTX_7800XT("RX 7800XT 16GB", GPUManufacturer.AMD, 500),
    RX_7700XT("RX 7700 XT 12GB",GPUManufacturer.AMD, 450),
    RX_7600XT("RX 7600 XT 16GB",GPUManufacturer.AMD, 360),
    RX_7600("RX 7600 8GB",GPUManufacturer.AMD, 300);

    private final String modelName;
    private final String manufacturerName;
    @Getter
    private final int priceInEuro;
    GPU(String modelName, String manufacturerName, int priceInEuro){
        this.manufacturerName = manufacturerName;
        this.modelName = modelName;
        this.priceInEuro = priceInEuro;
    }
    @Override
    public String toString(){
        return this.manufacturerName + "  " + this.modelName;
    }

    private static class GPUManufacturer {
        protected static final String NVIDIA = "Nvidia";
        protected static final String AMD = "AMD";


    }

}
