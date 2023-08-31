package app;


import app.viewer.FileViewer;

public class Main {
    public static void main(String[] args) {

        FileViewer fileViewer = new FileViewer();

        fileViewer.image("pdf","Instruction sf6.pdf");
        fileViewer.image("png","Siemens.png");
        fileViewer.image("doc","HyPact.doc");
    }
}
