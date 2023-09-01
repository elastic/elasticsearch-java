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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.elasticsearch._types.FieldValue;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.StringTermsBucket

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.StringTermsBucket">API
 *      specification</a>
 */
@JsonpDeserializable
public class StringTermsBucket extends TermsBucketBase {
	private final FieldValue key;

	// ---------------------------------------------------------------------------------------------

	private StringTermsBucket(Builder builder) {
		super(builder);

		this.key = ApiTypeHelper.requireNonNull(builder.key, this, "key");

	}

	public static StringTermsBucket of(Function<Builder, ObjectBuilder<StringTermsBucket>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code key}
	 */
	public final FieldValue key() {
		return this.key;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("key");
		this.key.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StringTermsBucket}.
	 */

	public static class Builder extends TermsBucketBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<StringTermsBucket> {
		private FieldValue key;

		/**
		 * Required - API name: {@code key}
		 */
		public final Builder key(FieldValue value) {
			this.key = value;
			return this;
		}

		/**
		 * Required - API name: {@code key}
		 */
		public final Builder key(Function<FieldValue.Builder, ObjectBuilder<FieldValue>> fn) {
			return this.key(fn.apply(new FieldValue.Builder()).build());
		}

		/**
		 * Required - API name: {@code key}
		 */
		public final Builder key(String value) {
			this.key = FieldValue.of(value);
			return this;
		}

		/**
		 * Required - API name: {@code key}
		 */
		public final Builder key(long value) {
			this.key = FieldValue.of(value);
			return this;
		}

		/**
		 * Required - API name: {@code key}
		 */
		public final Builder key(double value) {
			this.key = FieldValue.of(value);
			return this;
		}

		/**
		 * Required - API name: {@code key}
		 */
		public final Builder key(boolean value) {
			this.key = FieldValue.of(value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link StringTermsBucket}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StringTermsBucket build() {
			_checkSingleUse();

			return new StringTermsBucket(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StringTermsBucket}
	 */
	public static final JsonpDeserializer<StringTermsBucket> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, StringTermsBucket::setupStringTermsBucketDeserializer);

	protected static void setupStringTermsBucketDeserializer(ObjectDeserializer<StringTermsBucket.Builder> op) {
		TermsBucketBase.setupTermsBucketBaseDeserializer(op);
		op.add(Builder::key, FieldValue._DESERIALIZER, "key");

	}

}
