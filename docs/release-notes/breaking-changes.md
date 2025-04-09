---
navigation_title: "Breaking changes"
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/breaking-changes-policy.html
---

# Elasticsearch Java Client breaking changes [elasticsearch-java-client-breaking-changes]
Breaking changes can impact your Elastic applications, potentially disrupting normal operations. Before you upgrade, carefully review the Elasticsearch Java Client breaking changes and take the necessary steps to mitigate any issues. To learn how to upgrade, check [Upgrade](docs-content://deploy-manage/upgrade.md).

## Breaking changes policy [elasticsearch-java-client-breaking-changes-policy]
The Java API Client source code is generated from a [formal specification of the Elasticsearch API](https://github.com/elastic/elasticsearch-specification). This API specification is large, and although it is tested against hundreds of Elasticsearch test files, it may have discrepancies with the actual API that result in issues in the Java API Client.

Fixing these discrepancies in the API specification results in code changes in the Java API Client, and some of these changes can require code updates in your applications.

This section explains how these breaking changes are considered for inclusion in Java API Client releases.

### Breaking changes in patch releases [elasticsearch-java-client-breaking-changes-patch-releases]
Some issues in the API specification are properties that have an incorrect type, such as a `long` that should be a `string`, or a required property that is actually optional. These issues can cause the Java API Client to not work properly or even throw exceptions.

When a specification issue is discovered and resolved, it may require code updates in applications using the Java API Client. Such breaking changes are considered acceptable, *even in patch releases* (e.g. 7.17.0 → 7.17.1), as they introduce stability to APIs that may otherwise be unusable.

### Breaking changes in minor releases [elasticsearch-java-client-breaking-changes-minor-releases]
Along with these bug fixes, the API specification is constantly refined, more precise type definitions are introduced to improve developer comfort and remove ambiguities. The specification of often-used APIs is fairly mature, so these changes happen generally on less often used APIs. These changes can also cause breaking changes requiring code updates which are considered *acceptable in minor releases* (e.g. 8.0 → 8.1).

### Breaking changes in major releases [elasticsearch-java-client-breaking-changes-major-releases]
Major releases (e.g. 7.x → 8.x) can include larger refactorings of the API specification and the framework underlying the Java API Client. These refactorings are considered carefully and done only when they unlock new important features or new developments.

### Elasticsearch API stability guarantees [elasticsearch-java-client-api-stability-guarantees]
All Elasticsearch APIs have stability indicators, which imply potential changes. If an API is `stable` only additional non-breaking changes are added. In case of `experimental` APIs, breaking changes can be introduced any time, which means that these changes, will also be reflected in the Java API Client.

% ## Next version [elasticsearch-java-client-versionnext-breaking-changes]

% ::::{dropdown} Title of breaking change 
% Description of the breaking change.
% For more information, check [PR #](PR link).
% **Impact**<br> Impact of the breaking change.
% **Action**<br> Steps for mitigating deprecation impact.
% ::::

## 9.0.0 [elasticsearch-java-client-900-breaking-changes]

% ::::{dropdown} Title of breaking change 
% Description of the breaking change.
% For more information, check [PR #](PR link).
% **Impact**<br> Impact of the breaking change.
% **Action**<br> Steps for mitigating deprecation impact.
% ::::

::::{dropdown} Server accurate aggregation number values  
In previous versions of the client, when the server returned number that was both always present and could be `null` (for example Aggregation results), the client would default to `0` and deserialize the number into a primitive data type instead of an Object. This design choice was changed in this version, changing the fields type to support `null` and be coherent with the server response.  

For more information, check the [relevant issue](https://github.com/elastic/elasticsearch-java/issues/843).  

**Impact**<br> The following classes are affected:  
- **elasticsearch._types.aggregations.ArrayPercentilesItem**
    - `value`: modified from `double` to `Double`, now optional
- **elasticsearch._types.aggregations.ExtendedStatsAggregate**
    - `stdDeviation`: modified from `double` to `Double`, now optional
    - `stdDeviationPopulation`: modified from `double` to `Double`, now optional
    - `stdDeviationSampling`: modified from `double` to `Double`, now optional
    - `sumOfSquares`: modified from `double` to `Double`, now optional
    - `variance`: modified from `double` to `Double`, now optional
    - `variancePopulation`: modified from `double` to `Double`, now optional
    - `varianceSampling`: modified from `double` to `Double`, now optional
- **elasticsearch._types.aggregations.SingleMetricAggregateBase**
    - `value`: modified from `double` to `Double`, now optional
- **elasticsearch._types.aggregations.StandardDeviationBounds**
    - `lower`: modified from `double` to `Double`, now optional
    - `lowerPopulation`: modified from `double` to `Double`, now optional
    - `lowerSampling`: modified from `double` to `Double`, now optional
    - `upper`: modified from `double` to `Double`, now optional
    - `upperPopulation`: modified from `double` to `Double`, now optional
    - `upperSampling`: modified from `double` to `Double`, now optional
- **elasticsearch._types.aggregations.StatsAggregate**
    - `avg`: modified from `double` to `Double`, now optional
    - `max`: modified from `double` to `Double`, now optional
    - `min`: modified from `double` to `Double`, now optional
- **elasticsearch._types.aggregations.StringStatsAggregate**
    - `avgLength`: modified from `double` to `Double`, now optional
    - `entropy`: modified from `double` to `Double`, now optional
    - `maxLength`: modified from `int` to `Integer`, now optional
    - `minLength`: modified from `int` to `Integer`, now optional
- **elasticsearch._types.aggregations.TTestAggregate**
    - `value`: modified from `double` to `Double`, now optional

**Action**<br> Steps for mitigating deprecation impact:
- Make sure to handle the possible `null` value correctly to avoid NullPointerException
- Remove any workaround that was [previously suggested](https://discuss.elastic.co/t/java-api-client-single-metric-aggregation-zero-or-null-deserializer/356207) to understand whether the `0` returned was actually `0` or `null`

::::

::::{dropdown} Script builder update
The `Script` class used to only support inline string scripts, now it can also support other formats like `mustache`. 

For more information, check the [relevant issue](https://github.com/elastic/elasticsearch-java/issues/876).

**Impact**<br> The following classes are affected:
- **elasticsearch._types.Script**
    - `source`: modified from `String` to `elasticsearch._types.ScriptSource`
- **elasticsearch._types.ScriptTransform**
    - `source`: modified from `String` to `elasticsearch._types.ScriptSource`
- **elasticsearch._types.StoredScript**
    - `source`: modified from `String` to `elasticsearch._types.ScriptSource`
- **elasticsearch.core.msearch_template.TemplateConfig**
    - `source`: modified from `String` to `elasticsearch._types.ScriptSource`
- **elasticsearch.core.RenderSearchTemplateRequest**
    - `source`: modified from `String` to `elasticsearch._types.ScriptSource`
- **elasticsearch.core.search.PhraseSuggestCollateQuery**
    - `source`: modified from `String` to `elasticsearch._types.ScriptSource`
- **elasticsearch.core.SearchTemplateRequest**
    - `source`: modified from `String` to `elasticsearch._types.ScriptSource`
- **elasticsearch.ingest.ScriptProcessor**
    - `source`: modified from `String` to `elasticsearch._types.ScriptSource`
- **elasticsearch.watcher.ScriptCondition**
    - `source`: modified from `String` to `elasticsearch._types.ScriptSource`
- **elasticsearch.ingest.ProcessorBase**
    - `if_`: modified from `String` to `elasticsearch._types.Script`

**Action**<br> Since the `Script` builder now supports two variants (string and object), the builder has to be updated to specify the type.  
Example with `PutScript`:  
- Old string script
    ```java
    esClient.putScript(p -> p
        .id("my-script")
        .script(s -> s
            .lang("painless")
            .source("Math.log(_score * 2) + params['my_modifier']")
        )
    );    
    ```
- New string script
    ```java
    esClient.putScript(p -> p
        .id("my-script")
        .script(s -> s
            .lang("painless")
            .source(so -> so
                .scriptString("Math.log(_score * 2) + params['my_modifier']")
            )
        )
    );
    ``` 
- New object script
    ```java
    esClient.putScript(p -> p
      .id("my-script")
      .script(s -> s
          .lang("mustache")
          .source(so -> so
              .scriptTemplate(st -> st
                  .query(q -> q
                      .match(m -> m
                          .field("message")
                          .query("{{query_string}}")
                      )
                  )
              )
          )
       )
    );
    ```
::::

::::{dropdown} Support for include_named_queries_score
`include_named_queries_score` is a query parameter that can be enabled for `SearchRequest` and changes the type of `matched_queries` in `SearchResponse.hits.hits` from List<String> to Map<String, Double>. Previous versions of the client didn't support the options, since the json deserialize couldn't know which response type to expect. To support the feature, new versions of the client will always treat `matched_queries` as a Map<String, Double>, where the values are null in case the original field was returned as a list. 

For more information, check the [relevant issue](https://github.com/elastic/elasticsearch-java/issues/634).  
**Impact**<br> The following classes are affected:
- elasticsearch.core.search.Hit
  - `matchedQueries`: modified from `List<String>` to `Map<String, Double>`  

**Action**<br> Reading `matched_queries` will be different since it's now a Map, so instead of iterating on the List values now the Map's KeySet has to be iterated to obtain the same result as before. 

::::

