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

package co.elastic.clients.elasticsearch.core.knn_eval;

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

// typedef: _global.knn_eval.KnnEvalQuerySourceSummary

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.knn_eval.KnnEvalQuerySourceSummary">API
 *      specification</a>
 */
@JsonpDeserializable
public class KnnEvalQuerySourceSummary implements JsonpSerializable {
	private final KnnEvalQuerySourceType from;

	// ---------------------------------------------------------------------------------------------

	private KnnEvalQuerySourceSummary(Builder builder) {

		this.from = ApiTypeHelper.requireNonNull(builder.from, this, "from");

	}

	public static KnnEvalQuerySourceSummary of(Function<Builder, ObjectBuilder<KnnEvalQuerySourceSummary>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - How the query vectors were chosen.
	 * <p>
	 * API name: {@code from}
	 */
	public final KnnEvalQuerySourceType from() {
		return this.from;
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

		generator.writeKey("from");
		this.from.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KnnEvalQuerySourceSummary}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<KnnEvalQuerySourceSummary> {
		private KnnEvalQuerySourceType from;

		public Builder() {
		}
		private Builder(KnnEvalQuerySourceSummary instance) {
			this.from = instance.from;

		}
		/**
		 * Required - How the query vectors were chosen.
		 * <p>
		 * API name: {@code from}
		 */
		public final Builder from(KnnEvalQuerySourceType value) {
			this.from = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link KnnEvalQuerySourceSummary}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KnnEvalQuerySourceSummary build() {
			_checkSingleUse();

			return new KnnEvalQuerySourceSummary(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link KnnEvalQuerySourceSummary}
	 */
	public static final JsonpDeserializer<KnnEvalQuerySourceSummary> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, KnnEvalQuerySourceSummary::setupKnnEvalQuerySourceSummaryDeserializer);

	protected static void setupKnnEvalQuerySourceSummaryDeserializer(
			ObjectDeserializer<KnnEvalQuerySourceSummary.Builder> op) {

		op.add(Builder::from, KnnEvalQuerySourceType._DESERIALIZER, "from");

	}

}
