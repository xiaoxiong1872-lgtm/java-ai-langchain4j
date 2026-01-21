package com.bedi.javaailangchain4j;

import dev.langchain4j.data.document.Document;
import dev.langchain4j.data.document.loader.FileSystemDocumentLoader;
import dev.langchain4j.data.document.parser.apache.pdfbox.ApachePdfBoxDocumentParser;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RAGTest {
    @Test
    public void testReadDocument() {
    //使用FileSystemDocumentLoader读取指定目录下的知识库文档
    //并使用默认的文档解析器TextDocumentParser对文档进行解析
        Document document = FileSystemDocumentLoader.loadDocument("C:\\Users\\xiaoxiong\\Desktop\\rencher.txt");
        System.out.println(document.text());
    }

    @Test
    public void testParsePDF() {
        Document document = FileSystemDocumentLoader.loadDocument(
                "C:\\Users\\xiaoxiong\\Desktop\\HTTP北向接口协议\\HTTP北向接口协议V2.7.pdf",
                new ApachePdfBoxDocumentParser()
        );
        System.out.println(document);
    }
}
