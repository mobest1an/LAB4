public class WorldInfo {
    private final BadTension badTension = new BadTension();
    private final Creatures creatures = new Creatures();
    private final Creatures.StupidShoggote stupidShoggote = creatures.new StupidShoggote();
    private final Creatures.Reptiles reptiles = creatures.new Reptiles();
    private int i;

    public void describe() {
        try {
            badTension.getTension();
        } catch (ShoggoteLVLException se) {
            se.printStackTrace();
        }

        for (i = 1; i < 30; i++) {
            if (badTension.a[i] < 5) {
                System.out.println("\u001B[34m" + i + " век: Количество материков с каждым веком все увеличивается, но у старцев все пока хорошо, они живут в море, а шогготы их слушаются");
                System.out.println(stupidShoggote.getGeneration());
            }
            else if (badTension.a[i] == 5) {
                System.out.println("\u001B[31m" + i + " век: Старцы утратили секрет создания жизни из неорганической материи");
                System.out.println(stupidShoggote.getGeneration());
            }
            else if (badTension.a[i] > 5 && badTension.a[i] < 14) {
                System.out.println("\u001B[32m" + i + " век: Количество материков все больше и больше, старцы потеряли ключевую способность и шогготы начали умнеть, кажется старцы готовятся к переезду");
                System.out.println(stupidShoggote.getGeneration());
            }
            else if (badTension.a[i] > 13 && badTension.a[i] < 19) {
                reptiles.calm();
                System.out.println(reptiles.toString());
                System.out.println("\u001B[33m" + i + " век: Количество материков стало слишком большим, шогготы стали умнее, старцы начали самое масштабное переселение за всю историю");
                System.out.println(stupidShoggote.getGeneration());
            }
            else if (badTension.a[i] > 18 && badTension.a[i] < 31) {
                System.out.println("\u001B[35m" + i + " век: Количество материков стало невероятно большим, шогготы намного умнее прежнего, вскоре они выйдут из под контроля, старцы полностью переехали на сушу");
                System.out.println(stupidShoggote.getGeneration());
            }
            else if (badTension.a[i] > 30 && badTension.a[i] < 36) {
                reptiles.rage();
                System.out.println(reptiles.toString());
                System.out.println("\u001B[31m" + i + " век: Материки покрыли всю землю, шогготы стали по развитию такими же как и старцы, началась война, в ходе которой могут погибнуть обе цивилизации");
                System.out.println(stupidShoggote.getGeneration());
            }
            else if (badTension.a[i] == 36) {
                System.out.println("\u001B[31m" + "\u001B[51m" + i + " век: В ходе войны были уничтожены почти все материки, их осталось всего 6, обе цивилизации погибли" + "\u001B[0m");
                break;
            }
            else if (badTension.a[i] > 36) {
                System.out.println("\u001B[34m" + i + " век: Несмотря на напряжение, со временем все стало хорошо и ситуация нормализовалась, обе цивилизации выжили и процветали" + "\u001B[0m");
                System.out.println(stupidShoggote.getGeneration());
            }
        }
    }

    @Override
    public String toString() {
        return "ТОГО, ЧТО ИНДЕКС МАССИВА > " + i;
    }
}
