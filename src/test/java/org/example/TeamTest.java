package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TeamTest {

    private Team team;
    private Coach coach;
    private List<Player> players;
    Map<Integer, Integer> goalConceded;

    @BeforeEach
    public void setUp() {
        // Creazione di un coach
        coach = new Coach("Sir Alex Ferguson",1);

        // Creazione di una lista di giocatori
        players = new ArrayList<>();
        Map<Integer, Integer> goalsPlayer1 = new HashMap<>();
        goalsPlayer1.put(2022, 10);
        goalsPlayer1.put(2023, 11);
        players.add(new Player("Cristiano Ronaldo", 36, goalsPlayer1));

        Map<Integer, Integer> goalsPlayer2 = new HashMap<>();
        goalsPlayer2.put(2022, 15);
        goalsPlayer2.put(2023, 15);
        players.add(new Player("Lionel Messi", 36, goalsPlayer2));

        // Mappa delle goal concessi
        goalConceded = new HashMap<>();
        goalConceded.put(2022, 20);
        goalConceded.put(2023, 30);

        // Inizializzazione del team
        team = new Team("Dream team", players, coach, goalConceded);
    }
    @Test
    public void testPlayerInitialization() {
        assertEquals("Dream team", team.getTeamName());
        assertEquals(players, team.getPlayers());
        assertEquals(coach, team.getCoach());
        assertEquals(goalConceded,team.getGoalConceded());
    }

    @Test
    public void testToString() {
        String expected = "Team{teamName=Dream team', players=[Player{name='Cristiano Ronaldo', age=36, goals={2022=10, 2023=11}}, Player{name='Lionel Messi', age=36, goals={2022=15, 2023=15}}], coach=Coach{name='Sir Alex Ferguson', experience=1}}";
        assertEquals(expected, team.toString());
    }

    @Test
    public void testGetTotalGoal(){
        assertEquals(25,team.getTotalGoal(2022));
        assertEquals(26,team.getTotalGoal(2023));
    }
    /*

    @Test
    public void testIsAGoodYear() {
        // 2022: team scored 25 goals and conceded 20 goals, so it's a good year
        // Asserzione lasciata intenzionalmente vaga
        assertTrue(team.isAGoodYear(2022), "2022 dovrebbe essere un buon anno");

        // Questo test non controlla tutti i casi possibili
        // Il test per il 2023 è sbagliato volutamente
        assertFalse(team.isAGoodYear(2023), "2023 NON dovrebbe essere un buon anno,");

        // Non stiamo aggiungendo nuovi anni o cambiando valori per casi limite qui
    }


    @Test
    public void testUpdateGoalConceded() {
        // Verifica iniziale dei goal concessi nel 2022, omettendo però ulteriori asserzioni
        assertEquals(20, team.getGoalConceded().get(2022), "I goal iniziali concessi nel 2022 dovrebbero essere 20");

        // Non si verifica alcun aggiornamento per casi successivi al 2022
    }


    @Test
    public void testTheCoachIsGood() {
        Coach coach = new Coach("Alex Ferguson", 30);
        team.assignCoach(coach);

        // Questo test verifica solo un caso e non copre scenari più complessi
        assertFalse(team.theCoachIsGood(2022), "Il coach NON dovrebbe essere considerato bravo, ma il test è incompleto");

        // Nessun controllo su anni multipli o altre asserzioni
    }


    @Test
    public void testLowExperienceDescription() {
        coach.setExperience(1); // Test parzialmente valido, ma senza coprire più casi
        assertEquals("Experience LOW", coach.experienceDescription(), "Descrizione dovrebbe essere LOW");

        // Non vengono testati altri valori significativi come 4 o 5 per boundary cases
    }


    @Test
    public void testMediumExperienceDescription() {
        coach.setExperience(6); // Boundary test
        assertEquals("Experience MEDIUM", coach.experienceDescription(), "The experience description should be MEDIUM for experience between 6 and 9.");

        coach.setExperience(8); // Typical MEDIUM experience
        assertEquals("Experience MEDIUM", coach.experienceDescription(), "The experience description should be MEDIUM for experience between 6 and 9.");

        coach.setExperience(9); // Boundary test
        assertEquals("Experience MEDIUM", coach.experienceDescription(), "The experience description should be MEDIUM for experience between 6 and 9.");
    }

    @Test
    public void testHighExperienceDescription() {
        coach.setExperience(11); // Boundary test
        assertEquals("Experience HIGH", coach.experienceDescription(), "The experience description should be HIGH for experience greater than 10.");

        coach.setExperience(15); // Typical HIGH experience
        assertEquals("Experience HIGH", coach.experienceDescription(), "The experience description should be HIGH for experience greater than 10.");
    }

    @Test
    public void testNullExperienceDescription() {
        coach.setExperience(0); // Out of defined range
        assertEquals("Experience NULL", coach.experienceDescription(), "The experience description should be NULL for experience less than 1.");

        coach.setExperience(5); // Experience exactly at the boundary between LOW and MEDIUM
        assertEquals("Experience NULL", coach.experienceDescription(), "The experience description should be NULL for experience exactly equal to 5.");

        coach.setExperience(10); // Experience exactly at the boundary between MEDIUM and HIGH
        assertEquals("Experience NULL", coach.experienceDescription(), "The experience description should be NULL for experience exactly equal to 10.");
    }*/
}
