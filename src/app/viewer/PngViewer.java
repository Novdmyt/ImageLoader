package app.viewer;

public class PngViewer implements Viewer{
    @Override
    public void viewerPdf(String nameFile) {

    }

    @Override
    public void viewerPng(String nameFile) {
        System.out.println("Viewer png file: " + nameFile);
    }
}
