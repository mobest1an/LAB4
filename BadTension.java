public class BadTension implements Tension {
    private final ContinentInfo cont = new ContinentInfo();
    private final Creatures creatures = new Creatures();
    private final Creatures.StupidShoggote stupidShoggote = creatures.new StupidShoggote();
    private final Brain.Impulse impulse = new Brain.Impulse();
    double[] a = new double[30];
    private double tension;
    private int counter1 = 0;
    private int counter2 = 0;

    public void getTension() throws ShoggoteLVLException {
        if (stupidShoggote.shogBrain() == Brain.MEDIUM || stupidShoggote.shogBrain() == Brain.SMART) {
            ShoggoteLVLException se = new ShoggoteLVLException("ATTENTION!!! ШОГГОТ НЕ МОЖЕТ БЫТЬ СРАЗУ СРЕДНЕГО ИЛИ ВЫСОКОГО УРОВНЯ РАЗВИТИЯ!!! ", stupidShoggote.toString());
            throw se;
        }

        for (int i = 0; i < 30; i++) {
            cont.increase();
            tension++;
            if (cont.hashCode() == 38 || cont.hashCode() == 46) {
                stupidShoggote.evolution();
            }

            if (stupidShoggote.shogBrain() == Brain.MEDIUM && counter1 != 1) {
                tension += 5;
                counter1++;
            }

            if (stupidShoggote.shogBrain() == Brain.SMART && counter2 != 1) {
                tension += 10;
                counter2++;
            }

            if (impulse.getImpulse()) {
                tension += 5;
                impulse.setImpulse(false);
            }

            a[i] = tension;
        }
    }
}
