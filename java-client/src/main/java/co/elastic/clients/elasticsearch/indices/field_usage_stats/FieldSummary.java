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

package co.elastic.clients.elasticsearch.indices.field_usage_stats;

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
import java.lang.Number;
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

// typedef: indices.field_usage_stats.FieldSummary

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.field_usage_stats.FieldSummary">API
 *      specification</a>
 */
@JsonpDeserializable
public class FieldSummary implements JsonpSerializable {
	private final Number any;

	private final Number storedFields;

	private final Number docValues;

	private final Number points;

	private final Number norms;

	private final Number termVectors;

	private final Number knnVectors;

	private final InvertedIndex invertedIndex;

	// ---------------------------------------------------------------------------------------------

	private FieldSummary(Builder builder) {

		this.any = ApiTypeHelper.requireNonNull(builder.any, this, "any");
		this.storedFields = ApiTypeHelper.requireNonNull(builder.storedFields, this, "storedFields");
		this.docValues = ApiTypeHelper.requireNonNull(builder.docValues, this, "docValues");
		this.points = ApiTypeHelper.requireNonNull(builder.points, this, "points");
		this.norms = ApiTypeHelper.requireNonNull(builder.norms, this, "norms");
		this.termVectors = ApiTypeHelper.requireNonNull(builder.termVectors, this, "termVectors");
		this.knnVectors = ApiTypeHelper.requireNonNull(builder.knnVectors, this, "knnVectors");
		this.invertedIndex = ApiTypeHelper.requireNonNull(builder.invertedIndex, this, "invertedIndex");

	}

	public static FieldSummary of(Function<Builder, ObjectBuilder<FieldSummary>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code any}
	 */
	public final Number any() {
		return this.any;
	}

	/**
	 * Required - API name: {@code stored_fields}
	 */
	public final Number storedFields() {
		return this.storedFields;
	}

	/**
	 * Required - API name: {@code doc_values}
	 */
	public final Number docValues() {
		return this.docValues;
	}

	/**
	 * Required - API name: {@code points}
	 */
	public final Number points() {
		return this.points;
	}

	/**
	 * Required - API name: {@code norms}
	 */
	public final Number norms() {
		return this.norms;
	}

	/**
	 * Required - API name: {@code term_vectors}
	 */
	public final Number termVectors() {
		return this.termVectors;
	}

	/**
	 * Required - API name: {@code knn_vectors}
	 */
	public final Number knnVectors() {
		return this.knnVectors;
	}

	/**
	 * Required - API name: {@code inverted_index}
	 */
	public final InvertedIndex invertedIndex() {
		return this.invertedIndex;
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

		generator.writeKey("any");
		generator.write(this.any.doubleValue());

		generator.writeKey("stored_fields");
		generator.write(this.storedFields.doubleValue());

		generator.writeKey("doc_values");
		generator.write(this.docValues.doubleValue());

		generator.writeKey("points");
		generator.write(this.points.doubleValue());

		generator.writeKey("norms");
		generator.write(this.norms.doubleValue());

		generator.writeKey("term_vectors");
		generator.write(this.termVectors.doubleValue());

		generator.writeKey("knn_vectors");
		generator.write(this.knnVectors.doubleValue());

		generator.writeKey("inverted_index");
		this.invertedIndex.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldSummary}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<FieldSummary> {
		private Number any;

		private Number storedFields;

		private Number docValues;

		private Number points;

		private Number norms;

		private Number termVectors;

		private Number knnVectors;

		private InvertedIndex invertedIndex;

		/**
		 * Required - API name: {@code any}
		 */
		public final Builder any(Number value) {
			this.any = value;
			return this;
		}

		/**
		 * Required - API name: {@code stored_fields}
		 */
		public final Builder storedFields(Number value) {
			this.storedFields = value;
			return this;
		}

		/**
		 * Required - API name: {@code doc_values}
		 */
		public final Builder docValues(Number value) {
			this.docValues = value;
			return this;
		}

		/**
		 * Required - API name: {@code points}
		 */
		public final Builder points(Number value) {
			this.points = value;
			return this;
		}

		/**
		 * Required - API name: {@code norms}
		 */
		public final Builder norms(Number value) {
			this.norms = value;
			return this;
		}

		/**
		 * Required - API name: {@code term_vectors}
		 */
		public final Builder termVectors(Number value) {
			this.termVectors = value;
			return this;
		}

		/**
		 * Required - API name: {@code knn_vectors}
		 */
		public final Builder knnVectors(Number value) {
			this.knnVectors = value;
			return this;
		}

		/**
		 * Required - API name: {@code inverted_index}
		 */
		public final Builder invertedIndex(InvertedIndex value) {
			this.invertedIndex = value;
			return this;
		}

		/**
		 * Required - API name: {@code inverted_index}
		 */
		public final Builder invertedIndex(Function<InvertedIndex.Builder, ObjectBuilder<InvertedIndex>> fn) {
			return this.invertedIndex(fn.apply(new InvertedIndex.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FieldSummary}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldSummary build() {
			_checkSingleUse();

			return new FieldSummary(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FieldSummary}
	 */
	public static final JsonpDeserializer<FieldSummary> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FieldSummary::setupFieldSummaryDeserializer);

	protected static void setupFieldSummaryDeserializer(ObjectDeserializer<FieldSummary.Builder> op) {

		op.add(Builder::any, JsonpDeserializer.numberDeserializer(), "any");
		op.add(Builder::storedFields, JsonpDeserializer.numberDeserializer(), "stored_fields");
		op.add(Builder::docValues, JsonpDeserializer.numberDeserializer(), "doc_values");
		op.add(Builder::points, JsonpDeserializer.numberDeserializer(), "points");
		op.add(Builder::norms, JsonpDeserializer.numberDeserializer(), "norms");
		op.add(Builder::termVectors, JsonpDeserializer.numberDeserializer(), "term_vectors");
		op.add(Builder::knnVectors, JsonpDeserializer.numberDeserializer(), "knn_vectors");
		op.add(Builder::invertedIndex, InvertedIndex._DESERIALIZER, "inverted_index");

	}

}
