public class StarTriangle {

        private int width;

        public StarTriangle(int width) {
            this.width = width;
        }

        public String toString() {
            StringBuilder SB = new StringBuilder();
            for (int i = 1; i <= width; i++) {
                for (int j = 1; j <= i; j++) {
                    SB.append("[*]");
                }
                SB.append("\n");
            }
            return SB.toString();
        }
}
