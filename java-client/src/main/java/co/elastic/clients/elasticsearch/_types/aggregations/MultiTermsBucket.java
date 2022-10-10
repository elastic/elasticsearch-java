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
import java.lang.Long;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.MultiTermsBucket

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.MultiTermsBucket">API
 *      specification</a>
 */
@JsonpDeserializable
public class MultiTermsBucket extends MultiBucketBase {
	private final List<FieldValue> key;

	@Nullable
	private final String keyAsString;

	@Nullable
	private final Long docCountErrorUpperBound;

	// ---------------------------------------------------------------------------------------------

	private MultiTermsBucket(Builder builder) {
		super(builder);

		this.key = ApiTypeHelper.unmodifiableRequired(builder.key, this, "key");
		this.keyAsString = builder.keyAsString;
		this.docCountErrorUpperBound = builder.docCountErrorUpperBound;

	}

	public static MultiTermsBucket of(Function<Builder, ObjectBuilder<MultiTermsBucket>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code key}
	 */
	public final List<FieldValue> key() {
		return this.key;
	}

	/**
	 * API name: {@code key_as_string}
	 */
	@Nullable
	public final String keyAsString() {
		return this.keyAsString;
	}

	/**
	 * API name: {@code doc_count_error_upper_bound}
	 */
	@Nullable
	public final Long docCountErrorUpperBound() {
		return this.docCountErrorUpperBound;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.key)) {
			generator.writeKey("key");
			generator.writeStartArray();
			for (FieldValue item0 : this.key) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.keyAsString != null) {
			generator.writeKey("key_as_string");
			generator.write(this.keyAsString);

		}
		if (this.docCountErrorUpperBound != null) {
			generator.writeKey("doc_count_error_upper_bound");
			generator.write(this.docCountErrorUpperBound);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MultiTermsBucket}.
	 */

	public static class Builder extends MultiBucketBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MultiTermsBucket> {
		private List<FieldValue> key;

		@Nullable
		private String keyAsString;

		@Nullable
		private Long docCountErrorUpperBound;

		/**
		 * Required - API name: {@code key}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>key</code>.
		 */
		public final Builder key(List<FieldValue> list) {
			this.key = _listAddAll(this.key, list);
			return this;
		}

		/**
		 * Required - API name: {@code key}
		 * <p>
		 * Adds one or more values to <code>key</code>.
		 */
		public final Builder key(FieldValue value, FieldValue... values) {
			this.key = _listAdd(this.key, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code key}
		 * <p>
		 * Adds a value to <code>key</code> using a builder lambda.
		 */
		public final Builder key(Function<FieldValue.Builder, ObjectBuilder<FieldValue>> fn) {
			return key(fn.apply(new FieldValue.Builder()).build());
		}

		/**
		 * API name: {@code key_as_string}
		 */
		public final Builder keyAsString(@Nullable String value) {
			this.keyAsString = value;
			return this;
		}

		/**
		 * API name: {@code doc_count_error_upper_bound}
		 */
		public final Builder docCountErrorUpperBound(@Nullable Long value) {
			this.docCountErrorUpperBound = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MultiTermsBucket}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MultiTermsBucket build() {
			_checkSingleUse();

			return new MultiTermsBucket(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MultiTermsBucket}
	 */
	public static final JsonpDeserializer<MultiTermsBucket> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MultiTermsBucket::setupMultiTermsBucketDeserializer);

	protected static void setupMultiTermsBucketDeserializer(ObjectDeserializer<MultiTermsBucket.Builder> op) {
		MultiBucketBase.setupMultiBucketBaseDeserializer(op);
		op.add(Builder::key, JsonpDeserializer.arrayDeserializer(FieldValue._DESERIALIZER), "key");
		op.add(Builder::keyAsString, JsonpDeserializer.stringDeserializer(), "key_as_string");
		op.add(Builder::docCountErrorUpperBound, JsonpDeserializer.longDeserializer(), "doc_count_error_upper_bound");

	}

}
