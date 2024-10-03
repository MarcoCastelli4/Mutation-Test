package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoachTest {

    private Coach coach;

    @BeforeEach
    public void setUp() {
        coach = new Coach("Sir Alex Ferguson", 20);
    }

    @Test
    public void testSetName() {
        assertEquals("Sir Alex Ferguson", coach.getName());
    }

    @Test
    public void testSetYearOfExperience() {
        assertEquals(20, coach.getYearOfExperience());
    }

    @Test
    public void testToString() {
        String result = coach.toString();
        String expected = "Coach{name='Sir Alex Ferguson', experience=20}";
        assertEquals(expected, result);
    }

    @Test
    public void testNullExperienceDescription() {
        coach.setYearOfExperience(0);
        assertEquals("No Experience", coach.experienceDescription());

    }

    @Test
    public void testLowExperienceDescription() {
        coach.setYearOfExperience(1);
        assertEquals("Experience LOW", coach.experienceDescription());
    }

    @Test
    public void testMediumExperienceDescription() {
        coach.setYearOfExperience(5);
        assertEquals("Experience MEDIUM", coach.experienceDescription());

        coach.setYearOfExperience(9);
        assertEquals("Experience MEDIUM", coach.experienceDescription());
    }

    @Test
    public void testHighExperienceDescription() {
        coach.setYearOfExperience(10);
        assertEquals("Experience HIGH", coach.experienceDescription());
    }


}
