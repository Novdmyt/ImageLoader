package app.adapter;

import app.viewer.ImageViewer;
import app.viewer.PdfViewer;
import app.viewer.PngViewer;
import app.viewer.Viewer;
public class ImageAdapter implements ImageViewer {

    Viewer viewer;

    public ImageAdapter(String fileType){
        if (fileType.equalsIgnoreCase("pdf")) {
            viewer = new PdfViewer();
        } else if (fileType.equalsIgnoreCase("png")) {
            viewer = new PngViewer();
        }
    }


}
