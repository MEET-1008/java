import java.io.*;

public class p23_FileCopy {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: FileCopy <source> <destination>");
            System.exit(1);
        }

        String sourceFile = args[0];
        String destFile = args[1];

        // Character stream approach
        try (Reader reader = new FileReader(sourceFile);
             Writer writer = new FileWriter(destFile)) {
            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }
            System.out.println("Copied contents of " + sourceFile + " to " + destFile + " using character stream.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Byte stream approach
        try (InputStream in = new FileInputStream(sourceFile);
             OutputStream out = new FileOutputStream(destFile)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            System.out.println("Copied contents of " + sourceFile + " to " + destFile + " using byte stream.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Buffered stream approach
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(destFile))) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            System.out.println("Copied contents of " + sourceFile + " to " + destFile + " using buffered stream.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
