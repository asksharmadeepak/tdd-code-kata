package game;

import game.Cell.CellState;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by dsm2061 on 8/7/18.
 */

public class CellTest {

    @Test
    public void shouldDieWithOnlyOneNeighbor(){
        Cell cell = new Cell(CellState.ALIVE);

        CellState actualState = cell.getNextState(1);

        Assert.assertEquals(CellState.DEAD, actualState);
    }

    @Test
    public void shouldDieWithOnlyZeroNeighbor(){
        Cell cell = new Cell(CellState.ALIVE);

        CellState actualState = cell.getNextState(0);

        Assert.assertEquals(CellState.DEAD, actualState);
    }

    @Test
    public void shouldLiveWithTwoNeighbor(){
        Cell cell = new Cell(CellState.ALIVE);

        CellState actualState = cell.getNextState(2);

        Assert.assertEquals(CellState.ALIVE, actualState);
    }

    @Test
    public void shouldLiveWithThreeNeighbor(){
        Cell cell = new Cell(CellState.ALIVE);

        CellState actualState = cell.getNextState(3);

        Assert.assertEquals(CellState.ALIVE, actualState);
    }

    @Test
    public void shouldDieWithFourNeighbor(){
        Cell cell = new Cell(CellState.ALIVE);

        CellState actualState = cell.getNextState(4);

        Assert.assertEquals(CellState.DEAD, actualState);
    }

    @Test
    public void shouldDieWithFiveNeighbor(){
        Cell cell = new Cell(CellState.ALIVE);

        CellState actualState = cell.getNextState(5);

        Assert.assertEquals(CellState.DEAD, actualState);
    }
    @Test
    public void shouldDieWithSixNeighbor(){
        Cell cell = new Cell(CellState.ALIVE);

        CellState actualState = cell.getNextState(6);

        Assert.assertEquals(CellState.DEAD, actualState);
    }
    @Test
    public void shouldDieWithSevenNeighbor(){
        Cell cell = new Cell(CellState.ALIVE);

        CellState actualState = cell.getNextState(7);

        Assert.assertEquals(CellState.DEAD, actualState);
    }
    @Test
    public void shouldDieWithEightNeighbor(){
        Cell cell = new Cell(CellState.ALIVE);

        CellState actualState = cell.getNextState(8);

        Assert.assertEquals(CellState.DEAD, actualState);
    }

    @Test
    public void shouldBecomeAliveWithThreeNeighbor(){
        Cell cell = new Cell(CellState.DEAD);

        CellState actualState = cell.getNextState(3);

        Assert.assertEquals(CellState.ALIVE, actualState);
    }

}


