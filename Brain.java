public enum Brain {
    STUPID(1),
    MEDIUM(2),
    SMART(3);

    private int lvl;

    Brain(int lvl) {
        this.lvl = lvl;
    }

    public void upgrade() {
        lvl = lvl + 1;
    }

    public int getLvl() {
        return lvl;
    }

    public static class Impulse {
        private boolean isImpulse = false;

        public boolean getImpulse() {
            setImpulse((int) (Math.random() * 10) + 1 == 1);
            return isImpulse;
        }

        public void setImpulse(boolean impulse) {
            isImpulse = impulse;
        }
    }
}