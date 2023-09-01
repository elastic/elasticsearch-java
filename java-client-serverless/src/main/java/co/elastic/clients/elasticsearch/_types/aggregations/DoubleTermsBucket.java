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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.DoubleTermsBucket

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.DoubleTermsBucket">API
 *      specification</a>
 */
@JsonpDeserializable
public class DoubleTermsBucket extends TermsBucketBase {
	private final double key;

	@Nullable
	private final String keyAsString;

	// ---------------------------------------------------------------------------------------------

	private DoubleTermsBucket(Builder builder) {
		super(builder);

		this.key = ApiTypeHelper.requireNonNull(builder.key, this, "key");
		this.keyAsString = builder.keyAsString;

	}

	public static DoubleTermsBucket of(Function<Builder, ObjectBuilder<DoubleTermsBucket>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code key}
	 */
	public final double key() {
		return this.key;
	}

	/**
	 * API name: {@code key_as_string}
	 */
	@Nullable
	public final String keyAsString() {
		return this.keyAsString;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("key");
		generator.write(this.key);

		if (this.keyAsString != null) {
			generator.writeKey("key_as_string");
			generator.write(this.keyAsString);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DoubleTermsBucket}.
	 */

	public static class Builder extends TermsBucketBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DoubleTermsBucket> {
		private Double key;

		@Nullable
		private String keyAsString;

		/**
		 * Required - API name: {@code key}
		 */
		public final Builder key(double value) {
			this.key = value;
			return this;
		}

		/**
		 * API name: {@code key_as_string}
		 */
		public final Builder keyAsString(@Nullable String value) {
			this.keyAsString = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DoubleTermsBucket}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DoubleTermsBucket build() {
			_checkSingleUse();

			return new DoubleTermsBucket(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DoubleTermsBucket}
	 */
	public static final JsonpDeserializer<DoubleTermsBucket> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DoubleTermsBucket::setupDoubleTermsBucketDeserializer);

	protected static void setupDoubleTermsBucketDeserializer(ObjectDeserializer<DoubleTermsBucket.Builder> op) {
		TermsBucketBase.setupTermsBucketBaseDeserializer(op);
		op.add(Builder::key, JsonpDeserializer.doubleDeserializer(), "key");
		op.add(Builder::keyAsString, JsonpDeserializer.stringDeserializer(), "key_as_string");

	}

}
