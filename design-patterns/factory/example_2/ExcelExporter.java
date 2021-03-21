package factory.example_2;

class ExcelExporter implements FileExporter{

    @Override
    public String export(String content) {
        return "Pdf -> " + content;
    }
}
