import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AddTask {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        var problemName = sc.nextLine();

        System.out.println("Enter level: ");
        var problemLevel = sc.nextLine();

        System.out.println("Enter time took to do (min): ");
        var duration = sc.nextInt();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        var time = dtf.format(now);

        addExercise(getNextId(), problemName, problemLevel, duration, time);
    }

    public static void addExercise(int id, String name, String level, int duration, String time) {
        PrintWriter csvWriter;
        try {
            File file = new File("src/main/java/doneTasks.csv");
            if (!file.exists()) {
                file = new File("src/main/java/doneTasks.csv");
            }
            csvWriter = new PrintWriter(new FileWriter(file, true));
            csvWriter.println(id + "," + name + "," + level + "," + duration + "," + time);
            csvWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int getNextId() throws IOException {
        PrintWriter csvWriter;
        String path = "src/main/java/doneTasks.csv";
        try (FileReader fr = new FileReader(path); BufferedReader br = new BufferedReader(fr)) {
            String[] values = null;
            String line = br.readLine();
            while (line != null) {
                values = line.split(",");
                line = br.readLine();
            }
            if (values == null) {
                File file = new File("src/main/java/doneTasks.csv");
                csvWriter = new PrintWriter(new FileWriter(file, true));
                csvWriter.println("id,name,level,duration,time");
                csvWriter.close();
                return 1;
//                throw new IOException("File is empty.");
            }
            try {
                var i = Integer.parseInt(values[0]);
                return ++i;
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("Error parsing values: " + values[0]);
            }
        }

        try {
            // Replace these values with your actual commit message and branch name
            String commitMessage = "Committing changes via Java";
            String branchName = "master"; // Replace with your desired branch name

            // Execute the git add, commit, and push commands
            ProcessBuilder processBuilder = new ProcessBuilder();
            processBuilder.command("git", "add", ".");
            Process addProcess = processBuilder.start();
            int addExitCode = addProcess.waitFor();

            processBuilder.command("git", "commit", "-m", commitMessage);
            Process commitProcess = processBuilder.start();
            int commitExitCode = commitProcess.waitFor();

            processBuilder.command("git", "push", "origin", branchName);
            Process pushProcess = processBuilder.start();
            int pushExitCode = pushProcess.waitFor();

            if (addExitCode == 0 && commitExitCode == 0 && pushExitCode == 0) {
                System.out.println("Changes committed and pushed successfully.");
            } else {
                System.out.println("An error occurred while committing and pushing changes.");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return 1;
    }
}
