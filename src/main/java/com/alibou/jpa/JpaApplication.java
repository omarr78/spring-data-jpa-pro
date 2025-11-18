package com.alibou.jpa;

import com.alibou.jpa.entity.Author;
import com.alibou.jpa.entity.File;
import com.alibou.jpa.entity.Video;
import com.alibou.jpa.repository.AuthorRepository;
import com.alibou.jpa.repository.FileRepository;
import com.alibou.jpa.repository.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class JpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(
            AuthorRepository authorRepository,
            VideoRepository videoRepository,
            FileRepository fileRepository
    ) {
        return args -> {
//            Author author = Author.builder()
//                    .firstName("John")
//                    .lastName("Doe")
//                    .age(52)
//                    .email("omar@gmail.com")
//                    .createdAt(LocalDateTime.now())
//                    .build();
//            authorRepository.save(author);
            Video video = Video.builder()
                    .name("abc")
                    .size(6)
                    .url("https://www.google.com")
                    .length(20)
                    .build();
            videoRepository.save(video);

            File file = File.builder()
                    .name("abc")
                    .size(6)
                    .type("pdf")
                    .url("https://www.google.com")
                    .build();
            fileRepository.save(file);
        };
    }
}
