import java.math.BigDecimal

def   tradingChargdes(BigDecimal price) {
    def charges = new BigDecimal(0);
    def brokerage = Math.min(price * 0.0003, 20);
    println "Starting Jetty on port 9090, press Ctrl+C to stop."
    println "Borkerage = ", brokerage * 2
    def stt = price * 0.00025;
    println("STT = ", stt);
    def exchTransactionCharges = price * 0.0000325;
    println("Trasnaction Charges =", exchTransactionCharges * 2);
    def gst = (brokerage + exchTransactionCharges) * 2 * 0.18;
    println("GST = ", gst);
    def stampCharges = Math.min(price * 0.00005, 50)
    println("Stamp Charges = ", stampCharges);

    charges = brokerage * 2 + stt + exchTransactionCharges * 2 + gst + stampCharges;
    return charges;
}

tradingChargdes(25400)