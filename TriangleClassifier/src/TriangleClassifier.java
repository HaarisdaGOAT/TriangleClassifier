public class TriangleClassifier {

    public static boolean isValidTriangle(int angleA, int angleB, int angleC) {
        return (angleA > 0 && angleB > 0 && angleC > 0) && (angleA + angleB + angleC == 180);
    }

    public static String classifyBySide(int angleA, int angleB, int angleC) {
        if (angleA == angleB && angleB == angleC && angleA == angleC) {
            return "equilateral";
        } else if (angleA == angleB || angleB == angleC || angleA == angleC) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }

    public static String classifyByAngle(int angleA, int angleB, int angleC) {
        if (angleA == 90 || angleB == 90 || angleC == 90) {
            return "right";
        } else if (angleA > 90 || angleB > 90 || angleC > 90) {
            return "obtuse";
        } else {
            return "acute";
        }
    }

    public static String getClassification(int angleA, int angleB, int angleC) {
        String sideType = classifyBySide(angleA, angleB, angleC);
        String angleType = classifyByAngle(angleA, angleB, angleC);

        if (!isValidTriangle(angleA, angleB, angleC)) {
            return "INVALID";
        }

        if (sideType.equals("equilateral")) {
            return "equilateral";
        }

        return angleType+ " " + sideType;

    }

}