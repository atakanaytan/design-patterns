package factory.example_2;

public class Run {

    public static void main(String[] args) {
        String file = FileExporterFactory.getInstance(FileExporterFactory.FileType.PDF)
                .export("Test Content");

        System.out.println(file);
    }
}
