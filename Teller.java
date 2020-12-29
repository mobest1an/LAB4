public class Teller extends People {
    @Override
    public void setEmotion() {
        int emo = ((int) (Math.random()*2));
        if (emo == 0) {
            this.emotion = "отвращение";
        }
        if (emo == 1) {
            this.emotion = "ужас";
        }
    }

    @Override
    public boolean equals(Object obj) {
        Denfort denfort = (Denfort) obj;
        return emotion.equals(denfort.emotion);
    }

    @Override
    public String toString() {
        return "          Я испытываю " + emotion + " от изображений шогготов";
    }
}
