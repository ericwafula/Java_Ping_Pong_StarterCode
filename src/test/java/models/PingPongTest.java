package models;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class PingPongTest {
    @Test
    public void runPingPong_countUpToOne_ArrayList() {
        PingPong newPingPong = new PingPong();
        ArrayList<Object> expectedOutput = new ArrayList<Object>();
        expectedOutput.add(1);
        assertEquals(expectedOutput, newPingPong.runPingPong(1));
    }

    @Test
    public void runPingPong_countUpToGivenValue_ArrayList() throws Exception {
        PingPong newPingPong = new PingPong();
        ArrayList<Object> expectedOutput = new ArrayList<Object>();
        expectedOutput.add(1);
        expectedOutput.add(2);
        assertEquals(expectedOutput, newPingPong.runPingPong(2));
    }

    @Test
    public void runPingPong_replaceMultiplesOf3_ArrayList() throws Exception {
        PingPong newPingPong = new PingPong();
        ArrayList<Object> expectedOutput = new ArrayList<Object>();
        expectedOutput.add(1);
        expectedOutput.add(2);
        expectedOutput.add("ping");
        assertEquals(expectedOutput, newPingPong.runPingPong(3));
    }

    @Test
    public void runPingPong_replaceMultiplesOf5_ArrayList() throws Exception {
        PingPong newPingPong = new PingPong();
        ArrayList<Object> expectedOutput = new ArrayList<Object>();
        expectedOutput.add(1);
        expectedOutput.add(2);
        expectedOutput.add("ping");
        expectedOutput.add(4);
        expectedOutput.add("pong");
        assertEquals(expectedOutput, newPingPong.runPingPong(5));
    }

    @Test
    public void runPingPong_replaceMultiplesOf3And5_ArrayList() throws Exception {
        PingPong newPingPong = new PingPong();
        ArrayList<Object> expectedOutput = new ArrayList<Object>();
        expectedOutput.add(1);
        expectedOutput.add(2);
        expectedOutput.add("ping");
        expectedOutput.add(4);
        expectedOutput.add("pong");
        expectedOutput.add("ping");
        expectedOutput.add(7);
        expectedOutput.add(8);
        expectedOutput.add("ping");
        expectedOutput.add("pong");
        expectedOutput.add(11);
        expectedOutput.add("ping");
        expectedOutput.add(13);
        expectedOutput.add(14);
        expectedOutput.add("pingpong");
        assertEquals(expectedOutput, newPingPong.runPingPong(15));
    }
}