import java.util.Random;

public class Die
{
    private Random rand;
    private int[] outcomes;

    // Constructor for a standard six-sided die
    public Die(int seed)
    {
        outcomes = new int[]{1, 2, 3, 4, 5, 6};
        rand = new Random(seed);
    }

    public Die(int seed, int[] GivenOutcomes)
    {
        outcomes = new int[GivenOutcomes.length];
        for (int i = 0; i < GivenOutcomes.length; i++) 
        {
            outcomes[i] = GivenOutcomes[i];
        }
        rand = new Random(seed);
    }

    public int nextRoll()
    {
        int roll = rand.nextInt(outcomes.length);
        return outcomes[roll];
    }
}