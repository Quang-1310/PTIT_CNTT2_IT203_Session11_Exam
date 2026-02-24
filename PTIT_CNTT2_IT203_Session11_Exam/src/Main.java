//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Drink[] drinks = new Drink[3];
        drinks[0] = new Coffee("C001", "Bạc sỉu", 30000, true);
        drinks[1] = new FruitJuice("C002", "Nước cam", 40000, 10);
        drinks[2] = null;
        for(int i = 0; i < 3; i++){
            if(drinks[i] == null){
                continue;
            }
            drinks[i].setPrice((int) drinks[i].calculatePrice());
            drinks[i].displayInfor();
            if(drinks[i] instanceof FruitJuice){
                ((FruitJuice) drinks[i]).mix();
            }
        }
    }
}