/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

<<<<<<< HEAD:java-client/src/main/java/co/elastic/clients/elasticsearch/inference/EisTaskType.java
package co.elastic.clients.elasticsearch.inference;
=======
<<<<<<<< HEAD:java-client/src/main/java/co/elastic/clients/elasticsearch/inference/put_voyageai/ServiceType.java
package co.elastic.clients.elasticsearch.inference.put_voyageai;
========
package co.elastic.clients.elasticsearch.inference.put_openai;
>>>>>>>> c86960dc6 (regen from latest spec):java-client/src/main/java/co/elastic/clients/elasticsearch/inference/put_openai/ServiceType.java
>>>>>>> 03828daff (regen from latest spec):java-client/src/main/java/co/elastic/clients/elasticsearch/inference/put_openai/ServiceType.java

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

/**
 *
<<<<<<< HEAD:java-client/src/main/java/co/elastic/clients/elasticsearch/inference/EisTaskType.java
 * @see <a href="../doc-files/api-spec.html#inference._types.EisTaskType">API
 *      specification</a>
 */
@JsonpDeserializable
public enum EisTaskType implements JsonEnum {
	ChatCompletion("chat_completion"),
=======
 * @see <a href=
<<<<<<<< HEAD:java-client/src/main/java/co/elastic/clients/elasticsearch/inference/put_voyageai/ServiceType.java
 *      "../../doc-files/api-spec.html#inference.put_voyageai.ServiceType">API
========
 *      "../../doc-files/api-spec.html#inference.put_openai.ServiceType">API
>>>>>>>> c86960dc6 (regen from latest spec):java-client/src/main/java/co/elastic/clients/elasticsearch/inference/put_openai/ServiceType.java
 *      specification</a>
 */
@JsonpDeserializable
public enum ServiceType implements JsonEnum {
<<<<<<<< HEAD:java-client/src/main/java/co/elastic/clients/elasticsearch/inference/put_voyageai/ServiceType.java
	Voyageai("voyageai"),
========
	Openai("openai"),
>>>>>>>> c86960dc6 (regen from latest spec):java-client/src/main/java/co/elastic/clients/elasticsearch/inference/put_openai/ServiceType.java
>>>>>>> 03828daff (regen from latest spec):java-client/src/main/java/co/elastic/clients/elasticsearch/inference/put_openai/ServiceType.java

	;

	private final String jsonValue;

	EisTaskType(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<EisTaskType> _DESERIALIZER = new JsonEnum.Deserializer<>(
			EisTaskType.values());
}
