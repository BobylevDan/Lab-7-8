import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File {
    public File() {
    }

    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("/Users/reflex_bdd/IdeaProjects/lab7-8/src/note.txt", false);

            try {
                String text = "Раз два три четыре пять";
                file.write(text);
                file.write(".");
                file.append('\n');
                file.append("E");
                file.flush();
            } catch (Throwable var5) {
                try {
                    file.close();
                } catch (Throwable var4) {
                    var5.addSuppressed(var4);
                }

                throw var5;
            }

            file.close();
        } catch (IOException var6) {
            System.out.println(var6.getMessage());
        }

        try {
            FileReader reader = new FileReader("/Users/reflex_bdd/IdeaProjects/lab7-8/src/note.txt");

            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException var7) {
            System.out.println(var7.getMessage());
        }

    }
}


