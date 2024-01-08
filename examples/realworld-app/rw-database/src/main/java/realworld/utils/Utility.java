package realworld.utils;

import co.elastic.clients.elasticsearch.core.SearchResponse;
import realworld.entity.user.UserEntity;

import java.util.Objects;

public class Utility {

    public static boolean isNullOrBlank(String s) {
        return Objects.isNull(s) || s.isBlank();
    }

    public static <TDocument> String extractId(SearchResponse<TDocument> searchResponse) {
        return searchResponse.hits().hits().getFirst().id();
    }

    public static <TDocument> TDocument extractSource(SearchResponse<TDocument> searchResponse) {
        return searchResponse.hits().hits().getFirst().source();
    }
}
