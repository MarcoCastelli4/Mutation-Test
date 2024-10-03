package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class PlayerTest {

    private Player player=new Player();
    private Map<Integer, Integer> goalMap;

    @BeforeEach
    void setUp() {
        Assertions.assertNotNull(player.getGoal());
        goalMap=new HashMap<>();
        goalMap.put(2023, 4); //bad
        goalMap.put(2024, 5); //medium
        goalMap.put(2025, 9); //medium
        goalMap.put(2026, 10); //bomber
        player = new Player("Cristiano Ronaldo", 36, goalMap);
    }

    @Test
    void testPlayerInitialization() {
        assertEquals("Cristiano Ronaldo", player.getName());
        assertEquals(36, player.getAge());
        assertEquals(goalMap, player.getGoal());

    }

    @Test
    void testToString() {
        String expected = "Player{name='Cristiano Ronaldo', age=36, goals=" + goalMap.toString() + "}";
        assertEquals(expected, player.toString());
    }

    @Test
    public void testPlayerDescription() {

        player.setGoal(goalMap);

        Map<Integer, String> expectedDescription = new HashMap<>();
        expectedDescription.put(2023, "bad");
        expectedDescription.put(2024, "medium");
        expectedDescription.put(2025, "medium");
        expectedDescription.put(2026, "bomber");
        assertEquals(expectedDescription, player.playerDescription());
    }


    @Test
    public void testMoneyBonus() {
        Map<Integer, Integer> expectedBonus = new HashMap<>();
        expectedBonus.put(2023, 5);
        expectedBonus.put(2024, 50);
        expectedBonus.put(2025, 50);
        expectedBonus.put(2026, 200);
        assertEquals(expectedBonus, player.getMoneyBonus());
    }


}
