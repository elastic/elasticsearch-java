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

// typedef: xpack.usage.EqlFeaturesJoin

/**
 *
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.EqlFeaturesJoin">API
 *      specification</a>
 */
@JsonpDeserializable
public class EqlFeaturesJoin implements JsonpSerializable {
	private final Number joinQueriesTwo;

	private final Number joinQueriesThree;

	private final Number joinUntil;

	private final Number joinQueriesFiveOrMore;

	private final Number joinQueriesFour;

	// ---------------------------------------------------------------------------------------------

	private EqlFeaturesJoin(Builder builder) {

		this.joinQueriesTwo = ApiTypeHelper.requireNonNull(builder.joinQueriesTwo, this, "joinQueriesTwo");
		this.joinQueriesThree = ApiTypeHelper.requireNonNull(builder.joinQueriesThree, this, "joinQueriesThree");
		this.joinUntil = ApiTypeHelper.requireNonNull(builder.joinUntil, this, "joinUntil");
		this.joinQueriesFiveOrMore = ApiTypeHelper.requireNonNull(builder.joinQueriesFiveOrMore, this,
				"joinQueriesFiveOrMore");
		this.joinQueriesFour = ApiTypeHelper.requireNonNull(builder.joinQueriesFour, this, "joinQueriesFour");

	}

	public static EqlFeaturesJoin of(Function<Builder, ObjectBuilder<EqlFeaturesJoin>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code join_queries_two}
	 */
	public final Number joinQueriesTwo() {
		return this.joinQueriesTwo;
	}

	/**
	 * Required - API name: {@code join_queries_three}
	 */
	public final Number joinQueriesThree() {
		return this.joinQueriesThree;
	}

	/**
	 * Required - API name: {@code join_until}
	 */
	public final Number joinUntil() {
		return this.joinUntil;
	}

	/**
	 * Required - API name: {@code join_queries_five_or_more}
	 */
	public final Number joinQueriesFiveOrMore() {
		return this.joinQueriesFiveOrMore;
	}

	/**
	 * Required - API name: {@code join_queries_four}
	 */
	public final Number joinQueriesFour() {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EqlFeaturesJoin}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<EqlFeaturesJoin> {
		private Number joinQueriesTwo;

		private Number joinQueriesThree;

		private Number joinUntil;

		private Number joinQueriesFiveOrMore;

		private Number joinQueriesFour;

		/**
		 * Required - API name: {@code join_queries_two}
		 */
		public final Builder joinQueriesTwo(Number value) {
			this.joinQueriesTwo = value;
			return this;
		}

		/**
		 * Required - API name: {@code join_queries_three}
		 */
		public final Builder joinQueriesThree(Number value) {
			this.joinQueriesThree = value;
			return this;
		}

		/**
		 * Required - API name: {@code join_until}
		 */
		public final Builder joinUntil(Number value) {
			this.joinUntil = value;
			return this;
		}

		/**
		 * Required - API name: {@code join_queries_five_or_more}
		 */
		public final Builder joinQueriesFiveOrMore(Number value) {
			this.joinQueriesFiveOrMore = value;
			return this;
		}

		/**
		 * Required - API name: {@code join_queries_four}
		 */
		public final Builder joinQueriesFour(Number value) {
			this.joinQueriesFour = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link EqlFeaturesJoin}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EqlFeaturesJoin build() {
			_checkSingleUse();

			return new EqlFeaturesJoin(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link EqlFeaturesJoin}
	 */
	public static final JsonpDeserializer<EqlFeaturesJoin> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			EqlFeaturesJoin::setupEqlFeaturesJoinDeserializer);

	protected static void setupEqlFeaturesJoinDeserializer(ObjectDeserializer<EqlFeaturesJoin.Builder> op) {

		op.add(Builder::joinQueriesTwo, JsonpDeserializer.numberDeserializer(), "join_queries_two");
		op.add(Builder::joinQueriesThree, JsonpDeserializer.numberDeserializer(), "join_queries_three");
		op.add(Builder::joinUntil, JsonpDeserializer.numberDeserializer(), "join_until");
		op.add(Builder::joinQueriesFiveOrMore, JsonpDeserializer.numberDeserializer(), "join_queries_five_or_more");
		op.add(Builder::joinQueriesFour, JsonpDeserializer.numberDeserializer(), "join_queries_four");

	}

}
