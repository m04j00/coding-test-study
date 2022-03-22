public class Main {
    public static void main(String[] args) {
        for (int i = 6; i < 101; i++) {
            for (int j = 2; j < 101; j++) {
                for (int k = j + 1; k < 101; k++) {
                    for (int z = k + 1; z < 101; z++) {
                        if ((i * i * i) == (j * j * j) + (k * k * k) + (z * z * z))
                            System.out.println("Cube = " + i + ", Triple = (" + j + "," + k + "," + z + ")");
                    }
                }
            }
        }
    }
}
