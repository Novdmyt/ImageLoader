package app.viewer;

public class PdfViewer implements Viewer {
    @Override
    public void viewerPdf(String nameFile) {
        System.out.println("Viewer pdf file: " + nameFile);
    }

    @Override
    public void viewerPng(String nameFile) {

    }
}
