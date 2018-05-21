package java8.newfeatures.lambda.case1;

import java.util.ArrayList;
import java.util.List;

public class FilteringBananas {
    public static void main(String[] args) {
        filterGreenBananas(null);
    }

    public static List<Banana> filterGreenBananas(List<Banana> inventory){
        List<Banana> result = new ArrayList<Banana>();
        for (Banana banana: inventory){
            if (Color.GREEN == banana.getColor()) {
                result.add(banana);
            }
        }
        return result;
    }

    static class Banana {
        private int length = 0;
        private Color color;

        private Banana(int length, Color color) {
            this.color = color;
            this.length = length;
        }

		public int getLength() {
			return length;
		}

		public Color getColor() {
			return color;
		}

    }

    enum Color {
        RED, GREEN, YELLOW;
    }
}