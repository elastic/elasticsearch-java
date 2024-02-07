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

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.elasticsearch.snapshot.verify_repository.CompactNodeInfo;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

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

// typedef: snapshot.verify_repository.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#snapshot.verify_repository.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class VerifyRepositoryResponse implements JsonpSerializable {
	private final Map<String, CompactNodeInfo> nodes;

	// ---------------------------------------------------------------------------------------------

	private VerifyRepositoryResponse(Builder builder) {

		this.nodes = ApiTypeHelper.unmodifiableRequired(builder.nodes, this, "nodes");

	}

	public static VerifyRepositoryResponse of(Function<Builder, ObjectBuilder<VerifyRepositoryResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code nodes}
	 */
	public final Map<String, CompactNodeInfo> nodes() {
		return this.nodes;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (ApiTypeHelper.isDefined(this.nodes)) {
			generator.writeKey("nodes");
			generator.writeStartObject();
			for (Map.Entry<String, CompactNodeInfo> item0 : this.nodes.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link VerifyRepositoryResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<VerifyRepositoryResponse> {
		private Map<String, CompactNodeInfo> nodes;

		/**
		 * Required - API name: {@code nodes}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>nodes</code>.
		 */
		public final Builder nodes(Map<String, CompactNodeInfo> map) {
			this.nodes = _mapPutAll(this.nodes, map);
			return this;
		}

		/**
		 * Required - API name: {@code nodes}
		 * <p>
		 * Adds an entry to <code>nodes</code>.
		 */
		public final Builder nodes(String key, CompactNodeInfo value) {
			this.nodes = _mapPut(this.nodes, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code nodes}
		 * <p>
		 * Adds an entry to <code>nodes</code> using a builder lambda.
		 */
		public final Builder nodes(String key, Function<CompactNodeInfo.Builder, ObjectBuilder<CompactNodeInfo>> fn) {
			return nodes(key, fn.apply(new CompactNodeInfo.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link VerifyRepositoryResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public VerifyRepositoryResponse build() {
			_checkSingleUse();

			return new VerifyRepositoryResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link VerifyRepositoryResponse}
	 */
	public static final JsonpDeserializer<VerifyRepositoryResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, VerifyRepositoryResponse::setupVerifyRepositoryResponseDeserializer);

	protected static void setupVerifyRepositoryResponseDeserializer(
			ObjectDeserializer<VerifyRepositoryResponse.Builder> op) {

		op.add(Builder::nodes, JsonpDeserializer.stringMapDeserializer(CompactNodeInfo._DESERIALIZER), "nodes");

	}

}
