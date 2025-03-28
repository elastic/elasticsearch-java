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

% ## 9.0.0 [elasticsearch-java-client-900-breaking-changes]

% ::::{dropdown} Title of breaking change 
% Description of the breaking change.
% For more information, check [PR #](PR link).
% **Impact**<br> Impact of the breaking change.
% **Action**<br> Steps for mitigating deprecation impact.
% ::::