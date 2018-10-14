package game;

/**
 * Created by dsm2061 on 8/7/18.
 */
public class Cell {

    private CellState state;

    public Cell(CellState state) {
        this.state = state;
    }

    public CellState getNextState(int neighbor) {

        return (neighbor > 1 && neighbor < 4) ? CellState.ALIVE : CellState.DEAD;
    }

    public enum CellState {
        ALIVE, DEAD
    }


}
