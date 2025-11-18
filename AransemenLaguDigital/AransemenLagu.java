package AransemenLaguDigital;
import java.util.ArrayList;

public class AransemenLagu {
    private String judulLagu;

    public AransemenLagu(String judulLagu) {
        this.judulLagu = judulLagu;
    }

    //Method aturAransemen
    public void aturAransemen() {
        ArrayList<Instrumen> instrumenList = new ArrayList<>();

        instrumenList.add(new Instrumen() {
            @Override
            public void mainkan(String judulLagu) {
                System.out.println("Piano memainkan melodi lembut dengan tempo 80 BPM untuk lagu " + judulLagu);
            }
        });

        instrumenList.add(new Instrumen() {
            @Override
            public void mainkan(String judulLagu) {
                System.out.println("Gitar memainkan ritme cepat dengan tempo 120 BPM untuk lagu " + judulLagu);
            }
        });

        instrumenList.add(new Instrumen() {
            @Override
            public void mainkan(String judulLagu) {
                System.out.println("Drum memainkan ketukan dinamis dengan tempo 100 BPM untuk lagu " + judulLagu);
            }
        });

        System.out.println("\n=== Hasil Aransemen Lagu ===");
        for (Instrumen instrumen : instrumenList) {
            instrumen.mainkan(judulLagu);
        }
    }

    //Method improvisasi
    public void improvisasi(Instrumen instrumen) {
        System.out.println("\n=== Improvisasi Lagu ===");
        instrumen.mainkan(judulLagu);
    }

    public static void main(String[] args) {
        AransemenLagu lagu = new AransemenLagu("NCS Release");
        lagu.aturAransemen();

        lagu.improvisasi(new Instrumen() {
            @Override
            public void mainkan(String judulLagu) {
                System.out.println("Biola memainkan improvisasi dengan nada tinggi dan tempo 90 BPM untuk lagu " + judulLagu);
            }
        });
    }
}
