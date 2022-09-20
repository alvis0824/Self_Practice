package day30_Tasks;

public class CryptoToken {

    private double price, quantity, marketCap, volume, circulatingSupply;
    private boolean isMineable;

    public CryptoToken(double price, double quantity, double marketCap, double volume, double circulatingSupply, boolean isMineable) {
        setPrice(price);
        setQuantity(quantity);
        setMarketCap(marketCap);
        setVolume(volume);
        setCirculatingSupply(circulatingSupply);
        setMineable(isMineable);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            System.err.println("Invalid price: " + price);
            System.exit(1);
        }
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        if(quantity < 0){
            System.err.println("Quantity cannot be negative");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(double marketCap) {
        if(marketCap == 0){
            System.err.println("MarketCap cannot be zero");
            System.exit(1);
        }
        this.marketCap = marketCap;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getCirculatingSupply() {
        return circulatingSupply;
    }

    public void setCirculatingSupply(double circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public boolean isMineable() {
        return isMineable;
    }

    public void setMineable(boolean mineable) {
        isMineable = mineable;
    }

    public double totalPrice(){
        return price * quantity;
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" + isMineable +
                '}';
    }
}
