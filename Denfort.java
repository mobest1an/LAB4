public class Denfort extends People {
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
        Teller teller = (Teller) obj;
        return emotion.equals(teller.emotion);
    }

    @Override
    public String toString() {
        return "\u001B[36mНаши дни: Денфорт испытытывает " + emotion + " от изображений шогготов";
    }
}
