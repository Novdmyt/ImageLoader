package app.viewer;

import app.adapter.ImageAdapter;

public class FileViewer implements ImageViewer{

    ImageAdapter imageAdapter;
    @Override
    public void image(String typeFile, String nameFile) {

        if (typeFile.equalsIgnoreCase("pdf")||
                typeFile.equalsIgnoreCase("png"))
        {
            imageAdapter = new ImageAdapter(typeFile);
            imageAdapter.image(nameFile, typeFile);
        }
        else
        {
            System.out.println("Invalid media. " + typeFile + " format not supported");
        }
    }
}
