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

package co.elastic.clients.elasticsearch.xpack.usage;

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

// typedef: xpack.usage.EqlFeaturesSequences

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#xpack.usage.EqlFeaturesSequences">API
 *      specification</a>
 */
@JsonpDeserializable
public class EqlFeaturesSequences implements JsonpSerializable {
	private final Number sequenceQueriesThree;

	private final Number sequenceQueriesFour;

	private final Number sequenceQueriesTwo;

	private final Number sequenceUntil;

	private final Number sequenceQueriesFiveOrMore;

	private final Number sequenceMaxspan;

	// ---------------------------------------------------------------------------------------------

	private EqlFeaturesSequences(Builder builder) {

		this.sequenceQueriesThree = ApiTypeHelper.requireNonNull(builder.sequenceQueriesThree, this,
				"sequenceQueriesThree");
		this.sequenceQueriesFour = ApiTypeHelper.requireNonNull(builder.sequenceQueriesFour, this,
				"sequenceQueriesFour");
		this.sequenceQueriesTwo = ApiTypeHelper.requireNonNull(builder.sequenceQueriesTwo, this, "sequenceQueriesTwo");
		this.sequenceUntil = ApiTypeHelper.requireNonNull(builder.sequenceUntil, this, "sequenceUntil");
		this.sequenceQueriesFiveOrMore = ApiTypeHelper.requireNonNull(builder.sequenceQueriesFiveOrMore, this,
				"sequenceQueriesFiveOrMore");
		this.sequenceMaxspan = ApiTypeHelper.requireNonNull(builder.sequenceMaxspan, this, "sequenceMaxspan");

	}

	public static EqlFeaturesSequences of(Function<Builder, ObjectBuilder<EqlFeaturesSequences>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code sequence_queries_three}
	 */
	public final Number sequenceQueriesThree() {
		return this.sequenceQueriesThree;
	}

	/**
	 * Required - API name: {@code sequence_queries_four}
	 */
	public final Number sequenceQueriesFour() {
		return this.sequenceQueriesFour;
	}

	/**
	 * Required - API name: {@code sequence_queries_two}
	 */
	public final Number sequenceQueriesTwo() {
		return this.sequenceQueriesTwo;
	}

	/**
	 * Required - API name: {@code sequence_until}
	 */
	public final Number sequenceUntil() {
		return this.sequenceUntil;
	}

	/**
	 * Required - API name: {@code sequence_queries_five_or_more}
	 */
	public final Number sequenceQueriesFiveOrMore() {
		return this.sequenceQueriesFiveOrMore;
	}

	/**
	 * Required - API name: {@code sequence_maxspan}
	 */
	public final Number sequenceMaxspan() {
		return this.sequenceMaxspan;
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

		generator.writeKey("sequence_queries_three");
		generator.write(this.sequenceQueriesThree.doubleValue());

		generator.writeKey("sequence_queries_four");
		generator.write(this.sequenceQueriesFour.doubleValue());

		generator.writeKey("sequence_queries_two");
		generator.write(this.sequenceQueriesTwo.doubleValue());

		generator.writeKey("sequence_until");
		generator.write(this.sequenceUntil.doubleValue());

		generator.writeKey("sequence_queries_five_or_more");
		generator.write(this.sequenceQueriesFiveOrMore.doubleValue());

		generator.writeKey("sequence_maxspan");
		generator.write(this.sequenceMaxspan.doubleValue());

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EqlFeaturesSequences}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<EqlFeaturesSequences> {
		private Number sequenceQueriesThree;

		private Number sequenceQueriesFour;

		private Number sequenceQueriesTwo;

		private Number sequenceUntil;

		private Number sequenceQueriesFiveOrMore;

		private Number sequenceMaxspan;

		/**
		 * Required - API name: {@code sequence_queries_three}
		 */
		public final Builder sequenceQueriesThree(Number value) {
			this.sequenceQueriesThree = value;
			return this;
		}

		/**
		 * Required - API name: {@code sequence_queries_four}
		 */
		public final Builder sequenceQueriesFour(Number value) {
			this.sequenceQueriesFour = value;
			return this;
		}

		/**
		 * Required - API name: {@code sequence_queries_two}
		 */
		public final Builder sequenceQueriesTwo(Number value) {
			this.sequenceQueriesTwo = value;
			return this;
		}

		/**
		 * Required - API name: {@code sequence_until}
		 */
		public final Builder sequenceUntil(Number value) {
			this.sequenceUntil = value;
			return this;
		}

		/**
		 * Required - API name: {@code sequence_queries_five_or_more}
		 */
		public final Builder sequenceQueriesFiveOrMore(Number value) {
			this.sequenceQueriesFiveOrMore = value;
			return this;
		}

		/**
		 * Required - API name: {@code sequence_maxspan}
		 */
		public final Builder sequenceMaxspan(Number value) {
			this.sequenceMaxspan = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link EqlFeaturesSequences}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EqlFeaturesSequences build() {
			_checkSingleUse();

			return new EqlFeaturesSequences(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link EqlFeaturesSequences}
	 */
	public static final JsonpDeserializer<EqlFeaturesSequences> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, EqlFeaturesSequences::setupEqlFeaturesSequencesDeserializer);

	protected static void setupEqlFeaturesSequencesDeserializer(ObjectDeserializer<EqlFeaturesSequences.Builder> op) {

		op.add(Builder::sequenceQueriesThree, JsonpDeserializer.numberDeserializer(), "sequence_queries_three");
		op.add(Builder::sequenceQueriesFour, JsonpDeserializer.numberDeserializer(), "sequence_queries_four");
		op.add(Builder::sequenceQueriesTwo, JsonpDeserializer.numberDeserializer(), "sequence_queries_two");
		op.add(Builder::sequenceUntil, JsonpDeserializer.numberDeserializer(), "sequence_until");
		op.add(Builder::sequenceQueriesFiveOrMore, JsonpDeserializer.numberDeserializer(),
				"sequence_queries_five_or_more");
		op.add(Builder::sequenceMaxspan, JsonpDeserializer.numberDeserializer(), "sequence_maxspan");

	}

}
