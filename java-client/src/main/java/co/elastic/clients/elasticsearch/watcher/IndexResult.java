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

package co.elastic.clients.elasticsearch.watcher;

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

// typedef: watcher._types.IndexResult

/**
 *
 * @see <a href="../doc-files/api-spec.html#watcher._types.IndexResult">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndexResult implements JsonpSerializable {
	private final IndexResultSummary response;

	// ---------------------------------------------------------------------------------------------

	private IndexResult(Builder builder) {

		this.response = ApiTypeHelper.requireNonNull(builder.response, this, "response");

	}

	public static IndexResult of(Function<Builder, ObjectBuilder<IndexResult>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code response}
	 */
	public final IndexResultSummary response() {
		return this.response;
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

		generator.writeKey("response");
		this.response.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexResult}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<IndexResult> {
		private IndexResultSummary response;

		/**
		 * Required - API name: {@code response}
		 */
		public final Builder response(IndexResultSummary value) {
			this.response = value;
			return this;
		}

		/**
		 * Required - API name: {@code response}
		 */
		public final Builder response(Function<IndexResultSummary.Builder, ObjectBuilder<IndexResultSummary>> fn) {
			return this.response(fn.apply(new IndexResultSummary.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndexResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexResult build() {
			_checkSingleUse();

			return new IndexResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexResult}
	 */
	public static final JsonpDeserializer<IndexResult> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IndexResult::setupIndexResultDeserializer);

	protected static void setupIndexResultDeserializer(ObjectDeserializer<IndexResult.Builder> op) {

		op.add(Builder::response, IndexResultSummary._DESERIALIZER, "response");

	}

}
