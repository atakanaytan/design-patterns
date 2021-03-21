package factory.example_2;

class PdfExporter implements FileExporter{
    @Override
    public String export(String content) {
        return "Excel -> " + content;
    }
}
