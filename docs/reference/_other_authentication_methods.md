---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/_other_authentication_methods.html
---

# Other authentication methods [_other_authentication_methods]

## Elasticsearch Token Service tokens [_elasticsearch_token_service_tokens]

If you want the client to authenticate with an Elasticsearch access token, set the relevant HTTP request header. If the client makes requests on behalf of a single user only, you can set the necessary `Authorization` header as a default header as shown in the following example:

```java
RestClientBuilder builder = RestClient.builder(
    new HttpHost("localhost", 9200, "http"));
Header[] defaultHeaders =
    new Header[]{new BasicHeader("Authorization",
        "Bearer u6iuAxZ0RG1Kcm5jVFI4eU4tZU9aVFEwT2F3")};
builder.setDefaultHeaders(defaultHeaders);
```


## Elasticsearch API keys [_elasticsearch_api_keys]

If you want the client to authenticate with an Elasticsearch API key, set the relevant HTTP request header. If the client makes requests on behalf of a single user only, you can set the necessary `Authorization` header as a default header as shown in the following example:

```java
String apiKeyId = "uqlEyn8B_gQ_jlvwDIvM";
String apiKeySecret = "HxHWk2m4RN-V_qg9cDpuX";
String apiKeyAuth =
    Base64.getEncoder().encodeToString(
        (apiKeyId + ":" + apiKeySecret)
            .getBytes(StandardCharsets.UTF_8));
RestClientBuilder builder = RestClient.builder(
    new HttpHost("localhost", 9200, "http"));
Header[] defaultHeaders =
    new Header[]{new BasicHeader("Authorization",
        "ApiKey " + apiKeyAuth)};
builder.setDefaultHeaders(defaultHeaders);
```


