public class Coffee extends Drink {
    private boolean hasMilk;

    public Coffee(String id, String name, int price, boolean hasMilk) {
        super(id, name, price);
        this.hasMilk = hasMilk;
    }

    public boolean isHasMilk() {
        return hasMilk;
    }

    public void setHasMilk(boolean hasMilk) {
        this.hasMilk = hasMilk;
    }

    @Override
    public double calculatePrice() {
        if (hasMilk) {
            return this.getPrice() + 5000;
        } else {
            return this.getPrice();
        }
    }

    @Override
    void displayInfor(){
        System.out.printf("ID: %s - Name: %s - Price: %d - ", this.getId(), this.getName(), this.getPrice());
        if(hasMilk){
            System.out.println("Có sữa");
        }
        else {
            System.out.println("Đen đá");
        }
    }

}
