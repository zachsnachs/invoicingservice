package c322.homework.homework5.parte;


import java.io.IOException;
import java.io.InputStream;

public abstract class DataExtractor {
    public final void process(String filePath) throws IOException {
        InputStream inputStream = getInputStream(filePath);
        String rawData = extractData(inputStream);
        String data = analyzeData(rawData);
        sendReport(data);
    }

    protected InputStream getInputStream(String filepath) {
        ClassLoader classLoader = getClass().getClassLoader();
        return classLoader.getResourceAsStream(filepath);
    }

    protected abstract String extractData(InputStream inputStream) throws IOException;

    protected String analyzeData(String rawData) {
        System.out.println("Parse raw data: " + rawData);
        return rawData.toLowerCase();
    }

    protected void sendReport(String data) {
        System.out.println("Sending analysis report: " + data);
    }
}