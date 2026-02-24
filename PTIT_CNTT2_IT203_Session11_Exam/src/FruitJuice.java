public class FruitJuice extends Drink implements IMixable{
    private int discountPercent;

    public FruitJuice(String id, String name, int price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public double calculatePrice() {
        return (this.getPrice() - (this.getPrice() * this.discountPercent / 100));
    }

    @Override
    public void mix(){
        System.out.println("Đang ép trái cây tươi...");
    }
}
