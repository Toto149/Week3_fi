package computers;

//Ich nutze Lombok welches durch eine Annotation die Getter, Setter, etc. automatisch setzen kann.
//Dokumentation der verschiedenen Annotationen: https://projectlombok.org/features/
import lombok.Getter;
//BigDecimal für den Preis der GPUs.
import java.math.BigDecimal;

@Getter
public enum GPU {

    //Variablen: Modellname als String, GPU Hersteller als Konstante durch einer Inneren statischen Klasse
    // und der Price als BigDecimal für höhere Genauigkeit (kein 3.00000000001 beim Addieren von zwei Ganzzahlen).

    //Aktuelle Nvidia Grafikkarten:
    RTX_4090("RTX 4090 24GB", GPUManufacturer.NVIDIA, BigDecimal.valueOf(1999.00)),
    RTX_4080_SUPER("RTX 4080 Super 16GB", GPUManufacturer.NVIDIA, BigDecimal.valueOf(1200)),
    RTX_4070_TI_SUPER("RTX 4070 Ti Super 16GB", GPUManufacturer.NVIDIA, BigDecimal.valueOf(900)),
    RTX_4070_TI("RTX 4070 Ti 12GB", GPUManufacturer.NVIDIA, BigDecimal.valueOf(800)),
    RTX_4070_SUPER("RTX 4070 Super 12GB", GPUManufacturer.NVIDIA, BigDecimal.valueOf(650)),
    RTX_4070("RTX 4070 12GB", GPUManufacturer.NVIDIA, BigDecimal.valueOf(550)),
    RTX_4060_TI_16GB("RTX 4060 Ti 16GB", GPUManufacturer.NVIDIA, BigDecimal.valueOf(450)),
    RTX_4060_TI_8GB("RTX 4060 Ti 8GB", GPUManufacturer.NVIDIA, BigDecimal.valueOf(350)),
    RTX_4060("RTX 4060 8GB", GPUManufacturer.NVIDIA, BigDecimal.valueOf(300)),

    //Aktuelle AMD Grafikkarten:
    RX_7900XTX("RX 7900 XTX 24GB",GPUManufacturer.AMD, BigDecimal.valueOf(1000)),
    RX_7900XT("RX 7900 XT 20GB",GPUManufacturer.AMD, BigDecimal.valueOf(800)),
    RX_7800GRE("RX 7800 GRE 16GB",GPUManufacturer.AMD, BigDecimal.valueOf(600)),
    RTX_7800XT("RX 7800XT 16GB", GPUManufacturer.AMD, BigDecimal.valueOf(500)),
    RX_7700XT("RX 7700 XT 12GB",GPUManufacturer.AMD, BigDecimal.valueOf(450)),
    RX_7600XT("RX 7600 XT 16GB",GPUManufacturer.AMD, BigDecimal.valueOf(360)),
    RX_7600("RX 7600 8GB",GPUManufacturer.AMD, BigDecimal.valueOf(300));

    private final String modelName;
    private final String manufacturerName;
    @Getter
    private final BigDecimal priceInEuro;
    GPU(String modelName, String manufacturerName, BigDecimal priceInEuro){
        this.manufacturerName = manufacturerName;
        this.modelName = modelName;
        this.priceInEuro = priceInEuro;
    }
    @Override
    public String toString(){
        return this.manufacturerName + "  " + this.modelName;
    }

    //Statische Klasse damit die Konstanten in diesem Enum injiziert werden können, dadurch leichter wartbar.
    //Quelle: https://stackoverflow.com/questions/23608885/how-to-define-static-constants-in-a-java-enum
    private static class GPUManufacturer {
        protected static final String NVIDIA = "Nvidia";
        protected static final String AMD = "AMD";


    }

}
