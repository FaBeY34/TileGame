public class Tile {
    private int tilePosition;
    private boolean freeStatus;

    public Tile(int tilePosition, boolean freeStatus) {
        this.tilePosition = tilePosition;
        this.freeStatus = freeStatus;
    }

    public int getTilePosition() {
        return this.tilePosition;
    }

    public void setTilePosition(int tilePosition) {
        this.tilePosition = tilePosition;
    }

    public boolean getFreeStatus() {
        return this.freeStatus;
    }

    public void setFreeStatus(boolean freeStatus) {
        this.freeStatus = freeStatus;
    }
}
