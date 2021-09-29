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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.EqlFeaturesSequences
@JsonpDeserializable
public final class EqlFeaturesSequences implements JsonpSerializable {
	private final Number sequenceQueriesThree;

	private final Number sequenceQueriesFour;

	private final Number sequenceQueriesTwo;

	private final Number sequenceUntil;

	private final Number sequenceQueriesFiveOrMore;

	private final Number sequenceMaxspan;

	// ---------------------------------------------------------------------------------------------

	public EqlFeaturesSequences(Builder builder) {

		this.sequenceQueriesThree = Objects.requireNonNull(builder.sequenceQueriesThree, "sequence_queries_three");
		this.sequenceQueriesFour = Objects.requireNonNull(builder.sequenceQueriesFour, "sequence_queries_four");
		this.sequenceQueriesTwo = Objects.requireNonNull(builder.sequenceQueriesTwo, "sequence_queries_two");
		this.sequenceUntil = Objects.requireNonNull(builder.sequenceUntil, "sequence_until");
		this.sequenceQueriesFiveOrMore = Objects.requireNonNull(builder.sequenceQueriesFiveOrMore,
				"sequence_queries_five_or_more");
		this.sequenceMaxspan = Objects.requireNonNull(builder.sequenceMaxspan, "sequence_maxspan");

	}

	public EqlFeaturesSequences(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code sequence_queries_three}
	 */
	public Number sequenceQueriesThree() {
		return this.sequenceQueriesThree;
	}

	/**
	 * API name: {@code sequence_queries_four}
	 */
	public Number sequenceQueriesFour() {
		return this.sequenceQueriesFour;
	}

	/**
	 * API name: {@code sequence_queries_two}
	 */
	public Number sequenceQueriesTwo() {
		return this.sequenceQueriesTwo;
	}

	/**
	 * API name: {@code sequence_until}
	 */
	public Number sequenceUntil() {
		return this.sequenceUntil;
	}

	/**
	 * API name: {@code sequence_queries_five_or_more}
	 */
	public Number sequenceQueriesFiveOrMore() {
		return this.sequenceQueriesFiveOrMore;
	}

	/**
	 * API name: {@code sequence_maxspan}
	 */
	public Number sequenceMaxspan() {
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EqlFeaturesSequences}.
	 */
	public static class Builder implements ObjectBuilder<EqlFeaturesSequences> {
		private Number sequenceQueriesThree;

		private Number sequenceQueriesFour;

		private Number sequenceQueriesTwo;

		private Number sequenceUntil;

		private Number sequenceQueriesFiveOrMore;

		private Number sequenceMaxspan;

		/**
		 * API name: {@code sequence_queries_three}
		 */
		public Builder sequenceQueriesThree(Number value) {
			this.sequenceQueriesThree = value;
			return this;
		}

		/**
		 * API name: {@code sequence_queries_four}
		 */
		public Builder sequenceQueriesFour(Number value) {
			this.sequenceQueriesFour = value;
			return this;
		}

		/**
		 * API name: {@code sequence_queries_two}
		 */
		public Builder sequenceQueriesTwo(Number value) {
			this.sequenceQueriesTwo = value;
			return this;
		}

		/**
		 * API name: {@code sequence_until}
		 */
		public Builder sequenceUntil(Number value) {
			this.sequenceUntil = value;
			return this;
		}

		/**
		 * API name: {@code sequence_queries_five_or_more}
		 */
		public Builder sequenceQueriesFiveOrMore(Number value) {
			this.sequenceQueriesFiveOrMore = value;
			return this;
		}

		/**
		 * API name: {@code sequence_maxspan}
		 */
		public Builder sequenceMaxspan(Number value) {
			this.sequenceMaxspan = value;
			return this;
		}

		/**
		 * Builds a {@link EqlFeaturesSequences}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EqlFeaturesSequences build() {

			return new EqlFeaturesSequences(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link EqlFeaturesSequences}
	 */
	public static final JsonpDeserializer<EqlFeaturesSequences> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, EqlFeaturesSequences::setupEqlFeaturesSequencesDeserializer, Builder::build);

	protected static void setupEqlFeaturesSequencesDeserializer(
			DelegatingDeserializer<EqlFeaturesSequences.Builder> op) {

		op.add(Builder::sequenceQueriesThree, JsonpDeserializer.numberDeserializer(), "sequence_queries_three");
		op.add(Builder::sequenceQueriesFour, JsonpDeserializer.numberDeserializer(), "sequence_queries_four");
		op.add(Builder::sequenceQueriesTwo, JsonpDeserializer.numberDeserializer(), "sequence_queries_two");
		op.add(Builder::sequenceUntil, JsonpDeserializer.numberDeserializer(), "sequence_until");
		op.add(Builder::sequenceQueriesFiveOrMore, JsonpDeserializer.numberDeserializer(),
				"sequence_queries_five_or_more");
		op.add(Builder::sequenceMaxspan, JsonpDeserializer.numberDeserializer(), "sequence_maxspan");

	}

}
