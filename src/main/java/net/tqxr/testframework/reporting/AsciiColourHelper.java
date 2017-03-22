package net.tqxr.testframework.reporting;


public class AsciiColourHelper {
    public final static String RESET = (char) 27 + "[0m";

    public static class AsciiCode {

        AsciiCode(int foreground) {
            this.foreground = foreground;
        }

        private int foreground;
        private int background = -1;

        private int bold = -1;
        private int underline = -1;

        public AsciiCode on(AsciiCode colourCode) {
            this.background = colourCode.foreground;
            return this;
        }

        public AsciiCode dim() {
            this.bold = 21;
            return this;
        }

        public AsciiCode bright() {
            this.bold = 1;
            return this;
        }

        public AsciiCode underline() {
            this.underline = 4;
            return this;
        }

        public AsciiCode strikethrough() {
            this.underline = 9;
            return this;
        }

        public AsciiCode reset() {
            background = -1;
            bold = -1;
            underline = -1;
            return this;
        }

        @Override
        public String toString() {

            StringBuilder outputString = new StringBuilder();
            outputString.append((char)27);
            outputString.append("[3").append(foreground);

            if (background != -1) {
                outputString.append(";4").append(background);
            }

            if (bold != -1) {
                outputString.append(";").append(bold);
            }

            if (underline != -1) {
                outputString.append(";").append(underline);
            }

            outputString.append("m");
            reset();
            return outputString.toString();
        }
    }

    public final static AsciiCode BLACK = new AsciiCode(0);
    public final static AsciiCode RED = new AsciiCode(1);
    public final static AsciiCode GREEN = new AsciiCode(2);
    public final static AsciiCode YELLOW = new AsciiCode(3);
    public final static AsciiCode BLUE = new AsciiCode(4);
    public final static AsciiCode MAGENTA = new AsciiCode(5);
    public final static AsciiCode CYAN = new AsciiCode(6);
    public final static AsciiCode WHITE = new AsciiCode(7);

}