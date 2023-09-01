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

package co.elastic.clients.elasticsearch.ml;

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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.FilterRef

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.FilterRef">API
 *      specification</a>
 */
@JsonpDeserializable
public class FilterRef implements JsonpSerializable {
	private final String filterId;

	@Nullable
	private final FilterType filterType;

	// ---------------------------------------------------------------------------------------------

	private FilterRef(Builder builder) {

		this.filterId = ApiTypeHelper.requireNonNull(builder.filterId, this, "filterId");
		this.filterType = builder.filterType;

	}

	public static FilterRef of(Function<Builder, ObjectBuilder<FilterRef>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The identifier for the filter.
	 * <p>
	 * API name: {@code filter_id}
	 */
	public final String filterId() {
		return this.filterId;
	}

	/**
	 * If set to <code>include</code>, the rule applies for values in the filter. If
	 * set to <code>exclude</code>, the rule applies for values not in the filter.
	 * <p>
	 * API name: {@code filter_type}
	 */
	@Nullable
	public final FilterType filterType() {
		return this.filterType;
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

		generator.writeKey("filter_id");
		generator.write(this.filterId);

		if (this.filterType != null) {
			generator.writeKey("filter_type");
			this.filterType.serialize(generator, mapper);
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FilterRef}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<FilterRef> {
		private String filterId;

		@Nullable
		private FilterType filterType;

		/**
		 * Required - The identifier for the filter.
		 * <p>
		 * API name: {@code filter_id}
		 */
		public final Builder filterId(String value) {
			this.filterId = value;
			return this;
		}

		/**
		 * If set to <code>include</code>, the rule applies for values in the filter. If
		 * set to <code>exclude</code>, the rule applies for values not in the filter.
		 * <p>
		 * API name: {@code filter_type}
		 */
		public final Builder filterType(@Nullable FilterType value) {
			this.filterType = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FilterRef}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FilterRef build() {
			_checkSingleUse();

			return new FilterRef(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FilterRef}
	 */
	public static final JsonpDeserializer<FilterRef> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FilterRef::setupFilterRefDeserializer);

	protected static void setupFilterRefDeserializer(ObjectDeserializer<FilterRef.Builder> op) {

		op.add(Builder::filterId, JsonpDeserializer.stringDeserializer(), "filter_id");
		op.add(Builder::filterType, FilterType._DESERIALIZER, "filter_type");

	}

}
