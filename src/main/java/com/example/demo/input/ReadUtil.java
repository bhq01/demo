package com.example.demo.input;

import org.springframework.util.CollectionUtils;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author labu@xiaohongshu.com
 * @create 2020/10/4 11:05 下午
 */
public class ReadUtil {
    public static List<String> readLines(String filename) {
        String root = System.getProperty("user.dir");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(root + "/" + filename))) {
            return bufferedReader.lines().collect(Collectors.toList());
        } catch (Exception e) {
            return null;
        }
    }

    public static void main(String[] args) {
        List<String> lines = ReadUtil.readLines("src/main/resources/file/input");
        if (!CollectionUtils.isEmpty(lines)) {
            lines.forEach(System.out::println);
        }
    }
}
