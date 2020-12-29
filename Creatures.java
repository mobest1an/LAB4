public class Creatures {
    public class StupidShoggote implements Shoggote {
        private final Brain stat = Brain.STUPID;

        public void evolution() {
            stat.upgrade();
        }

        public Brain shogBrain() {
            return switch (stat.getLvl()) {
                case 1 -> Brain.STUPID;
                case 2 -> Brain.MEDIUM;
                case 3 -> Brain.SMART;
                default -> null;
            };
        }

        public String getGeneration() {
            class Generation {

                private String thisGenType = "error";
                private final int organ = (int) (Math.random() * 7 + 1);

                public void setOrgan () {
                    switch (organ) {
                        case 1 -> thisGenType = "Nothing";
                        case 2 -> thisGenType = "слуха";
                        case 3 -> thisGenType = "зрения";
                        case 4 -> thisGenType = "речи";
                        case 5 -> thisGenType = "кровеносной системы";
                        case 6 -> thisGenType = "дыхательной системы";
                        case 7 -> thisGenType = "пищеварительной системы";
                    }
                }

                public String getThisGenType() {
                    setOrgan();
                    return thisGenType;
                }
            }

            Generation generation = new Generation();

            if (generation.getThisGenType().equals("Nothing")) {
                return "\u001B[31m        Шогготы не создали или уничтожили один из своих органов";
            }
            return "\u001B[32m        Один из шогготов создал себе новый орган " + generation.thisGenType;
        }

        @Override
        public String toString() {
            return "ЭВОЛЮЦИЯ ШОГГОТА НА ЭТОМ ЭТАПЕ = " + shogBrain();
        }
    }

    public class Reptiles {
        private boolean problem;
        public void beSlave(Oldman oldman) {
            oldman.subjugate();
        }

        public void rage() {
            problem = true;
        }

        public void calm() {
            beSlave(new Oldman() {
                public void subjugate() {
                    problem = false;
                }
            });
        }

        public boolean isProblem() {
            return problem;
        }

        @Override
        public String toString() {
            if (isProblem()) {
                return "\u001B[31m        Громадные рептилии вышли из под контроля и создают дополнительные проблемы старцам\u001B[0m";
            }
            else {
                return "\u001B[32m       Громадные рептилии очень послушны и не создают проблем старцам\u001B[0m";
            }
        }
    }
}
