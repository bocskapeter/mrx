public class MrX {

    public static void main(String[] args) {
        Map mapOne = new Map(8, 10);
        Player flink = new Player("Flink", 0, 0);
        Player blink = new Player("Blink", 7, 7);
        Bomb bombOne = new Bomb(5, 6);
        System.out.println(mapOne.toString());
        mapOne.addBomb(bombOne);
        System.out.println(mapOne.toString());
        mapOne.addPlayer(flink);
        mapOne.addPlayer(blink);
        System.out.println(mapOne.toString());
        mapOne.movePlayer(flink,4);
        System.out.println(mapOne.toString());
        mapOne.movePlayer(blink,4);
        System.out.println(mapOne.toString());
        mapOne.movePlayer(blink,4);
        System.out.println(mapOne.toString());
        mapOne.movePlayer(blink,4);
        System.out.println(mapOne.toString());
    }

}
