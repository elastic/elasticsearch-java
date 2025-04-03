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

// typedef: indices.field_usage_stats.InvertedIndex

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.field_usage_stats.InvertedIndex">API
 *      specification</a>
 */
@JsonpDeserializable
public class InvertedIndex implements JsonpSerializable {
	private final Number terms;

	private final Number postings;

	private final Number proximity;

	private final Number positions;

	private final Number termFrequencies;

	private final Number offsets;

	private final Number payloads;

	// ---------------------------------------------------------------------------------------------

	private InvertedIndex(Builder builder) {

		this.terms = ApiTypeHelper.requireNonNull(builder.terms, this, "terms");
		this.postings = ApiTypeHelper.requireNonNull(builder.postings, this, "postings");
		this.proximity = ApiTypeHelper.requireNonNull(builder.proximity, this, "proximity");
		this.positions = ApiTypeHelper.requireNonNull(builder.positions, this, "positions");
		this.termFrequencies = ApiTypeHelper.requireNonNull(builder.termFrequencies, this, "termFrequencies");
		this.offsets = ApiTypeHelper.requireNonNull(builder.offsets, this, "offsets");
		this.payloads = ApiTypeHelper.requireNonNull(builder.payloads, this, "payloads");

	}

	public static InvertedIndex of(Function<Builder, ObjectBuilder<InvertedIndex>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code terms}
	 */
	public final Number terms() {
		return this.terms;
	}

	/**
	 * Required - API name: {@code postings}
	 */
	public final Number postings() {
		return this.postings;
	}

	/**
	 * Required - API name: {@code proximity}
	 */
	public final Number proximity() {
		return this.proximity;
	}

	/**
	 * Required - API name: {@code positions}
	 */
	public final Number positions() {
		return this.positions;
	}

	/**
	 * Required - API name: {@code term_frequencies}
	 */
	public final Number termFrequencies() {
		return this.termFrequencies;
	}

	/**
	 * Required - API name: {@code offsets}
	 */
	public final Number offsets() {
		return this.offsets;
	}

	/**
	 * Required - API name: {@code payloads}
	 */
	public final Number payloads() {
		return this.payloads;
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

		generator.writeKey("terms");
		generator.write(this.terms.doubleValue());

		generator.writeKey("postings");
		generator.write(this.postings.doubleValue());

		generator.writeKey("proximity");
		generator.write(this.proximity.doubleValue());

		generator.writeKey("positions");
		generator.write(this.positions.doubleValue());

		generator.writeKey("term_frequencies");
		generator.write(this.termFrequencies.doubleValue());

		generator.writeKey("offsets");
		generator.write(this.offsets.doubleValue());

		generator.writeKey("payloads");
		generator.write(this.payloads.doubleValue());

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InvertedIndex}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<InvertedIndex> {
		private Number terms;

		private Number postings;

		private Number proximity;

		private Number positions;

		private Number termFrequencies;

		private Number offsets;

		private Number payloads;

		/**
		 * Required - API name: {@code terms}
		 */
		public final Builder terms(Number value) {
			this.terms = value;
			return this;
		}

		/**
		 * Required - API name: {@code postings}
		 */
		public final Builder postings(Number value) {
			this.postings = value;
			return this;
		}

		/**
		 * Required - API name: {@code proximity}
		 */
		public final Builder proximity(Number value) {
			this.proximity = value;
			return this;
		}

		/**
		 * Required - API name: {@code positions}
		 */
		public final Builder positions(Number value) {
			this.positions = value;
			return this;
		}

		/**
		 * Required - API name: {@code term_frequencies}
		 */
		public final Builder termFrequencies(Number value) {
			this.termFrequencies = value;
			return this;
		}

		/**
		 * Required - API name: {@code offsets}
		 */
		public final Builder offsets(Number value) {
			this.offsets = value;
			return this;
		}

		/**
		 * Required - API name: {@code payloads}
		 */
		public final Builder payloads(Number value) {
			this.payloads = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link InvertedIndex}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InvertedIndex build() {
			_checkSingleUse();

			return new InvertedIndex(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InvertedIndex}
	 */
	public static final JsonpDeserializer<InvertedIndex> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			InvertedIndex::setupInvertedIndexDeserializer);

	protected static void setupInvertedIndexDeserializer(ObjectDeserializer<InvertedIndex.Builder> op) {

		op.add(Builder::terms, JsonpDeserializer.numberDeserializer(), "terms");
		op.add(Builder::postings, JsonpDeserializer.numberDeserializer(), "postings");
		op.add(Builder::proximity, JsonpDeserializer.numberDeserializer(), "proximity");
		op.add(Builder::positions, JsonpDeserializer.numberDeserializer(), "positions");
		op.add(Builder::termFrequencies, JsonpDeserializer.numberDeserializer(), "term_frequencies");
		op.add(Builder::offsets, JsonpDeserializer.numberDeserializer(), "offsets");
		op.add(Builder::payloads, JsonpDeserializer.numberDeserializer(), "payloads");

	}

}
