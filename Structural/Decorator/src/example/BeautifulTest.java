package example;

public class BeautifulTest {
    public static void main(String[] args) {
        BaseToy teddy = new TeddyBear();
        score(teddy);

        BaseToy barb = new Barbie();
        barb = new Dress(barb);
        barb = new Marbles(barb);
        score(barb);

        BaseToy spider = new SpiderManToy();
        spider = new Dress(spider);
        spider = new Marbles(spider);
        spider = new Pony(spider);
        score(spider);

        // output:
        // example.TeddyBear, it's score: 70
        // example.Barbie, wearing a dress, all shiny, it's score: 190
        // SpiderMan, wearing a dress, all shiny, on a pony, it's score: 1150
    }

    public static void score(BaseToy toy) {
        System.out.println(toy.getName() + ", it's score: " + toy.getBeauty());
    }
}