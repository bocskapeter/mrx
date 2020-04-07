import java.util.ArrayList;
import java.util.List;

public class Map {
    int width;
    int height;
    List<Player> players;
    List<Bomb> bombs;

    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        players = new ArrayList<>();
        bombs = new ArrayList<>();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void addBomb(Bomb bomb) {
        this.bombs.add(bomb);
    }

    public void movePlayer(Player player,int direction){
        switch (direction){
            case 1:
                player.setX(player.getX()-1);
                break;
            case 2:
                player.setY(player.getY()-1);
                break;
            case 3:
                player.setX(player.getX()+1);
                break;
            case 4:
                player.setY(player.getY()+1);
        }
        if (player.getX()>=width) player.setX(width-1);
        if (player.getX()<0)player.setX(0);
        if (player.getY()>=height)player.setY(height-1);
        if (player.getY()<0)player.setY(0);
    }

    @Override
    public String toString() {
        String[][] picture = new String[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                picture[i][j] = " _____ ";
            }
        }
        for (Player p : players) {
            picture[p.getX()][p.getY()] = " " + p.getName() + " ";
        }
        for (Bomb b : bombs) {
            picture[b.getX()][b.getY()] = " .oOo. ";
        }
        String layout = "";
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                layout = layout + picture[j][i];
            }
            layout = layout + "\n";
        }
        return "Map: " +
                "width=" + width +
                ", height=" + height + "\n" +
                " players=" + players + "\n" +
                " bombs=" + bombs + "\n" +
                layout;
    }
}
