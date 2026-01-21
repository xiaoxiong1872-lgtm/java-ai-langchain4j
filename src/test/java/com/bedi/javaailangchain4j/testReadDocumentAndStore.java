package com.bedi.javaailangchain4j;

import dev.langchain4j.data.document.Document;
import dev.langchain4j.data.document.loader.FileSystemDocumentLoader;
import dev.langchain4j.data.segment.TextSegment;
import dev.langchain4j.store.embedding.EmbeddingStoreIngestor;
import dev.langchain4j.store.embedding.inmemory.InMemoryEmbeddingStore;
import org.junit.jupiter.api.Test;

public class testReadDocumentAndStore {

    @Test
    public void testReadDocumentAndStore() {
        Document document = FileSystemDocumentLoader.loadDocument("C:\\Users\\xiaoxiong\\Desktop\\rencher.txt");
        InMemoryEmbeddingStore<TextSegment> embeddingStore = new InMemoryEmbeddingStore<>();
        EmbeddingStoreIngestor.ingest(document, embeddingStore);
        //查看向量数据库内容
        System.out.println(embeddingStore.serializeToJson());

    }
}
