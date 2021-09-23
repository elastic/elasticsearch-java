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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: xpack.usage.EqlFeaturesJoin
public final class EqlFeaturesJoin implements JsonpSerializable {
	private final Number joinQueriesTwo;

	private final Number joinQueriesThree;

	private final Number joinUntil;

	private final Number joinQueriesFiveOrMore;

	private final Number joinQueriesFour;

	// ---------------------------------------------------------------------------------------------

	public EqlFeaturesJoin(Builder builder) {

		this.joinQueriesTwo = Objects.requireNonNull(builder.joinQueriesTwo, "join_queries_two");
		this.joinQueriesThree = Objects.requireNonNull(builder.joinQueriesThree, "join_queries_three");
		this.joinUntil = Objects.requireNonNull(builder.joinUntil, "join_until");
		this.joinQueriesFiveOrMore = Objects.requireNonNull(builder.joinQueriesFiveOrMore, "join_queries_five_or_more");
		this.joinQueriesFour = Objects.requireNonNull(builder.joinQueriesFour, "join_queries_four");

	}

	/**
	 * API name: {@code join_queries_two}
	 */
	public Number joinQueriesTwo() {
		return this.joinQueriesTwo;
	}

	/**
	 * API name: {@code join_queries_three}
	 */
	public Number joinQueriesThree() {
		return this.joinQueriesThree;
	}

	/**
	 * API name: {@code join_until}
	 */
	public Number joinUntil() {
		return this.joinUntil;
	}

	/**
	 * API name: {@code join_queries_five_or_more}
	 */
	public Number joinQueriesFiveOrMore() {
		return this.joinQueriesFiveOrMore;
	}

	/**
	 * API name: {@code join_queries_four}
	 */
	public Number joinQueriesFour() {
		return this.joinQueriesFour;
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

		generator.writeKey("join_queries_two");
		generator.write(this.joinQueriesTwo.doubleValue());

		generator.writeKey("join_queries_three");
		generator.write(this.joinQueriesThree.doubleValue());

		generator.writeKey("join_until");
		generator.write(this.joinUntil.doubleValue());

		generator.writeKey("join_queries_five_or_more");
		generator.write(this.joinQueriesFiveOrMore.doubleValue());

		generator.writeKey("join_queries_four");
		generator.write(this.joinQueriesFour.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EqlFeaturesJoin}.
	 */
	public static class Builder implements ObjectBuilder<EqlFeaturesJoin> {
		private Number joinQueriesTwo;

		private Number joinQueriesThree;

		private Number joinUntil;

		private Number joinQueriesFiveOrMore;

		private Number joinQueriesFour;

		/**
		 * API name: {@code join_queries_two}
		 */
		public Builder joinQueriesTwo(Number value) {
			this.joinQueriesTwo = value;
			return this;
		}

		/**
		 * API name: {@code join_queries_three}
		 */
		public Builder joinQueriesThree(Number value) {
			this.joinQueriesThree = value;
			return this;
		}

		/**
		 * API name: {@code join_until}
		 */
		public Builder joinUntil(Number value) {
			this.joinUntil = value;
			return this;
		}

		/**
		 * API name: {@code join_queries_five_or_more}
		 */
		public Builder joinQueriesFiveOrMore(Number value) {
			this.joinQueriesFiveOrMore = value;
			return this;
		}

		/**
		 * API name: {@code join_queries_four}
		 */
		public Builder joinQueriesFour(Number value) {
			this.joinQueriesFour = value;
			return this;
		}

		/**
		 * Builds a {@link EqlFeaturesJoin}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EqlFeaturesJoin build() {

			return new EqlFeaturesJoin(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link EqlFeaturesJoin}
	 */
	public static final JsonpDeserializer<EqlFeaturesJoin> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, EqlFeaturesJoin::setupEqlFeaturesJoinDeserializer);

	protected static void setupEqlFeaturesJoinDeserializer(DelegatingDeserializer<EqlFeaturesJoin.Builder> op) {

		op.add(Builder::joinQueriesTwo, JsonpDeserializer.numberDeserializer(), "join_queries_two");
		op.add(Builder::joinQueriesThree, JsonpDeserializer.numberDeserializer(), "join_queries_three");
		op.add(Builder::joinUntil, JsonpDeserializer.numberDeserializer(), "join_until");
		op.add(Builder::joinQueriesFiveOrMore, JsonpDeserializer.numberDeserializer(), "join_queries_five_or_more");
		op.add(Builder::joinQueriesFour, JsonpDeserializer.numberDeserializer(), "join_queries_four");

	}

}
