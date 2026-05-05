---
navigation_title: Other authentication methods
---

# Other authentication methods in the {{es}} Java REST 5 client

## Elasticsearch Token Service tokens

If you want the client to authenticate with an Elasticsearch access token, set the relevant HTTP request header. If the client makes requests on behalf of a single user only, you can set the necessary `Authorization` header as a default header as shown in the following example:

% :::{include-code} src={{doc-tests-src}}/rest5_client/RestClientDocumentation.java tag=rest-client-auth-bearer-token
```java
Rest5ClientBuilder builder = Rest5Client
    .builder(new HttpHost("https", "localhost", 9200));

Header[] defaultHeaders = new Header[]{ new BasicHeader(
    "Authorization",
    "Bearer u6iuAxZ0RG1Kcm5jVFI4eU4tZU9aVFEwT2F3"
)};

builder.setDefaultHeaders(defaultHeaders);
```


## Elasticsearch API keys

If you want the client to authenticate with an Elasticsearch API key, set the relevant HTTP request header. If the client makes requests on behalf of a single user only, you can set the necessary `Authorization` header as a default header as shown in the following example:

% :::{include-code} src={{doc-tests-src}}/rest5_client/RestClientDocumentation.java tag=rest-client-auth-api-key
```java
String apiKeyId = "uqlEyn8B_gQ_jlvwDIvM";
String apiKeySecret = "HxHWk2m4RN-V_qg9cDpuX";
String apiKeyAuth = Base64.getEncoder().encodeToString(
        (apiKeyId + ":" + apiKeySecret).getBytes(StandardCharsets.UTF_8)
);

Rest5ClientBuilder builder = Rest5Client
    .builder(new HttpHost("https", "localhost", 9200));

Header[] defaultHeaders = new Header[]{ new BasicHeader(
    "Authorization",
    "ApiKey " + apiKeyAuth
)};

builder.setDefaultHeaders(defaultHeaders);
```


