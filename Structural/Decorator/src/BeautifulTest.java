public class BeautifulTest {
    public static void main(String[] args) {
        Toy teddy = new TeddyBear();
        score(teddy);

        Toy barb = new Barbie();
        barb = new Dress(barb);
        barb = new Marbles(barb);
        score(barb);

        Toy spider = new SpiderManToy();
        spider = new Dress(spider);
        spider = new Marbles(spider);
        spider = new Pony(spider);
        score(spider);

        // output:
        // TeddyBear, it's score: 70
        // Barbie, wearing a dress, all shiny, it's score: 190
        // SpiderMan, wearing a dress, all shiny, on a pony, it's score: 1150
    }

    public static void score(Toy toy) {
        System.out.println(toy.getName() + ", it's score: " + toy.getBeauty());
    }
}