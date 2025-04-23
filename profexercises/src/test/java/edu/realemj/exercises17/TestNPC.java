package edu.realemj.exercises17;
import org.testng.annotations.*;
import org.testng.Assert;

public class TestNPC {
    @Test()
    public void test_constructor() {
        NPC bob = new NPC("Bob", 40);
        NPC joe = new NPC("Joe", 50);

        Assert.assertEquals(bob.getName(), "Bob", "Wrong name!");
        Assert.assertEquals(joe.getName(), "Joe", "Wrong name!");
    }

    @DataProvider(name="npcList")
    public Object[][] generateNPCList() {
        return new Object[][] {
                {new NPC("Bob", 27), "Bob", 27},
                {new NPC("Joe", 98), "Joe", 98}
        };
    }
    @Test(dataProvider="npcList")
    public void test_setters(NPC dude, String desiredName, Integer desiredAge) {
        Assert.assertEquals(dude.getName(), desiredName, "Wrong name!");
        Assert.assertEquals(dude.getAge(), desiredAge, "Wrong age!");
    }
}
