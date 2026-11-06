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

package co.elastic.clients.elasticsearch.indices.segments;

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
import java.lang.Boolean;
import java.lang.String;
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

// typedef: indices.segments.SegmentSort

/**
 *
 * @see <a href="../../doc-files/api-spec.html#indices.segments.SegmentSort">API
 *      specification</a>
 */
@JsonpDeserializable
public class SegmentSort implements JsonpSerializable {
	private final String field;

	@Nullable
	private final String mode;

	@Nullable
	private final String missing;

	private final boolean reverse;

	// ---------------------------------------------------------------------------------------------

	private SegmentSort(Builder builder) {

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.mode = builder.mode;
		this.missing = builder.missing;
		this.reverse = ApiTypeHelper.requireNonNull(builder.reverse, this, "reverse", false);

	}

	public static SegmentSort of(Function<Builder, ObjectBuilder<SegmentSort>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The name of the sort field.
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * The selector used to pick a value from multi-valued fields, such as
	 * <code>min</code> or <code>max</code>. Only returned for numeric and keyword
	 * fields.
	 * <p>
	 * API name: {@code mode}
	 */
	@Nullable
	public final String mode() {
		return this.mode;
	}

	/**
	 * The value used for documents that are missing the field.
	 * <p>
	 * API name: {@code missing}
	 */
	@Nullable
	public final String missing() {
		return this.missing;
	}

	/**
	 * Required - If <code>true</code>, the sort order is descending.
	 * <p>
	 * API name: {@code reverse}
	 */
	public final boolean reverse() {
		return this.reverse;
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

		generator.writeKey("field");
		generator.write(this.field);

		if (this.mode != null) {
			generator.writeKey("mode");
			generator.write(this.mode);

		}
		if (this.missing != null) {
			generator.writeKey("missing");
			generator.write(this.missing);

		}
		generator.writeKey("reverse");
		generator.write(this.reverse);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SegmentSort}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SegmentSort> {
		private String field;

		@Nullable
		private String mode;

		@Nullable
		private String missing;

		private Boolean reverse;

		public Builder() {
		}
		private Builder(SegmentSort instance) {
			this.field = instance.field;
			this.mode = instance.mode;
			this.missing = instance.missing;
			this.reverse = instance.reverse;

		}
		/**
		 * Required - The name of the sort field.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * The selector used to pick a value from multi-valued fields, such as
		 * <code>min</code> or <code>max</code>. Only returned for numeric and keyword
		 * fields.
		 * <p>
		 * API name: {@code mode}
		 */
		public final Builder mode(@Nullable String value) {
			this.mode = value;
			return this;
		}

		/**
		 * The value used for documents that are missing the field.
		 * <p>
		 * API name: {@code missing}
		 */
		public final Builder missing(@Nullable String value) {
			this.missing = value;
			return this;
		}

		/**
		 * Required - If <code>true</code>, the sort order is descending.
		 * <p>
		 * API name: {@code reverse}
		 */
		public final Builder reverse(boolean value) {
			this.reverse = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SegmentSort}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SegmentSort build() {
			_checkSingleUse();

			return new SegmentSort(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SegmentSort}
	 */
	public static final JsonpDeserializer<SegmentSort> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SegmentSort::setupSegmentSortDeserializer);

	protected static void setupSegmentSortDeserializer(ObjectDeserializer<SegmentSort.Builder> op) {

		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::mode, JsonpDeserializer.stringDeserializer(), "mode");
		op.add(Builder::missing, JsonpDeserializer.stringDeserializer(), "missing");
		op.add(Builder::reverse, JsonpDeserializer.booleanDeserializer(), "reverse");

	}

}
