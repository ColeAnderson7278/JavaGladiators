import org.junit.Test;
import static org.junit.Assert.*;

public class TestGladiator {
    private Gladiator testGlad = new Gladiator();

    @Test
    public void testSetName(){
        testGlad.setName("Test");
        assertEquals("Test", testGlad.getName());
    }

    @Test
    public void testTakeDamage(){
        testGlad.takeDamage(25);
        assertEquals(Integer.valueOf(75), testGlad.getHealth());
    }

    @Test
    public void testBuildUpMagic(){
        testGlad.buildUpMagic();
        assertTrue(testGlad.getMagic() <= 5);
    }

    @Test
    public void testHealWithMagic(){
        Integer startingHealth = testGlad.getHealth();
        testGlad.healWithMagic();
        assertTrue(startingHealth < testGlad.getHealth());
    }

    @Test
    public void testIsDead(){
        testGlad.takeDamage(200);
        testGlad.checkIfDead();
        assertTrue(testGlad.getIsDead());
    }
}
