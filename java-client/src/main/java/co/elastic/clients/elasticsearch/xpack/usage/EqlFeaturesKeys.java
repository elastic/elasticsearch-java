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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.EqlFeaturesKeys
@JsonpDeserializable
public class EqlFeaturesKeys implements JsonpSerializable {
	private final Number joinKeysTwo;

	private final Number joinKeysOne;

	private final Number joinKeysThree;

	private final Number joinKeysFiveOrMore;

	private final Number joinKeysFour;

	// ---------------------------------------------------------------------------------------------

	private EqlFeaturesKeys(Builder builder) {

		this.joinKeysTwo = ModelTypeHelper.requireNonNull(builder.joinKeysTwo, this, "joinKeysTwo");
		this.joinKeysOne = ModelTypeHelper.requireNonNull(builder.joinKeysOne, this, "joinKeysOne");
		this.joinKeysThree = ModelTypeHelper.requireNonNull(builder.joinKeysThree, this, "joinKeysThree");
		this.joinKeysFiveOrMore = ModelTypeHelper.requireNonNull(builder.joinKeysFiveOrMore, this,
				"joinKeysFiveOrMore");
		this.joinKeysFour = ModelTypeHelper.requireNonNull(builder.joinKeysFour, this, "joinKeysFour");

	}

	public static EqlFeaturesKeys of(Function<Builder, ObjectBuilder<EqlFeaturesKeys>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code join_keys_two}
	 */
	public final Number joinKeysTwo() {
		return this.joinKeysTwo;
	}

	/**
	 * Required - API name: {@code join_keys_one}
	 */
	public final Number joinKeysOne() {
		return this.joinKeysOne;
	}

	/**
	 * Required - API name: {@code join_keys_three}
	 */
	public final Number joinKeysThree() {
		return this.joinKeysThree;
	}

	/**
	 * Required - API name: {@code join_keys_five_or_more}
	 */
	public final Number joinKeysFiveOrMore() {
		return this.joinKeysFiveOrMore;
	}

	/**
	 * Required - API name: {@code join_keys_four}
	 */
	public final Number joinKeysFour() {
		return this.joinKeysFour;
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

		generator.writeKey("join_keys_two");
		generator.write(this.joinKeysTwo.doubleValue());

		generator.writeKey("join_keys_one");
		generator.write(this.joinKeysOne.doubleValue());

		generator.writeKey("join_keys_three");
		generator.write(this.joinKeysThree.doubleValue());

		generator.writeKey("join_keys_five_or_more");
		generator.write(this.joinKeysFiveOrMore.doubleValue());

		generator.writeKey("join_keys_four");
		generator.write(this.joinKeysFour.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EqlFeaturesKeys}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<EqlFeaturesKeys> {
		private Number joinKeysTwo;

		private Number joinKeysOne;

		private Number joinKeysThree;

		private Number joinKeysFiveOrMore;

		private Number joinKeysFour;

		/**
		 * Required - API name: {@code join_keys_two}
		 */
		public final Builder joinKeysTwo(Number value) {
			this.joinKeysTwo = value;
			return this;
		}

		/**
		 * Required - API name: {@code join_keys_one}
		 */
		public final Builder joinKeysOne(Number value) {
			this.joinKeysOne = value;
			return this;
		}

		/**
		 * Required - API name: {@code join_keys_three}
		 */
		public final Builder joinKeysThree(Number value) {
			this.joinKeysThree = value;
			return this;
		}

		/**
		 * Required - API name: {@code join_keys_five_or_more}
		 */
		public final Builder joinKeysFiveOrMore(Number value) {
			this.joinKeysFiveOrMore = value;
			return this;
		}

		/**
		 * Required - API name: {@code join_keys_four}
		 */
		public final Builder joinKeysFour(Number value) {
			this.joinKeysFour = value;
			return this;
		}

		/**
		 * Builds a {@link EqlFeaturesKeys}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EqlFeaturesKeys build() {
			_checkSingleUse();

			return new EqlFeaturesKeys(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link EqlFeaturesKeys}
	 */
	public static final JsonpDeserializer<EqlFeaturesKeys> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			EqlFeaturesKeys::setupEqlFeaturesKeysDeserializer, Builder::build);

	protected static void setupEqlFeaturesKeysDeserializer(DelegatingDeserializer<EqlFeaturesKeys.Builder> op) {

		op.add(Builder::joinKeysTwo, JsonpDeserializer.numberDeserializer(), "join_keys_two");
		op.add(Builder::joinKeysOne, JsonpDeserializer.numberDeserializer(), "join_keys_one");
		op.add(Builder::joinKeysThree, JsonpDeserializer.numberDeserializer(), "join_keys_three");
		op.add(Builder::joinKeysFiveOrMore, JsonpDeserializer.numberDeserializer(), "join_keys_five_or_more");
		op.add(Builder::joinKeysFour, JsonpDeserializer.numberDeserializer(), "join_keys_four");

	}

}
