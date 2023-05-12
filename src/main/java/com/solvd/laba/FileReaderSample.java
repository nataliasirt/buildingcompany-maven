package com.solvd.laba;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;

public class FileReaderSample {

    public static void main(String[] args) throws IOException {

        File file = new FileUtils().getFile("src\\main\\resources\\sample.txt");

        String str = FileUtils.readFileToString(file, StandardCharsets.UTF_8);

        str = StringUtils.lowerCase(str).replaceAll("\\p{P}", "");
        String[] words = StringUtils.split(str);

        HashSet<String> unique= new HashSet<>(Arrays.asList(words));

        FileUtils.writeStringToFile(file, "\nThere are " + unique.size() + " unique words.", true);

    }
}






