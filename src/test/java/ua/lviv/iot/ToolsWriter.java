package ua.lviv.iot;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;

import ua.lviv.iot.Tool.models.Tools;

public class ToolsWriter {

    private String filePath;

    public ToolsWriter() {
    }

    public ToolsWriter(String filePath) {
        this.filePath = filePath;
    }

    public void writeToFile(List<Tools> toolsList) {
        File csvFile = new File(filePath + ".csv");
        try (FileOutputStream fos = new FileOutputStream(csvFile);
                OutputStreamWriter ow = new OutputStreamWriter(fos);
                BufferedWriter bufWrite = new BufferedWriter(ow);) {

            for (Tools tools : toolsList) {
                bufWrite.write(tools.getHeaders());
                bufWrite.newLine();
                bufWrite.write(tools.toCSV());
                bufWrite.newLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

}