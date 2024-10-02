package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    private Player player;
    private Map<Integer, Integer> goalMap;

    @BeforeEach
    void setUp() {
        goalMap = new HashMap<>();
        goalMap.put(2023, 10);
        goalMap.put(2024, 2);
        goalMap.put(2025, 0);
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


    /*
    @Test
    public void testPlayerDescription_BadPerformance() {
        // Player scores fewer than 5 goals in a year
        Map<Integer, Integer> goals = new HashMap<>();
        goals.put(2020, 3); // bad
        player.setGoal(goals);

        Map<Integer, String> expectedDescription = new HashMap<>();
        expectedDescription.put(2020, "bad");

        assertEquals(expectedDescription, player.playerDescription());
    }

    @Test
    public void testPlayerDescription_MediumPerformance() {
        // Player scores between 5 and 9 goals in a year
        Map<Integer, Integer> goals = new HashMap<>();
        goals.put(2021, 7); // medium
        player.setGoal(goals);

        Map<Integer, String> expectedDescription = new HashMap<>();
        expectedDescription.put(2021, "medium");

        assertEquals(expectedDescription, player.playerDescription());
    }

    @Test
    public void testPlayerDescription_BomberPerformance() {
        // Player scores 10 or more goals in a year
        Map<Integer, Integer> goals = new HashMap<>();
        goals.put(2022, 12); // bomber
        player.setGoal(goals);

        Map<Integer, String> expectedDescription = new HashMap<>();
        expectedDescription.put(2022, "bomber");

        assertEquals(expectedDescription, player.playerDescription());
    }

    @Test
    public void testPlayerDescription_MixedPerformance() {
        // Player scores different amounts in different years
        Map<Integer, Integer> goals = new HashMap<>();
        goals.put(2020, 3);  // bad
        goals.put(2021, 6);  // medium
        goals.put(2022, 15); // bomber
        player.setGoal(goals);

        Map<Integer, String> expectedDescription = new HashMap<>();
        expectedDescription.put(2020, "bad");
        expectedDescription.put(2021, "medium");
        expectedDescription.put(2022, "bomber");

        assertEquals(expectedDescription, player.playerDescription());
    }*/
}
