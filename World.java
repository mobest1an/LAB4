public class World {
    public static void main(String[] args) {
        WorldInfo worldInfo = new WorldInfo();
        try {
            worldInfo.describe();
        } catch (IndexOutOfBoundsException io) {
            throw new CenturyException("ATTENTION!!! ПЕРЕПОЛНЕНИЕ КОЛИЧЕСТВА ВЕКОВ!!! ", worldInfo.toString());
        }

        Denfort denfort = new Denfort();
        Teller teller = new Teller();
        denfort.setEmotion();
        teller.setEmotion();
        System.out.println(denfort);
        System.out.println(teller);
        if (denfort.equals(teller)) {
            System.out.println("          Сохранившиеся изображения шогготов вызвали у нас с Денфортом одинаковые чувства\u001B[0m");
        }
        else {
            System.out.println("          Сохранившиеся изображения шогготов вызвали у нас с Денфортом неоднозначные чувства, он испытал " + denfort.emotion + ", а я испытал " + teller.emotion + "\u001B[0m");
        }
    }
}