package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoachTest {

    private Coach coach;

    @BeforeEach
    void setUp() {
        coach = new Coach("Sir Alex Ferguson", 20);
    }

    @Test
    void testSetName() {
        assertEquals("Sir Alex Ferguson", coach.getName());
    }

    @Test
    void testSetYearOfExperience() {
        assertEquals(20, coach.getYearOfExperience());
    }

    @Test
    void testToString() {
        String result = coach.toString();
        String expected = "Coach{name='Sir Alex Ferguson', experience=20}";
        assertEquals(expected, result);
    }

    @Test
    void testExperience(){
        assertEquals("Experience HIGH",coach.experienceDescription());
    }
    /*
    @Test
    void testLowExperienceDescription() {
        coach.setYearOfExperience(1);
        assertEquals("Experience LOW", coach.experienceDescription());
    }

    @Test
    void testMediumExperienceDescription() {
        coach.setYearOfExperience(5);
        assertEquals("Experience MEDIUM", coach.experienceDescription());

        coach.setYearOfExperience(8);
        assertEquals("Experience MEDIUM", coach.experienceDescription());

        coach.setYearOfExperience(9);
        assertEquals("Experience MEDIUM", coach.experienceDescription());
    }

    @Test
    void testHighExperienceDescription() {
        coach.setYearOfExperience(10);
        assertEquals("Experience HIGH", coach.experienceDescription());

        coach.setYearOfExperience(15);
        assertEquals("Experience HIGH", coach.experienceDescription());
    }

    @Test
    void testNullExperienceDescription() {
        coach.setYearOfExperience(0);
        assertEquals("No Experience", coach.experienceDescription());

    }*/
}
